package com.kuaishou.merchant.live.cart.onsale.anchor.s;
import erd.g;
import com.kuaishou.merchant.live.cart.onsale.anchor.LiveAnchorOnSaleFragment;
import java.lang.Object;
import com.kuaishou.merchant.live.cart.onsale.anchor.model.LiveMerchantAnchorOnSaleCommodityResponse;
import java.util.Objects;
import w24.a;
import java.lang.StringBuilder;
import java.lang.String;
import q87.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import tkd.b;
import tkd.d;
import fs3.g;
import is3.b;
import com.kuaishou.merchant.live.cart.onsale.anchor.LiveAnchorOnSaleFragment$c;
import js3.a;
import is3.a;
import com.kuaishou.merchant.live.cart.onsale.model.ExtraMap;
import java.util.List;
import com.kuaishou.merchant.live.cart.salemanager.model.LiveAnchorConfig;
import com.kuaishou.merchant.api.core.LiveMerchantBaseContext;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
import com.kuaishou.merchant.live.cart.basic.model.ItemCard;
import com.kuaishou.merchant.api.core.model.Commodity$ExtraInfo;
import com.kuaishou.merchant.api.core.model.Commodity;
import java.lang.Integer;
import java.util.Map;
import com.kuaishou.merchant.live.cart.salemanager.model.LiveAnchorToolsInfo;
import com.kuaishou.merchant.live.cart.salemanager.model.LiveAnchorToolsInfo$LiveAnchorTool;
import r54.a;
import ss3.a;
import ts3.b;
import e34.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.merchant.live.basic.model.punish.PunishInfo;
import mkc.b;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView$a;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView;
import f34.d;
import android.view.View$OnClickListener;
import android.view.View;
import mkc.c;
import android.view.ViewParent;
import android.view.ViewGroup;
import lnc.a1;

public final class s implements g	// class@001917
{
    public final LiveAnchorOnSaleFragment b;

    public void s(LiveAnchorOnSaleFragment p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       b[] uobArray;
       LiveAnchorToolsInfo$LiveAnchorTool liveAnchorTo;
       s tb = this.b;
       Objects.requireNonNull(tb);
       Object[] objArray = new Object[0];
       a.C().A("LiveAnchorOnSaleFragment", "loadCommodityList success"+p0.toString(), objArray);
       if (PatchProxy.applyVoidOneRefs(p0, tb, LiveAnchorOnSaleFragment.class, "18")) {
       }else {
          int i = -1695065466;
          b uob = d.a(i).x30();
          uob.e(tb.q.a(), tb.q.q, p0.getSandeagoInfo());
          uob.A(p0.getExtraInfo().mCategoryList);
          LiveMerchantAnchorOnSaleCommodityResponse mAnchorConfi = p0.mAnchorConfig;
          if (mAnchorConfi != null) {
             uob.v(mAnchorConfi.mMaxSandeagoNum);
          }
          String liveStreamId = tb.q.b.getLiveStreamId();
          if (!PatchProxy.applyVoidTwoRefs(p0, liveStreamId, tb, LiveAnchorOnSaleFragment.class, "10")) {
             b uob1 = d.a(i).x30();
             if (!TextUtils.x(liveStreamId) && p0.mItemCardList != null) {
                HashMap hashMap = new HashMap();
                Iterator iterator2 = p0.mItemCardList.iterator();
                while (iterator2.hasNext()) {
                   ItemCard itemCard = iterator2.next();
                   if (itemCard.mType == 1) {
                      itemCard = itemCard.mCommodity;
                      if (itemCard != null && itemCard.getExtraInfo().mSaleType == 2) {
                         hashMap.put(itemCard.mId, Integer.valueOf(itemCard.mTotalStock));
                      }
                   }
                }
                uob1.l(liveStreamId, hashMap);
             }
          }
       }
    label_00c6 :
       if (!PatchProxy.applyVoidOneRefs(p0, tb, LiveAnchorOnSaleFragment.class, "20")) {
          LiveAnchorOnSaleFragment$c t = tb.q.t;
          LiveMerchantAnchorOnSaleCommodityResponse mOnSellToolA1 = p0.mOnSellToolAreaInfo;
          if (mOnSellToolA1 != null) {
             Iterator iterator1 = mOnSellToolA1.mLiveAnchorToolList.iterator();
             while (iterator1.hasNext()) {
                liveAnchorTo = iterator1.next();
                t.put(Integer.valueOf(liveAnchorTo.mType), liveAnchorTo);
             }
          }
       }
       LiveMerchantAnchorOnSaleCommodityResponse mOnSellToolA = p0.mOnSellToolAreaInfo;
       if (mOnSellToolA != null) {
          LiveAnchorToolsInfo mLiveAnchorT = mOnSellToolA.mLiveAnchorToolList;
          if (!PatchProxy.applyVoidOneRefs(mLiveAnchorT, tb, LiveAnchorOnSaleFragment.class, "19") && mLiveAnchorT != null) {
             LiveAnchorOnSaleFragment$c r = tb.q.r;
             Iterator iterator = mLiveAnchorT.iterator();
             while (true) {
                if (iterator.hasNext()) {
                   liveAnchorTo = iterator.next();
                   if (liveAnchorTo.mType == 12) {
                      r.a = true;
                      r.c = liveAnchorTo.mForbidReason;
                      r.b = liveAnchorTo.mIsForbidden ^ 1;
                      if (!TextUtils.x(tb.q.a())) {
                         r.d = d.a(0x50a4ea96).no().d(tb.q.a());
                      }
                   }
                }else {
                   r.a = false;
                }
             }
          }
       }
       LiveAnchorOnSaleFragment q = tb.q;
       q.c = p0;
       q.k = tb.t.a(p0.mOnSellToolAreaInfo, p0.mItemCardList);
       q = tb.q;
       q.d = null;
       LiveAnchorOnSaleFragment o = tb.o;
       if (o != null) {
          Object[] objArray1 = new Object[]{q};
          o.i(objArray1);
       }
       if (!PatchProxy.applyVoidOneRefs(p0, tb, LiveAnchorOnSaleFragment.class, "21")) {
          if (p0.getExtraInfo().mPunishInfo != null && p0.getExtraInfo().mPunishInfo.isPunished()) {
             KwaiEmptyStateView$a uoa = KwaiEmptyStateView.e();
             uoa.d();
             uoa.n(p0.getExtraInfo().mPunishInfo.mDescription);
             uoa.e(R.string.arg_RES_7f105075);
             uoa.p(new d(tb, p0));
             uoa.k(R.drawable.arg_RES_7f080eb5);
             p0 = c.e(tb.m, b.i, uoa).getParent();
             if (p0 != null) {
                p0.setFocusable(1);
                p0.setClickable(1);
                p0.setBackgroundColor(a1.a(R.color.arg_RES_7f06008c));
             }
          }else {
             uobArray = new b[]{b.i};
             c.d(tb.m, uobArray);
          }
       }
       uobArray = new b[]{b.d};
       c.d(tb.m, uobArray);
       b[] uobArray1 = new b[]{b.g};
       c.d(tb.m, uobArray1);
       return;
    }
}
