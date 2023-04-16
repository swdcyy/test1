package com.yxcorp.gifshow.activity.share.topic.ShareTopicExtra$LocationInfo;
import java.io.Serializable;
import com.yxcorp.gifshow.activity.share.topic.ShareTopicExtra$LocationInfo$a;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import java.lang.Double;

public final class ShareTopicExtra$LocationInfo implements Serializable	// class@001468
{
    public String address;
    public String cityName;
    public String country;
    public Double latitude;
    public Double longitude;
    public String province;
    public static final ShareTopicExtra$LocationInfo$a Companion;
    public static final long serialVersionUID;

    static {
       ShareTopicExtra$LocationInfo.Companion = new ShareTopicExtra$LocationInfo$a(null);
    }
    public void ShareTopicExtra$LocationInfo(){
       super();
    }
    public final String getAddress(){
       return this.address;
    }
    public final String getCityName(){
       return this.cityName;
    }
    public final String getCountry(){
       return this.country;
    }
    public final Double getLatitude(){
       return this.latitude;
    }
    public final Double getLongitude(){
       return this.longitude;
    }
    public final String getProvince(){
       return this.province;
    }
    public final void setAddress(String p0){
       this.address = p0;
    }
    public final void setCityName(String p0){
       this.cityName = p0;
    }
    public final void setCountry(String p0){
       this.country = p0;
    }
    public final void setLatitude(Double p0){
       this.latitude = p0;
    }
    public final void setLongitude(Double p0){
       this.longitude = p0;
    }
    public final void setProvince(String p0){
       this.province = p0;
    }
}
