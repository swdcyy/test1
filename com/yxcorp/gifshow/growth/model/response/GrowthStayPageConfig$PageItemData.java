package com.yxcorp.gifshow.growth.model.response.GrowthStayPageConfig$PageItemData;
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

public final class GrowthStayPageConfig$PageItemData implements Serializable	// class@00144d
{
    public final String button;
    public final String desc;
    public final String icon;
    public final String link;
    public final String title;

    public void GrowthStayPageConfig$PageItemData(String p0,String p1,String p2,String p3,String p4){
       super();
       this.icon = p0;
       this.title = p1;
       this.desc = p2;
       this.button = p3;
       this.link = p4;
    }
    public static GrowthStayPageConfig$PageItemData copy$default(GrowthStayPageConfig$PageItemData p0,String p1,String p2,String p3,String p4,String p5,int p6,Object p7){
       GrowthStayPageConfig$PageItemData icon;
       GrowthStayPageConfig$PageItemData title;
       GrowthStayPageConfig$PageItemData desc;
       GrowthStayPageConfig$PageItemData button;
       GrowthStayPageConfig$PageItemData link;
       if (p6 & 0x01) {
          icon = p0.icon;
       }
       if (p6 & 0x02) {
          title = p0.title;
       }
       p7 = title;
       if (p6 & 0x04) {
          desc = p0.desc;
       }
       GrowthStayPageConfig$PageItemData pageItemData = desc;
       if (p6 & 0x08) {
          button = p0.button;
       }
       GrowthStayPageConfig$PageItemData pageItemData1 = button;
       if (p6 & 0x10) {
          link = p0.link;
       }
       return p0.copy(icon, p7, pageItemData, pageItemData1, link);
    }
    public final String component1(){
       return this.icon;
    }
    public final String component2(){
       return this.title;
    }
    public final String component3(){
       return this.desc;
    }
    public final String component4(){
       return this.button;
    }
    public final String component5(){
       return this.link;
    }
    public final GrowthStayPageConfig$PageItemData copy(String p0,String p1,String p2,String p3,String p4){
       Object obj;
       if (PatchProxy.isSupport(GrowthStayPageConfig$PageItemData.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          obj = PatchProxy.apply(objArray, this, GrowthStayPageConfig$PageItemData.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       GrowthStayPageConfig$PageItemData pageItemData = new GrowthStayPageConfig$PageItemData(p0, p1, p2, p3, p4);
       return obj;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, GrowthStayPageConfig$PageItemData.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof GrowthStayPageConfig$PageItemData && (a.g(this.icon, p0.icon) && (a.g(this.title, p0.title) && (a.g(this.desc, p0.desc) && (a.g(this.button, p0.button) && a.g(this.link, p0.link))))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       GrowthStayPageConfig$PageItemData obj = PatchProxy.apply(null, this, GrowthStayPageConfig$PageItemData.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.icon;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       GrowthStayPageConfig$PageItemData ttitle = this.title;
       int i2 = (ttitle != null)? ttitle.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       ttitle = this.desc;
       i2 = (ttitle != null)? ttitle.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       ttitle = this.button;
       i2 = (ttitle != null)? ttitle.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       ttitle = this.link;
       if (ttitle != null) {
          i = ttitle.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, GrowthStayPageConfig$PageItemData.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "PageItemData\(icon="+this.icon+", title="+this.title+", desc="+this.desc+", button="+this.button+", link="+this.link+"\)";
    }
}
