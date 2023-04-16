package com.yxcorp.gifshow.profile.model.ProfilePostRecoTip;
import java.io.Serializable;
import java.util.List;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class ProfilePostRecoTip implements Serializable	// class@0013af
{
    public final String actionBtnTitle;
    public final String extParams;
    public final List icon;
    public final String materialId;
    public final String materialName;
    public final String scheme;
    public final String title;
    public final int type;

    public void ProfilePostRecoTip(List p0,String p1,String p2,int p3,String p4,String p5,String p6,String p7){
       a.p(p2, "title");
       a.p(p4, "actionBtnTitle");
       a.p(p5, "materialId");
       a.p(p6, "materialName");
       super();
       this.icon = p0;
       this.scheme = p1;
       this.title = p2;
       this.type = p3;
       this.actionBtnTitle = p4;
       this.materialId = p5;
       this.materialName = p6;
       this.extParams = p7;
    }
    public static ProfilePostRecoTip copy$default(ProfilePostRecoTip p0,List p1,String p2,String p3,int p4,String p5,String p6,String p7,String p8,int p9,Object p10){
       ProfilePostRecoTip profilePostR = p0;
       int i = p9;
       ProfilePostRecoTip icon = (i & 0x01)? profilePostR.icon: p1;
       ProfilePostRecoTip scheme = (i & 0x02)? profilePostR.scheme: p2;
       ProfilePostRecoTip title = (i & 0x04)? profilePostR.title: p3;
       ProfilePostRecoTip type = (i & 0x08)? profilePostR.type: p4;
       ProfilePostRecoTip actionBtnTit = (i & 0x10)? profilePostR.actionBtnTitle: p5;
       ProfilePostRecoTip materialId = (i & 0x20)? profilePostR.materialId: p6;
       ProfilePostRecoTip materialName = (i & 0x40)? profilePostR.materialName: p7;
       ProfilePostRecoTip extParams = (i & 0x0080)? profilePostR.extParams: p8;
       return p0.copy(icon, scheme, title, type, actionBtnTit, materialId, materialName, extParams);
    }
    public final List component1(){
       return this.icon;
    }
    public final String component2(){
       return this.scheme;
    }
    public final String component3(){
       return this.title;
    }
    public final int component4(){
       return this.type;
    }
    public final String component5(){
       return this.actionBtnTitle;
    }
    public final String component6(){
       return this.materialId;
    }
    public final String component7(){
       return this.materialName;
    }
    public final String component8(){
       return this.extParams;
    }
    public final ProfilePostRecoTip copy(List p0,String p1,String p2,int p3,String p4,String p5,String p6,String p7){
       ProfilePostRecoTip obj;
       object oobject = p2;
       object oobject1 = p4;
       object oobject2 = p5;
       object oobject3 = p6;
       if (PatchProxy.isSupport(ProfilePostRecoTip.class)) {
          Object[] objArray = new Object[]{p0,p1,oobject,Integer.valueOf(p3),oobject1,oobject2,oobject3,p7};
          obj = PatchProxy.apply(objArray, this, ProfilePostRecoTip.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }else {
          int i = this;
       }
       a.p(p2, "title");
       a.p(oobject1, "actionBtnTitle");
       a.p(oobject2, "materialId");
       a.p(oobject3, "materialName");
       obj = new ProfilePostRecoTip(p0, p1, p2, p3, p4, p5, p6, p7);
       return v10;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ProfilePostRecoTip.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof ProfilePostRecoTip && (a.g(this.icon, p0.icon) && (a.g(this.scheme, p0.scheme) && (a.g(this.title, p0.title) && (this.type == p0.type && (a.g(this.actionBtnTitle, p0.actionBtnTitle) && (a.g(this.materialId, p0.materialId) && (a.g(this.materialName, p0.materialName) && a.g(this.extParams, p0.extParams)))))))))) {
          return true;
       }
       return false;
    }
    public final String getActionBtnTitle(){
       return this.actionBtnTitle;
    }
    public final String getExtParams(){
       return this.extParams;
    }
    public final List getIcon(){
       return this.icon;
    }
    public final String getMaterialId(){
       return this.materialId;
    }
    public final String getMaterialName(){
       return this.materialName;
    }
    public final String getScheme(){
       return this.scheme;
    }
    public final String getTitle(){
       return this.title;
    }
    public final int getType(){
       return this.type;
    }
    public int hashCode(){
       ProfilePostRecoTip obj = PatchProxy.apply(null, this, ProfilePostRecoTip.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.icon;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       ProfilePostRecoTip tscheme = this.scheme;
       int i2 = (tscheme != null)? tscheme.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tscheme = this.title;
       i2 = (tscheme != null)? tscheme.hashCode(): 0;
       i1 = (((i1 + i2) * 31) + this.type) * 31;
       tscheme = this.actionBtnTitle;
       i2 = (tscheme != null)? tscheme.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tscheme = this.materialId;
       i2 = (tscheme != null)? tscheme.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tscheme = this.materialName;
       i2 = (tscheme != null)? tscheme.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tscheme = this.extParams;
       if (tscheme != null) {
          i = tscheme.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, ProfilePostRecoTip.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ProfilePostRecoTip\(icon="+this.icon+", scheme="+this.scheme+", title="+this.title+", type="+this.type+", actionBtnTitle="+this.actionBtnTitle+", materialId="+this.materialId+", materialName="+this.materialName+", extParams="+this.extParams+"\)";
    }
}
