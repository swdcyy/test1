package com.kuaishou.merchant.marketing.shop.newfancoupon.dialog.NewFanCouponReceiveDialog;
import com.kuaishou.merchant.marketing.shop.newfancoupon.dialog.NewFanCouponBaseDialog;
import com.kuaishou.merchant.marketing.shop.newfancoupon.dialog.NewFanCouponBaseDialog$b;
import erd.a;
import com.kuaishou.merchant.popupController.api.models.DialogConfig;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.trello.rxlifecycle3.components.support.RxDialogFragment;
import com.kuaishou.merchant.marketing.shop.newfancoupon.model.NewFanCouponModel;
import j94.b;
import java.io.Serializable;
import androidx.fragment.app.KwaiDialogFragment;
import wkd.b;
import com.kwai.framework.network.sntp.a;
import java.lang.Long;
import java.lang.System;
import j94.a;
import android.widget.TextView;
import android.os.Handler;
import k94.b;
import java.lang.Runnable;
import android.content.Context;
import androidx.fragment.app.Fragment;
import java.lang.StringBuilder;
import java.util.Locale;
import java.lang.Math;
import com.kuaishou.merchant.marketing.shop.newfancoupon.dialog.NewFanCouponReceiveDialog$a;
import android.os.CountDownTimer;

public class NewFanCouponReceiveDialog extends NewFanCouponBaseDialog	// class@001bf3
{
    public CountDownTimer J;
    public long K;
    public Handler L;

    public void NewFanCouponReceiveDialog(NewFanCouponBaseDialog$b p0,a p1){
       super(p0, p1);
    }
    public DialogConfig getConfig(){
       DialogConfig obj = PatchProxy.apply(null, this, NewFanCouponReceiveDialog.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new DialogConfig();
       obj.mDialogName = "NewFanCouponReceiveDialog";
       return obj;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, NewFanCouponReceiveDialog.class, "11")) {
          return;
       }
       super.onDestroy();
       this.zh();
       this.xh();
       return;
    }
    public void th(){
       if (PatchProxy.applyVoid(null, this, NewFanCouponReceiveDialog.class, "10")) {
          return;
       }
       b.b(2, this.C.couponTemplateId);
       super.th();
       return;
    }
    public NewFanCouponModel uh(){
       Object obj = PatchProxy.apply(null, this, NewFanCouponReceiveDialog.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.Zg("KEY_NEW_FAN_COUPON_RECEIVE");
    }
    public void vh(NewFanCouponModel p0){
       NewFanCouponReceiveDialog tK;
       NewFanCouponBaseDialog newFanCoupon1;
       int i;
       if (PatchProxy.applyVoidOneRefs(p0, this, NewFanCouponReceiveDialog.class, "1")) {
          return;
       }
       this.zh();
       NewFanCouponReceiveDialog newFanCoupon = null;
       if (!PatchProxy.applyVoidOneRefs(p0, this, NewFanCouponReceiveDialog.class, "4")) {
          Long longx = b.a(0x3b1f7b44).a();
          if (longx == null || !longx.longValue() - newFanCoupon) {
             longx = Long.valueOf(System.currentTimeMillis());
          }
          try{
             this.K = Long.parseLong(p0.endTime) - longx.longValue();
          }catch(java.lang.Exception e0){
             this.K = newFanCoupon;
          }
       }
    }
    public String wh(long p0){
       String obj;
       StringBuilder str;
       String str1;
       Object[] objArray;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(NewFanCouponReceiveDialog.class)) {
          obj = PatchProxy.applyOneRefs(Long.valueOf(p0), this, NewFanCouponReceiveDialog.class, "7");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       if (this.getContext() == null) {
          return "";
       }else {
          obj = this.getString(R.string.arg_RES_7f10274d);
          int i = 1;
          int i1 = 0;
          int i2 = 2;
          float f = 1000.00f;
          long l = 0xea60;
          if (p0 - (long)a.c >= 0) {
             str = "";
             if (PatchProxy.isSupport(NewFanCouponReceiveDialog.class)) {
                str1 = PatchProxy.applyOneRefs(Long.valueOf(p0), this, NewFanCouponReceiveDialog.class, "5");
                if (str1 != patchProxyRe) {
                label_0085 :
                   return str+str1+obj;
                }
             }
             long l1 = (long)a.c;
             long l2 = p0 / l1;
             objArray = new Object[]{Long.valueOf(l2),Long.valueOf(((p0 % l1) / l)),Long.valueOf((long)((float)(p0 % l) / f))};
             str1 = String.format(Locale.getDefault(), "%02d:%02d:%02d ", objArray);
             goto label_0085 ;
          }else {
             str = "";
             if (PatchProxy.isSupport(NewFanCouponReceiveDialog.class)) {
                str1 = PatchProxy.applyOneRefs(Long.valueOf(p0), this, NewFanCouponReceiveDialog.class, "6");
                if (str1 != patchProxyRe) {
                label_00d5 :
                   return str+str1+obj;
                }
             }
             objArray = new Object[i2];
             objArray[i1] = Long.valueOf(((p0 % (long)a.c) / l));
             objArray[i] = Long.valueOf((long)Math.round(((float)(p0 % l) / f)));
             str1 = String.format(Locale.getDefault(), "00:%02d:%02d ", objArray);
             goto label_00d5 ;
          }
       }
    }
    public final void xh(){
       if (PatchProxy.applyVoid(null, this, NewFanCouponReceiveDialog.class, "9")) {
          return;
       }
       NewFanCouponReceiveDialog tL = this.L;
       if (tL != null) {
          tL.removeCallbacksAndMessages(null);
       }
       return;
    }
    public final void yh(){
       if (PatchProxy.applyVoid(null, this, NewFanCouponReceiveDialog.class, "3")) {
          return;
       }
       NewFanCouponReceiveDialog$a uoa = new NewFanCouponReceiveDialog$a(this, this.K, 1000);
       this.J = v0;
       v0.start();
       return;
    }
    public final void zh(){
       if (PatchProxy.applyVoid(null, this, NewFanCouponReceiveDialog.class, "8")) {
          return;
       }
       NewFanCouponReceiveDialog tJ = this.J;
       if (tJ != null) {
          tJ.cancel();
          this.J = null;
       }
       return;
    }
}
