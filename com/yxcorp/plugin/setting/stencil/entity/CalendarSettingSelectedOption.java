package com.yxcorp.plugin.setting.stencil.entity.CalendarSettingSelectedOption;
import java.io.Serializable;
import com.yxcorp.gifshow.settings.stencil.entity.SettingLocalizedString;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class CalendarSettingSelectedOption implements Serializable	// class@000903
{
    public final SettingLocalizedString name;
    public final SettingLocalizedString selectedName;
    public final String type;
    public final int value;

    public void CalendarSettingSelectedOption(SettingLocalizedString p0,SettingLocalizedString p1,int p2,String p3){
       super();
       this.selectedName = p0;
       this.name = p1;
       this.value = p2;
       this.type = p3;
    }
    public static CalendarSettingSelectedOption copy$default(CalendarSettingSelectedOption p0,SettingLocalizedString p1,SettingLocalizedString p2,int p3,String p4,int p5,Object p6){
       CalendarSettingSelectedOption selectedName;
       CalendarSettingSelectedOption name;
       CalendarSettingSelectedOption value;
       CalendarSettingSelectedOption type;
       if (p5 & 0x01) {
          selectedName = p0.selectedName;
       }
       if (p5 & 0x02) {
          name = p0.name;
       }
       if (p5 & 0x04) {
          value = p0.value;
       }
       if (p5 & 0x08) {
          type = p0.type;
       }
       return p0.copy(selectedName, name, value, type);
    }
    public final SettingLocalizedString component1(){
       return this.selectedName;
    }
    public final SettingLocalizedString component2(){
       return this.name;
    }
    public final int component3(){
       return this.value;
    }
    public final String component4(){
       return this.type;
    }
    public final CalendarSettingSelectedOption copy(SettingLocalizedString p0,SettingLocalizedString p1,int p2,String p3){
       if (PatchProxy.isSupport(CalendarSettingSelectedOption.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, p1, Integer.valueOf(p2), p3, this, CalendarSettingSelectedOption.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new CalendarSettingSelectedOption(p0, p1, p2, p3);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CalendarSettingSelectedOption.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof CalendarSettingSelectedOption && (a.g(this.selectedName, p0.selectedName) && (a.g(this.name, p0.name) && (this.value == p0.value && a.g(this.type, p0.type)))))) {
          return true;
       }
       return false;
    }
    public final SettingLocalizedString getName(){
       return this.name;
    }
    public final SettingLocalizedString getSelectedName(){
       return this.selectedName;
    }
    public final String getType(){
       return this.type;
    }
    public final int getValue(){
       return this.value;
    }
    public int hashCode(){
       CalendarSettingSelectedOption obj = PatchProxy.apply(null, this, CalendarSettingSelectedOption.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.selectedName;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       CalendarSettingSelectedOption tname = this.name;
       int i2 = (tname != null)? tname.hashCode(): 0;
       i1 = (((i1 + i2) * 31) + this.value) * 31;
       tname = this.type;
       if (tname != null) {
          i = tname.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, CalendarSettingSelectedOption.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "CalendarSettingSelectedOption\(selectedName="+this.selectedName+", name="+this.name+", value="+this.value+", type="+this.type+"\)";
    }
}
