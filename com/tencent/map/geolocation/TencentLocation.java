package com.tencent.map.geolocation.TencentLocation;
import java.lang.String;
import java.lang.Integer;
import android.os.Bundle;
import java.util.List;

public interface abstract TencentLocation	// class@000e5a
{

    float getAccuracy();
    String getAddress();
    double getAltitude();
    Integer getAreaStat();
    float getBearing();
    String getCity();
    String getCityCode();
    String getCityPhoneCode();
    int getCoordinateType();
    double getDirection();
    String getDistrict();
    long getElapsedRealtime();
    Bundle getExtra();
    int getGPSRssi();
    String getIndoorBuildingFloor();
    String getIndoorBuildingId();
    int getIndoorLocationType();
    double getLatitude();
    double getLongitude();
    String getName();
    String getNation();
    List getPoiList();
    String getProvider();
    String getProvince();
    float getSpeed();
    String getStreet();
    String getStreetNo();
    long getTime();
    String getTown();
    String getVillage();
    int isMockGps();
}
