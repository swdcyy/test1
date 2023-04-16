package com.kwai.framework.location.model.LocationCityInfo;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Float;
import ok.k;
import java.lang.Number;
import java.lang.StringBuilder;

public class LocationCityInfo implements Serializable	// class@000b85
{
    public double altitude;
    public float mAccuracy;
    public String mAddress;
    public String mCityName;
    public String mCountry;
    public String mCounty;
    public double mLatitude;
    public double mLongitude;
    public String mProvince;
    public String mStreet;
    public String sdkType;
    public float speed;
    public static final long serialVersionUID = 0x796b724f36386274;

    public void LocationCityInfo(){
       super();
       this.mCityName = "";
    }
    public void LocationCityInfo(String p0){
       super();
       this.mCityName = "";
       this.mCityName = p0;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LocationCityInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (p0 == null || this.getClass() != p0.getClass()) {
          return false;
       }
       if (Double.compare(p0.mLongitude, this.mLongitude) || (Double.compare(p0.mLatitude, this.mLatitude) || (Float.compare(p0.mAccuracy, this.mAccuracy) || (!k.a(this.mCityName, p0.mCityName) || (!k.a(this.mProvince, p0.mProvince) || (!k.a(this.mAddress, p0.mAddress) || (!k.a(this.mCountry, p0.mCountry) || (!k.a(this.mStreet, p0.mStreet) || !k.a(this.mCounty, p0.mCounty))))))))) {
          b = false;
       }
       return b;
    }
    public int hashCode(){
       Object[] obj = PatchProxy.apply(null, this, LocationCityInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = new Object[9];
       obj[0] = this.mCityName;
       obj[1] = Double.valueOf(this.mLongitude);
       obj[2] = Double.valueOf(this.mLatitude);
       obj[3] = this.mProvince;
       obj[4] = this.mAddress;
       obj[5] = this.mCountry;
       obj[6] = this.mStreet;
       obj[7] = this.mCounty;
       obj[8] = Float.valueOf(this.mAccuracy);
       return k.b(obj);
    }
    public boolean isInvalid(){
       Object obj = PatchProxy.apply(null, this, LocationCityInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (Double.isNaN(this.mLatitude) || Double.isNaN(this.mLongitude))? true: false;
       return b;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LocationCityInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LocationCityInfo{mCityName=\'"+this.mCityName+'''+", mLongitude="+this.mLongitude+", mLatitude="+this.mLatitude+", mProvince=\'"+this.mProvince+'''+", mAddress=\'"+this.mAddress+'''+", mCountry=\'"+this.mCountry+'''+", mStreet=\'"+this.mStreet+'''+", mCounty=\'"+this.mCounty+'''+", mAccuracy="+this.mAccuracy+'}';
    }
}
