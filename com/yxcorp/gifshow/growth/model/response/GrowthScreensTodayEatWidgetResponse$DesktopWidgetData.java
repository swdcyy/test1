package com.yxcorp.gifshow.growth.model.response.GrowthScreensTodayEatWidgetResponse$DesktopWidgetData;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class GrowthScreensTodayEatWidgetResponse$DesktopWidgetData implements Serializable	// class@001446
{
    public final String background;
    public final String cuisine;
    public final String linkUrl;
    public final String subTitle;
    public final String title;

    public void GrowthScreensTodayEatWidgetResponse$DesktopWidgetData(String p0,String p1,String p2,String p3,String p4){
       super();
       this.title = p0;
       this.subTitle = p1;
       this.cuisine = p2;
       this.linkUrl = p3;
       this.background = p4;
    }
    public static GrowthScreensTodayEatWidgetResponse$DesktopWidgetData copy$default(GrowthScreensTodayEatWidgetResponse$DesktopWidgetData p0,String p1,String p2,String p3,String p4,String p5,int p6,Object p7){
       GrowthScreensTodayEatWidgetResponse$DesktopWidgetData title;
       GrowthScreensTodayEatWidgetResponse$DesktopWidgetData subTitle;
       GrowthScreensTodayEatWidgetResponse$DesktopWidgetData cuisine;
       GrowthScreensTodayEatWidgetResponse$DesktopWidgetData linkUrl;
       GrowthScreensTodayEatWidgetResponse$DesktopWidgetData background;
       if (p6 & 0x01) {
          title = p0.title;
       }
       if (p6 & 0x02) {
          subTitle = p0.subTitle;
       }
       p7 = subTitle;
       if (p6 & 0x04) {
          cuisine = p0.cuisine;
       }
       GrowthScreensTodayEatWidgetResponse$DesktopWidgetData uDesktopWidg = cuisine;
       if (p6 & 0x08) {
          linkUrl = p0.linkUrl;
       }
       GrowthScreensTodayEatWidgetResponse$DesktopWidgetData uDesktopWidg1 = linkUrl;
       if (p6 & 0x10) {
          background = p0.background;
       }
       return p0.copy(title, p7, uDesktopWidg, uDesktopWidg1, background);
    }
    public final String component1(){
       return this.title;
    }
    public final String component2(){
       return this.subTitle;
    }
    public final String component3(){
       return this.cuisine;
    }
    public final String component4(){
       return this.linkUrl;
    }
    public final String component5(){
       return this.background;
    }
    public final GrowthScreensTodayEatWidgetResponse$DesktopWidgetData copy(String p0,String p1,String p2,String p3,String p4){
       Object obj;
       if (PatchProxy.isSupport(GrowthScreensTodayEatWidgetResponse$DesktopWidgetData.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          obj = PatchProxy.apply(objArray, this, GrowthScreensTodayEatWidgetResponse$DesktopWidgetData.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       GrowthScreensTodayEatWidgetResponse$DesktopWidgetData uDesktopWidg = new GrowthScreensTodayEatWidgetResponse$DesktopWidgetData(p0, p1, p2, p3, p4);
       return obj;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, GrowthScreensTodayEatWidgetResponse$DesktopWidgetData.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof GrowthScreensTodayEatWidgetResponse$DesktopWidgetData && (a.g(this.title, p0.title) && (a.g(this.subTitle, p0.subTitle) && (a.g(this.cuisine, p0.cuisine) && (a.g(this.linkUrl, p0.linkUrl) && a.g(this.background, p0.background))))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       GrowthScreensTodayEatWidgetResponse$DesktopWidgetData obj = PatchProxy.apply(null, this, GrowthScreensTodayEatWidgetResponse$DesktopWidgetData.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.title;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       GrowthScreensTodayEatWidgetResponse$DesktopWidgetData tsubTitle = this.subTitle;
       int i2 = (tsubTitle != null)? tsubTitle.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tsubTitle = this.cuisine;
       i2 = (tsubTitle != null)? tsubTitle.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tsubTitle = this.linkUrl;
       i2 = (tsubTitle != null)? tsubTitle.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tsubTitle = this.background;
       if (tsubTitle != null) {
          i = tsubTitle.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, GrowthScreensTodayEatWidgetResponse$DesktopWidgetData.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "DesktopWidgetData\(title="+this.title+", subTitle="+this.subTitle+", cuisine="+this.cuisine+", linkUrl="+this.linkUrl+", background="+this.background+"\)";
    }
}
