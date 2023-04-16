package com.yxcorp.plugin.setting.stencil.entity.CalendarSettingItem;
import java.io.Serializable;
import java.lang.String;
import com.yxcorp.plugin.setting.stencil.entity.CalendarSettingItemInfo;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class CalendarSettingItem implements Serializable	// class@000900
{
    public final String itemKey;
    public final CalendarSettingItemInfo itemTypeInfo;

    public void CalendarSettingItem(String p0,CalendarSettingItemInfo p1){
       super();
       this.itemKey = p0;
       this.itemTypeInfo = p1;
    }
    public static CalendarSettingItem copy$default(CalendarSettingItem p0,String p1,CalendarSettingItemInfo p2,int p3,Object p4){
       CalendarSettingItem itemKey;
       CalendarSettingItem itemTypeInfo;
       if (p3 & 0x01) {
          itemKey = p0.itemKey;
       }
       if (p3 & 0x02) {
          itemTypeInfo = p0.itemTypeInfo;
       }
       return p0.copy(itemKey, itemTypeInfo);
    }
    public final String component1(){
       return this.itemKey;
    }
    public final CalendarSettingItemInfo component2(){
       return this.itemTypeInfo;
    }
    public final CalendarSettingItem copy(String p0,CalendarSettingItemInfo p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, CalendarSettingItem.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new CalendarSettingItem(p0, p1);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CalendarSettingItem.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof CalendarSettingItem && (a.g(this.itemKey, p0.itemKey) && a.g(this.itemTypeInfo, p0.itemTypeInfo)))) {
          return true;
       }
       return false;
    }
    public final String getItemKey(){
       return this.itemKey;
    }
    public final CalendarSettingItemInfo getItemTypeInfo(){
       return this.itemTypeInfo;
    }
    public int hashCode(){
       CalendarSettingItem obj = PatchProxy.apply(null, this, CalendarSettingItem.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.itemKey;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       CalendarSettingItem titemTypeInf = this.itemTypeInfo;
       if (titemTypeInf != null) {
          i = titemTypeInf.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, CalendarSettingItem.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "CalendarSettingItem\(itemKey="+this.itemKey+", itemTypeInfo="+this.itemTypeInfo+"\)";
    }
}
