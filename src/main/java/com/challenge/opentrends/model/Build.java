package com.challenge.opentrends.model;

public class Build {

    private int buildId;
    private String name;
    private String pathRepo;
    private String version;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPathRepo() {
        return pathRepo;
    }

    public void setPathRepo(String pathRepo) {
        this.pathRepo = pathRepo;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public int getBuildId() {
        return buildId;
    }

    public void setBuildId(int buildId) {
        this.buildId = buildId;
    }
}
