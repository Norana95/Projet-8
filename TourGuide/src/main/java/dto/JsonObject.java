package dto;

public class JsonObject {

    public String attractionName;
    public double latitudeAttractionLocation;
    public double longitudeAttractionLocation;
    public double latitudeUserLocation;
    public double longitudeUserLocation;
    public double distanceBetweenUserAndAttraction;
    public int rewardsPointOfAttraction;

    public void setAttractionName(String attractionName) {
        this.attractionName = attractionName;
    }

    public void setLatitudeAttractionLocation(double latitudeAttractionLocation) {
        this.latitudeAttractionLocation = latitudeAttractionLocation;
    }

    public void setLongitudeAttractionLocation(double longitudeAttractionLocation) {
        this.longitudeAttractionLocation = longitudeAttractionLocation;
    }

    public void setLatitudeUserLocation(double latitudeUserLocation) {
        this.latitudeUserLocation = latitudeUserLocation;
    }

    public void setLongitudeUserLocation(double longitudeUserLocation) {
        this.longitudeUserLocation = longitudeUserLocation;
    }

    public void setDistanceBetweenUserAndAttraction(double distanceBetweenUserAndAttraction) {
        this.distanceBetweenUserAndAttraction = distanceBetweenUserAndAttraction;
    }

    public void setRewardsPointOfAttraction(int rewardsPointOfAttraction) {
        this.rewardsPointOfAttraction = rewardsPointOfAttraction;
    }
}
