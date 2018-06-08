package requests;

import enums.RequestType;
import enums.ResponseProcessor;
import objects.Query;

public class MemberIDRequest extends Request {

    private String query;
    private ResponseProcessor responseProcessor;
    private RequestType requestType;
    private String organizationName;

    public MemberIDRequest(String organizationName, String endCursor) {
        this.organizationName = organizationName;
        this.query = "query {\n" +
                "organization(login: \"" + organizationName + "\") {\n" +
                "members(first: 100 after:" + endCursor + ") {\n" +
                "pageInfo {\n" +
                " hasNextPage\n" +
                "endCursor\n" +
                "}\n" +
                "nodes {\n" +
                "id\n" +
                "}\n" +
                "}\n" +
                "}\n" +
                "}";

        this.responseProcessor = ResponseProcessor.MEMBER_ID;
        this.requestType = RequestType.MEMBER_ID;
    }

    public Query generateQuery() {
        return new Query(this.organizationName, this.query, this.responseProcessor, this.requestType);
    }
}