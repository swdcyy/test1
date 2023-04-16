package com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.MtPurchasePanelCommodityWelfareSignalProcPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.MtPurchasePanelCommodityWelfareSignalProcPresenter$a;
import nsd.u;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.MtPurchasePanelCommodityWelfareSignalProcPresenter$mSignalArrayListener$1;
import com.yxcorp.utility.SystemUtil;
import java.lang.String;
import jc4.f;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.api.core.model.Commodity$ExtraInfo;
import com.kuaishou.merchant.api.core.model.Commodity;
import msd.l;
import qk4.c;
import com.yxcorp.gifshow.util.rx.RxBus;
import p14.f;
import brd.t;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.MtPurchasePanelCommodityWelfareSignalProcPresenter$c;
import erd.g;
import crd.b;
import com.kuaishou.livestream.message.nano.LiveShopMessages$LiveShopAction;
import java.lang.Boolean;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.MtPurchasePanelCommodityWelfareSignalProcPresenter$b;
import java.lang.Runnable;
import ekd.k1;
import com.kuaishou.merchant.message.nano.LiveRoomSignalMessage$WelfareItemStockProgressMessage;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.livestream.message.nano.LiveExtraMessages$LiveCommonAbstractSignal;
import com.kuaishou.merchant.live.basic.common.LiveCommonLogBiz;
import p74.a;
import java.lang.Throwable;
import o74.a;
import kk4.g;
import com.kuaishou.merchant.transaction.base.purchasepanel.model.OrderConfirmCommodity;
import com.smile.gifmaker.mvps.utils.DefaultObservable;
import qk4.e;
import jk4.d;
import com.kuaishou.merchant.transaction.base.purchasepanel.model.MerchantLivePurchasePanelResponse;

public final class MtPurchasePanelCommodityWelfareSignalProcPresenter extends PresenterV2	// class@000816
{
    public OrderConfirmCommodity p;
    public DefaultObservable q;
    public e r;
    public c s;
    public d t;
    public MerchantLivePurchasePanelResponse u;
    public final l v;
    public final boolean w;
    public static final MtPurchasePanelCommodityWelfareSignalProcPresenter$a x;

    static {
       MtPurchasePanelCommodityWelfareSignalProcPresenter.x = new MtPurchasePanelCommodityWelfareSignalProcPresenter$a(null);
    }
    public void MtPurchasePanelCommodityWelfareSignalProcPresenter(){
       super();
       this.v = new MtPurchasePanelCommodityWelfareSignalProcPresenter$mSignalArrayListener$1(this);
       boolean b = false;
       if (SystemUtil.I() || f.a("enablePurchasePanelSignalFilter", b)) {
          b = true;
       }
       this.w = b;
       return;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, MtPurchasePanelCommodityWelfareSignalProcPresenter.class, "2")) {
          return;
       }
       MtPurchasePanelCommodityWelfareSignalProcPresenter tp = this.p;
       if (tp != null) {
          Commodity$ExtraInfo extraInfo = tp.getExtraInfo();
          if (extraInfo != null && extraInfo.mSaleType == 6) {
             if (this.w != null) {
                tp = this.s;
                if (tp != null) {
                   tp.a("welfareItemStockProgress", this.v);
                }
             }else {
                this.X7(RxBus.f.f(f.class).subscribe(new MtPurchasePanelCommodityWelfareSignalProcPresenter$c(this)));
             }
          }
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, MtPurchasePanelCommodityWelfareSignalProcPresenter.class, "3")) {
          return;
       }
       MtPurchasePanelCommodityWelfareSignalProcPresenter ts = this.s;
       if (ts != null) {
          ts.b("welfareItemStockProgress", this.v);
       }
       return;
    }
    public final void P8(LiveShopMessages$LiveShopAction p0,boolean p1){
       MtPurchasePanelCommodityWelfareSignalProcPresenter mtPurchasePa = MtPurchasePanelCommodityWelfareSignalProcPresenter.class;
       if (PatchProxy.isSupport(mtPurchasePa) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, mtPurchasePa, "7")) {
          return;
       }
       k1.o(new MtPurchasePanelCommodityWelfareSignalProcPresenter$b(this, p0, p1));
       return;
    }
    public final LiveRoomSignalMessage$WelfareItemStockProgressMessage R8(LiveShopMessages$LiveShopAction p0){
       LiveRoomSignalMessage$WelfareItemStockProgressMessage welfareItemS;
       Object obj = PatchProxy.applyOneRefs(p0, this, MtPurchasePanelCommodityWelfareSignalProcPresenter.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          welfareItemS = LiveRoomSignalMessage$WelfareItemStockProgressMessage.parseFrom(p0.action.payload);
       }catch(java.lang.Exception e4){
          a.l(LiveCommonLogBiz.WELFARE, "LiveBaseWelfareProgressPresenter", "parse WelfareProgressMessage failed", e4);
          welfareItemS = null;
       }
       return welfareItemS;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, MtPurchasePanelCommodityWelfareSignalProcPresenter.class, "1")) {
          return;
       }
       this.p = this.q8(g.class).b;
       this.q = this.r8("LIVE_AUDIENCE_ORDER_CONFIRM_BOTTOM_ACTIVITY_TIP");
       this.r = this.r8("LIVE_AUDIENCE_ORDER_CONFIRM_SERVICE");
       this.s = this.r8("ORDER_CONFIRM_SC_LIVE_SERVICE");
       this.t = this.r8("REFRESH_PAGE_SINGLE_TASK_MANAGER");
       this.u = this.q8(MerchantLivePurchasePanelResponse.class);
       return;
    }
}
