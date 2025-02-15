package com.github.dockerjava.api.command;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 *
 * @author Marcus Linke
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@EqualsAndHashCode
@ToString
public class TopContainerResponse {

    @JsonProperty("Titles")
    private String[] titles;

    @JsonProperty("Processes")
    private String[][] processes;

    public String[] getTitles() {
        return titles;
    }

    public String[][] getProcesses() {
        return processes;
    }
}
