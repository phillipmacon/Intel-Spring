package de.adesso.gitstalker.core.resources.member_Resources;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@NoArgsConstructor
public class RepositoriesContributedTo {

    private ArrayList<NodesRepoContributedTo> nodes;
}
