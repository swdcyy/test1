package com.yxcorp.gifshow.social.profile.MaterialBannerData;
import java.io.Serializable;
import com.yxcorp.gifshow.social.profile.MaterialBannerData$a;
import nsd.u;
import java.lang.String;
import com.yxcorp.gifshow.social.profile.Banner;
import java.util.List;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class MaterialBannerData implements Serializable	// class@001d6d
{
    public final Banner banner;
    public final List materials;
    public final String title;
    public static final MaterialBannerData$a Companion;
    public static final long serialVersionUID;

    static {
       MaterialBannerData.Companion = new MaterialBannerData$a(null);
    }
    public void MaterialBannerData(String p0,Banner p1,List p2){
       a.p(p2, "materials");
       super();
       this.title = p0;
       this.banner = p1;
       this.materials = p2;
    }
    public static MaterialBannerData copy$default(MaterialBannerData p0,String p1,Banner p2,List p3,int p4,Object p5){
       MaterialBannerData title;
       MaterialBannerData banner;
       MaterialBannerData materials;
       if (p4 & 0x01) {
          title = p0.title;
       }
       if (p4 & 0x02) {
          banner = p0.banner;
       }
       if (p4 & 0x04) {
          materials = p0.materials;
       }
       return p0.copy(title, banner, materials);
    }
    public final String component1(){
       return this.title;
    }
    public final Banner component2(){
       return this.banner;
    }
    public final List component3(){
       return this.materials;
    }
    public final MaterialBannerData copy(String p0,Banner p1,List p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, MaterialBannerData.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p2, "materials");
       return new MaterialBannerData(p0, p1, p2);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MaterialBannerData.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof MaterialBannerData && (a.g(this.title, p0.title) && (a.g(this.banner, p0.banner) && a.g(this.materials, p0.materials))))) {
          return true;
       }
       return false;
    }
    public final Banner getBanner(){
       return this.banner;
    }
    public final List getMaterials(){
       return this.materials;
    }
    public final String getTitle(){
       return this.title;
    }
    public int hashCode(){
       MaterialBannerData obj = PatchProxy.apply(null, this, MaterialBannerData.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.title;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       MaterialBannerData tbanner = this.banner;
       int i2 = (tbanner != null)? tbanner.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tbanner = this.materials;
       if (tbanner != null) {
          i = tbanner.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, MaterialBannerData.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "MaterialBannerData\(title="+this.title+", banner="+this.banner+", materials="+this.materials+"\)";
    }
}
