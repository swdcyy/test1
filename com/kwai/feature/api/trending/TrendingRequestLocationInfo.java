package com.kwai.feature.api.trending.TrendingRequestLocationInfo;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import fg6.a;
import com.google.gson.Gson;

public class TrendingRequestLocationInfo implements Serializable	// class@0011c9
{
    public String mCityName;
    public String mProvince;
    public static final long serialVersionUID = 0x1233d0234c3b68ad;

    public void TrendingRequestLocationInfo(String p0,String p1){
       super();
       this.mProvince = p0;
       this.mCityName = p1;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, TrendingRequestLocationInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.a.q(this);
    }
}
