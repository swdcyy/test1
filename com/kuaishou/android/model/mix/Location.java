package com.kuaishou.android.model.mix.Location;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;

public class Location implements Serializable	// class@000d0d
{
    public double latitude;
    public double longitude;
    public String mAddress;
    public int mCheckType;
    public String mCity;
    public long mDistance;
    public String mExtParams;
    public long mId;
    public String mLinkUrl;
    public int mLocationImg;
    public String mOverrideTitle;
    public int mPoiOwnerType;
    public String mTitle;
    public List mTypeList;
    public boolean showed;
    public static final long serialVersionUID = 0xff;

    public void Location(){
       super();
    }
    public String getAddress(){
       return this.mAddress;
    }
    public int getCheckType(){
       return this.mCheckType;
    }
    public String getCity(){
       return this.mCity;
    }
    public long getDistance(){
       return this.mDistance;
    }
    public String getExtParams(){
       return this.mExtParams;
    }
    public long getId(){
       return this.mId;
    }
    public double getLatitude(){
       return this.latitude;
    }
    public String getLinkUrl(){
       return this.mLinkUrl;
    }
    public double getLongitude(){
       return this.longitude;
    }
    public String getOverrideTitle(){
       return this.mOverrideTitle;
    }
    public int getPoiOwnerType(){
       return this.mPoiOwnerType;
    }
    public String getTitle(){
       return this.mTitle;
    }
}
