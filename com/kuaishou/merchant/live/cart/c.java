package com.kuaishou.merchant.live.cart.c;
import fs3.c;
import java.lang.Object;
import androidx.fragment.app.KwaiDialogFragment;
import android.net.Uri;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.live.cart.onsale.audience.LiveAudienceShopWrapperFragment;
import java.util.Objects;
import ekd.x0;
import java.lang.Boolean;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import qvb.i;
import com.kuaishou.merchant.live.cart.onsale.audience.d;
import qvb.n0;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.merchant.live.cart.onsale.audience.BaseLiveAudienceShopFragment;
import com.kuaishou.merchant.api.core.LiveMerchantBaseContext;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.merchant.live.cart.askinterpret.LiveMerchantAnchorAskInterpretFragment;
import android.os.Bundle;
import android.os.Parcelable;
import org.parceler.b;
import androidx.fragment.app.Fragment;
import ds3.a;
import ds3.l;
import com.kuaishou.merchant.live.cart.onsale.audience.preload.LiveShopPreloadHelper;
import com.kuaishou.merchant.live.cart.MerchantCartLogBiz;
import p74.a;
import o74.a;
import java.util.Map;
import java.util.UUID;
import com.kuaishou.merchant.preload.net.MethodRequest;
import qa4.f;
import crd.b;
import crd.c;
import com.kuaishou.merchant.preload.PreloadConfig;
import com.kuaishou.merchant.preload.PreloadConfig$a;
import java.util.concurrent.TimeUnit;
import brd.t;
import t45.d;
import brd.z;
import d44.d;
import erd.g;
import d34.c;
import d34.b;
import e34.b;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import q2b.h$b;
import k2b.e0;
import k2b.u1;
import java.lang.Integer;
import java.lang.Long;
import io.reactivex.internal.functions.Functions;
import com.kuaishou.merchant.live.cart.b;
import java.util.HashMap;
import fg6.a;
import com.google.gson.Gson;
import ds3.m;
import com.kuaishou.merchant.live.cart.search.LiveYellowCartSearchFragment;
import com.kuaishou.merchant.live.cart.search.LiveYellowCartSearchFragment$a;
import com.kuaishou.merchant.live.cart.onsale.audience.a;
import wkd.b;
import b24.a;
import com.kuaishou.merchant.live.cart.onsale.audience.ultron.LiveYellowCartUltronFragment;
import com.kuaishou.merchant.live.cart.onsale.audience.ultron.LiveYellowCartUltronFragment$a;
import com.kuaishou.merchant.basic.fragment.MerchantBottomSheetFragment;
import com.kuaishou.merchant.basic.fragment.f;
import java.util.List;
import java.util.ArrayList;
import com.kuaishou.merchant.live.cart.a;
import com.kuaishou.merchant.preload.net.cache.PreloadCache;
import kotlin.jvm.internal.a;
import android.util.LruCache;
import java.util.Set;
import java.util.Iterator;
import sa4.a;
import d44.b;
import com.kuaishou.merchant.live.cart.orders.LiveShopOrdersFragment;
import android.content.Context;
import w24.a;
import q87.c;
import d34.a;
import ot3.l0;
import cjd.e;
import erd.o;
import d44.a;
import com.kuaishou.merchant.live.cart.onsale.audience.preload.a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.framework.model.feed.BaseFeed;
import fs3.c$c;
import com.kuaishou.merchant.live.cart.onsale.audience.i$d;
import com.kuaishou.merchant.live.cart.onsale.audience.i;
import com.kuaishou.merchant.api.core.model.MerchantInfo;
import fs3.c$a;
import com.kuaishou.merchant.live.cart.salemanager.LiveAnchorShopFragment;
import com.kwai.framework.init.a;
import com.kuaishou.merchant.live.cart.onsale.audience.ultron.rollback.UltronYellowCartInitModule;
import fs3.c$b;
import ks3.k0;
import ks3.e;
import ks3.x;
import ks3.l;
import com.kuaishou.merchant.live.cart.onsale.anchor.LiveAnchorOnSaleFragment;
import com.kuaishou.merchant.live.cart.onsale.anchor.LiveAnchorOnSaleFragment$c;

public class c implements c	// class@0018fe
{

    public void c(){
       super();
    }
    public void Ak(KwaiDialogFragment p0,Uri p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "5")) {
          return;
       }
       if (p0 instanceof LiveAudienceShopWrapperFragment) {
          Objects.requireNonNull(p0);
          if (!PatchProxy.applyVoidOneRefs(p1, p0, LiveAudienceShopWrapperFragment.class, "17") && p0.E != null) {
             if (Boolean.parseBoolean(x0.a(p1, "needUpdate")) && !PatchProxy.applyVoid(null, p0, LiveAudienceShopWrapperFragment.class, "18")) {
                RecyclerView recyclerView = p0.E.h0();
                if (recyclerView.getLayoutManager() != null) {
                   recyclerView.scrollToPosition(0);
                   p0.E.q().a();
                }
             }
             String str = x0.a(p1, "queryBuyerCouponId");
             if (!TextUtils.x(str)) {
                p0.E.Mh(str);
             }
          }
       }
       return;
    }
    public KwaiDialogFragment FX(LiveMerchantBaseContext p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LiveMerchantAnchorAskInterpretFragment obj = PatchProxy.applyOneRefs(p0, this, c.class, "13");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = PatchProxy.applyOneRefs(p0, null, LiveMerchantAnchorAskInterpretFragment.class, "1");
       if (obj != patchProxyRe) {
       }else {
          Bundle uBundle = new Bundle();
          uBundle.putParcelable("INTERPRET_LIVE_BASE_CONTEXT", b.c(p0));
          obj = new LiveMerchantAnchorAskInterpretFragment();
          obj.setArguments(uBundle);
       }
       return obj;
    }
    public String HQ(a p0,l p1){
       f a;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String obj = PatchProxy.applyTwoRefs(p0, p1, this, c.class, "7");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = PatchProxy.applyTwoRefs(p0, p1, null, LiveShopPreloadHelper.class, "5");
       if (obj != patchProxyRe) {
       }else {
          a.s(MerchantCartLogBiz.LIVE_SHOP_PRELOAD, "LiveShopPreloadHelper", "preloadWhenClick");
          obj = UUID.randomUUID().toString();
          a = f.a;
          a.d(LiveShopPreloadHelper.d(), new MethodRequest(LiveShopPreloadHelper.a(p0, p1), null).setTraceId(obj));
          a.c(LiveShopPreloadHelper.d(), obj);
       }
       return obj;
    }
    public b IV(a p0,l p1){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b obj = PatchProxy.applyTwoRefs(p0, p1, this, c.class, "6");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = PatchProxy.applyTwoRefs(p0, p1, null, LiveShopPreloadHelper.class, "2");
       if (obj != patchProxyRe) {
       }else {
          a.s(MerchantCartLogBiz.LIVE_SHOP_PRELOAD, "LiveShopPreloadHelper", "preloadWhenShow");
          b uob = c.b();
          if (PreloadConfig.Companion.a()) {
             f.a.b(LiveShopPreloadHelper.d());
             obj = t.timer(1000, TimeUnit.MILLISECONDS).observeOn(d.a).subscribe(new d(p0, p1));
          }else {
             obj = uob;
          }
          LiveShopPreloadHelper.g();
       }
       return obj;
    }
    public t TZ(String p0,String p1,String p2,String p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, c.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.a().X0(p0, p1, p2, p3);
    }
    public void UR(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "20")) {
          return;
       }
       if (!PatchProxy.applyVoidOneRefs(p0, null, b.class, "67")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "SMALL_CART_GOODS_LIST_SUBPAGE_REQUEST";
          i3 oi3 = i3.f();
          oi3.d("traceId", p0);
          uElementPack.params = oi3.e();
          ClientEvent$UrlPackage urlPackage = new ClientEvent$UrlPackage();
          urlPackage.page2 = "MERCHANT_LIVE_SMALL_CART_GOODS_LIST_SUBPAGE";
          h$b uob = h$b.e(7, "SMALL_CART_GOODS_LIST_SUBPAGE_REQUEST");
          uob.k(uElementPack);
          uob.u(urlPackage);
          u1.p0("", null, uob);
       }
       return;
    }
    public b V0(String p0,int p1,String p2,long p3,String p4){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),p2,Long.valueOf(p3),p4};
          Object obj = PatchProxy.apply(objArray, this, uoc, "17");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return b.a().V0(p0, p1, p2, p3, p4).subscribe(Functions.d(), b.b);
    }
    public t a7(String p0,String p1,HashMap p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, c.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.a().h1(p0, p1, a.a.q(p2));
    }
    public t b0(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, c.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.a().b0(p0, p1);
    }
    public KwaiDialogFragment cp(a p0,l p1,m p2){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LiveYellowCartSearchFragment obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, c.class, "4");
       if (obj != patchProxyRe) {
          return obj;
       }
       LiveYellowCartSearchFragment$a m = LiveYellowCartSearchFragment.M;
       Objects.requireNonNull(m);
       obj = PatchProxy.applyThreeRefs(p0, p1, p2, m, LiveYellowCartSearchFragment$a.class, "1");
       if (obj != patchProxyRe) {
       }else {
          obj = new LiveYellowCartSearchFragment();
          LiveYellowCartSearchFragment e = obj.E;
          e.b = p0;
          e.c = p1;
          e.d = p2;
          e.s = true;
       }
       return obj;
    }
    public KwaiDialogFragment hL(a p0,l p1){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LiveYellowCartUltronFragment$a obj = PatchProxy.applyTwoRefs(p0, p1, this, c.class, "3");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (b.a(-337650694).a()) {
          obj = LiveYellowCartUltronFragment.P;
          Objects.requireNonNull(obj);
          LiveYellowCartUltronFragment liveYellowCa = PatchProxy.applyTwoRefs(p0, p1, obj, LiveYellowCartUltronFragment$a.class, "1");
          if (liveYellowCa != patchProxyRe) {
          }else {
             liveYellowCa = new LiveYellowCartUltronFragment();
             LiveYellowCartUltronFragment f = liveYellowCa.F;
             f.b = p0;
             f.c = p1;
             f.s = true;
          }
          return liveYellowCa;
       }else {
          LiveAudienceShopWrapperFragment liveAudience = PatchProxy.applyTwoRefs(p0, p1, null, LiveAudienceShopWrapperFragment.class, "1");
          if (liveAudience != patchProxyRe) {
          }else {
             liveAudience = new LiveAudienceShopWrapperFragment();
             liveAudience.L = p0;
             liveAudience.M = p1;
             liveAudience.A.j(p1.d);
          }
          return liveAudience;
       }
    }
    public List hj(){
       ArrayList obj = PatchProxy.apply(null, this, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       obj.add(a.a);
       return obj;
    }
    public boolean isAvailable(){
       return true;
    }
    public void j2(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "8")) {
          return;
       }
       if (!PatchProxy.applyVoidOneRefs(p0, null, LiveShopPreloadHelper.class, "11")) {
          a.s(MerchantCartLogBiz.LIVE_SHOP_PRELOAD, "LiveShopPreloadHelper", "removeCache");
          if (p0 != null) {
             PreloadCache d = PreloadCache.d;
             String str = "/rest/app/eshop/ks/live/item/byGuest";
             Objects.requireNonNull(d);
             if (!PatchProxy.applyVoidThreeRefs(str, "liveStreamId", p0, d, PreloadCache.class, "9")) {
                a.p(str, "path");
                a.p("liveStreamId", "key");
                a.p(p0, "value");
                LruCache lruCache = d.a().get(str);
                if (lruCache != null) {
                   Iterator iterator = lruCache.snapshot().keySet().iterator();
                   while (iterator.hasNext()) {
                      a uoa = iterator.next();
                      Map map = uoa.a();
                      String str1 = (map != null)? map.get("liveStreamId"): null;
                      if (a.g(p0, str1)) {
                         lruCache.remove(uoa);
                      }
                   }
                }
             }
          }
       }
       return;
    }
    public boolean jQ(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return b.a(0x7213474a).a(p0);
    }
    public Fragment ko(String p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LiveShopOrdersFragment obj = PatchProxy.applyOneRefs(p0, this, c.class, "19");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = PatchProxy.applyOneRefs(p0, null, LiveShopOrdersFragment.class, "1");
       if (obj != patchProxyRe) {
       }else {
          Bundle uBundle = new Bundle();
          uBundle.putString("liveStreamID", p0);
          obj = new LiveShopOrdersFragment();
          obj.setArguments(uBundle);
       }
       return obj;
    }
    public b lj(Context p0,LiveMerchantBaseContext p1,int p2){
       b obj;
       b uob;
       t ot;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(c.class)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), this, c.class, "10");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       obj = b.a(0x7213474a);
       Objects.requireNonNull(obj);
       if (PatchProxy.isSupport(b.class)) {
          uob = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), obj, b.class, "4");
          if (uob != patchProxyRe) {
          label_0102 :
             return uob;
          }
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.C().w("LiveAudienceGoodsListCacheManager", "preloadGoodsList", objArray);
       a uoa = a.a();
       String liveStreamId = p1.getLiveStreamId();
       String serverExpTag = p1.getServerExpTag();
       int fansGroupLev = p1.getFansGroupLevel();
       String livePayload = p1.getLivePayload();
       int i1 = l0.h(p0);
       String liveAuthorId = p1.getLiveAuthorId();
       Objects.requireNonNull(uoa);
       a uoa1 = a.class;
       if (PatchProxy.isSupport(uoa1)) {
          objArray = new Object[14];
          objArray[i] = liveStreamId;
          objArray[1] = serverExpTag;
          objArray[2] = Integer.valueOf(p2);
          objArray[3] = Integer.valueOf(fansGroupLev);
          objArray[4] = livePayload;
          objArray[5] = "";
          objArray[6] = "";
          objArray[7] = "";
          objArray[8] = "";
          objArray[9] = Integer.valueOf(1);
          objArray[10] = Integer.valueOf(i);
          objArray[11] = "";
          objArray[12] = Integer.valueOf(i1);
          objArray[13] = liveAuthorId;
          ot = PatchProxy.apply(objArray, uoa, uoa1, "2");
          if (ot != patchProxyRe) {
          label_00ec :
             uob = ot.map(new e()).subscribe(new a(obj, p1), a.b);
             goto label_0102 ;
          }
       }
       ot = uoa.b(false, 0, liveStreamId, serverExpTag, p2, fansGroupLev, livePayload, "", "", "", "", 1, 0, "", "", i1, liveAuthorId);
       goto label_00ec ;
    }
    public void r40(ClientContent$LiveStreamPackage p0,GifshowActivity p1,BaseFeed p2,c$c p3){
       i$d uod;
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, c.class, "18")) {
          return;
       }
       if (p3 == null) {
          uod = new i$d();
       }
       new i(p0, p1, p2, uod).a();
       return;
    }
    public Fragment sf(LiveMerchantBaseContext p0,MerchantInfo p1,c$a p2,String p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, c.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveAnchorShopFragment.Nh(p0, p1, p2, p3);
    }
    public a xz(){
       Object obj = PatchProxy.apply(null, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new UltronYellowCartInitModule();
    }
    public Fragment yH(LiveMerchantBaseContext p0,c$b p1,k0 p2,e p3,x p4,l p5,c$a p6){
       Object[] obj;
       LiveAnchorOnSaleFragment liveAnchorOn;
       object oobject = p1;
       object oobject1 = p2;
       object oobject2 = p3;
       object oobject3 = p4;
       object oobject4 = p5;
       object oobject5 = p6;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c uoc = c.class;
       int i = 5;
       int i1 = 4;
       int i2 = 7;
       if (PatchProxy.isSupport(uoc)) {
          Object[] objArray = new Object[i2];
          objArray[0] = p0;
          objArray[1] = oobject;
          objArray[2] = oobject1;
          objArray[3] = oobject2;
          objArray[i1] = oobject3;
          objArray[i] = oobject4;
          objArray[6] = oobject5;
          obj = PatchProxy.apply(objArray, this, uoc, "12");
          if (obj != patchProxyRe) {
             return obj;
          }
       }else {
          i1 = this;
       }
       if (PatchProxy.isSupport(LiveAnchorOnSaleFragment.class)) {
          obj = new Object[i2];
          obj[0] = p0;
          obj[1] = oobject;
          obj[2] = oobject1;
          obj[3] = oobject2;
          obj[4] = oobject3;
          obj[5] = oobject4;
          obj[6] = oobject5;
          liveAnchorOn = PatchProxy.apply(obj, null, LiveAnchorOnSaleFragment.class, "1");
          if (liveAnchorOn != patchProxyRe) {
          label_008d :
             return liveAnchorOn;
          }
       }
       Bundle uBundle = new Bundle();
       uBundle.putParcelable("KEY_LIVE_BASE_CONTEXT", b.c(p0));
       liveAnchorOn = new LiveAnchorOnSaleFragment();
       liveAnchorOn.setArguments(uBundle);
       liveAnchorOn.p = oobject;
       liveAnchorOn.z = oobject1;
       liveAnchorOn.A = oobject2;
       LiveAnchorOnSaleFragment q = liveAnchorOn.q;
       q.i = oobject3;
       q.j = oobject4;
       liveAnchorOn.B = oobject5;
       goto label_008d ;
    }
}
