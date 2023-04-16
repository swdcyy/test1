package aj4.b;
import vd4.b;
import aj4.b$a;
import nsd.u;
import androidx.fragment.app.Fragment;
import java.util.LinkedList;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.merchant.transaction.base.dynamic.component.payment.PaymentModel;
import java.util.Collection;
import ekd.q;
import android.widget.LinearLayout;
import com.kuaishou.merchant.transaction.base.logger.MerchantTransactionLogBiz;
import p74.a;
import o74.a;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.ViewGroup$LayoutParams;
import aj4.b$b;
import mu4.d;
import com.kuaishou.merchant.transaction.base.dynamic.component.payment.CashierView;
import aj4.b$c;
import com.kuaishou.merchant.transaction.base.dynamic.component.payment.CashierView$e;
import java.util.List;
import android.view.ViewTreeObserver;
import aj4.c;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import aj4.b$d;
import aj4.b$e;
import java.lang.System;
import com.google.gson.JsonObject;
import java.lang.Integer;
import java.lang.Number;
import com.google.gson.JsonElement;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.graphics.Rect;
import ij4.d;
import rk0.b;
import com.google.gson.JsonArray;
import java.util.Iterator;
import com.kuaishou.merchant.transaction.base.model.PaymentMethodInfo;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import fg6.a;
import java.lang.reflect.Type;
import com.google.gson.Gson;
import qrd.l1;
import bo4.b;

public final class b extends b	// class@00008b
{
    public ViewTreeObserver$OnGlobalLayoutListener A;
    public String B;
    public boolean C;
    public final List D;
    public final List E;
    public final List F;
    public boolean G;
    public PaymentModel y;
    public CashierView z;
    public static final b$a H;

    static {
       b.H = new b$a(null);
    }
    public void b(Fragment p0){
       super(p0);
       this.D = new LinkedList();
       this.E = new LinkedList();
       this.F = new LinkedList();
    }
    public void E8(){
       boolean b;
       b uob = b.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uob, "3")) {
          return;
       }
       super.E8();
       b ty = this.y;
       if (ty != null) {
          a.m(ty);
          if (q.f(ty.mMethodList)) {
             uob = this.z;
             a.m(uob);
             uob.setVisibility(8);
             a.s(MerchantTransactionLogBiz.PURCHASE, "LivePaymentPresenter", "no valid payment method");
             return;
          }else {
             this.m8().setVisibility(0);
             ViewGroup$LayoutParams layoutParams = this.m8().getLayoutParams();
             layoutParams.height = -2;
             layoutParams.width = -1;
             this.X8("mtp_sku_changed", new b$b(this));
             ty = this.z;
             if (ty != null) {
                b = true;
                ty.setHideSubMethodWhenUnSelected(b);
                ty.g = b;
             }
             ty = this.z;
             if (ty != null) {
                ty.setPayListPanelCallBack(new b$c(this));
             }
             ty = this.y;
             if (ty != null) {
                b tz = this.z;
                if (tz != null) {
                   tz.b(ty.mMethodList, ty.mShowProviderSize, this.G, 0x3f4ccccd);
                }
             }
             if (!PatchProxy.applyVoid(objArray, this, uob, "11") && this.C == null) {
                uob = this.z;
                a.m(uob);
                ViewTreeObserver viewTreeObse = uob.getViewTreeObserver();
                if (viewTreeObse != null && viewTreeObse.isAlive()) {
                   if (this.A == null) {
                      this.A = new c(this);
                   }
                   viewTreeObse.addOnGlobalLayoutListener(this.A);
                }
             }
             this.X8("MERCHANT_LIST_SCROLL_EVENT", new b$d(this));
             this.X8("mtp_request_fail", new b$e(this));
          }
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, b.class, "8")) {
          return;
       }
       super.J8();
       if (this.y != null) {
          this.t9();
          b tz = this.z;
          if (tz != null) {
             tz.g();
          }
       }
       return;
    }
    public final void a1(){
       if (PatchProxy.applyVoid(null, this, b.class, "4")) {
          return;
       }
       this.B = String.valueOf(System.currentTimeMillis());
       JsonObject jsonObject = new JsonObject();
       jsonObject.c0("callbackId", this.B);
       jsonObject.a0("reselectedEventType", Integer.valueOf(1000));
       this.l9("mtp_pe_refresh_page", jsonObject.toString());
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       super.doBindView(p0);
       this.z = p0.findViewById(0x7f0a0678);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.y = this.s8(PaymentModel.class);
       return;
    }
    public final boolean o9(View p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       b = true;
       if (p0 == null || p0.getLocalVisibleRect(new Rect()) != b) {
          b = false;
       }
       return b;
    }
    public final void q9(){
       b ty;
       JsonObject tag;
       if (PatchProxy.applyVoid(null, this, b.class, "9")) {
          return;
       }
       b tz = this.z;
       if (tz != null) {
          a.m(tz);
          if (tz.getVisibility() != 8) {
             tz = this.z;
             a.m(tz);
             if (tz.getChildCount()) {
                tz = this.z;
                a.m(tz);
                if (this.o9(tz)) {
                   if (this.C == null) {
                      this.C = true;
                      Fragment uFragment = this.R8();
                      ty = this.y;
                      if (!PatchProxy.applyVoidTwoRefs(uFragment, ty, null, d.class, "13")) {
                         JsonArray jsonArray = new JsonArray();
                         Iterator iterator = ty.mMethodList.iterator();
                         while (iterator.hasNext()) {
                            jsonArray.G(d.c(iterator.next()));
                         }
                         ClientEvent$ElementPackage uElementPack1 = new ClientEvent$ElementPackage();
                         uElementPack1.action2 = "PAY_MODULE";
                         tag = new JsonObject();
                         tag.G("pay_method_list", jsonArray);
                         uElementPack1.params = tag.toString();
                         u1.C0("", d.b(uFragment), 3, uElementPack1, new ClientContent$ContentPackage());
                      }
                   }
                   int i = 0;
                   ty = this.z;
                   a.m(ty);
                   int childCount = ty.getChildCount();
                   while (i < childCount) {
                      b tz1 = this.z;
                      a.m(tz1);
                      View childAt = tz1.getChildAt(i);
                      tag = childAt.getTag();
                      if (!tag instanceof PaymentMethodInfo || (!this.E.contains(tag) && this.o9(childAt))) {
                         Fragment uFragment1 = this.R8();
                         Object obj = tag;
                         if (!PatchProxy.applyVoidTwoRefs(uFragment1, obj, null, d.class, "14")) {
                            ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                            uElementPack.action2 = "PAY_METHOD_ITEM";
                            uElementPack.params = d.c(obj).toString();
                            u1.C0("", d.b(uFragment1), 3, uElementPack, new ClientContent$ContentPackage());
                         }
                         this.E.add(tag);
                      }
                   label_00f2 :
                      i = i + 1;
                   }
                }
             }
          }
       }
       return;
    }
    public final void s9(){
       if (PatchProxy.applyVoid(null, this, b.class, "6")) {
          return;
       }
       this.l9("mtp_payment_changed", null);
       return;
    }
    public final void t9(){
       if (PatchProxy.applyVoid(null, this, b.class, "13")) {
          return;
       }
       if (this.A != null) {
          b tz = this.z;
          if (tz != null) {
             ViewTreeObserver viewTreeObse = tz.getViewTreeObserver();
             if (viewTreeObse != null) {
                if (!viewTreeObse.isAlive()) {
                   viewTreeObse = null;
                }
                if (viewTreeObse != null) {
                   viewTreeObse.removeOnGlobalLayoutListener(this.A);
                }
             }
          }
          this.A = null;
       }
       return;
    }
    public final void u9(PaymentMethodInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "5")) {
          return;
       }
       JsonObject jsonObject = new JsonObject();
       jsonObject.c0("type", "stashPageData");
       JsonObject jsonObject1 = new JsonObject();
       jsonObject1.G("stashPaymentInfo", a.a.y(p0, PaymentMethodInfo.class));
       jsonObject.G("data", jsonObject1);
       b.a(this.R8(), jsonObject.toString());
       return;
    }
}
