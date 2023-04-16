package com.kuaishou.merchant.transaction.purchase.dynamic.component.bottombar.a;
import vd4.b;
import androidx.fragment.app.Fragment;
import com.kuaishou.merchant.transaction.purchase.dynamic.component.bottombar.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import com.kuaishou.merchant.transaction.base.model.PaymentMethodInfo;
import androidx.fragment.app.FragmentActivity;
import hm4.b;
import android.app.Activity;
import mu4.d;
import com.kuaishou.merchant.transaction.purchase.dynamic.component.bottombar.BottomBarModel;
import lnc.a1;
import android.widget.TextView;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import bo4.b;
import ue4.g;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import zd4.a;
import q87.c;
import com.kuaishou.merchant.transaction.purchase.dynamic.component.bottombar.BottomBarModel$Info;
import ot3.p0;
import java.lang.Boolean;

public class a extends b	// class@0008fe
{
    public View A;
    public TextView B;
    public TextView C;
    public TextView D;
    public TextView E;
    public TextView F;
    public Fragment G;
    public boolean H;
    public BottomBarModel y;
    public BottomBarModel$Info z;

    public void a(Fragment p0){
       super(p0);
       this.G = p0;
       this.U7(new c(p0));
    }
    public void E8(){
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "3")) {
          return;
       }
       super.E8();
       if (this.z == null) {
          this.m8().setVisibility(8);
          return;
       }else {
          this.A.setVisibility(0);
          this.s9(this.o9());
          this.V8(this.G.getActivity(), "mtp_payment_changed", new b(this));
          if (!PatchProxy.applyVoid(objArray, this, uoa, "9")) {
             uoa = this.y;
             if (uoa != null && uoa.mCanSale == null) {
                this.B.setTextColor(a1.a(R.color.arg_RES_7f061b0a));
                this.C.setTextColor(a1.a(R.color.arg_RES_7f061b0a));
                this.D.setTextColor(a1.a(R.color.arg_RES_7f061b0a));
             }else {
                this.B.setTextColor(a1.a(R.color.arg_RES_7f061b06));
                this.C.setTextColor(a1.a(R.color.arg_RES_7f061b06));
                this.D.setTextColor(a1.a(R.color.arg_RES_7f061b06));
             }
          }
          return;
       }
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, a.class, "4")) {
          return;
       }
       super.J8();
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       super.doBindView(p0);
       this.A = p0.findViewById(0x7f0a0473);
       this.B = p0.findViewById(0x7f0a421e);
       this.C = p0.findViewById(0x7f0a422d);
       this.D = p0.findViewById(0x7f0a422e);
       this.E = p0.findViewById(0x7f0a40f9);
       this.F = p0.findViewById(0x7f0a415c);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       super.j8();
       BottomBarModel uBottomBarMo = this.s8(BottomBarModel.class);
       this.y = uBottomBarMo;
       if (uBottomBarMo != null) {
          this.z = uBottomBarMo.mBottomInfo;
          this.H = uBottomBarMo.mCanSale;
       }
       return;
    }
    public final PaymentMethodInfo o9(){
       JsonObject obj = PatchProxy.apply(null, this, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new JsonObject();
       obj.c0("type", "getStashPageData");
       obj.c0("data", "stashPaymentInfo");
       return g.b(b.a(this.G, obj.toString()), PaymentMethodInfo.class);
    }
    public final CharSequence q9(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!TextUtils.x(p0)) {
          int i = p0.indexOf(".");
          if (i >= 0 && i != (p0.length() - 1)) {
             SpannableString spannableStr = new SpannableString(p0);
             spannableStr.setSpan(new AbsoluteSizeSpan(a1.d(R.dimen.arg_RES_7f0702cc)), i, p0.length(), 18);
             return spannableStr;
          }
       }
       return p0;
    }
    public final void s9(PaymentMethodInfo p0){
       a uoa = a.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoa, "6")) {
          return;
       }
       int i = 0;
       if (this.z == null) {
          Object[] objArray = new Object[i];
          a.C().A("BottomBarPresenter", "onBind: mBottomBarModel null", objArray);
          this.C.setVisibility(8);
          this.B.setVisibility(8);
          this.D.setVisibility(8);
          this.E.setVisibility(8);
          this.F.setVisibility(8);
       }else {
          this.C.setVisibility(i);
          this.D.setVisibility(i);
          if (!TextUtils.x(this.z.mFeeTitle)) {
             this.B.setVisibility(i);
             this.B.setText(this.z.mFeeTitle);
          }else {
             this.B.setVisibility(8);
          }
          if (p0 != null && p0.mHasBalance != null) {
             this.D.setText(this.q9(p0.m(p0.mDeposit)));
             this.E.setVisibility(i);
             this.E.setText(a1.r(R.string.arg_RES_7f1033fb, p0.m(p0.mBalance)));
          }else {
             this.D.setText(this.q9(this.z.mRealPayFee));
             this.E.setVisibility(8);
          }
          p0 = PatchProxy.apply(null, this, uoa, "7");
          boolean b = (p0 != PatchProxyResult.class)? p0.booleanValue(): TextUtils.x(this.z.mDiscountFee) ^ 0x01;
          uoa = this.F;
          if (!b) {
             i = 8;
          }
          uoa.setVisibility(i);
          if (b) {
             this.F.setText(a1.r(R.string.arg_RES_7f1033da, this.z.mDiscountFee));
          }
       }
       return;
    }
}
