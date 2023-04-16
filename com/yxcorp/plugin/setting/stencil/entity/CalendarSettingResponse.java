package com.yxcorp.plugin.setting.stencil.entity.CalendarSettingResponse;
import java.io.Serializable;
import com.yxcorp.plugin.setting.stencil.entity.CalendarSettingConfig;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class CalendarSettingResponse implements Serializable	// class@000902
{
    public final CalendarSettingConfig settingConfig;

    public void CalendarSettingResponse(CalendarSettingConfig p0){
       super();
       this.settingConfig = p0;
    }
    public static CalendarSettingResponse copy$default(CalendarSettingResponse p0,CalendarSettingConfig p1,int p2,Object p3){
       CalendarSettingResponse settingConfi;
       if (p2 & 0x01) {
          settingConfi = p0.settingConfig;
       }
       return p0.copy(settingConfi);
    }
    public final CalendarSettingConfig component1(){
       return this.settingConfig;
    }
    public final CalendarSettingResponse copy(CalendarSettingConfig p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CalendarSettingResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new CalendarSettingResponse(p0);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CalendarSettingResponse.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof CalendarSettingResponse && a.g(this.settingConfig, p0.settingConfig))) {
          return true;
       }
       return false;
    }
    public final CalendarSettingConfig getSettingConfig(){
       return this.settingConfig;
    }
    public int hashCode(){
       CalendarSettingResponse obj = PatchProxy.apply(null, this, CalendarSettingResponse.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.settingConfig;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, CalendarSettingResponse.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "CalendarSettingResponse\(settingConfig="+this.settingConfig+"\)";
    }
}
