package com.kuaishou.merchant.transaction.live.dynamic.component.buybutton.c;
import vd4.b;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import sk4.b;
import com.google.gson.JsonObject;
import com.kuaishou.merchant.transaction.base.model.PaymentMethodInfo;
import ue4.g;
import com.google.gson.JsonElement;
import bo4.b;
import gd4.d;
import gd4.d$a;
import com.kuaishou.merchant.transaction.base.sku.b;
import com.kuaishou.merchant.transaction.live.dynamic.component.buybutton.c$a;
import android.view.View$OnClickListener;
import android.view.ViewGroup;
import ti4.f;
import mu4.d;
import ti4.g;
import ti4.d;
import com.yxcorp.gifshow.util.rx.RxBus;
import wd4.c;
import brd.t;
import t45.d;
import brd.z;
import com.kuaishou.merchant.transaction.live.dynamic.component.buybutton.b;
import erd.r;
import ti4.e;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.util.SparseBooleanArray;
import com.kuaishou.merchant.transaction.live.dynamic.component.buybutton.BuyButtonModel;
import com.kuaishou.merchant.transaction.base.purchasepanel.model.BuyButton;
import java.lang.CharSequence;
import android.widget.TextView;
import ij4.d;
import java.lang.Integer;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import android.view.View;
import yd4.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.utility.TextUtils;
import androidx.fragment.app.FragmentActivity;
import rk0.b;
import android.app.Activity;
import com.kuaishou.merchant.router.b;
import rk4.c;
import java.util.List;
import java.util.Iterator;
import com.kuaishou.merchant.transaction.base.sku.SkuSpecification;
import java.lang.StringBuilder;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.lang.Iterable;
import android.text.TextUtils;
import e17.i;
import ju4.d;
import ot3.p0;
import lnc.a1;

public class c extends b	// class@000794
{
    public TextView A;
    public TextView B;
    public TextView C;
    public TextView D;
    public b E;
    public Fragment F;
    public String G;
    public b H;
    public BuyButtonModel y;
    public ViewGroup z;
    public static final int I;

    public void c(Fragment p0){
       super(p0);
       this.F = p0;
    }
    public void E8(){
       c uoc = c.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoc, "3")) {
          return;
       }
       super.E8();
       c tF = this.F;
       String str = "4";
       if (!PatchProxy.applyVoidOneRefs(tF, objArray, b.class, str)) {
          JsonObject jsonObject = new JsonObject();
          PaymentMethodInfo paymentMetho = b.b(tF);
          JsonObject jsonObject1 = (paymentMetho != null)? g.e(g.d(paymentMetho)): objArray;
          jsonObject.G("serverPayMethod", jsonObject1);
          jsonObject1 = new JsonObject();
          jsonObject1.c0("type", "stashPageData");
          jsonObject1.G("data", jsonObject);
          b.a(tF, jsonObject1.toString());
       }
       d$a n = d.n;
       this.E = n.a(this.F).v0();
       this.z.setOnClickListener(new c$a(this));
       this.q9();
       if (!PatchProxy.applyVoid(objArray, this, uoc, "6")) {
          this.X8("mt_purchase_panel_activity_state_changed", new f(this));
       }
       if (!PatchProxy.applyVoid(objArray, this, uoc, "8")) {
          this.X8("mtp_sku_changed", new g(this));
       }
       if (!PatchProxy.applyVoid(objArray, this, uoc, "9")) {
          this.X8("mtp_payment_changed", new d(this));
       }
       if (!PatchProxy.applyVoid(objArray, this, uoc, str)) {
          this.X7(RxBus.f.f(c.class).observeOn(d.a).filter(b.b).subscribe(new e(this)));
       }
       if (!n.a(this.F).r0().get(9)) {
          uoc = this.F;
          BuyButton mCanClick = this.y.mBuyButton.mCanClick;
          String str1 = (this.B.getText() != null)? this.B.getText().toString(): "";
          JsonObject serverParams = this.y.getServerParams();
          if (!PatchProxy.isSupport(d.class) || !PatchProxy.applyVoidFourRefs(uoc, Integer.valueOf(mCanClick), str1, serverParams, null, d.class, "6")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "SUBMIT_BUTTON";
             i3 oi3 = i3.f();
             d.a(oi3, serverParams);
             oi3.d("click_status", String.valueOf(mCanClick));
             oi3.d("button_name", str1);
             uElementPack.params = oi3.e();
             u1.C0("", d.b(uoc), 6, uElementPack, new ClientContent$ContentPackage());
          }
          n.a(this.F).r0().put(9, true);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "2")) {
          return;
       }
       super.doBindView(p0);
       this.z = p0.findViewById(0x7f0a05e6);
       this.B = p0.findViewById(0x7f0a05ed);
       this.C = p0.findViewById(0x7f0a05ec);
       this.D = p0.findViewById(0x7f0a05ea);
       TextView textView = p0.findViewById(R.id.waiting_dot_tv);
       this.A = textView;
       this.H = new b(this.z, null, null, textView);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       super.j8();
       this.y = this.s8(BuyButtonModel.class);
       return;
    }
    public void o9(){
       boolean b1;
       boolean b2;
       Iterator iterator;
       String obj1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c uoc = c.class;
       if (PatchProxy.applyVoid(null, this, uoc, "14")) {
          return;
       }
       b obj = PatchProxy.apply(null, this, uoc, "16");
       boolean b = true;
       if (obj != patchProxyRe) {
          b1 = obj.booleanValue();
       }else {
          obj1 = this.y.getButtonActionData();
          if (this.y.getBuyButtonType() == 4 && !TextUtils.x(obj1)) {
             b.k(this.P8(), obj1);
             b1 = true;
          }else {
             b1 = false;
          }
       }
       if (b1) {
          return;
       }else {
          obj = PatchProxy.apply(null, this, uoc, "15");
          if (obj != patchProxyRe) {
             b = obj.booleanValue();
          }else {
             obj = PatchProxy.apply(null, this, uoc, "17");
             if (obj != patchProxyRe) {
                b2 = obj.booleanValue();
             }else if(this.E.j != null){
                Boolean uBoolean = PatchProxy.apply(null, this, uoc, "18");
                if (uBoolean != patchProxyRe) {
                }else {
                   uBoolean = Boolean.valueOf(this.E.o);
                }
                if (!uBoolean.booleanValue() && !this.E.i()) {
                   uoc = this.E;
                   obj1 = PatchProxy.applyOneRefs(uoc, null, c.class, "3");
                   if (obj1 != patchProxyRe) {
                      b2 = obj1.booleanValue();
                   }else if(uoc == null){
                      iterator = uoc.e().iterator();
                      while (true) {
                         if (iterator.hasNext()) {
                            if (!c.a(iterator.next())) {
                               b2 = false;
                               break ;
                            }
                         }
                      }
                   }
                   b2 = true;
                   if (!b2) {
                      b2 = true;
                   }
                }
             }
          label_00be :
             b2 = false;
             int i = 0x7f11066a;
             if (b2) {
                obj = this.E.g;
                StringBuilder str = "请选择";
                ArrayList uArrayList = new ArrayList();
                iterator = this.E.e().iterator();
                while (iterator.hasNext()) {
                   SkuSpecification skuSpecifica = iterator.next();
                   if (!obj.containsKey(skuSpecifica.mPropName)) {
                      uArrayList.add(skuSpecifica.mPropName);
                   }
                }
                str = str+TextUtils.join(" ", uArrayList);
                this.G = str;
                i.d(i, str);
             }else {
                BuyButtonModel mBuyButton = this.y.mBuyButton;
                if (mBuyButton != null && (mBuyButton.mButtonType == 2 && !TextUtils.x(mBuyButton.mButtonActionData))) {
                   i.d(i, this.y.mBuyButton.mButtonActionData);
                }
             }
             b = false;
          }
       label_012d :
          if (!b) {
             return;
          }else {
             d.i(this.P8(), "mtp_submit_order_action", null);
             return;
          }
       }
    }
    public void q9(){
       c uoc = c.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoc, "11")) {
          return;
       }
       this.H.b();
       c tz = this.z;
       float f = (this.y.mBuyButton.mCanClick != null)? 0x3f800000: 0x3f000000;
       tz.setAlpha(f);
       this.z.setClickable(this.y.mBuyButton.mCanClick);
       int i = 0;
       if (!PatchProxy.applyVoid(objArray, this, uoc, "12")) {
          this.B.setText(this.y.mBuyButton.mBtnTitle);
          this.C.setVisibility(8);
          PaymentMethodInfo paymentMetho1 = b.b(this.F);
          if (paymentMetho1 != null && (this.y.mBuyButton.mCanClick != null && this.E.i())) {
             if (paymentMetho1.mBalance > 0) {
                this.B.setText("0元下单");
                this.C.setVisibility(i);
                this.C.setText(a1.r(R.string.arg_RES_7f1033fb, p0.m(paymentMetho1.mBalance)));
             }
             if (TextUtils.n(paymentMetho1.mPaymentMethod, "PAP") && TextUtils.n("NORMAL", paymentMetho1.mProviderChannelType)) {
                this.B.setText("免密支付");
             }
          }
       }
    label_00a3 :
       if (!PatchProxy.applyVoid(objArray, this, uoc, "13")) {
          if (!TextUtils.x(this.y.mPrice)) {
             this.D.setText(p0.e(this.y.mPrice, a1.d(R.dimen.arg_RES_7f070f74), a1.d(R.dimen.arg_RES_7f070f79)));
          }
          uoc = this.D;
          if (this.y.mBuyButton.mCanClick == null || !this.E.i()) {
             i = 8;
          }
          uoc.setVisibility(i);
          PaymentMethodInfo paymentMetho = b.b(this.F);
          if (paymentMetho != null && (this.y.mBuyButton.mCanClick != null && (this.E.i() && paymentMetho.mBalance > 0))) {
             this.D.setVisibility(8);
          }
       }
    label_010c :
       return;
    }
}
