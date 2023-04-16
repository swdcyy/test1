package com.kuaishou.merchant.marketing.shop.newfancoupon.dialog.NewFanCouponBaseDialog;
import com.kuaishou.merchant.basic.fragment.MerchantBaseControllerDialogFragment;
import com.kuaishou.merchant.marketing.shop.newfancoupon.dialog.NewFanCouponBaseDialog$b;
import erd.a;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import xm4.a;
import androidx.fragment.app.KwaiDialogFragment;
import android.animation.ValueAnimator;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import android.view.Window;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import lnc.a1;
import android.text.TextPaint;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Button;
import com.kuaishou.merchant.marketing.shop.newfancoupon.dialog.NewFanCouponBaseDialog$a;
import android.view.View$OnClickListener;
import com.kuaishou.merchant.marketing.shop.newfancoupon.model.NewFanCouponModel;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.graphics.Typeface;
import ot3.p0;
import com.yxcorp.gifshow.util.span.SpannableStringBuilderUtils;
import android.text.style.StyleSpan;
import com.kuaishou.merchant.marketing.shop.newfancoupon.model.NewFanCouponModel$Button;
import com.kuaishou.merchant.marketing.shop.newfancoupon.dialog.a;
import k94.a;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.kuaishou.merchant.marketing.shop.MerchantMarketingShopLogBiz;
import java.lang.StringBuilder;
import p74.a;
import o74.a;

public abstract class NewFanCouponBaseDialog extends MerchantBaseControllerDialogFragment	// class@001bf0
{
    public NewFanCouponBaseDialog$b A;
    public a B;
    public NewFanCouponModel C;
    public ValueAnimator D;
    public TextPaint E;
    public TextPaint F;
    public int G;
    public int H;
    public int I;
    public View t;
    public ImageView u;
    public TextView v;
    public TextView w;
    public TextView x;
    public Button y;
    public TextView z;

    public void NewFanCouponBaseDialog(NewFanCouponBaseDialog$b p0,a p1){
       super();
       this.A = p0;
       this.B = p1;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, NewFanCouponBaseDialog.class, "1");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       View view = a.d(p0, R.layout.arg_RES_7f0d02fd, p1, false);
       this.t = view;
       return view;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, NewFanCouponBaseDialog.class, "8")) {
          return;
       }
       super.onDestroyView();
       NewFanCouponBaseDialog tD = this.D;
       if (tD != null) {
          tD.removeAllListeners();
          this.D.cancel();
       }
       return;
    }
    public void onStart(){
       if (PatchProxy.applyVoid(null, this, NewFanCouponBaseDialog.class, "7")) {
          return;
       }
       super.onStart();
       if (this.getDialog() != null && this.getDialog().getWindow() != null) {
          this.getDialog().setCanceledOnTouchOutside(false);
          Window window = this.getDialog().getWindow();
          window.clearFlags(0x4000000);
          window.addFlags(Integer.MIN_VALUE);
          window.setBackgroundDrawable(new ColorDrawable(0x4c000000));
          window.getDecorView().setPadding(false, false, false, false);
          window.setLayout(-1, -1);
          window.setWindowAnimations(false);
          window.setDimAmount(0);
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, NewFanCouponBaseDialog.class, "2")) {
          return;
       }
       super.onViewCreated(p0, p1);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, NewFanCouponBaseDialog.class, "3")) {
          this.H = a1.d(0x7f07032e);
          this.I = a1.d(0x7f0702fe);
          this.G = a1.d(0x7f0702b4);
          TextPaint textPaint = new TextPaint();
          this.F = textPaint;
          textPaint.setTextSize((float)this.I);
          textPaint = new TextPaint();
          this.E = textPaint;
          textPaint.setTextSize((float)this.H);
       }
       this.u = this.t.findViewById(0x7f0a14f1);
       this.v = this.t.findViewById(0x7f0a414d);
       this.w = this.t.findViewById(0x7f0a4220);
       this.x = this.t.findViewById(0x7f0a42f3);
       this.y = this.t.findViewById(0x7f0a0578);
       this.z = this.t.findViewById(0x7f0a4131);
       this.t.findViewById(R.id.iv_close).setOnClickListener(new NewFanCouponBaseDialog$a(this));
       if (!PatchProxy.applyVoid(objArray, this, NewFanCouponBaseDialog.class, "4")) {
          NewFanCouponModel newFanCoupon = this.uh();
          this.C = newFanCoupon;
          if (newFanCoupon != null) {
             if (!TextUtils.isEmpty(newFanCoupon.avatarUrl)) {
                this.u.setImageURI(Uri.parse(this.C.avatarUrl));
             }
             this.v.setText(this.C.desc);
             NewFanCouponBaseDialog tw = this.w;
             NewFanCouponModel couponPrice = this.C.couponPrice;
             SpannableStringBuilder spannableStr = PatchProxy.applyOneRefs(couponPrice, this, NewFanCouponBaseDialog.class, "6");
             if (spannableStr != PatchProxyResult.class) {
             }else {
                float f = this.E.measureText(couponPrice);
                String str = "гд";
                float f1 = this.F.measureText(str);
                int i = a1.d(R.dimen.arg_RES_7f070319);
                f = f + f1;
                while (f - (float)this.G > 0) {
                   int i1 = this.H - a1.d(0x7f0702e3);
                   this.H = i1;
                   i1 = this.I - a1.d(0x7f0702e3);
                   this.I = i1;
                   this.E.setTextSize((float)this.H);
                   this.F.setTextSize((float)this.I);
                   f = this.E.measureText(couponPrice);
                   f1 = this.F.measureText(str);
                   float f2 = f + f1;
                   if (f2 - (float)this.G <= 0 || this.H < i) {
                      break ;
                   }
                }
                spannableStr = new SpannableStringBuilder();
                SpannableStringBuilderUtils.f(spannableStr, "гд", this.I, a1.a(R.color.arg_RES_7f061e04), false, p0.l());
                spannableStr.setSpan(new StyleSpan(1), 0, 1, 33);
                SpannableStringBuilderUtils.i(spannableStr, a1.d(R.dimen.arg_RES_7f070329));
                SpannableStringBuilderUtils.f(spannableStr, couponPrice, this.H, a1.a(R.color.arg_RES_7f061e04), false, p0.l());
             }
             tw.setText(spannableStr);
             this.x.setText(this.C.useConditionTitle);
             newFanCoupon = this.C.button;
             if (newFanCoupon != null) {
                this.y.setText(newFanCoupon.title);
             }
             this.y.setOnClickListener(new a(this));
             if (!PatchProxy.applyVoid(objArray, this, NewFanCouponBaseDialog.class, "5")) {
                ValueAnimator valueAnimato = ValueAnimator.ofFloat(new float[3]{0x3f800000,0x3f4ccccd,0x3f800000});
                this.D = valueAnimato;
                valueAnimato.addUpdateListener(new a(this));
                this.D.setDuration(500);
                this.D.start();
             }
             this.vh(this.C);
          }
       }
       return;
    }
    public void th(){
       if (PatchProxy.applyVoid(null, this, NewFanCouponBaseDialog.class, "9")) {
          return;
       }
       NewFanCouponBaseDialog tB = this.B;
       if (tB != null) {
          try{
             tB.run();
          }catch(java.lang.Exception e0){
             a.g(MerchantMarketingShopLogBiz.NEW_FAN_COUPON, "NewFanCouponBaseDialog", "CloseDialog Exception:"+e0);
          }
       }
    }
    public abstract NewFanCouponModel uh();
    public abstract void vh(NewFanCouponModel p0);
}
