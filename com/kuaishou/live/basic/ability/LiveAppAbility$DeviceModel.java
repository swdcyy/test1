package com.kuaishou.live.basic.ability.LiveAppAbility$DeviceModel;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LiveAppAbility$DeviceModel	// class@000c4e
{
    public String deviceModel;

    public void LiveAppAbility$DeviceModel(String p0){
       super();
       this.deviceModel = p0;
    }
    public static LiveAppAbility$DeviceModel copy$default(LiveAppAbility$DeviceModel p0,String p1,int p2,Object p3){
       LiveAppAbility$DeviceModel deviceModel;
       if (p2 & 0x01) {
          deviceModel = p0.deviceModel;
       }
       return p0.copy(deviceModel);
    }
    public final String component1(){
       return this.deviceModel;
    }
    public final LiveAppAbility$DeviceModel copy(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveAppAbility$DeviceModel.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveAppAbility$DeviceModel(p0);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveAppAbility$DeviceModel.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LiveAppAbility$DeviceModel && a.g(this.deviceModel, p0.deviceModel))) {
          return true;
       }
       return false;
    }
    public final String getDeviceModel(){
       return this.deviceModel;
    }
    public int hashCode(){
       LiveAppAbility$DeviceModel obj = PatchProxy.apply(null, this, LiveAppAbility$DeviceModel.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.deviceModel;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public final void setDeviceModel(String p0){
       this.deviceModel = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveAppAbility$DeviceModel.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "DeviceModel\(deviceModel="+this.deviceModel+"\)";
    }
}
