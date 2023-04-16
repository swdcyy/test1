package com.kwai.feature.api.platform.bridge.beans.GetLocationCityInfoResult;
import java.io.Serializable;
import com.kwai.framework.location.model.LocationCityInfo;
import java.lang.Object;

public class GetLocationCityInfoResult implements Serializable	// class@00104f
{
    public String address;
    public String city;
    public String country;
    public double latitude;
    public long locationTime;
    public double longitude;
    public String province;
    public String subLocality;

    public void GetLocationCityInfoResult(LocationCityInfo p0){
       super();
       if (p0 == null) {
          return;
       }
       this.longitude = p0.mLongitude;
       this.latitude = p0.mLatitude;
       this.address = p0.mAddress;
       this.country = p0.mCountry;
       this.province = p0.mProvince;
       this.city = p0.mCityName;
       this.subLocality = p0.mStreet;
       return;
    }
}
