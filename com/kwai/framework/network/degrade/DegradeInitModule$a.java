package com.kwai.framework.network.degrade.DegradeInitModule$a;
import com.kwai.framework.network.degrade.e$b;
import com.kwai.framework.network.degrade.DegradeInitModule;
import java.lang.Object;
import com.yxcorp.gifshow.retrofit.degrade.DegradeConfig$UrlDegrade;
import okhttp3.Request;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import hyb.d;
import sid.e0;
import ch.hsr.geohash.GeoHash;

public class DegradeInitModule$a implements e$b	// class@0017b3
{
    public final String a;
    public final DegradeInitModule b;

    public void DegradeInitModule$a(DegradeInitModule p0){
       this.b = p0;
       super();
       this.a = "nohash";
    }
    public String a(DegradeConfig$UrlDegrade p0,Request p1,String p2){
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, DegradeInitModule$a.class, "1");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       d uod = e0.d();
       if (uod == null) {
          return "nohash";
       }
       double latitude = uod.getLatitude();
       double longitude = uod.getLongitude();
       if (p0 != null) {
          DegradeConfig$UrlDegrade mLatScope = p0.mLatScope;
          if (latitude - mLatScope[0] >= 0 && latitude - mLatScope[1] <= 0) {
             DegradeConfig$UrlDegrade mLonScope = p0.mLonScope;
             if (longitude - mLonScope[0] >= 0 && longitude - mLonScope[1] <= 0) {
                return GeoHash.geoHashStringWithCharacterPrecision(uod.getLatitude(), uod.getLongitude(), p0.mPrecision);
             }
          }
       }
       return "nohash";
    }
}
