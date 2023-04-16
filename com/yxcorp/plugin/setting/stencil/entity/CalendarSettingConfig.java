package com.yxcorp.plugin.setting.stencil.entity.CalendarSettingConfig;
import java.io.Serializable;
import java.lang.String;
import com.yxcorp.gifshow.settings.stencil.entity.SettingLocalizedString;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class CalendarSettingConfig implements Serializable	// class@0008fe
{
    public final List groups;
    public final String pageKey;
    public final SettingLocalizedString title;

    public void CalendarSettingConfig(String p0,SettingLocalizedString p1,List p2){
       super();
       this.pageKey = p0;
       this.title = p1;
       this.groups = p2;
    }
    public static CalendarSettingConfig copy$default(CalendarSettingConfig p0,String p1,SettingLocalizedString p2,List p3,int p4,Object p5){
       CalendarSettingConfig pageKey;
       CalendarSettingConfig title;
       CalendarSettingConfig groups;
       if (p4 & 0x01) {
          pageKey = p0.pageKey;
       }
       if (p4 & 0x02) {
          title = p0.title;
       }
       if (p4 & 0x04) {
          groups = p0.groups;
       }
       return p0.copy(pageKey, title, groups);
    }
    public final String component1(){
       return this.pageKey;
    }
    public final SettingLocalizedString component2(){
       return this.title;
    }
    public final List component3(){
       return this.groups;
    }
    public final CalendarSettingConfig copy(String p0,SettingLocalizedString p1,List p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, CalendarSettingConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new CalendarSettingConfig(p0, p1, p2);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CalendarSettingConfig.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof CalendarSettingConfig && (a.g(this.pageKey, p0.pageKey) && (a.g(this.title, p0.title) && a.g(this.groups, p0.groups))))) {
          return true;
       }
       return false;
    }
    public final List getGroups(){
       return this.groups;
    }
    public final String getPageKey(){
       return this.pageKey;
    }
    public final SettingLocalizedString getTitle(){
       return this.title;
    }
    public int hashCode(){
       CalendarSettingConfig obj = PatchProxy.apply(null, this, CalendarSettingConfig.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.pageKey;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       CalendarSettingConfig ttitle = this.title;
       int i2 = (ttitle != null)? ttitle.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       ttitle = this.groups;
       if (ttitle != null) {
          i = ttitle.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, CalendarSettingConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "CalendarSettingConfig\(pageKey="+this.pageKey+", title="+this.title+", groups="+this.groups+"\)";
    }
}
