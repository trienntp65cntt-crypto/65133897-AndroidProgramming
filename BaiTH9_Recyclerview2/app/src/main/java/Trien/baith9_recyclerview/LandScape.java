package Trien.baith9_recyclerview;

public class LandScape
{
    String langImagefileName;
    String landCation;

    public String getLangImagefileName() {
        return langImagefileName;
    }

    public void setLangImagefileName(String langImagefileName) {
        this.langImagefileName = langImagefileName;
    }

    public String getLandCation() {
        return landCation;
    }

    public void setLandCation(String landCation) {
        this.landCation = landCation;
    }

    public LandScape(String langImagefileName, String landCation) {
        this.langImagefileName = langImagefileName;
        this.landCation = landCation;
    }
}
