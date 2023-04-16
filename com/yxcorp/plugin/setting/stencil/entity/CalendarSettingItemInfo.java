package com.yxcorp.plugin.setting.stencil.entity.CalendarSettingItemInfo;
import java.io.Serializable;
import com.yxcorp.gifshow.settings.stencil.entity.SettingLocalizedString;
import com.yxcorp.plugin.setting.stencil.entity.CalendarSettingSelectedOption;
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

public final class CalendarSettingItemInfo implements Serializable	// class@000901
{
    public final SettingLocalizedString description;
    public final int groupId;
    public final int id;
    public final SettingLocalizedString innerDescription;
    public final SettingLocalizedString name;
    public CalendarSettingSelectedOption selectedOption;
    public final SettingLocalizedString title;

    public void CalendarSettingItemInfo(SettingLocalizedString p0,SettingLocalizedString p1,SettingLocalizedString p2,SettingLocalizedString p3,CalendarSettingSelectedOption p4,int p5,int p6){
       super();
       this.name = p0;
       this.title = p1;
       this.description = p2;
       this.innerDescription = p3;
       this.selectedOption = p4;
       this.groupId = p5;
       this.id = p6;
    }
    public static CalendarSettingItemInfo copy$default(CalendarSettingItemInfo p0,SettingLocalizedString p1,SettingLocalizedString p2,SettingLocalizedString p3,SettingLocalizedString p4,CalendarSettingSelectedOption p5,int p6,int p7,int p8,Object p9){
       CalendarSettingItemInfo name;
       CalendarSettingItemInfo title;
       CalendarSettingItemInfo description;
       CalendarSettingItemInfo innerDescrip;
       CalendarSettingItemInfo selectedOpti;
       CalendarSettingItemInfo groupId;
       CalendarSettingItemInfo id;
       if (p8 & 0x01) {
          name = p0.name;
       }
       if (p8 & 0x02) {
          title = p0.title;
       }
       p9 = title;
       if (p8 & 0x04) {
          description = p0.description;
       }
       CalendarSettingItemInfo uCalendarSet = description;
       if (p8 & 0x08) {
          innerDescrip = p0.innerDescription;
       }
       CalendarSettingItemInfo uCalendarSet1 = innerDescrip;
       if (p8 & 0x10) {
          selectedOpti = p0.selectedOption;
       }
       CalendarSettingItemInfo uCalendarSet2 = selectedOpti;
       if (p8 & 0x20) {
          groupId = p0.groupId;
       }
       CalendarSettingItemInfo uCalendarSet3 = groupId;
       if (p8 & 0x40) {
          id = p0.id;
       }
       return p0.copy(name, p9, uCalendarSet, uCalendarSet1, uCalendarSet2, uCalendarSet3, id);
    }
    public final SettingLocalizedString component1(){
       return this.name;
    }
    public final SettingLocalizedString component2(){
       return this.title;
    }
    public final SettingLocalizedString component3(){
       return this.description;
    }
    public final SettingLocalizedString component4(){
       return this.innerDescription;
    }
    public final CalendarSettingSelectedOption component5(){
       return this.selectedOption;
    }
    public final int component6(){
       return this.groupId;
    }
    public final int component7(){
       return this.id;
    }
    public final CalendarSettingItemInfo copy(SettingLocalizedString p0,SettingLocalizedString p1,SettingLocalizedString p2,SettingLocalizedString p3,CalendarSettingSelectedOption p4,int p5,int p6){
       Object obj;
       if (PatchProxy.isSupport(CalendarSettingItemInfo.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4,Integer.valueOf(p5),Integer.valueOf(p6)};
          obj = PatchProxy.apply(objArray, this, CalendarSettingItemInfo.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }else {
          int i = this;
       }
       CalendarSettingItemInfo uCalendarSet = new CalendarSettingItemInfo(p0, p1, p2, p3, p4, p5, p6);
       return obj;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CalendarSettingItemInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof CalendarSettingItemInfo && (a.g(this.name, p0.name) && (a.g(this.title, p0.title) && (a.g(this.description, p0.description) && (a.g(this.innerDescription, p0.innerDescription) && (a.g(this.selectedOption, p0.selectedOption) && (this.groupId == p0.groupId && this.id == p0.id)))))))) {
          return true;
       }
       return false;
    }
    public final SettingLocalizedString getDescription(){
       return this.description;
    }
    public final int getGroupId(){
       return this.groupId;
    }
    public final int getId(){
       return this.id;
    }
    public final SettingLocalizedString getInnerDescription(){
       return this.innerDescription;
    }
    public final SettingLocalizedString getName(){
       return this.name;
    }
    public final CalendarSettingSelectedOption getSelectedOption(){
       return this.selectedOption;
    }
    public final SettingLocalizedString getTitle(){
       return this.title;
    }
    public int hashCode(){
       CalendarSettingItemInfo obj = PatchProxy.apply(null, this, CalendarSettingItemInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.name;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       CalendarSettingItemInfo ttitle = this.title;
       int i2 = (ttitle != null)? ttitle.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       ttitle = this.description;
       i2 = (ttitle != null)? ttitle.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       ttitle = this.innerDescription;
       i2 = (ttitle != null)? ttitle.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       ttitle = this.selectedOption;
       if (ttitle != null) {
          i = ttitle.hashCode();
       }
       return (((((i1 + i) * 31) + this.groupId) * 31) + this.id);
    }
    public final void setSelectedOption(CalendarSettingSelectedOption p0){
       this.selectedOption = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, CalendarSettingItemInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "CalendarSettingItemInfo\(name="+this.name+", title="+this.title+", description="+this.description+", innerDescription="+this.innerDescription+", selectedOption="+this.selectedOption+", groupId="+this.groupId+", id="+this.id+"\)";
    }
}
