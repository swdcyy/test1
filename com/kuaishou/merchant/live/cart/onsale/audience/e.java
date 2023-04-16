package com.kuaishou.merchant.live.cart.onsale.audience.e;
import ok.h;
import com.kuaishou.merchant.live.cart.onsale.audience.LiveAudienceShopWrapperFragment;
import java.lang.Object;
import java.lang.Void;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import brd.t;
import ds3.l;
import wkd.b;
import d44.b;
import ds3.a;
import com.kuaishou.merchant.api.core.LiveMerchantBaseContext;
import com.kuaishou.merchant.live.cart.onsale.audience.model.CommodityListGuestResponse;
import w24.a;
import q87.c;
import java.util.Map;
import android.util.Pair;
import com.kuaishou.merchant.live.cart.onsale.audience.preload.LiveShopPreloadHelper$Config;
import com.kuaishou.merchant.live.cart.onsale.audience.preload.LiveShopPreloadHelper;
import ta4.b;
import com.kuaishou.merchant.basic.fragment.MerchantBottomSheetFragment;
import com.kuaishou.merchant.basic.fragment.f;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.merchant.live.cart.MerchantCartLogBiz;
import p74.a;
import o74.a;
import t45.d;
import brd.z;
import d34.a;
import android.content.Context;
import lnc.a1;
import ot3.l0;
import brd.x;
import d34.f;
import lkd.b;
import erd.o;
import cjd.e;
import com.kuaishou.merchant.live.cart.onsale.audience.f;
import brd.w;
import erd.c;
import k34.z;
import k34.y;
import com.kuaishou.merchant.live.cart.onsale.audience.h;
import erd.g;
import crd.b;

public final class e implements h	// class@00193c
{
    public final LiveAudienceShopWrapperFragment b;

    public void e(LiveAudienceShopWrapperFragment p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       Object obj;
       LiveAudienceShopWrapperFragment l;
       e b = this.b;
       Objects.requireNonNull(b);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       t ot = PatchProxy.apply(objArray, b, LiveAudienceShopWrapperFragment.class, "20");
       if (ot != patchProxyRe) {
       }else {
          int i = 0;
          if (b.M.b != null) {
             int i1 = 0x7213474a;
             if (b.a(i1).a(b.L.b.getLiveStreamId())) {
                b uob = b.a(i1);
                String liveStreamId = b.L.b.getLiveStreamId();
                Objects.requireNonNull(uob);
                obj = PatchProxy.applyOneRefs(liveStreamId, uob, b.class, "3");
                if (obj != patchProxyRe) {
                   objArray = obj;
                }else {
                   Object[] objArray1 = new Object[i];
                   a.C().w("LiveAudienceGoodsListCacheManager", "getCachedResponse", objArray1);
                   Pair pair = uob.a.get(liveStreamId);
                   uob.a.clear();
                   if (pair != null) {
                      objArray = pair.second;
                   }
                }
                ot = t.just(objArray);
             }
          }
          LiveShopPreloadHelper$Config uConfig = LiveShopPreloadHelper.f();
          Pair pair1 = LiveShopPreloadHelper.c(b.L, b.M);
          Pair second = pair1.second;
          b.U = second;
          b.A.h(second);
          second = pair1.first;
          obj = PatchProxy.applyTwoRefs(second, uConfig, b, LiveAudienceShopWrapperFragment.class, "21");
          boolean b1 = true;
          if (obj != patchProxyRe) {
             i = obj.booleanValue();
          }else if(second == null || !TextUtils.x(b.M.k)){
             l = b.M;
             if (l.c != null || (uConfig.mDisableCacheFromNotCart == null && TextUtils.x(l.g))) {
                i = true;
             }
          }
          if (i) {
             b.T = b1;
             pair1.first.isCacheResponse = b1;
             a.s(MerchantCartLogBiz.LIVE_SHOP_PRELOAD, "LiveAudienceShopWrapperFragment", "get shop cached response successful");
             ot = t.just(pair1.first).observeOn(d.a);
          }else {
             l = b.L;
             l = b.M;
             ot = a.a().b(uConfig.mPreloadEachEnable, uConfig.mCurrentCacheTime, b.L.b.getLiveStreamId(), b.L.b.getServerExpTag(), l.i, l.b.getFansGroupLevel(), b.L.b.getLivePayload(), "", "", l.k, l.f, l.e, 0, "", l.g, l0.h(a1.c()), b.L.b.getLiveAuthorId()).compose(b.Ih()).retryWhen(new f(b.X, b.L, b.M)).map(new e());
          }
       }
       return ot.zipWith(b.R.hide(), f.a).onErrorReturn(new z(b)).subscribe(new y(b), h.b);
    }
}
