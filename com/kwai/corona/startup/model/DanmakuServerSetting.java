package com.kwai.corona.startup.model.DanmakuServerSetting;
import java.io.Serializable;
import com.kwai.corona.startup.model.DanmakuServerSetting$a;
import nsd.u;
import com.kwai.corona.startup.model.DanmakuServerSettingForeUpdateInfo;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class DanmakuServerSetting implements Serializable	// class@000cf6
{
    public final int fontSize;
    public final DanmakuServerSettingForeUpdateInfo forceUpdateInfo;
    public final int lineCount;
    public final int opacity;
    public final int speed;
    public static final DanmakuServerSetting$a Companion;

    static {
       DanmakuServerSetting.Companion = new DanmakuServerSetting$a(null);
    }
    public void DanmakuServerSetting(DanmakuServerSettingForeUpdateInfo p0,int p1,int p2,int p3,int p4){
       super();
       this.forceUpdateInfo = p0;
       this.opacity = p1;
       this.lineCount = p2;
       this.speed = p3;
       this.fontSize = p4;
    }
    public static DanmakuServerSetting copy$default(DanmakuServerSetting p0,DanmakuServerSettingForeUpdateInfo p1,int p2,int p3,int p4,int p5,int p6,Object p7){
       DanmakuServerSetting forceUpdateI;
       DanmakuServerSetting opacity;
       DanmakuServerSetting lineCount;
       DanmakuServerSetting speed;
       DanmakuServerSetting fontSize;
       if (p6 & 0x01) {
          forceUpdateI = p0.forceUpdateInfo;
       }
       if (p6 & 0x02) {
          opacity = p0.opacity;
       }
       p7 = opacity;
       if (p6 & 0x04) {
          lineCount = p0.lineCount;
       }
       DanmakuServerSetting uDanmakuServ = lineCount;
       if (p6 & 0x08) {
          speed = p0.speed;
       }
       DanmakuServerSetting uDanmakuServ1 = speed;
       if (p6 & 0x10) {
          fontSize = p0.fontSize;
       }
       return p0.copy(forceUpdateI, p7, uDanmakuServ, uDanmakuServ1, fontSize);
    }
    public final DanmakuServerSettingForeUpdateInfo component1(){
       return this.forceUpdateInfo;
    }
    public final int component2(){
       return this.opacity;
    }
    public final int component3(){
       return this.lineCount;
    }
    public final int component4(){
       return this.speed;
    }
    public final int component5(){
       return this.fontSize;
    }
    public final DanmakuServerSetting copy(DanmakuServerSettingForeUpdateInfo p0,int p1,int p2,int p3,int p4){
       Object obj;
       if (PatchProxy.isSupport(DanmakuServerSetting.class)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          obj = PatchProxy.apply(objArray, this, DanmakuServerSetting.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       DanmakuServerSetting uDanmakuServ = new DanmakuServerSetting(p0, p1, p2, p3, p4);
       return obj;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, DanmakuServerSetting.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof DanmakuServerSetting && (a.g(this.forceUpdateInfo, p0.forceUpdateInfo) && (this.opacity == p0.opacity && (this.lineCount == p0.lineCount && (this.speed == p0.speed && this.fontSize == p0.fontSize)))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       DanmakuServerSetting obj = PatchProxy.apply(null, this, DanmakuServerSetting.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.forceUpdateInfo;
       int i = (obj != null)? obj.hashCode(): 0;
       return ((((((((i * 31) + this.opacity) * 31) + this.lineCount) * 31) + this.speed) * 31) + this.fontSize);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, DanmakuServerSetting.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "DanmakuServerSetting\(forceUpdateInfo="+this.forceUpdateInfo+", opacity="+this.opacity+", lineCount="+this.lineCount+", speed="+this.speed+", fontSize="+this.fontSize+"\)";
    }
}
