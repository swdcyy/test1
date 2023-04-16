package com.yxcorp.gifshow.social.profile.Material;
import java.io.Serializable;
import com.yxcorp.gifshow.social.profile.Material$a;
import nsd.u;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class Material implements Serializable	// class@001d6b
{
    public final String buttonLinkUrl;
    public final String buttonTitle;
    public final String icon;
    public final String id;
    public final String materialIcon;
    public final String materialType;
    public final String title;
    public final String type;
    public final long useCount;
    public static final Material$a Companion;
    public static final long serialVersionUID;

    static {
       Material.Companion = new Material$a(null);
    }
    public void Material(String p0,String p1,String p2,String p3,String p4,String p5,long p6,String p7,String p8){
       a.p(p0, "id");
       a.p(p1, "icon");
       a.p(p2, "type");
       a.p(p3, "materialType");
       a.p(p4, "materialIcon");
       a.p(p5, "title");
       a.p(p7, "buttonLinkUrl");
       a.p(p8, "buttonTitle");
       super();
       this.id = p0;
       this.icon = p1;
       this.type = p2;
       this.materialType = p3;
       this.materialIcon = p4;
       this.title = p5;
       this.useCount = p6;
       this.buttonLinkUrl = p7;
       this.buttonTitle = p8;
    }
    public static Material copy$default(Material p0,String p1,String p2,String p3,String p4,String p5,String p6,long p7,String p8,String p9,int p10,Object p11){
       Material material = p0;
       int i = p10;
       Material id = (i & 0x01)? material.id: p1;
       Material icon = (i & 0x02)? material.icon: p2;
       Material type = (i & 0x04)? material.type: p3;
       Material materialType = (i & 0x08)? material.materialType: p4;
       Material materialIcon = (i & 0x10)? material.materialIcon: p5;
       Material title = (i & 0x20)? material.title: p6;
       Material useCount = (i & 0x40)? material.useCount: p7;
       Material buttonLinkUr = (i & 0x0080)? material.buttonLinkUrl: p8;
       Material buttonTitle = (i & 0x0100)? material.buttonTitle: p9;
       return p0.copy(id, icon, type, materialType, materialIcon, title, useCount, buttonLinkUr, buttonTitle);
    }
    public final String component1(){
       return this.id;
    }
    public final String component2(){
       return this.icon;
    }
    public final String component3(){
       return this.type;
    }
    public final String component4(){
       return this.materialType;
    }
    public final String component5(){
       return this.materialIcon;
    }
    public final String component6(){
       return this.title;
    }
    public final long component7(){
       return this.useCount;
    }
    public final String component8(){
       return this.buttonLinkUrl;
    }
    public final String component9(){
       return this.buttonTitle;
    }
    public final Material copy(String p0,String p1,String p2,String p3,String p4,String p5,long p6,String p7,String p8){
       Material obj;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p2;
       object oobject3 = p3;
       object oobject4 = p4;
       object oobject5 = p5;
       object oobject6 = p7;
       object oobject7 = p8;
       if (PatchProxy.isSupport(Material.class)) {
          Object[] objArray = new Object[9];
          objArray[0] = oobject;
          objArray[1] = oobject1;
          objArray[2] = oobject2;
          objArray[3] = oobject3;
          objArray[4] = oobject4;
          objArray[5] = oobject5;
          objArray[6] = Long.valueOf(p6);
          objArray[7] = oobject6;
          objArray[8] = oobject7;
          obj = PatchProxy.apply(objArray, this, Material.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }else {
          int i = this;
       }
       a.p(p0, "id");
       a.p(p1, "icon");
       a.p(oobject2, "type");
       a.p(oobject3, "materialType");
       a.p(oobject4, "materialIcon");
       a.p(oobject5, "title");
       a.p(oobject6, "buttonLinkUrl");
       a.p(oobject7, "buttonTitle");
       obj = new Material(p0, p1, p2, p3, p4, p5, p6, p7, p8);
       return v12;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, Material.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof Material && (a.g(this.id, p0.id) && (a.g(this.icon, p0.icon) && (a.g(this.type, p0.type) && (a.g(this.materialType, p0.materialType) && (a.g(this.materialIcon, p0.materialIcon) && (a.g(this.title, p0.title) && (!this.useCount - p0.useCount && (a.g(this.buttonLinkUrl, p0.buttonLinkUrl) && a.g(this.buttonTitle, p0.buttonTitle))))))))))) {
          return true;
       }
       return false;
    }
    public final String getButtonLinkUrl(){
       return this.buttonLinkUrl;
    }
    public final String getButtonTitle(){
       return this.buttonTitle;
    }
    public final String getIcon(){
       return this.icon;
    }
    public final String getId(){
       return this.id;
    }
    public final String getMaterialIcon(){
       return this.materialIcon;
    }
    public final String getMaterialType(){
       return this.materialType;
    }
    public final String getTitle(){
       return this.title;
    }
    public final String getType(){
       return this.type;
    }
    public final long getUseCount(){
       return this.useCount;
    }
    public int hashCode(){
       Material obj = PatchProxy.apply(null, this, Material.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.id;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       Material ticon = this.icon;
       int i2 = (ticon != null)? ticon.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       ticon = this.type;
       i2 = (ticon != null)? ticon.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       ticon = this.materialType;
       i2 = (ticon != null)? ticon.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       ticon = this.materialIcon;
       i2 = (ticon != null)? ticon.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       ticon = this.title;
       i2 = (ticon != null)? ticon.hashCode(): 0;
       ticon = this.useCount;
       i1 = (((i1 + i2) * 31) + (int)(ticon ^ (ticon >> 32))) * 31;
       ticon = this.buttonLinkUrl;
       i2 = (ticon != null)? ticon.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       ticon = this.buttonTitle;
       if (ticon != null) {
          i = ticon.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, Material.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Material\(id="+this.id+", icon="+this.icon+", type="+this.type+", materialType="+this.materialType+", materialIcon="+this.materialIcon+", title="+this.title+", useCount="+this.useCount+", buttonLinkUrl="+this.buttonLinkUrl+", buttonTitle="+this.buttonTitle+"\)";
    }
}
