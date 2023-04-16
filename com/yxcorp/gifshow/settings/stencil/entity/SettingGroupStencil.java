package com.yxcorp.gifshow.settings.stencil.entity.SettingGroupStencil;
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

public final class SettingGroupStencil implements Serializable	// class@001b34
{
    public final String groupKey;
    public final List items;
    public final boolean teenagerModeEnable;
    public final SettingLocalizedString title;

    public void SettingGroupStencil(String p0,SettingLocalizedString p1,boolean p2,List p3){
       super();
       this.groupKey = p0;
       this.title = p1;
       this.teenagerModeEnable = p2;
       this.items = p3;
    }
    public static SettingGroupStencil copy$default(SettingGroupStencil p0,String p1,SettingLocalizedString p2,boolean p3,List p4,int p5,Object p6){
       SettingGroupStencil groupKey;
       SettingGroupStencil title;
       SettingGroupStencil teenagerMode;
       SettingGroupStencil items;
       if (p5 & 0x01) {
          groupKey = p0.groupKey;
       }
       if (p5 & 0x02) {
          title = p0.title;
       }
       if (p5 & 0x04) {
          teenagerMode = p0.teenagerModeEnable;
       }
       if (p5 & 0x08) {
          items = p0.items;
       }
       return p0.copy(groupKey, title, teenagerMode, items);
    }
    public final String component1(){
       return this.groupKey;
    }
    public final SettingLocalizedString component2(){
       return this.title;
    }
    public final boolean component3(){
       return this.teenagerModeEnable;
    }
    public final List component4(){
       return this.items;
    }
    public final SettingGroupStencil copy(String p0,SettingLocalizedString p1,boolean p2,List p3){
       if (PatchProxy.isSupport(SettingGroupStencil.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, p1, Boolean.valueOf(p2), p3, this, SettingGroupStencil.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new SettingGroupStencil(p0, p1, p2, p3);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SettingGroupStencil.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof SettingGroupStencil && (a.g(this.groupKey, p0.groupKey) && (a.g(this.title, p0.title) && (this.teenagerModeEnable == p0.teenagerModeEnable && a.g(this.items, p0.items)))))) {
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
    public final boolean getTeenagerModeEnable(){
       return this.teenagerModeEnable;
    }
    public final SettingLocalizedString getTitle(){
       return this.title;
    }
    public int hashCode(){
       SettingGroupStencil obj = PatchProxy.apply(null, this, SettingGroupStencil.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.groupKey;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       SettingGroupStencil ttitle = this.title;
       int i2 = (ttitle != null)? ttitle.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       ttitle = this.teenagerModeEnable;
       if (ttitle != null) {
          i2 = 1;
       }
       i1 = (i1 + i2) * 31;
       ttitle = this.items;
       if (ttitle != null) {
          i = ttitle.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, SettingGroupStencil.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "SettingGroupStencil\(groupKey="+this.groupKey+", title="+this.title+", teenagerModeEnable="+this.teenagerModeEnable+", items="+this.items+"\)";
    }
}
