package com.kwai.framework.location.locationupload.LocationUploadConfig;
import java.lang.Object;
import com.kwai.framework.location.locationupload.LocationUploadConfig$DynamicConfig;
import com.kwai.framework.location.locationupload.LocationUploadConfig$Filter;
import java.util.List;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Integer;

public class LocationUploadConfig	// class@001638
{
    public int cellUpload;
    public int countLimit;
    public LocationUploadConfig$DynamicConfig dynamicConfig;
    public List mIntervals;
    public int wifiScanCount;

    public void LocationUploadConfig(){
       super();
    }
    public int a(){
       return this.dynamicConfig.filter.cnt;
    }
    public List b(){
       return this.mIntervals;
    }
    public String c(){
       LocationUploadConfig obj = PatchProxy.apply(null, this, LocationUploadConfig.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.dynamicConfig;
       if (obj != null && obj.a()) {
          return this.dynamicConfig.tag;
       }
       return "";
    }
    public boolean d(){
       LocationUploadConfig obj = PatchProxy.apply(null, this, LocationUploadConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.dynamicConfig;
       boolean b = (obj != null && obj.a())? true: false;
       return b;
    }
    public boolean e(int p0){
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LocationUploadConfig locationUplo = LocationUploadConfig.class;
       if (PatchProxy.isSupport(locationUplo)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, locationUplo, "5");
          if (obj != patchProxyRe) {
             return obj.booleanValue();
          }
       }
       Object obj1 = PatchProxy.apply(null, this, locationUplo, "4");
       boolean b = true;
       if (obj1 != patchProxyRe) {
          b1 = obj1.booleanValue();
       }else if(this.mIntervals != null && this.b().size() == this.countLimit){
          b1 = true;
       }else {
          b1 = false;
       }
       if (!b1 || p0 >= this.countLimit) {
          b = false;
       }
       return b;
    }
}
