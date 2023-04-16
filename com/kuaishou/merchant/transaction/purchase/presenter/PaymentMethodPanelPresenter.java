package com.kuaishou.merchant.transaction.purchase.presenter.PaymentMethodPanelPresenter;
import androidx.core.widget.NestedScrollView$b;
import im8.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.util.SparseBooleanArray;
import com.kuaishou.merchant.transaction.purchase.presenter.PaymentMethodPanelPresenter$a;
import java.util.LinkedList;
import com.kuaishou.merchant.transaction.purchase.presenter.PaymentMethodPanelPresenter$4;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import ue4.o;
import java.util.Map;
import com.kuaishou.merchant.transaction.base.model.PageModuleInfo;
import java.util.Collection;
import ekd.q;
import com.kuaishou.merchant.transaction.base.model.PaymentMethodInfo;
import com.kuaishou.merchant.transaction.base.widget.paylist.PayListPanelView;
import android.widget.LinearLayout;
import com.kuaishou.merchant.transaction.purchase.presenter.PaymentMethodPanelPresenter$b;
import com.kuaishou.merchant.transaction.base.widget.paylist.PayListPanelView$f;
import com.kuaishou.merchant.transaction.purchase.presenter.d0$b;
import com.kuaishou.merchant.transaction.purchase.MerchantPurchaseFragment;
import androidx.lifecycle.Lifecycle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleObserver;
import android.view.ViewTreeObserver;
import com.kuaishou.merchant.transaction.purchase.presenter.PaymentMethodPanelPresenter$c;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.kuaishou.merchant.transaction.base.logger.MerchantTransactionLogBiz;
import p74.a;
import o74.a;
import android.view.View;
import com.kuaishou.merchant.transaction.base.live.model.PurchasePageParams;
import em4.m;
import androidx.core.widget.NestedScrollView;
import java.lang.Integer;
import android.widget.FrameLayout;
import android.view.ViewGroup;
import com.kwai.robust.PatchProxyResult;
import um4.q1;
import java.util.HashMap;
import java.lang.Boolean;
import com.kuaishou.merchant.transaction.purchase.presenter.e$c;
import com.kuaishou.merchant.transaction.purchase.presenter.g$a;
import em4.a;

public class PaymentMethodPanelPresenter extends PresenterV2 implements NestedScrollView$b, g	// class@000959
{
    public final List A;
    public ViewTreeObserver$OnGlobalLayoutListener B;
    public boolean C;
    public e$c D;
    public g$a E;
    public a F;
    public boolean G;
    public boolean H;
    public final LifecycleObserver I;
    public final SparseBooleanArray p;
    public PaymentMethodPanelPresenter$d q;
    public d0$b r;
    public Map s;
    public PurchasePageParams t;
    public List u;
    public int v;
    public boolean w;
    public MerchantPurchaseFragment x;
    public PayListPanelView y;
    public PaymentMethodInfo z;

    public void PaymentMethodPanelPresenter(){
       super();
       this.p = new SparseBooleanArray();
       this.q = new PaymentMethodPanelPresenter$a(this);
       this.A = new LinkedList();
       this.C = true;
       this.I = new PaymentMethodPanelPresenter$4(this);
    }
    public void E8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, PaymentMethodPanelPresenter.class, "3")) {
          return;
       }
       o.g(this.u);
       if (this.w != null) {
          PaymentMethodPanelPresenter ts = this.s;
          if (ts != null) {
             PageModuleInfo pageModuleIn = ts.get("pay");
             if (pageModuleIn != null) {
                boolean b = true;
                if (pageModuleIn.mDisplayType != b && !q.f(this.u)) {
                   this.z = o.k(this.u);
                   this.y.setHideSubMethodWhenUnSelected(b);
                   this.y.b(this.u, this.v, this.G, 0x3f19999a);
                   this.y.setVisibility(false);
                   this.y.setPayListPanelCallBack(new PaymentMethodPanelPresenter$b(this));
                   this.r.e(this);
                   this.H = b;
                   ts = this.x;
                   if (ts.M != null) {
                      ts.getLifecycle().addObserver(this.I);
                   }
                   if (this.C != null) {
                      ViewTreeObserver viewTreeObse = this.y.getViewTreeObserver();
                      if (viewTreeObse != null && viewTreeObse.isAlive()) {
                         if (this.B == null) {
                            this.B = new PaymentMethodPanelPresenter$c(this);
                         }
                         viewTreeObse.addOnGlobalLayoutListener(this.B);
                      label_00a7 :
                         this.C = false;
                         return;
                      }else {
                         goto label_00a7 ;
                      }
                   }else {
                      goto label_00a7 ;
                   }
                }
             }
          }
       }
       this.y.setVisibility(8);
       a.s(MerchantTransactionLogBiz.PURCHASE, "PaymentMethodPanelPresenter", "no valid payment method");
       this.z = objArray;
       goto label_00a7 ;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, PaymentMethodPanelPresenter.class, "6")) {
          return;
       }
       this.r.f(this);
       this.R8();
       PaymentMethodPanelPresenter tx = this.x;
       if (tx.M != null) {
          tx.getLifecycle().removeObserver(this.I);
       }
       tx = this.y;
       if (tx != null) {
          tx.g();
       }
       return;
    }
    public void P8(){
       if (PatchProxy.applyVoid(null, this, PaymentMethodPanelPresenter.class, "7")) {
          return;
       }
       PaymentMethodPanelPresenter ty = this.y;
       if (ty == null || (ty.getVisibility() != 8 && this.y.getChildCount())) {
          int scrollY = this.r.getScrollY();
          int i = this.r.d();
          int i1 = 0;
          while (i1 < this.y.getChildCount()) {
             View childAt = this.y.getChildAt(i1);
             int i2 = this.r.c(childAt);
             if (i2 < i) {
                i2 = i2 + childAt.getHeight();
                if (i2 >= scrollY) {
                   Object tag = childAt.getTag();
                   if (tag instanceof PaymentMethodInfo && !this.A.contains(tag)) {
                      m.s(this.t.mPrevPageSelectedPayMethod, tag, tag.isServerSelectedAtMainLevel(this.z));
                      this.A.add(tag);
                   }
                }
             }
             i1 = i1 + 1;
          }
       }
       return;
    }
    public void R8(){
       if (PatchProxy.applyVoid(null, this, PaymentMethodPanelPresenter.class, "9")) {
          return;
       }
       if (this.B != null) {
          ViewTreeObserver viewTreeObse = this.y.getViewTreeObserver();
          if (viewTreeObse != null && viewTreeObse.isAlive()) {
             viewTreeObse.removeOnGlobalLayoutListener(this.B);
          }
          this.B = null;
       }
       return;
    }
    public void d5(NestedScrollView p0,int p1,int p2,int p3,int p4){
       PaymentMethodPanelPresenter paymentMetho = PaymentMethodPanelPresenter.class;
       int i = 0;
       if (PatchProxy.isSupport(paymentMetho)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, paymentMetho, "8")) {
             return;
          }
       }
       PaymentMethodPanelPresenter ty = this.y;
       if (ty == null || (ty.getVisibility() != 8 && this.y.getChildCount())) {
          ty = p0.getHeight();
          while (i < this.y.getChildCount()) {
             View childAt = this.y.getChildAt(i);
             Object tag = childAt.getTag();
             if (tag instanceof PaymentMethodInfo && !this.A.contains(tag)) {
                int i1 = o.q(p0, childAt, 5);
                if (i1 < ty) {
                   i1 = i1 + childAt.getHeight();
                   if (i1 >= p2) {
                      m.s(this.t.mPrevPageSelectedPayMethod, tag, tag.isServerSelectedAtMainLevel(this.z));
                      this.A.add(tag);
                   }
                }
             }
             i = i + 1;
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PaymentMethodPanelPresenter.class, "2")) {
          return;
       }
       this.y = p0.findViewById(0x7f0a2fbf);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PaymentMethodPanelPresenter.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new q1();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, PaymentMethodPanelPresenter.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(PaymentMethodPanelPresenter.class, new q1());
       }else {
          obj.put(PaymentMethodPanelPresenter.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, PaymentMethodPanelPresenter.class, "1")) {
          return;
       }
       this.r = this.r8("page_scroll_dispatch_service");
       this.s = this.t8("page_module_info");
       this.u = this.t8("payment_method_info_list");
       this.w = this.v8("can_sale", Boolean.class).booleanValue();
       this.x = this.r8("FRAGMENT");
       this.v = this.r8("show_provider_size").intValue();
       this.t = this.r8("page_params");
       this.D = this.r8("agreement_service");
       this.E = this.r8("payment_amount_service");
       this.F = this.q8(a.class);
       return;
    }
}
