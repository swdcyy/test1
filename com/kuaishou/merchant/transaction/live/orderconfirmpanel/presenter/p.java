package com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.p;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.r;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.basic.model.AddressInfo;
import java.util.Objects;
import java.lang.Integer;
import java.lang.Boolean;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.merchant.transaction.base.purchasepanel.model.MerchantLivePurchasePanelResponse;
import com.kwai.robust.PatchProxyResult;
import kc4.x;
import z1.k;
import qk4.d;
import kc4.c$a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.merchant.transaction.base.logger.MerchantTransactionLogBiz;
import p74.a;
import o74.a;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.q;
import qk4.e;
import com.kuaishou.merchant.transaction.base.sku.c;
import kc4.c$b;
import android.content.Intent;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.MerchantLivePurchasePanelFragment;
import com.kuaishou.merchant.transaction.base.address.model.AddressEditParams$a;
import com.kuaishou.merchant.api.core.model.Commodity;
import com.yxcorp.utility.n;
import lnc.a1;
import com.kuaishou.merchant.api.core.LiveMerchantBaseContext;
import com.yxcorp.gifshow.activity.GifshowActivity;
import nk4.a1;
import n3d.a;
import com.kuaishou.merchant.transaction.base.address.MerchantAddressEditActivity;
import nk4.z0;
import com.kuaishou.merchant.transaction.base.address.MerchantAddressListActivity;

public class p extends m	// class@00083b
{
    public final r c;

    public void p(r p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       Intent obj1;
       int b;
       AddressInfo obj4;
       Object obj = this;
       if (PatchProxy.applyVoidOneRefs(p0, obj, p.class, "1")) {
          return;
       }
       p c = obj.c;
       int i = (!r.P8(c.B))? 3: 1;
       Objects.requireNonNull(c);
       r or = r.class;
       if (!PatchProxy.isSupport(or) || (PatchProxy.applyVoidTwoRefs(Integer.valueOf(i), Boolean.FALSE, c, or, "7") || (c.getActivity() != null && !c.getActivity().isFinishing()))) {
          Activity activity = c.getActivity();
          MerchantLivePurchasePanelResponse mAddressInfo = c.u.mAddressInfo;
          PatchProxyResult patchProxyRe = PatchProxyResult.class;
          int i1 = 0;
          if (PatchProxy.isSupport(or)) {
             obj1 = PatchProxy.applyThreeRefs(activity, mAddressInfo, Integer.valueOf(i), c, r.class, "8");
             if (obj1 != patchProxyRe) {
                b = obj1.booleanValue();
             }else if(!x.h(mAddressInfo)){
                if (c.F.get() == null || c.v.get() == null) {
                   a.u(MerchantTransactionLogBiz.LIVE_PURCHASE_PANEL, "LiveAudienceOrderConfirmAddressTipsPresenter", "openAddressHalfPage", "addrService", c.F.get(), "btmBarService", c.v.get());
                }else {
                   Object obj2 = c.v.get();
                   Object obj3 = c.F.get();
                   int i2 = 4;
                   if (PatchProxy.isSupport(or)) {
                      Object[] objArray = new Object[]{activity,obj2,obj3,mAddressInfo,Integer.valueOf(i)};
                      obj4 = PatchProxy.apply(objArray, c, or, "9");
                      if (obj4 != patchProxyRe) {
                         b = obj4.booleanValue();
                      }
                   }
                   obj4 = mAddressInfo.mListUri;
                   if (i == 3) {
                      obj4 = mAddressInfo.mAddUri;
                   }else if(i == i2){
                      obj4 = mAddressInfo.mEditUri;
                   }
                   AddressInfo uAddressInfo = obj4;
                   if (TextUtils.x(uAddressInfo)) {
                      a.i(MerchantTransactionLogBiz.LIVE_PURCHASE_PANEL, "LiveAudienceOrderConfirmAddressTipsPresenter", "openLev4AddressPage", "uri", "empty", "pageType", Integer.valueOf(i));
                   }else {
                      q oq = new q(c, obj2, c.q, c.w, c.u, c.B);
                      obj3.a(activity, uAddressInfo, patchProxyRe);
                      b = true;
                   }
                }
             }
             b = false;
          }else {
             goto label_0075 ;
          }
          if (!b) {
             obj1 = c.getActivity().getIntent();
             if (obj1 != null) {
                obj1.putExtra("isHalf", true);
                obj1.putExtra("absoluteHeight", c.p.Pa());
             }
             b = 0x7f070319;
             if (i != 1) {
                if (i == 3) {
                   AddressEditParams$a uoa = new AddressEditParams$a();
                   r b1 = c.B;
                   if (b1 == null) {
                      b1 = new AddressInfo();
                   }
                   uoa.a(b1);
                   uoa.f(c.u.mItemInfo.mId);
                   uoa.e(true);
                   uoa.d(c.p.Pa());
                   uoa.g(false);
                   uoa.c(((n.j(c.getActivity()) - c.p.Pa()) - a1.d(b)));
                   uoa.b(true);
                   uoa.h(c.t.getLiveAuthorId());
                   MerchantAddressEditActivity.C3(c.getActivity(), uoa, new a1(c, i));
                }
             }else {
                MerchantAddressListActivity.C3(c.getActivity(), 2, c.B.mAddressId, 1, c.u.mItemInfo.mId, c.t.getLiveAuthorId(), true, ((n.j(c.getActivity()) - c.p.Pa()) - a1.d(b)), new z0(c, i));
             }
          }
       }
    label_01e4 :
       return;
    }
}
