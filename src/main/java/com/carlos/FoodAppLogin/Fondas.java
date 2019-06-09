package com.carlos.FoodAppLogin;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Fondas")

public class Fondas {
	
	private String id;
	private String name;
	private String pricelevel;
	private String address;
	private double coordlatitude;
	private double coordaltitude;
	private String description;
	private String businessHours;
	private String neigborhood;
	private String backgroundimageurl;
	private String thumbnail;
	
	public Fondas(String id, String name, String pricelevel, String address, double coordlatitude, double coordaltitude,
			String description, String businessHours, String neigborhood, String backgroundimageurl, String thumbnail) {
		super();
		this.id = id;
		this.name = name;
		this.pricelevel = pricelevel;
		this.address = address;
		this.coordlatitude = coordlatitude;
		this.coordaltitude = coordaltitude;
		this.description = description;
		this.businessHours = businessHours;
		this.neigborhood = neigborhood;
		this.backgroundimageurl = backgroundimageurl;
		this.thumbnail = thumbnail;
	}
	public String getBackgroundimageurl() {
		return backgroundimageurl;
	}
	public void setBackgroundimageurl(String backgroundimageurl) {
		this.backgroundimageurl = backgroundimageurl;
	}
	public String getThumbnail() {
		return thumbnail;
	}
	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPriceLevel() {
		return pricelevel;
	}
	public void setPriceLevel(String priceLevel) {
		this.pricelevel = priceLevel;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getCoordlatitude() {
		return coordlatitude;
	}
	public void setCoordlatitude(double coordlatitude) {
		this.coordlatitude = coordlatitude;
	}
	public double getCoordAltitude() {
		return coordaltitude;
	}
	public void setCoordAltitude(double coordaltitude) {
		this.coordaltitude = coordaltitude;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getBusinessHours() {
		return businessHours;
	}
	public void setBusinessHours(String businessHours) {
		this.businessHours = businessHours;
	}
	public String getNeigborhood() {
		return neigborhood;
	}
	public void setNeigborhood(String neigborhood) {
		this.neigborhood = neigborhood;
	}
	

}
