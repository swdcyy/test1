package com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.r;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.merchant.basic.model.AddressInfo;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import nk4.c1;
import java.lang.Runnable;
import android.view.ViewGroup;
import brd.t;
import com.smile.gifmaker.mvps.utils.DefaultObservable;
import nk4.b1;
import erd.g;
import crd.b;
import android.content.Intent;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.kuaishou.merchant.transaction.base.sku.c;
import yj4.h;
import z1.k;
import qk4.d;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.model.PageInfoReqParam;
import com.kuaishou.merchant.transaction.base.logger.MerchantTransactionLogBiz;
import p74.a;
import o74.a;
import qk4.e;
import com.kuaishou.merchant.transaction.base.purchasepanel.model.MerchantLivePurchasePanelResponse;
import ue4.s;
import pi4.a;
import android.view.View;
import ekd.m1;
import androidx.recyclerview.widget.RecyclerView;
import android.widget.TextView;
import kk4.i;
import com.kuaishou.merchant.api.core.LiveMerchantBaseContext;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.MerchantLivePurchasePanelFragment;

public class r extends PresenterV2	// class@00083d
{
    public RecyclerView A;
    public AddressInfo B;
    public String C;
    public ViewGroup D;
    public TextView E;
    public k F;
    public MerchantLivePurchasePanelFragment p;
    public e q;
    public i r;
    public DefaultObservable s;
    public LiveMerchantBaseContext t;
    public MerchantLivePurchasePanelResponse u;
    public k v;
    public c w;
    public ViewGroup x;
    public Runnable y;
    public int z;

    public void r(){
       super();
    }
    public static boolean P8(AddressInfo p0){
       boolean b = (p0 != null && p0.mAddressId > 0)? true: false;
       return b;
    }
    public void E8(){
       r or = r.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, or, "3")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, or, "6")) {
          if (this.y == null) {
             this.y = new c1(this);
          }
          this.x.post(this.y);
       }
       this.X7(this.s.observable().subscribe(new b1(this)));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, r.class, "5")) {
          return;
       }
       this.x.removeCallbacks(this.y);
       return;
    }
    public final void R8(int p0,int p1,Intent p2,int p3){
       AddressInfo uAddressInfo;
       r or = r.class;
       if (PatchProxy.isSupport(or) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, Integer.valueOf(p3), this, r.class, "10")) {
          return;
       }
       if (p1 == 2) {
          if (!PatchProxy.isSupport(or) || (!PatchProxy.applyVoidTwoRefs(p2, Integer.valueOf(p3), this, or, "11") && p2 != null)) {
             if (PatchProxy.isSupport(or)) {
                uAddressInfo = PatchProxy.applyTwoRefs(p2, Integer.valueOf(p3), this, or, "12");
                if (uAddressInfo != PatchProxyResult.class) {
                }else if(p3 == 3){
                   uAddressInfo = SerializableHook.getSerializableExtra(p2, "ADDRESS_INFO");
                }else {
                   uAddressInfo = SerializableHook.getSerializableExtra(p2, "KEY_CALLBACK_RESULT_JSON");
                }
             }else {
                goto label_0054 ;
             }
             if (uAddressInfo != null && !uAddressInfo.equals(this.B)) {
                boolean b = true;
                if (h.a(this.w)) {
                   if (this.v.get() != null) {
                      d uod = this.v.get();
                      PageInfoReqParam pageInfoReqP = uod.c();
                      if (uod.h()) {
                         pageInfoReqP.reselectAddress(uAddressInfo.mAddressId);
                      }
                      uod.d(uod.c(), b);
                   }else {
                      a.h(MerchantTransactionLogBiz.LIVE_PURCHASE_PANEL, "LiveAudienceOrderConfirmAddressTipsPresenter", "updateAddress", "service", "null");
                   }
                }else if(!r.P8(this.B)){
                   this.q.c();
                }else {
                   this.S8(uAddressInfo);
                   r tu = this.u;
                   if (tu != null) {
                      MerchantLivePurchasePanelResponse mAddressInfo = tu.mAddressInfo;
                      if (mAddressInfo != null) {
                         mAddressInfo.updateAddressInfo(uAddressInfo, s.a());
                         this.q.e(b);
                         this.s.notifyChanged(new a(uAddressInfo, this.u.mAddressInfo.mAddress));
                      }
                   }
                }
             }
          }
       }else if(p1 == 3 && this.v.get() != null){
          d uod1 = this.v.get();
          PageInfoReqParam pageInfoReqP1 = uod1.c();
          if (h.a(this.w)) {
             r tB = this.B;
             AddressInfo mAddressId = (tB != null)? tB.mAddressId: 0;
             pageInfoReqP1.reselectAddress(mAddressId);
          }else {
             pageInfoReqP1.mReselectedEventType = 0;
          }
          uod1.d(uod1.c(), false);
       }
    label_011d :
       return;
    }
    public void S8(AddressInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, r.class, "13")) {
          return;
       }
       r tB = this.B;
       if (tB != null) {
          tB.updateAddressInfo(p0, s.a());
       }else {
          this.B = p0;
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, r.class, "1")) {
          return;
       }
       this.A = m1.f(p0, 0x7f0a34da);
       this.x = m1.f(p0, 0x7f0a02f6);
       this.D = p0.findViewById(0x7f0a2f01);
       this.E = p0.findViewById(0x7f0a40e9);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, r.class, "2")) {
          return;
       }
       this.q = this.r8("LIVE_AUDIENCE_ORDER_CONFIRM_SERVICE");
       this.r = this.q8(i.class);
       this.s = this.r8("LIVE_AUDIENCE_ORDER_CONFIRM_BOTTOM_ADDRESS_TIP");
       this.t = this.r8("LIVE_BASE_CONTEXT");
       this.u = this.q8(MerchantLivePurchasePanelResponse.class);
       this.v = this.r8("LIVE_AUDIENCE_ORDER_BOTTOM_BAR_SERVICE_MEDIA");
       this.w = this.r8("LIVE_AUDIENCE_SKU_MANAGER");
       this.z = this.r8("LIVE_AUDIENCE_ORDER_CONFIRM_BOTTOM_ADDRESS_TIP_POSITION").intValue();
       this.p = this.r8("LIVE_AUDIENCE_ORDER_CONFIRM_PANEL_FRAGMENT");
       this.F = this.r8("ID_ADDRESS_SERVICE_SUPPLIER");
       return;
    }
}
