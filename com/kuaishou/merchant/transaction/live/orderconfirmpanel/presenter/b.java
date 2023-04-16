package com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.merchant.basic.model.AddressInfo;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.app.Activity;
import oi4.a;
import oi4.b;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.merchant.api.core.LiveMerchantBaseContext;
import com.kuaishou.merchant.transaction.base.purchasepanel.model.MerchantLivePurchasePanelResponse;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.b$a;
import androidx.recyclerview.widget.RecyclerView$r;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Integer;
import android.widget.TextView;
import android.content.Intent;
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
import ue4.s;
import kc4.x;
import kc4.c$a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.c;
import kc4.c$b;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.MerchantLivePurchasePanelFragment;
import com.kuaishou.merchant.transaction.base.address.model.AddressEditParams$a;
import com.kuaishou.merchant.api.core.model.Commodity;
import com.yxcorp.utility.n;
import lnc.a1;
import com.yxcorp.gifshow.activity.GifshowActivity;
import nk4.c;
import n3d.a;
import com.kuaishou.merchant.transaction.base.address.MerchantAddressEditActivity;
import nk4.b;
import com.kuaishou.merchant.transaction.base.address.MerchantAddressListActivity;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import y8c.d;
import pi4.a;
import com.smile.gifmaker.mvps.utils.DefaultObservable;
import nk4.e;
import android.view.View$OnClickListener;
import java.lang.StringBuilder;
import nk4.d;

public class b extends PresenterV2	// class@000819
{
    public View A;
    public TextView B;
    public TextView C;
    public TextView D;
    public TextView E;
    public View F;
    public d p;
    public RecyclerView q;
    public k r;
    public LiveMerchantBaseContext s;
    public MerchantLivePurchasePanelResponse t;
    public AddressInfo u;
    public c v;
    public DefaultObservable w;
    public MerchantLivePurchasePanelFragment x;
    public e y;
    public k z;

    public void b(){
       super();
    }
    public static boolean R8(AddressInfo p0){
       boolean b = (p0 != null && p0.mAddressId > 0)? true: false;
       return b;
    }
    public static boolean S8(View p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, null, b.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       b = (p0 != null && !p0.getVisibility())? true: false;
       return b;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, b.class, "4")) {
          return;
       }
       b.a(this.getActivity()).r(this.s.getLiveStreamPackage(), this.t, this.u);
       this.a9();
       this.q.addOnScrollListener(new b$a(this));
       return;
    }
    public void F8(){
       PatchProxy.applyVoid(null, this, b.class, "3");
    }
    public void J8(){
       PatchProxy.applyVoid(null, this, b.class, "5");
    }
    public final void P8(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "18")) {
          return;
       }
       if (0x7f0a3b86 == p0) {
          this.B = this.m8().findViewById(0x7f0a019b);
          this.C = this.m8().findViewById(0x7f0a019c);
          this.D = this.m8().findViewById(0x7f0a019a);
          this.E = this.m8().findViewById(0x7f0a0199);
       }
       return;
    }
    public final void V8(int p0,int p1,Intent p2,int p3){
       AddressInfo uAddressInfo;
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, Integer.valueOf(p3), this, b.class, "7")) {
          return;
       }
       if (p1 == 2) {
          if (!PatchProxy.isSupport(uob) || (!PatchProxy.applyVoidTwoRefs(p2, Integer.valueOf(p3), this, uob, "8") && p2 != null)) {
             if (PatchProxy.isSupport(uob)) {
                uAddressInfo = PatchProxy.applyTwoRefs(p2, Integer.valueOf(p3), this, uob, "9");
                if (uAddressInfo != PatchProxyResult.class) {
                }else if(p3 == 3){
                   uAddressInfo = SerializableHook.getSerializableExtra(p2, "ADDRESS_INFO");
                }else {
                   uAddressInfo = SerializableHook.getSerializableExtra(p2, "KEY_CALLBACK_RESULT_JSON");
                }
             }else {
                goto label_0054 ;
             }
             if (uAddressInfo != null) {
                if (h.a(this.v)) {
                   if (this.r.get() != null) {
                      d uod = this.r.get();
                      PageInfoReqParam pageInfoReqP = uod.c();
                      if (uod.h()) {
                         pageInfoReqP.reselectAddress(uAddressInfo.mAddressId);
                      }
                      uod.d(uod.c(), true);
                   }else {
                      a.h(MerchantTransactionLogBiz.LIVE_PURCHASE_PANEL, "LiveAudienceOrderConfirmAddressPresenter", "updateAddress", "service", "null");
                   }
                }else if(!b.R8(this.u)){
                   this.y.c();
                }else {
                   this.u.updateAddressInfo(uAddressInfo, s.a());
                   this.a9();
                }
                this.Z8();
             }
          }
       }else if(p1 == 3 && this.r.get() != null){
          d uod1 = this.r.get();
          PageInfoReqParam pageInfoReqP1 = uod1.c();
          if (h.a(this.v)) {
             b tu = this.u;
             AddressInfo mAddressId = (tu != null)? tu.mAddressId: 0;
             pageInfoReqP1.reselectAddress(mAddressId);
          }else {
             pageInfoReqP1.mReselectedEventType = 0;
          }
          uod1.d(uod1.c(), false);
       }
    label_00fc :
       return;
    }
    public void W8(int p0,boolean p1){
       boolean b;
       Intent obj1;
       int b1;
       int this;
       AddressInfo obj4;
       Object obj = this;
       int i = p0;
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), obj, uob, "11")) {
          return;
       }
       if (this.getActivity() != null && !this.getActivity().isFinishing()) {
          Activity activity = this.getActivity();
          b u = obj.u;
          PatchProxyResult patchProxyRe = PatchProxyResult.class;
          int i1 = 3;
          b = true;
          if (PatchProxy.isSupport(uob)) {
             obj1 = PatchProxy.applyThreeRefs(activity, u, Integer.valueOf(p0), this, b.class, "12");
             if (obj1 != patchProxyRe) {
                b1 = obj1.booleanValue();
             }else {
             label_0059 :
                String str = null;
                if (x.h(u)) {
                   if (obj.z.get() == null || obj.r.get() == null) {
                      a.u(MerchantTransactionLogBiz.LIVE_PURCHASE_PANEL, "LiveAudienceOrderConfirmAddressPresenter", "openAddressHalfPage", "addrService", obj.z.get(), "btmBarService", obj.r.get());
                   }else {
                      Object obj2 = obj.r.get();
                      Object obj3 = obj.z.get();
                      this = 4;
                      if (PatchProxy.isSupport(uob)) {
                         Object[] objArray = new Object[]{activity,obj2,obj3,u,Integer.valueOf(p0)};
                         obj4 = PatchProxy.apply(objArray, obj, uob, "13");
                         if (obj4 != patchProxyRe) {
                            b1 = obj4.booleanValue();
                         }
                      }
                      obj4 = u.mListUri;
                      if (i == i1) {
                         obj4 = u.mAddUri;
                      }else if(i == this){
                         obj4 = u.mEditUri;
                      }
                      AddressInfo uAddressInfo = obj4;
                      if (TextUtils.x(uAddressInfo)) {
                         a.i(MerchantTransactionLogBiz.LIVE_PURCHASE_PANEL, "LiveAudienceOrderConfirmAddressPresenter", "openLev4AddressPage", "uri", "empty", "pageType", Integer.valueOf(p0));
                      }else {
                         c uoc = new c(this, obj2, obj.y, obj.v, obj.t, obj.u);
                         obj3.a(activity, uAddressInfo, patchProxyRe);
                         b1 = true;
                      }
                   }
                }
                b1 = false;
             }
          }else {
             goto label_0059 ;
          }
          if (b1) {
             return;
          }else {
             obj1 = this.getActivity().getIntent();
             if (obj1 != null) {
                obj1.putExtra("isHalf", b);
                obj1.putExtra("absoluteHeight", obj.x.Pa());
             }
             b1 = 0x7f070319;
             if (i != b) {
                if (i == i1) {
                   AddressEditParams$a uoa = new AddressEditParams$a();
                   uoa.a(obj.u);
                   uoa.f(obj.t.mItemInfo.mId);
                   uoa.e(b);
                   uoa.d(obj.x.Pa());
                   uoa.g(p1);
                   uoa.c(((n.j(this.getActivity()) - obj.x.Pa()) - a1.d(b1)));
                   uoa.b(b);
                   uoa.h(obj.s.getLiveAuthorId());
                   MerchantAddressEditActivity.C3(this.getActivity(), uoa, new c(obj, i));
                }
             }else {
                MerchantAddressListActivity.C3(this.getActivity(), 2, obj.u.mAddressId, 1, obj.t.mItemInfo.mId, obj.s.getLiveAuthorId(), true, ((n.j(this.getActivity()) - obj.x.Pa()) - a1.d(b1)), new b(obj, i));
             }
          }
       }
    label_01b9 :
       return;
    }
    public final void X8(boolean p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "17")) {
          return;
       }
       if (p0) {
          this.P8(R.id.stub_address_panel);
          this.A.setVisibility(0);
       }else if(b.S8(this.A)){
          this.A.setVisibility(8);
       }
       return;
    }
    public final void Y8(boolean p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "16")) {
          return;
       }
       if (p0) {
          this.P8(R.id.stub_no_address_panel);
          this.F.setVisibility(0);
       }else if(b.S8(this.F)){
          this.F.setVisibility(8);
       }
       return;
    }
    public void Z8(){
       if (PatchProxy.applyVoid(null, this, b.class, "10")) {
          return;
       }
       LinearLayoutManager layoutManage = this.q.getLayoutManager();
       if (layoutManage == null) {
          return;
       }
       if (layoutManage.i0() > this.p.get() || layoutManage.c() < this.p.get()) {
          MerchantLivePurchasePanelResponse mAddressInfo = this.t.mAddressInfo;
          if (mAddressInfo != null && !TextUtils.x(mAddressInfo.mAddress)) {
             MerchantLivePurchasePanelResponse mAddressInfo1 = this.t.mAddressInfo;
             this.w.notifyChanged(new a(mAddressInfo1, mAddressInfo1.mAddress));
          }else {
             this.w.notifyChanged(new a(new AddressInfo(), a1.p(R.string.arg_RES_7f1033c4)));
          }
       }else {
          this.w.notifyChanged(new a());
       }
       return;
    }
    public final void a9(){
       boolean b;
       b uob = b.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uob, "6")) {
          return;
       }
       b = false;
       boolean b1 = true;
       if (b.R8(this.u)) {
          this.Y8(b);
          this.X8(b1);
          b tu = this.u;
          if (PatchProxy.applyVoidOneRefs(tu, this, uob, "15") || (this.A != null && tu != null)) {
             this.A.setOnClickListener(new e(this));
             this.B.setText(tu.mConsignee);
             this.C.setText(tu.mMobile);
             uob = this.D;
             String str = " ";
             StringBuilder str1 = tu.mProvince+str+tu.mCity+str+tu.mDistrict;
             str = (TextUtils.x(tu.mTownName))? "": str+tu.mTownName;
             uob.setText(str1+str);
             this.E.setText(tu.mAddress);
          }
       }else {
          this.Y8(b1);
          this.X8(b);
          if (!PatchProxy.applyVoid(objArray, this, uob, "14") && this.F != null) {
             this.F.setOnClickListener(new d(this));
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       this.A = p0.findViewById(0x7f0a3b86);
       this.F = p0.findViewById(0x7f0a3b8f);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       this.p = this.r8("ADAPTER_POSITION_GETTER");
       this.q = this.r8("LIVE_AUDIENCE_ORDER_CONFIRM_RECYCLER_VIEW");
       this.r = this.r8("LIVE_AUDIENCE_ORDER_BOTTOM_BAR_SERVICE_MEDIA");
       this.s = this.r8("LIVE_BASE_CONTEXT");
       this.t = this.q8(MerchantLivePurchasePanelResponse.class);
       this.u = this.q8(AddressInfo.class);
       this.v = this.r8("LIVE_AUDIENCE_SKU_MANAGER");
       this.w = this.r8("LIVE_AUDIENCE_ORDER_CONFIRM_BOTTOM_ADDRESS_TIP");
       this.x = this.r8("LIVE_AUDIENCE_ORDER_CONFIRM_PANEL_FRAGMENT");
       this.y = this.r8("LIVE_AUDIENCE_ORDER_CONFIRM_SERVICE");
       this.z = this.r8("ID_ADDRESS_SERVICE_SUPPLIER");
       return;
    }
}
