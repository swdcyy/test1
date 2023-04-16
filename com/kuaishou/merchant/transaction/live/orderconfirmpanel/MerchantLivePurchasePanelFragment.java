package com.kuaishou.merchant.transaction.live.orderconfirmpanel.MerchantLivePurchasePanelFragment;
import bt3.a;
import com.kuaishou.merchant.basic.fragment.MerchantRecycleFragment;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.MerchantLivePurchasePanelFragment$b;
import jk4.d;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.MerchantLivePurchasePanelFragment$a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.w;
import androidx.fragment.app.Fragment;
import com.kuaishou.merchant.transaction.live.orderconfirmpage.fragment.MerchantPurchasePanelFragment;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.i;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.g;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.o;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.l;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.d;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.r;
import nk4.s;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.e;
import y8c.t;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.c;
import java.lang.Integer;
import java.lang.Boolean;
import qk4.d;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ExpTagTrans;
import k2b.u1;
import java.lang.Number;
import ni4.b;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.merchant.api.core.LiveMerchantBaseContext;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.merchant.transaction.base.purchasepanel.model.MerchantLivePurchasePanelResponse;
import com.kuaishou.client.log.content.packages.nano.ClientContent$CommodityDetailPackage;
import com.kuaishou.merchant.api.core.model.Commodity;
import com.kuaishou.merchant.transaction.base.purchasepanel.model.MerchantLivePurchasePanelResponse$ItemInfo;
import java.util.Collection;
import ekd.q;
import java.util.List;
import com.kuaishou.merchant.transaction.base.purchasepanel.OrderConfirmLogParam;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import xm4.a;
import java.util.Map;
import lnc.i3;
import java.lang.CharSequence;
import java.util.Set;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map$Entry;
import com.kuaishou.merchant.transaction.base.sku.c;
import yj4.e;
import yj4.f;
import android.net.Uri;
import ekd.x0;
import ot3.h0;
import lnc.o5;
import r74.d;
import java.util.UUID;
import com.kwai.performance.fluency.page.monitor.PageMonitor;
import java.util.Objects;
import jk4.a;
import y8c.g;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.a;
import androidx.recyclerview.widget.RecyclerView;
import qvb.i;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.b;

public class MerchantLivePurchasePanelFragment extends MerchantRecycleFragment implements a	// class@0007e5
{
    public LiveMerchantBaseContext I;
    public final MerchantLivePurchasePanelFragment$b J;
    public b K;
    public d L;
    public c M;
    public c$a N;
    public final d O;
    public ClientEvent$ExpTagTrans P;
    public ClientEvent$ExpTagTrans Q;
    public String R;
    public i3 S;
    public e T;
    public static final int U;

    public void MerchantLivePurchasePanelFragment(){
       super();
       this.J = new MerchantLivePurchasePanelFragment$b();
       this.O = new d();
       this.T = new MerchantLivePurchasePanelFragment$a(this);
    }
    public PresenterV2 B2(){
       PresenterV2 obj = PatchProxy.applyWithListener(null, this, MerchantLivePurchasePanelFragment.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.B2();
       obj.U7(new w(this));
       if (this instanceof MerchantPurchasePanelFragment ^ 0x01) {
          obj.U7(new i(this));
          obj.U7(new g());
       }
       obj.U7(new o());
       obj.U7(new l());
       obj.U7(new d());
       obj.U7(new r());
       obj.U7(new s());
       obj.U7(new e());
       PatchProxy.onMethodExit(MerchantLivePurchasePanelFragment.class, "6");
       return obj;
    }
    public t Bh(){
       Object obj = PatchProxy.apply(null, this, MerchantLivePurchasePanelFragment.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.M == null) {
          this.M = new c(this.J, this);
       }
       return this.M;
    }
    public String C1(){
       return "AUDIENCE_ORDER_CONFIRM_PANEL";
    }
    public String D1(){
       return "∞Î∆¡∂©µ•»∑»œ“≥";
    }
    public boolean E3(int p0){
       MerchantLivePurchasePanelFragment obj;
       if (PatchProxy.isSupport(MerchantLivePurchasePanelFragment.class)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, MerchantLivePurchasePanelFragment.class, "15");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (this.J.s != null) {
          return false;
       }else {
          obj = this.L;
          if (obj != null && obj.m()) {
             return true;
          }else if(this.J.B == true){
             if (p0 != 2) {
                return false;
             }else {
                return true;
             }
          }else {
             return false;
          }
       }
    }
    public ClientEvent$ExpTagTrans I1(){
       return this.P;
    }
    public ClientEvent$ExpTagTrans K5(){
       return this.Q;
    }
    public int M(){
       return 1;
    }
    public void Mh(){
       if (PatchProxy.applyVoid(null, this, MerchantLivePurchasePanelFragment.class, "12")) {
          return;
       }
       this.dismiss();
       return;
    }
    public void Nh(){
       if (PatchProxy.applyVoid(null, this, MerchantLivePurchasePanelFragment.class, "10")) {
          return;
       }
       u1.c(this.o(), this.R);
       return;
    }
    public int Pa(){
       MerchantLivePurchasePanelFragment obj = PatchProxy.apply(null, this, MerchantLivePurchasePanelFragment.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.K;
       if (obj != null) {
          return (obj.Pa() - this.K.k9());
       }
       return 0;
    }
    public ClientContent$ContentPackage Q3(){
       MerchantLivePurchasePanelFragment$b f;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       ClientContent$ContentPackage obj = PatchProxy.apply(objArray, this, MerchantLivePurchasePanelFragment.class, "17");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = new ClientContent$ContentPackage();
       ClientContent$LiveStreamPackage liveStreamPa = PatchProxy.apply(objArray, this, MerchantLivePurchasePanelFragment.class, "18");
       if (liveStreamPa != patchProxyRe) {
       }else {
          liveStreamPa = new ClientContent$LiveStreamPackage();
          MerchantLivePurchasePanelFragment tJ1 = this.J;
          if (tJ1 != null) {
             f = tJ1.f;
             if (f != null) {
                liveStreamPa.liveStreamId = TextUtils.k(f.getLiveStreamId());
                liveStreamPa.anchorUserId = TextUtils.k(this.J.f.getLiveAuthorId());
                liveStreamPa.serverExpTag = TextUtils.k(this.J.f.getServerExpTag());
             }
          }
          tJ1 = this.J;
          if (tJ1 != null) {
             f = tJ1.c;
             if (f != null) {
                MerchantLivePurchasePanelResponse mUri = f.mUri;
                if (mUri == null) {
                   mUri = "";
                }
                liveStreamPa.sourceUrl = mUri;
             }
          }
       }
       obj.liveStreamPackage = liveStreamPa;
       ClientContent$CommodityDetailPackage uCommodityDe = PatchProxy.apply(objArray, this, MerchantLivePurchasePanelFragment.class, "19");
       if (uCommodityDe != patchProxyRe) {
       }else {
          uCommodityDe = new ClientContent$CommodityDetailPackage();
          MerchantLivePurchasePanelFragment tJ = this.J;
          if (tJ != null) {
             MerchantLivePurchasePanelFragment$b c = tJ.c;
             if (c != null) {
                MerchantLivePurchasePanelResponse mItemInfo = c.mItemInfo;
                if (mItemInfo != null) {
                   uCommodityDe.id = TextUtils.k(mItemInfo.mId);
                   mItemInfo = c.mItemInfo;
                   uCommodityDe.itemActivityType = mItemInfo.mSaleType;
                   uCommodityDe.itemType = mItemInfo.mSourceType;
                }
                if (!q.f(c.mSkuInfos)) {
                   uCommodityDe.skuNum = c.mSkuInfos.size();
                }
                uCommodityDe.sellerId = TextUtils.k(c.mSellerId);
                mItemInfo = c.mLogParam;
                if (mItemInfo != null) {
                   uCommodityDe.carrierId = TextUtils.k(mItemInfo.mCarrierId);
                   uCommodityDe.carrierType = String.valueOf(c.mLogParam.mCarrierType);
                }
                uCommodityDe.hasCoupon = c.mHasCoupon;
             }
          }
       }
       obj.commodityDetailPackage = uCommodityDe;
       return obj;
    }
    public boolean S1(){
       return false;
    }
    public boolean Xg(){
       return false;
    }
    public void dismiss(){
       if (PatchProxy.applyVoid(null, this, MerchantLivePurchasePanelFragment.class, "11")) {
          return;
       }
       MerchantLivePurchasePanelFragment tK = this.K;
       if (tK != null) {
          tK.dismiss();
       }
       return;
    }
    public boolean eg(){
       return true;
    }
    public View eh(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, MerchantLivePurchasePanelFragment.class, "3");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       return a.d(p0, 0x7f0d04e0, p1, false);
    }
    public List fg(){
       List obj = PatchProxy.apply(null, this, MerchantLivePurchasePanelFragment.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.fg();
       obj.add(this.J);
       return obj;
    }
    public int getLayoutResId(){
       return 0x7f0d04e0;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MerchantLivePurchasePanelFragment.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(MerchantLivePurchasePanelFragment.class, null);
       return objectsByTag;
    }
    public String getPageParams(){
       MerchantLivePurchasePanelFragment obj = PatchProxy.apply(null, this, MerchantLivePurchasePanelFragment.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.J == null) {
          return "";
       }
       obj = this.S;
       if (obj != null) {
          return obj.e();
       }
       this.S = i3.f();
       if (!TextUtils.x(this.J.T)) {
          this.S.d("error_text", this.J.T);
       }
       if (!q.h(this.J.S)) {
          Iterator iterator = this.J.S.entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             if (!TextUtils.x(uEntry.getKey()) && !TextUtils.x(uEntry.getValue())) {
                this.S.d(uEntry.getKey(), uEntry.getValue());
             }
          }
       }
       return this.S.e();
    }
    public String h5(){
       return this.R;
    }
    public String o(){
       return "MERCHANT_SKU_PURCHASE_PAGE_HALF";
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantLivePurchasePanelFragment.class, "2")) {
          return;
       }
       super.onCreate(p0);
       if (!PatchProxy.applyVoid(null, this, MerchantLivePurchasePanelFragment.class, "14")) {
          MerchantLivePurchasePanelFragment tJ = this.J;
          tJ.b = this;
          tJ.r = this;
          tJ.d = new c();
          tJ = this.J;
          tJ.f = this.I;
          tJ.g = this.T;
          tJ.h = new e(this);
          tJ.t = new f(this);
          tJ.v = this.O;
          tJ.w = h0.a(x0.f(tJ.x));
          tJ = this.J;
          tJ.y = x0.b(x0.f(tJ.x), "itemId", "");
          tJ = this.J;
          tJ.z = x0.b(x0.f(tJ.x), "sellerId", "");
          tJ = this.J;
          tJ.A = x0.b(x0.f(tJ.x), "liveStreamId", "");
          tJ = this.J;
          String str = "0";
          tJ.P = x0.b(x0.f(tJ.x), "selectedSkuId", str);
          MerchantLivePurchasePanelFragment tJ1 = this.J;
          boolean b = true;
          if (o5.b(x0.b(x0.f(this.J.x), "hideBackIcon", str), 0) != b) {
             b = false;
          }
          tJ1.n = b;
          this.J.B = o5.b(x0.b(x0.f(this.J.x), "fromType", str), 0);
          tJ = this.J;
          tJ.G = x0.b(x0.f(tJ.x), "carrierId", "");
          this.J.F = o5.b(x0.b(x0.f(this.J.x), "carrierType", str), 0);
          tJ = this.J;
          tJ.H = x0.b(x0.f(tJ.x), "carrierEntry", "");
          tJ = this.J;
          tJ.J = x0.b(x0.f(tJ.x), "campaignType", "");
          tJ = this.J;
          tJ.K = x0.b(x0.f(tJ.x), "adActionType", "");
          tJ = this.J;
          tJ.L = x0.b(x0.f(tJ.x), "extType", "");
          tJ = this.J;
          tJ.M = x0.b(x0.f(tJ.x), "shortBuyScene", "");
          tJ = this.J;
          tJ.N = o5.d(x0.b(x0.f(tJ.x), "addressId", ""), 0);
          tJ = this.J;
          tJ.O = o5.d(x0.b(x0.f(tJ.x), "selectedPropId", ""), 0);
          tJ = this.J;
          tJ.Q = x0.b(x0.f(tJ.x), "installmentProductNo", "");
          tJ.v = this.O;
       }
       d.a(this).b();
       this.R = UUID.randomUUID().toString();
       PageMonitor.INSTANCE.registerPageInfo(this, this.o());
       return;
    }
    public void onDestroy(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, MerchantLivePurchasePanelFragment.class, "9")) {
          return;
       }
       super.onDestroy();
       this.Nh();
       this.R = objArray;
       MerchantLivePurchasePanelFragment tO = this.O;
       Objects.requireNonNull(tO);
       if (!PatchProxy.applyVoid(objArray, tO, d.class, "2")) {
          d a = tO.a;
          if (a != null) {
             a.cancel();
          }
       }
       return;
    }
    public g vh(){
       a obj = PatchProxy.apply(null, this, MerchantLivePurchasePanelFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new a(this.J);
       obj.n1("ADAPTER", obj);
       obj.n1("LIVE_AUDIENCE_ORDER_CONFIRM_RECYCLER_VIEW", this.h0());
       return obj;
    }
    public i yh(){
       Object obj = PatchProxy.apply(null, this, MerchantLivePurchasePanelFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new b(this.J);
    }
}
