package com.kuaishou.merchant.transaction.purchase.presenter.g;
import im8.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import um4.m;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import com.kuaishou.merchant.transaction.base.model.PaymentMethodInfo;
import com.kuaishou.merchant.transaction.purchase.presenter.PaymentMethodPanelPresenter$d;
import java.lang.CharSequence;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.utility.TextUtils;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import lnc.a1;
import zd4.a;
import q87.c;
import android.widget.TextView;
import com.kuaishou.merchant.transaction.purchase.model.PaymentInfo;
import ot3.p0;
import java.lang.Boolean;
import um4.o;
import java.util.Map;
import java.util.HashMap;

public class g extends PresenterV2 implements g	// class@00097c
{
    public PaymentInfo p;
    public PaymentMethodPanelPresenter$d q;
    public g$a r;
    public View s;
    public TextView t;
    public TextView u;
    public TextView v;
    public TextView w;
    public TextView x;

    public void g(){
       super();
       this.r = new m(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, g.class, "3")) {
          return;
       }
       this.s.setVisibility(0);
       this.R8(this.q.a());
       return;
    }
    public final CharSequence P8(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, g.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!TextUtils.x(p0)) {
          int i = p0.indexOf(".");
          if (i >= 0 && i != (p0.length() - 1)) {
             SpannableString spannableStr = new SpannableString(p0);
             spannableStr.setSpan(new AbsoluteSizeSpan(a1.d(R.dimen.arg_RES_7f0702a4)), i, p0.length(), 18);
             return spannableStr;
          }
       }
       return p0;
    }
    public final void R8(PaymentMethodInfo p0){
       g og = g.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, og, "4")) {
          return;
       }
       int i = 0;
       if (this.p == null) {
          Object[] objArray = new Object[i];
          a.C().A("BottomBarPaymentInfoDisplayPresenter", "onBind: mPaymentInfo null", objArray);
          this.u.setVisibility(8);
          this.t.setVisibility(8);
          this.v.setVisibility(8);
          this.w.setVisibility(8);
          this.x.setVisibility(8);
       }else {
          this.u.setVisibility(i);
          this.v.setVisibility(i);
          if (!TextUtils.x(this.p.mFeeTitle)) {
             this.t.setVisibility(i);
             this.t.setText(this.p.mFeeTitle);
          }else {
             this.t.setVisibility(8);
          }
          if (p0 != null && p0.mHasBalance != null) {
             this.v.setText(this.P8(p0.m(p0.mDeposit)));
             this.w.setVisibility(i);
             this.w.setText(a1.r(R.string.arg_RES_7f1033fb, p0.m(p0.mBalance)));
          }else {
             this.v.setText(this.P8(this.p.mRealPayFee));
             this.w.setVisibility(8);
          }
          p0 = PatchProxy.apply(null, this, og, "6");
          boolean b = (p0 != PatchProxyResult.class)? p0.booleanValue(): TextUtils.x(this.p.mDiscountFee) ^ 0x01;
          og = this.x;
          if (!b) {
             i = 8;
          }
          og.setVisibility(i);
          if (b) {
             this.x.setText(a1.r(R.string.arg_RES_7f1033da, this.p.mDiscountFee));
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "2")) {
          return;
       }
       this.s = p0.findViewById(0x7f0a0473);
       this.t = p0.findViewById(0x7f0a421e);
       this.u = p0.findViewById(0x7f0a422d);
       this.v = p0.findViewById(0x7f0a422e);
       this.w = p0.findViewById(0x7f0a40f9);
       this.x = p0.findViewById(0x7f0a415c);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, g.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new o();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, g.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(g.class, new o());
       }else {
          obj.put(g.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, g.class, "1")) {
          return;
       }
       this.p = this.t8("bottom_bar_price_info");
       this.q = this.t8("payment_method_service");
       return;
    }
}
