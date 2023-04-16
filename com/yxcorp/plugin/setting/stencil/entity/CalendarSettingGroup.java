package com.yxcorp.plugin.setting.stencil.entity.CalendarSettingGroup;
import java.io.Serializable;
import java.lang.String;
import com.yxcorp.gifshow.settings.stencil.entity.SettingLocalizedString;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class CalendarSettingGroup implements Serializable	// class@0008ff
{
    public final String groupKey;
    public final List items;
    public final boolean showTitle;
    public final boolean teenagerModeEnable;
    public final SettingLocalizedString title;

    public void CalendarSettingGroup(String p0,SettingLocalizedString p1,boolean p2,boolean p3,List p4){
       super();
       this.groupKey = p0;
       this.title = p1;
       this.showTitle = p2;
       this.teenagerModeEnable = p3;
       this.items = p4;
    }
    public static CalendarSettingGroup copy$default(CalendarSettingGroup p0,String p1,SettingLocalizedString p2,boolean p3,boolean p4,List p5,int p6,Object p7){
       CalendarSettingGroup groupKey;
       CalendarSettingGroup title;
       CalendarSettingGroup showTitle;
       CalendarSettingGroup teenagerMode;
       CalendarSettingGroup items;
       if (p6 & 0x01) {
          groupKey = p0.groupKey;
       }
       if (p6 & 0x02) {
          title = p0.title;
       }
       p7 = title;
       if (p6 & 0x04) {
          showTitle = p0.showTitle;
       }
       CalendarSettingGroup uCalendarSet = showTitle;
       if (p6 & 0x08) {
          teenagerMode = p0.teenagerModeEnable;
       }
       CalendarSettingGroup uCalendarSet1 = teenagerMode;
       if (p6 & 0x10) {
          items = p0.items;
       }
       return p0.copy(groupKey, p7, uCalendarSet, uCalendarSet1, items);
    }
    public final String component1(){
       return this.groupKey;
    }
    public final SettingLocalizedString component2(){
       return this.title;
    }
    public final boolean component3(){
       return this.showTitle;
    }
    public final boolean component4(){
       return this.teenagerModeEnable;
    }
    public final List component5(){
       return this.items;
    }
    public final CalendarSettingGroup copy(String p0,SettingLocalizedString p1,boolean p2,boolean p3,List p4){
       Object obj;
       if (PatchProxy.isSupport(CalendarSettingGroup.class)) {
          Object[] objArray = new Object[]{p0,p1,Boolean.valueOf(p2),Boolean.valueOf(p3),p4};
          obj = PatchProxy.apply(objArray, this, CalendarSettingGroup.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       CalendarSettingGroup uCalendarSet = new CalendarSettingGroup(p0, p1, p2, p3, p4);
       return obj;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CalendarSettingGroup.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof CalendarSettingGroup && (a.g(this.groupKey, p0.groupKey) && (a.g(this.title, p0.title) && (this.showTitle == p0.showTitle && (this.teenagerModeEnable == p0.teenagerModeEnable && a.g(this.items, p0.items))))))) {
          return true;
       }
       return false;
    }
    public final String getGroupKey(){
       return this.groupKey;
    }
    public final List getItems(){
       return this.items;
    }
    public final boolean getShowTitle(){
       return this.showTitle;
    }
    public final boolean getTeenagerModeEnable(){
       return this.teenagerModeEnable;
    }
    public final SettingLocalizedString getTitle(){
       return this.title;
    }
    public int hashCode(){
       CalendarSettingGroup obj = PatchProxy.apply(null, this, CalendarSettingGroup.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.groupKey;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       CalendarSettingGroup ttitle = this.title;
       int i2 = (ttitle != null)? ttitle.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       ttitle = this.showTitle;
       int i3 = 1;
       if (ttitle != null) {
          i2 = 1;
       }
       i1 = (i1 + i2) * 31;
       ttitle = this.teenagerModeEnable;
       if (ttitle == null) {
          i3 = ttitle;
       }
       i1 = (i1 + i3) * 31;
       ttitle = this.items;
       if (ttitle != null) {
          i = ttitle.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, CalendarSettingGroup.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "CalendarSettingGroup\(groupKey="+this.groupKey+", title="+this.title+", showTitle="+this.showTitle+", teenagerModeEnable="+this.teenagerModeEnable+", items="+this.items+"\)";
    }
}
