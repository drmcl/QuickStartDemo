package com.weaver.drmcl.sandpit;

@SuppressWarnings("unused")
public class WhoAmi {
    private String name;
    private String occupation;

    public WhoAmi() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @SuppressWarnings("unused")
    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    @Override
    public String toString() {

        return "WhoAmi{" +
                "name=" + name +
                ", occupation=" + occupation +
                '}';
    }
}
