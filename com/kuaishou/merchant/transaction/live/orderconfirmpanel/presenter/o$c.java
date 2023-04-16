package com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.o$c;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.o;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import kk4.i;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import oi4.a;
import oi4.b;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.merchant.api.core.LiveMerchantBaseContext;
import com.kuaishou.merchant.transaction.base.purchasepanel.model.MerchantLivePurchasePanelResponse;
import com.kuaishou.merchant.transaction.base.purchasepanel.model.BottomTipInfo;
import com.kuaishou.merchant.transaction.base.logger.MerchantTransactionLogBiz;
import p74.a;
import o74.a;
import com.kuaishou.merchant.transaction.base.purchasepanel.model.BottomTipsPromotionParams;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.model.PageInfoReqParam;
import qk4.d;
import java.lang.Integer;

public class o$c extends m	// class@000839
{
    public final o c;

    public void o$c(o p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o$c.class, "1")) {
          return;
       }
       o$c tc = this.c;
       Objects.requireNonNull(tc);
       o oo = o.class;
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, tc, oo, "15")) {
          int i = tc.v.a();
          b.a(tc.getActivity()).j(tc.y, tc.x.getLiveStreamPackage());
          if (i != 5) {
             if (i != 6) {
                if (i == 8) {
                   tc.S8();
                }
             }else if(PatchProxy.applyVoid(objArray, tc, oo, "30")){
                i a = tc.v.a;
                if (a != null) {
                   objArray = a.mPromotionButtonParam;
                }
                if (objArray == null) {
                   a.g(MerchantTransactionLogBiz.LIVE_PURCHASE_PANEL, "LiveAudienceOrderConfirmTipsPresenter", "no recommend content");
                }else {
                   tc.y.mSelectedItemCount = objArray.mRecommendNum;
                   o s = tc.s;
                   s.l(s.c(), true, true);
                }
             }
          }else if(PatchProxy.applyVoid(objArray, tc, oo, "29")){
             BottomTipInfo mPromotionBu = tc.v.a.mPromotionButtonParam;
             if (mPromotionBu != null) {
                BottomTipsPromotionParams mReselectPro = mPromotionBu.mReselectPromotionType;
                BottomTipsPromotionParams mPromotionId = mPromotionBu.mPromotionId;
                BottomTipsPromotionParams mPromotionSu = mPromotionBu.mPromotionSubCategoryFront;
                if (!PatchProxy.isSupport(oo) || !PatchProxy.applyVoidThreeRefs(Integer.valueOf(mReselectPro), mPromotionId, Integer.valueOf(mPromotionSu), tc, o.class, "28")) {
                   PageInfoReqParam pageInfoReqP = tc.s.c();
                   pageInfoReqP.mReselectedEventType = 5;
                   pageInfoReqP.buildPromotionInfo(mReselectPro, mPromotionId, mPromotionSu, true);
                   tc.s.d(pageInfoReqP, true);
                }
             }
          }
       }
       return;
    }
}
