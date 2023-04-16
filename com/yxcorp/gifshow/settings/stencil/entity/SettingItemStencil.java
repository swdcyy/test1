package com.yxcorp.gifshow.settings.stencil.entity.SettingItemStencil;
import java.io.Serializable;
import java.lang.String;
import com.yxcorp.gifshow.settings.stencil.entity.SettingLocalizedString;
import com.yxcorp.gifshow.settings.stencil.entity.SettingItemStencilType;
import java.lang.Integer;
import java.util.Map;
import com.yxcorp.gifshow.settings.stencil.entity.action.SettingPageAction;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;

public final class SettingItemStencil implements Serializable	// class@001b35
{
    public SettingPageAction action;
    public String description;
    public String iconDarkUrl;
    public String iconUrl;
    public final String itemKey;
    public String itemLogName;
    public final SettingItemStencilType itemType;
    public final Integer redDotType;
    public Map statusTitle;
    public SettingLocalizedString subTitle;
    public final boolean teenagerModeEnable;
    public SettingLocalizedString title;

    public void SettingItemStencil(String p0,SettingLocalizedString p1,String p2,SettingItemStencilType p3,String p4,String p5,String p6,Integer p7,boolean p8,SettingLocalizedString p9,Map p10,SettingPageAction p11){
       a.p(p3, "itemType");
       super();
       this.itemKey = p0;
       this.title = p1;
       this.itemLogName = p2;
       this.itemType = p3;
       this.description = p4;
       this.iconUrl = p5;
       this.iconDarkUrl = p6;
       this.redDotType = p7;
       this.teenagerModeEnable = p8;
       this.subTitle = p9;
       this.statusTitle = p10;
       this.action = p11;
    }
    public static SettingItemStencil copy$default(SettingItemStencil p0,String p1,SettingLocalizedString p2,String p3,SettingItemStencilType p4,String p5,String p6,String p7,Integer p8,boolean p9,SettingLocalizedString p10,Map p11,SettingPageAction p12,int p13,Object p14){
       SettingItemStencil settingItemS = p0;
       int i = p13;
       SettingItemStencil itemKey = (i & 0x01)? settingItemS.itemKey: p1;
       SettingItemStencil title = (i & 0x02)? settingItemS.title: p2;
       SettingItemStencil itemLogName = (i & 0x04)? settingItemS.itemLogName: p3;
       SettingItemStencil itemType = (i & 0x08)? settingItemS.itemType: p4;
       SettingItemStencil description = (i & 0x10)? settingItemS.description: p5;
       SettingItemStencil iconUrl = (i & 0x20)? settingItemS.iconUrl: p6;
       SettingItemStencil iconDarkUrl = (i & 0x40)? settingItemS.iconDarkUrl: p7;
       SettingItemStencil redDotType = (i & 0x0080)? settingItemS.redDotType: p8;
       SettingItemStencil teenagerMode = (i & 0x0100)? settingItemS.teenagerModeEnable: p9;
       SettingItemStencil subTitle = (i & 0x0200)? settingItemS.subTitle: p10;
       SettingItemStencil statusTitle = (i & 0x0400)? settingItemS.statusTitle: p11;
       SettingItemStencil action = (i & 0x0800)? settingItemS.action: p12;
       return p0.copy(itemKey, title, itemLogName, itemType, description, iconUrl, iconDarkUrl, redDotType, teenagerMode, subTitle, statusTitle, action);
    }
    public final String component1(){
       return this.itemKey;
    }
    public final SettingLocalizedString component10(){
       return this.subTitle;
    }
    public final Map component11(){
       return this.statusTitle;
    }
    public final SettingPageAction component12(){
       return this.action;
    }
    public final SettingLocalizedString component2(){
       return this.title;
    }
    public final String component3(){
       return this.itemLogName;
    }
    public final SettingItemStencilType component4(){
       return this.itemType;
    }
    public final String component5(){
       return this.description;
    }
    public final String component6(){
       return this.iconUrl;
    }
    public final String component7(){
       return this.iconDarkUrl;
    }
    public final Integer component8(){
       return this.redDotType;
    }
    public final boolean component9(){
       return this.teenagerModeEnable;
    }
    public final SettingItemStencil copy(String p0,SettingLocalizedString p1,String p2,SettingItemStencilType p3,String p4,String p5,String p6,Integer p7,boolean p8,SettingLocalizedString p9,Map p10,SettingPageAction p11){
       SettingItemStencil obj;
       object oobject = p3;
       if (PatchProxy.isSupport(SettingItemStencil.class)) {
          Object[] objArray = new Object[12];
          objArray[0] = p0;
          objArray[1] = p1;
          objArray[2] = p2;
          objArray[3] = oobject;
          objArray[4] = p4;
          objArray[5] = p5;
          objArray[6] = p6;
          objArray[7] = p7;
          objArray[8] = Boolean.valueOf(p8);
          objArray[9] = p9;
          objArray[10] = p10;
          objArray[11] = p11;
          obj = PatchProxy.apply(objArray, this, SettingItemStencil.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }else {
          int i = this;
       }
       a.p(oobject, "itemType");
       obj = new SettingItemStencil(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11);
       return v14;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SettingItemStencil.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof SettingItemStencil && (a.g(this.itemKey, p0.itemKey) && (a.g(this.title, p0.title) && (a.g(this.itemLogName, p0.itemLogName) && (a.g(this.itemType, p0.itemType) && (a.g(this.description, p0.description) && (a.g(this.iconUrl, p0.iconUrl) && (a.g(this.iconDarkUrl, p0.iconDarkUrl) && (a.g(this.redDotType, p0.redDotType) && (this.teenagerModeEnable == p0.teenagerModeEnable && (a.g(this.subTitle, p0.subTitle) && (a.g(this.statusTitle, p0.statusTitle) && a.g(this.action, p0.action)))))))))))))) {
          return true;
       }
       return false;
    }
    public final SettingPageAction getAction(){
       return this.action;
    }
    public final String getDescription(){
       return this.description;
    }
    public final String getIconDarkUrl(){
       return this.iconDarkUrl;
    }
    public final String getIconUrl(){
       return this.iconUrl;
    }
    public final String getItemKey(){
       return this.itemKey;
    }
    public final String getItemLogName(){
       return this.itemLogName;
    }
    public final SettingItemStencilType getItemType(){
       return this.itemType;
    }
    public final Integer getRedDotType(){
       return this.redDotType;
    }
    public final Map getStatusTitle(){
       return this.statusTitle;
    }
    public final SettingLocalizedString getSubTitle(){
       return this.subTitle;
    }
    public final boolean getTeenagerModeEnable(){
       return this.teenagerModeEnable;
    }
    public final SettingLocalizedString getTitle(){
       return this.title;
    }
    public int hashCode(){
       SettingItemStencil obj = PatchProxy.apply(null, this, SettingItemStencil.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.itemKey;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       SettingItemStencil ttitle = this.title;
       int i2 = (ttitle != null)? ttitle.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       ttitle = this.itemLogName;
       i2 = (ttitle != null)? ttitle.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       ttitle = this.itemType;
       i2 = (ttitle != null)? ttitle.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       ttitle = this.description;
       i2 = (ttitle != null)? ttitle.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       ttitle = this.iconUrl;
       i2 = (ttitle != null)? ttitle.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       ttitle = this.iconDarkUrl;
       i2 = (ttitle != null)? ttitle.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       ttitle = this.redDotType;
       i2 = (ttitle != null)? ttitle.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       ttitle = this.teenagerModeEnable;
       if (ttitle != null) {
          i2 = 1;
       }
       i1 = (i1 + i2) * 31;
       ttitle = this.subTitle;
       i2 = (ttitle != null)? ttitle.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       ttitle = this.statusTitle;
       i2 = (ttitle != null)? ttitle.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       ttitle = this.action;
       if (ttitle != null) {
          i = ttitle.hashCode();
       }
       return (i1 + i);
    }
    public final void setAction(SettingPageAction p0){
       this.action = p0;
    }
    public final void setDescription(String p0){
       this.description = p0;
    }
    public final void setIconDarkUrl(String p0){
       this.iconDarkUrl = p0;
    }
    public final void setIconUrl(String p0){
       this.iconUrl = p0;
    }
    public final void setItemLogName(String p0){
       this.itemLogName = p0;
    }
    public final void setStatusTitle(Map p0){
       this.statusTitle = p0;
    }
    public final void setSubTitle(SettingLocalizedString p0){
       this.subTitle = p0;
    }
    public final void setTitle(SettingLocalizedString p0){
       this.title = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, SettingItemStencil.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "SettingItemStencil\(itemKey="+this.itemKey+", title="+this.title+", itemLogName="+this.itemLogName+", itemType="+this.itemType+", description="+this.description+", iconUrl="+this.iconUrl+", iconDarkUrl="+this.iconDarkUrl+", redDotType="+this.redDotType+", teenagerModeEnable="+this.teenagerModeEnable+", subTitle="+this.subTitle+", statusTitle="+this.statusTitle+", action="+this.action+"\)";
    }
}
