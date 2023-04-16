package com.yxcorp.gifshow.growth.model.response.GrowthScreensWidgetResponse$DesktopWidgetData;
import java.io.Serializable;
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

public final class GrowthScreensWidgetResponse$DesktopWidgetData implements Serializable	// class@001448
{
    public final int badgeCount;
    public final String iconUrl;
    public final String title;

    public void GrowthScreensWidgetResponse$DesktopWidgetData(int p0,String p1,String p2){
       super();
       this.badgeCount = p0;
       this.title = p1;
       this.iconUrl = p2;
    }
    public static GrowthScreensWidgetResponse$DesktopWidgetData copy$default(GrowthScreensWidgetResponse$DesktopWidgetData p0,int p1,String p2,String p3,int p4,Object p5){
       GrowthScreensWidgetResponse$DesktopWidgetData badgeCount;
       GrowthScreensWidgetResponse$DesktopWidgetData title;
       GrowthScreensWidgetResponse$DesktopWidgetData iconUrl;
       if (p4 & 0x01) {
          badgeCount = p0.badgeCount;
       }
       if (p4 & 0x02) {
          title = p0.title;
       }
       if (p4 & 0x04) {
          iconUrl = p0.iconUrl;
       }
       return p0.copy(badgeCount, title, iconUrl);
    }
    public final int component1(){
       return this.badgeCount;
    }
    public final String component2(){
       return this.title;
    }
    public final String component3(){
       return this.iconUrl;
    }
    public final GrowthScreensWidgetResponse$DesktopWidgetData copy(int p0,String p1,String p2){
       if (PatchProxy.isSupport(GrowthScreensWidgetResponse$DesktopWidgetData.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), p1, p2, this, GrowthScreensWidgetResponse$DesktopWidgetData.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new GrowthScreensWidgetResponse$DesktopWidgetData(p0, p1, p2);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, GrowthScreensWidgetResponse$DesktopWidgetData.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof GrowthScreensWidgetResponse$DesktopWidgetData && (this.badgeCount == p0.badgeCount && (a.g(this.title, p0.title) && a.g(this.iconUrl, p0.iconUrl))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, GrowthScreensWidgetResponse$DesktopWidgetData.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = this.badgeCount * 31;
       GrowthScreensWidgetResponse$DesktopWidgetData ttitle = this.title;
       int i1 = 0;
       int i2 = (ttitle != null)? ttitle.hashCode(): 0;
       i = (i + i2) * 31;
       ttitle = this.iconUrl;
       if (ttitle != null) {
          i1 = ttitle.hashCode();
       }
       return (i + i1);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, GrowthScreensWidgetResponse$DesktopWidgetData.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "DesktopWidgetData\(badgeCount="+this.badgeCount+", title="+this.title+", iconUrl="+this.iconUrl+"\)";
    }
}
