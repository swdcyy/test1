package com.kwai.corona.startup.model.DanmakuServerSettingForeUpdateInfo;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;

public final class DanmakuServerSettingForeUpdateInfo implements Serializable	// class@000cf7
{
    public final boolean forceUpdate;
    public final int version;

    public void DanmakuServerSettingForeUpdateInfo(boolean p0,int p1){
       super();
       this.forceUpdate = p0;
       this.version = p1;
    }
    public static DanmakuServerSettingForeUpdateInfo copy$default(DanmakuServerSettingForeUpdateInfo p0,boolean p1,int p2,int p3,Object p4){
       DanmakuServerSettingForeUpdateInfo forceUpdate;
       DanmakuServerSettingForeUpdateInfo version;
       if (p3 & 0x01) {
          forceUpdate = p0.forceUpdate;
       }
       if (p3 & 0x02) {
          version = p0.version;
       }
       return p0.copy(forceUpdate, version);
    }
    public final boolean component1(){
       return this.forceUpdate;
    }
    public final int component2(){
       return this.version;
    }
    public final DanmakuServerSettingForeUpdateInfo copy(boolean p0,int p1){
       if (PatchProxy.isSupport(DanmakuServerSettingForeUpdateInfo.class)) {
          Object obj = PatchProxy.applyTwoRefs(Boolean.valueOf(p0), Integer.valueOf(p1), this, DanmakuServerSettingForeUpdateInfo.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new DanmakuServerSettingForeUpdateInfo(p0, p1);
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof DanmakuServerSettingForeUpdateInfo && (this.forceUpdate == p0.forceUpdate && this.version == p0.version))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       int i;
       DanmakuServerSettingForeUpdateInfo obj = PatchProxy.apply(null, this, DanmakuServerSettingForeUpdateInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.forceUpdate;
       if (obj != null) {
          i = 1;
       }
       return ((i * 31) + this.version);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, DanmakuServerSettingForeUpdateInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "DanmakuServerSettingForeUpdateInfo\(forceUpdate="+this.forceUpdate+", version="+this.version+"\)";
    }
}
