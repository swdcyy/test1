package com.kwai.feature.api.live.service.basic.baseinfo.LiveSceneInfoService$LiveSceneInfo$MerchantInfo;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public final class LiveSceneInfoService$LiveSceneInfo$MerchantInfo	// class@000ffa
{
    public final boolean hasShopCar;
    public final boolean merchantEntrance;

    public void LiveSceneInfoService$LiveSceneInfo$MerchantInfo(boolean p0,boolean p1){
       super();
       this.merchantEntrance = p0;
       this.hasShopCar = p1;
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof LiveSceneInfoService$LiveSceneInfo$MerchantInfo && (this.merchantEntrance == p0.merchantEntrance && this.hasShopCar == p0.hasShopCar))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       LiveSceneInfoService$LiveSceneInfo$MerchantInfo tmerchantEnt = this.merchantEntrance;
       int i = 1;
       if (tmerchantEnt != null) {
          tmerchantEnt = 1;
       }
       int i1 = tmerchantEnt * 31;
       LiveSceneInfoService$LiveSceneInfo$MerchantInfo thasShopCar = this.hasShopCar;
       if (thasShopCar == null) {
          i = thasShopCar;
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveSceneInfoService$LiveSceneInfo$MerchantInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "MerchantInfo\(merchantEntrance="+this.merchantEntrance+", hasShopCar="+this.hasShopCar+"\)";
    }
}
