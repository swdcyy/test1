package com.yxcorp.gifshow.growth.vfc.model.GrowthVfcModel;
import java.io.Serializable;
import com.yxcorp.gifshow.growth.vfc.model.GrowthVfcModel$a;
import nsd.u;
import java.lang.String;
import com.yxcorp.gifshow.growth.vfc.model.GrowthVfcTokenShowDialogResponse;
import com.yxcorp.gifshow.growth.vfc.model.NonReceiveCouponDialog;
import com.yxcorp.gifshow.growth.vfc.model.VfcActionSelector;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;

public final class GrowthVfcModel implements Serializable	// class@0015ae
{
    public final VfcActionSelector actionSelector;
    public final boolean currentLiving;
    public final NonReceiveCouponDialog followingDialog;
    public final boolean hasFollow;
    public final String linkUrl;
    public final GrowthVfcTokenShowDialogResponse tokenShowDialog;
    public final String vUserId;
    public static final GrowthVfcModel$a Companion;
    public static final long serialVersionUID;

    static {
       GrowthVfcModel.Companion = new GrowthVfcModel$a(null);
    }
    public void GrowthVfcModel(boolean p0,String p1,GrowthVfcTokenShowDialogResponse p2,String p3,boolean p4,NonReceiveCouponDialog p5,VfcActionSelector p6){
       a.p(p1, "linkUrl");
       a.p(p5, "followingDialog");
       super();
       this.currentLiving = p0;
       this.linkUrl = p1;
       this.tokenShowDialog = p2;
       this.vUserId = p3;
       this.hasFollow = p4;
       this.followingDialog = p5;
       this.actionSelector = p6;
    }
    public static GrowthVfcModel copy$default(GrowthVfcModel p0,boolean p1,String p2,GrowthVfcTokenShowDialogResponse p3,String p4,boolean p5,NonReceiveCouponDialog p6,VfcActionSelector p7,int p8,Object p9){
       GrowthVfcModel currentLivin;
       GrowthVfcModel linkUrl;
       GrowthVfcModel tokenShowDia;
       GrowthVfcModel vUserId;
       GrowthVfcModel hasFollow;
       GrowthVfcModel followingDia;
       GrowthVfcModel actionSelect;
       if (p8 & 0x01) {
          currentLivin = p0.currentLiving;
       }
       if (p8 & 0x02) {
          linkUrl = p0.linkUrl;
       }
       p9 = linkUrl;
       if (p8 & 0x04) {
          tokenShowDia = p0.tokenShowDialog;
       }
       GrowthVfcModel growthVfcMod = tokenShowDia;
       if (p8 & 0x08) {
          vUserId = p0.vUserId;
       }
       GrowthVfcModel growthVfcMod1 = vUserId;
       if (p8 & 0x10) {
          hasFollow = p0.hasFollow;
       }
       GrowthVfcModel growthVfcMod2 = hasFollow;
       if (p8 & 0x20) {
          followingDia = p0.followingDialog;
       }
       GrowthVfcModel growthVfcMod3 = followingDia;
       if (p8 & 0x40) {
          actionSelect = p0.actionSelector;
       }
       return p0.copy(currentLivin, p9, growthVfcMod, growthVfcMod1, growthVfcMod2, growthVfcMod3, actionSelect);
    }
    public final boolean component1(){
       return this.currentLiving;
    }
    public final String component2(){
       return this.linkUrl;
    }
    public final GrowthVfcTokenShowDialogResponse component3(){
       return this.tokenShowDialog;
    }
    public final String component4(){
       return this.vUserId;
    }
    public final boolean component5(){
       return this.hasFollow;
    }
    public final NonReceiveCouponDialog component6(){
       return this.followingDialog;
    }
    public final VfcActionSelector component7(){
       return this.actionSelector;
    }
    public final GrowthVfcModel copy(boolean p0,String p1,GrowthVfcTokenShowDialogResponse p2,String p3,boolean p4,NonReceiveCouponDialog p5,VfcActionSelector p6){
       GrowthVfcModel obj;
       object oobject = p1;
       object oobject1 = p5;
       if (PatchProxy.isSupport(GrowthVfcModel.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),oobject,p2,p3,Boolean.valueOf(p4),oobject1,p6};
          obj = PatchProxy.apply(objArray, this, GrowthVfcModel.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }else {
          int i = this;
       }
       a.p(p1, "linkUrl");
       a.p(oobject1, "followingDialog");
       obj = new GrowthVfcModel(p0, p1, p2, p3, p4, p5, p6);
       return v9;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, GrowthVfcModel.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof GrowthVfcModel && (this.currentLiving == p0.currentLiving && (a.g(this.linkUrl, p0.linkUrl) && (a.g(this.tokenShowDialog, p0.tokenShowDialog) && (a.g(this.vUserId, p0.vUserId) && (this.hasFollow == p0.hasFollow && (a.g(this.followingDialog, p0.followingDialog) && a.g(this.actionSelector, p0.actionSelector))))))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       int i1;
       GrowthVfcModel tfollowingDi;
       GrowthVfcModel obj = PatchProxy.apply(null, this, GrowthVfcModel.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.currentLiving;
       int i = 1;
       if (obj != null) {
          i1 = 1;
       }
       i1 = i1 * 31;
       GrowthVfcModel tlinkUrl = this.linkUrl;
       int i2 = 0;
       int i3 = (tlinkUrl != null)? tlinkUrl.hashCode(): 0;
       i1 = (i1 + i3) * 31;
       tlinkUrl = this.tokenShowDialog;
       i3 = (tlinkUrl != null)? tlinkUrl.hashCode(): 0;
       i1 = (i1 + i3) * 31;
       tlinkUrl = this.vUserId;
       i3 = (tlinkUrl != null)? tlinkUrl.hashCode(): 0;
       i1 = (i1 + i3) * 31;
       tlinkUrl = this.hasFollow;
       if (tlinkUrl == null) {
          tfollowingDi = tlinkUrl;
       }
       i1 = (i1 + i) * 31;
       tfollowingDi = this.followingDialog;
       i = (tfollowingDi != null)? tfollowingDi.hashCode(): 0;
       i1 = (i1 + i) * 31;
       tfollowingDi = this.actionSelector;
       if (tfollowingDi != null) {
          i2 = tfollowingDi.hashCode();
       }
       return (i1 + i2);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, GrowthVfcModel.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "GrowthVfcModel\(currentLiving="+this.currentLiving+", linkUrl="+this.linkUrl+", tokenShowDialog="+this.tokenShowDialog+", vUserId="+this.vUserId+", hasFollow="+this.hasFollow+", followingDialog="+this.followingDialog+", actionSelector="+this.actionSelector+"\)";
    }
}
