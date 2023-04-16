package com.yxcorp.gifshow.growth.model.response.GrowthStayDialogConfig$StayRelationDialog;
import java.io.Serializable;
import java.lang.String;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class GrowthStayDialogConfig$StayRelationDialog implements Serializable	// class@00144b
{
    public final List avatars;
    public final String desc;
    public final String detainBtn;
    public final String detainLink;
    public final String title;
    public final String uninstallBtn;

    public void GrowthStayDialogConfig$StayRelationDialog(String p0,String p1,List p2,String p3,String p4,String p5){
       super();
       this.title = p0;
       this.desc = p1;
       this.avatars = p2;
       this.detainBtn = p3;
       this.detainLink = p4;
       this.uninstallBtn = p5;
    }
    public static GrowthStayDialogConfig$StayRelationDialog copy$default(GrowthStayDialogConfig$StayRelationDialog p0,String p1,String p2,List p3,String p4,String p5,String p6,int p7,Object p8){
       GrowthStayDialogConfig$StayRelationDialog title;
       GrowthStayDialogConfig$StayRelationDialog desc;
       GrowthStayDialogConfig$StayRelationDialog avatars;
       GrowthStayDialogConfig$StayRelationDialog detainBtn;
       GrowthStayDialogConfig$StayRelationDialog detainLink;
       GrowthStayDialogConfig$StayRelationDialog uninstallBtn;
       if (p7 & 0x01) {
          title = p0.title;
       }
       if (p7 & 0x02) {
          desc = p0.desc;
       }
       p8 = desc;
       if (p7 & 0x04) {
          avatars = p0.avatars;
       }
       GrowthStayDialogConfig$StayRelationDialog stayRelation = avatars;
       if (p7 & 0x08) {
          detainBtn = p0.detainBtn;
       }
       GrowthStayDialogConfig$StayRelationDialog stayRelation1 = detainBtn;
       if (p7 & 0x10) {
          detainLink = p0.detainLink;
       }
       GrowthStayDialogConfig$StayRelationDialog stayRelation2 = detainLink;
       if (p7 & 0x20) {
          uninstallBtn = p0.uninstallBtn;
       }
       return p0.copy(title, p8, stayRelation, stayRelation1, stayRelation2, uninstallBtn);
    }
    public final String component1(){
       return this.title;
    }
    public final String component2(){
       return this.desc;
    }
    public final List component3(){
       return this.avatars;
    }
    public final String component4(){
       return this.detainBtn;
    }
    public final String component5(){
       return this.detainLink;
    }
    public final String component6(){
       return this.uninstallBtn;
    }
    public final GrowthStayDialogConfig$StayRelationDialog copy(String p0,String p1,List p2,String p3,String p4,String p5){
       Object obj;
       if (PatchProxy.isSupport(GrowthStayDialogConfig$StayRelationDialog.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4,p5};
          obj = PatchProxy.apply(objArray, this, GrowthStayDialogConfig$StayRelationDialog.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       GrowthStayDialogConfig$StayRelationDialog stayRelation = new GrowthStayDialogConfig$StayRelationDialog(p0, p1, p2, p3, p4, p5);
       return obj;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, GrowthStayDialogConfig$StayRelationDialog.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof GrowthStayDialogConfig$StayRelationDialog && (a.g(this.title, p0.title) && (a.g(this.desc, p0.desc) && (a.g(this.avatars, p0.avatars) && (a.g(this.detainBtn, p0.detainBtn) && (a.g(this.detainLink, p0.detainLink) && a.g(this.uninstallBtn, p0.uninstallBtn)))))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       GrowthStayDialogConfig$StayRelationDialog obj = PatchProxy.apply(null, this, GrowthStayDialogConfig$StayRelationDialog.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.title;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       GrowthStayDialogConfig$StayRelationDialog tdesc = this.desc;
       int i2 = (tdesc != null)? tdesc.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tdesc = this.avatars;
       i2 = (tdesc != null)? tdesc.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tdesc = this.detainBtn;
       i2 = (tdesc != null)? tdesc.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tdesc = this.detainLink;
       i2 = (tdesc != null)? tdesc.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tdesc = this.uninstallBtn;
       if (tdesc != null) {
          i = tdesc.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, GrowthStayDialogConfig$StayRelationDialog.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "StayRelationDialog\(title="+this.title+", desc="+this.desc+", avatars="+this.avatars+", detainBtn="+this.detainBtn+", detainLink="+this.detainLink+", uninstallBtn="+this.uninstallBtn+"\)";
    }
}
