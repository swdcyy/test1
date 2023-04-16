package com.yxcorp.gifshow.growth.vfc.model.GrowthVfcRewardResponse;
import java.io.Serializable;
import com.yxcorp.gifshow.growth.vfc.model.GrowthVfcRewardResponse$a;
import nsd.u;
import com.yxcorp.gifshow.growth.vfc.model.NormalReceiveCouponDialogModel;
import com.yxcorp.gifshow.growth.vfc.model.NonReceiveCouponDialog;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class GrowthVfcRewardResponse implements Serializable	// class@0015b0
{
    public final NonReceiveCouponDialog nonReceiveCouponDialog;
    public final NormalReceiveCouponDialogModel normalReceiveCouponDialogModel;
    public final boolean receivableCoupon;
    public static final GrowthVfcRewardResponse$a Companion;
    public static final long serialVersionUID;

    static {
       GrowthVfcRewardResponse.Companion = new GrowthVfcRewardResponse$a(null);
    }
    public void GrowthVfcRewardResponse(boolean p0,NormalReceiveCouponDialogModel p1,NonReceiveCouponDialog p2){
       super();
       this.receivableCoupon = p0;
       this.normalReceiveCouponDialogModel = p1;
       this.nonReceiveCouponDialog = p2;
    }
    public static GrowthVfcRewardResponse copy$default(GrowthVfcRewardResponse p0,boolean p1,NormalReceiveCouponDialogModel p2,NonReceiveCouponDialog p3,int p4,Object p5){
       GrowthVfcRewardResponse receivableCo;
       GrowthVfcRewardResponse normalReceiv;
       GrowthVfcRewardResponse nonReceiveCo;
       if (p4 & 0x01) {
          receivableCo = p0.receivableCoupon;
       }
       if (p4 & 0x02) {
          normalReceiv = p0.normalReceiveCouponDialogModel;
       }
       if (p4 & 0x04) {
          nonReceiveCo = p0.nonReceiveCouponDialog;
       }
       return p0.copy(receivableCo, normalReceiv, nonReceiveCo);
    }
    public final boolean component1(){
       return this.receivableCoupon;
    }
    public final NormalReceiveCouponDialogModel component2(){
       return this.normalReceiveCouponDialogModel;
    }
    public final NonReceiveCouponDialog component3(){
       return this.nonReceiveCouponDialog;
    }
    public final GrowthVfcRewardResponse copy(boolean p0,NormalReceiveCouponDialogModel p1,NonReceiveCouponDialog p2){
       if (PatchProxy.isSupport(GrowthVfcRewardResponse.class)) {
          Object obj = PatchProxy.applyThreeRefs(Boolean.valueOf(p0), p1, p2, this, GrowthVfcRewardResponse.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new GrowthVfcRewardResponse(p0, p1, p2);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, GrowthVfcRewardResponse.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof GrowthVfcRewardResponse && (this.receivableCoupon == p0.receivableCoupon && (a.g(this.normalReceiveCouponDialogModel, p0.normalReceiveCouponDialogModel) && a.g(this.nonReceiveCouponDialog, p0.nonReceiveCouponDialog))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       int i;
       GrowthVfcRewardResponse obj = PatchProxy.apply(null, this, GrowthVfcRewardResponse.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.receivableCoupon;
       if (obj != null) {
          i = 1;
       }
       i = i * 31;
       GrowthVfcRewardResponse tnormalRecei = this.normalReceiveCouponDialogModel;
       int i1 = 0;
       int i2 = (tnormalRecei != null)? tnormalRecei.hashCode(): 0;
       i = (i + i2) * 31;
       tnormalRecei = this.nonReceiveCouponDialog;
       if (tnormalRecei != null) {
          i1 = tnormalRecei.hashCode();
       }
       return (i + i1);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, GrowthVfcRewardResponse.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "GrowthVfcRewardResponse\(receivableCoupon="+this.receivableCoupon+", normalReceiveCouponDialogModel="+this.normalReceiveCouponDialogModel+", nonReceiveCouponDialog="+this.nonReceiveCouponDialog+"\)";
    }
}
