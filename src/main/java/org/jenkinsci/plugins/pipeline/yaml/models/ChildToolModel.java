package org.jenkinsci.plugins.pipeline.yaml.models;

import lombok.Getter;
import lombok.Setter;
import org.jenkinsci.plugins.pipeline.yaml.interfaces.ParsableModelInterface;


@Getter
@Setter
public class ChildToolModel extends AbstractModel implements ParsableModelInterface {

    private String toolType;
    private String toolName;

    public ChildToolModel(String toolType, String toolName) {
        this.toolType = toolType;
        this.toolName = toolName;
    }
}
