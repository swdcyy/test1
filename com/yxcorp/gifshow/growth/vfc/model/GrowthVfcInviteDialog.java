package com.yxcorp.gifshow.growth.vfc.model.GrowthVfcInviteDialog;
import java.io.Serializable;
import com.yxcorp.gifshow.growth.vfc.model.GrowthVfcInviteDialog$a;
import nsd.u;
import java.lang.Boolean;
import com.yxcorp.gifshow.growth.vfc.model.VfcInviteDialogType;
import com.yxcorp.gifshow.growth.vfc.model.ShowShareAwardDialog;
import com.yxcorp.gifshow.growth.vfc.model.ShowShareDialog;
import com.yxcorp.gifshow.growth.vfc.model.NonReceiveCouponDialog;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;

public final class GrowthVfcInviteDialog implements Serializable	// class@0015aa
{
    public final Boolean closeWidget;
    public final VfcInviteDialogType dialogType;
    public final NonReceiveCouponDialog errorDialog;
    public final ShowShareAwardDialog showShareAwardDialog;
    public final ShowShareDialog showShareDialog;
    public static final GrowthVfcInviteDialog$a Companion;
    public static final long serialVersionUID;

    static {
       GrowthVfcInviteDialog.Companion = new GrowthVfcInviteDialog$a(null);
    }
    public void GrowthVfcInviteDialog(Boolean p0,VfcInviteDialogType p1,ShowShareAwardDialog p2,ShowShareDialog p3,NonReceiveCouponDialog p4){
       a.p(p1, "dialogType");
       super();
       this.closeWidget = p0;
       this.dialogType = p1;
       this.showShareAwardDialog = p2;
       this.showShareDialog = p3;
       this.errorDialog = p4;
    }
    public static GrowthVfcInviteDialog copy$default(GrowthVfcInviteDialog p0,Boolean p1,VfcInviteDialogType p2,ShowShareAwardDialog p3,ShowShareDialog p4,NonReceiveCouponDialog p5,int p6,Object p7){
       GrowthVfcInviteDialog closeWidget;
       GrowthVfcInviteDialog dialogType;
       GrowthVfcInviteDialog showShareAwa;
       GrowthVfcInviteDialog showShareDia;
       GrowthVfcInviteDialog errorDialog;
       if (p6 & 0x01) {
          closeWidget = p0.closeWidget;
       }
       if (p6 & 0x02) {
          dialogType = p0.dialogType;
       }
       p7 = dialogType;
       if (p6 & 0x04) {
          showShareAwa = p0.showShareAwardDialog;
       }
       GrowthVfcInviteDialog growthVfcInv = showShareAwa;
       if (p6 & 0x08) {
          showShareDia = p0.showShareDialog;
       }
       GrowthVfcInviteDialog growthVfcInv1 = showShareDia;
       if (p6 & 0x10) {
          errorDialog = p0.errorDialog;
       }
       return p0.copy(closeWidget, p7, growthVfcInv, growthVfcInv1, errorDialog);
    }
    public final Boolean component1(){
       return this.closeWidget;
    }
    public final VfcInviteDialogType component2(){
       return this.dialogType;
    }
    public final ShowShareAwardDialog component3(){
       return this.showShareAwardDialog;
    }
    public final ShowShareDialog component4(){
       return this.showShareDialog;
    }
    public final NonReceiveCouponDialog component5(){
       return this.errorDialog;
    }
    public final GrowthVfcInviteDialog copy(Boolean p0,VfcInviteDialogType p1,ShowShareAwardDialog p2,ShowShareDialog p3,NonReceiveCouponDialog p4){
       Object obj;
       if (PatchProxy.isSupport(GrowthVfcInviteDialog.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          obj = PatchProxy.apply(objArray, this, GrowthVfcInviteDialog.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p1, "dialogType");
       GrowthVfcInviteDialog growthVfcInv = new GrowthVfcInviteDialog(p0, p1, p2, p3, p4);
       return obj;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, GrowthVfcInviteDialog.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof GrowthVfcInviteDialog && (a.g(this.closeWidget, p0.closeWidget) && (a.g(this.dialogType, p0.dialogType) && (a.g(this.showShareAwardDialog, p0.showShareAwardDialog) && (a.g(this.showShareDialog, p0.showShareDialog) && a.g(this.errorDialog, p0.errorDialog))))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       GrowthVfcInviteDialog obj = PatchProxy.apply(null, this, GrowthVfcInviteDialog.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.closeWidget;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       GrowthVfcInviteDialog tdialogType = this.dialogType;
       int i2 = (tdialogType != null)? tdialogType.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tdialogType = this.showShareAwardDialog;
       i2 = (tdialogType != null)? tdialogType.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tdialogType = this.showShareDialog;
       i2 = (tdialogType != null)? tdialogType.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tdialogType = this.errorDialog;
       if (tdialogType != null) {
          i = tdialogType.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, GrowthVfcInviteDialog.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "GrowthVfcInviteDialog\(closeWidget="+this.closeWidget+", dialogType="+this.dialogType+", showShareAwardDialog="+this.showShareAwardDialog+", showShareDialog="+this.showShareDialog+", errorDialog="+this.errorDialog+"\)";
    }
}
