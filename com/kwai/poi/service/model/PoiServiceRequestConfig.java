package com.kwai.poi.service.model.PoiServiceRequestConfig;
import java.io.Serializable;
import com.kwai.poi.service.model.PoiServiceRequestConfig$a;
import nsd.u;
import com.kwai.poi.service.model.PoiServiceConfigInfo;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class PoiServiceRequestConfig implements Serializable	// class@0013b7
{
    public final PoiServiceConfigInfo keyWordConfigInfo;
    public final PoiServiceConfigInfo nearbyConfig;
    public static final PoiServiceRequestConfig$a Companion;
    public static final long serialVersionUID;

    static {
       PoiServiceRequestConfig.Companion = new PoiServiceRequestConfig$a(null);
    }
    public void PoiServiceRequestConfig(){
       super(null, null, 3, null);
    }
    public void PoiServiceRequestConfig(PoiServiceConfigInfo p0,PoiServiceConfigInfo p1){
       a.p(p0, "nearbyConfig");
       a.p(p1, "keyWordConfigInfo");
       super();
       this.nearbyConfig = p0;
       this.keyWordConfigInfo = p1;
    }
    public void PoiServiceRequestConfig(PoiServiceConfigInfo p0,PoiServiceConfigInfo p1,int p2,u p3){
       PoiServiceConfigInfo poiServiceCo;
       if (p2 & 0x01) {
          poiServiceCo = new PoiServiceConfigInfo(0, 0, null, 0, false, 31, null);
       }
       if (p2 & 0x02) {
          poiServiceCo = new PoiServiceConfigInfo(1, 0, null, 0, false, 30, null);
       }
       super(p0, p1);
       return;
    }
    public static PoiServiceRequestConfig copy$default(PoiServiceRequestConfig p0,PoiServiceConfigInfo p1,PoiServiceConfigInfo p2,int p3,Object p4){
       PoiServiceRequestConfig nearbyConfig;
       PoiServiceRequestConfig keyWordConfi;
       if (p3 & 0x01) {
          nearbyConfig = p0.nearbyConfig;
       }
       if (p3 & 0x02) {
          keyWordConfi = p0.keyWordConfigInfo;
       }
       return p0.copy(nearbyConfig, keyWordConfi);
    }
    public final PoiServiceConfigInfo component1(){
       return this.nearbyConfig;
    }
    public final PoiServiceConfigInfo component2(){
       return this.keyWordConfigInfo;
    }
    public final PoiServiceRequestConfig copy(PoiServiceConfigInfo p0,PoiServiceConfigInfo p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, PoiServiceRequestConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "nearbyConfig");
       a.p(p1, "keyWordConfigInfo");
       return new PoiServiceRequestConfig(p0, p1);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PoiServiceRequestConfig.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof PoiServiceRequestConfig && (a.g(this.nearbyConfig, p0.nearbyConfig) && a.g(this.keyWordConfigInfo, p0.keyWordConfigInfo)))) {
          return true;
       }
       return false;
    }
    public final PoiServiceConfigInfo getKeyWordConfigInfo(){
       return this.keyWordConfigInfo;
    }
    public final PoiServiceConfigInfo getNearbyConfig(){
       return this.nearbyConfig;
    }
    public int hashCode(){
       PoiServiceRequestConfig obj = PatchProxy.apply(null, this, PoiServiceRequestConfig.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.nearbyConfig;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       PoiServiceRequestConfig tkeyWordConf = this.keyWordConfigInfo;
       if (tkeyWordConf != null) {
          i = tkeyWordConf.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, PoiServiceRequestConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "PoiServiceRequestConfig\(nearbyConfig="+this.nearbyConfig+", keyWordConfigInfo="+this.keyWordConfigInfo+"\)";
    }
}
