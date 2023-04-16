package com.kuaishou.merchant.live.cart.onsale.audience.component.dynamic.LiveShopDynamicComponentPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.merchant.live.cart.onsale.audience.component.dynamic.LiveShopDynamicComponentPresenter$a;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import com.kuaishou.merchant.live.cart.onsale.audience.component.dynamic.DynamicEmptyView;
import com.kuaishou.merchant.live.cart.MerchantCartLogBiz;
import java.lang.StringBuilder;
import com.kuaishou.merchant.live.cart.onsale.audience.model.ComponentInfo;
import p74.a;
import o74.a;
import kotlin.jvm.internal.a;
import o34.i;
import o34.f$a;
import o34.f;
import com.kuaishou.merchant.live.cart.onsale.audience.component.dynamic.LiveShopDynamicComponentPresenter$b;
import hu4.f;
import hu4.h;
import java.util.HashMap;
import com.kuaishou.merchant.live.cart.onsale.audience.model.ComponentData;
import yz7.e;
import java.util.Map;
import java.lang.Integer;
import com.kuaishou.merchant.live.cart.onsale.audience.a;
import ds3.l;
import ks3.f0;
import com.kuaishou.merchant.api.core.LiveMerchantBaseContext;
import v34.a;
import kotlin.Pair;
import trd.t0;
import com.kuaishou.merchant.live.cart.onsale.audience.component.dynamic.LiveShopDynamicComponentPresenter$c;
import a44.d;
import com.yxcorp.gifshow.util.rx.RxBus;
import p14.c;
import brd.t;
import t45.d;
import brd.z;
import com.kuaishou.merchant.live.cart.onsale.audience.component.dynamic.LiveShopDynamicComponentPresenter$d;
import erd.g;
import crd.b;
import z34.a;
import com.kuaishou.merchant.live.cart.onsale.audience.component.dynamic.LiveShopDynamicComponentPresenter$onBind$5;
import v34.c;
import msd.l;
import com.kuaishou.merchant.live.cart.onsale.audience.component.dynamic.LiveShopDynamicComponentPresenter$e;
import lnc.b9;
import java.lang.Number;
import zsd.u;

public final class LiveShopDynamicComponentPresenter extends PresenterV2	// class@00193a
{
    public b A;
    public a p;
    public LiveMerchantBaseContext q;
    public f0 r;
    public f s;
    public int t;
    public ComponentInfo u;
    public ComponentData v;
    public h w;
    public boolean x;
    public Runnable y;
    public b z;
    public static final LiveShopDynamicComponentPresenter$a B;

    static {
       LiveShopDynamicComponentPresenter.B = new LiveShopDynamicComponentPresenter$a(null);
    }
    public void LiveShopDynamicComponentPresenter(){
       super();
    }
    public void E8(){
       String str2;
       LiveShopDynamicComponentPresenter tu1;
       LiveShopDynamicComponentPresenter ts;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveShopDynamicComponentPresenter.class, "2")) {
          return;
       }
       String str = "component";
       String str1 = "LiveShopDynamicComponentPresenter";
       if (this.m8() instanceof DynamicEmptyView) {
          MerchantCartLogBiz lIVE_AUDIENC = MerchantCartLogBiz.LIVE_AUDIENCE_ON_SALE;
          str2 = "render failed, component=";
          LiveShopDynamicComponentPresenter tu = this.u;
          if (tu != null) {
             objArray = tu.getName();
          }
          a.h(lIVE_AUDIENC, str1, str2+objArray, str, this.u);
          tu1 = this.u;
          if (tu1 != null) {
             ts = this.s;
             if (ts == null) {
                a.S("commandService");
             }
             ts.a(i.b(tu1));
          }
          return;
       }else {
          tu1 = this.w;
          if (tu1 != null) {
             tu1.k(new LiveShopDynamicComponentPresenter$b(this));
          }
          HashMap hashMap = new HashMap();
          ts = this.v;
          if (ts != null) {
             ComponentData data = ts.data;
             if (data != null) {
                hashMap.put("payload", e.f(data));
             }
          }
          ts = this.u;
          if (ts != null) {
             hashMap.put("__Id", ts.getId());
          }
          hashMap.put("__index", Integer.valueOf(this.t));
          ts = this.p;
          str2 = "shopParam";
          if (ts == null) {
             a.S(str2);
          }
          hashMap.put("__entryResource", ts.c.h);
          ts = this.r;
          String str3 = "liveRouterManager";
          if (ts == null) {
             a.S(str3);
          }
          hashMap.put("liveId", ts.J4());
          ts = this.r;
          if (ts == null) {
             a.S(str3);
          }
          hashMap.put("pageId", ts.I4());
          ts = this.q;
          if (ts == null) {
             a.S("liveBaseContext");
          }
          hashMap.putAll(a.a(ts));
          t0.o0(hashMap, a.a.b());
          ts = this.w;
          if (ts != null) {
             LiveShopDynamicComponentPresenter$c uoc = new LiveShopDynamicComponentPresenter$c(this);
             View view = this.m8();
             if (!PatchProxy.applyVoidTwoRefs(uoc, view, ts, h.class, "3")) {
                h o = ts.o;
                if (o != null || view != null) {
                   if (view != null) {
                      ts.j.put(Integer.toHexString(view.hashCode()), uoc);
                   }else {
                      ts.j.put(Integer.toHexString(o.hashCode()), uoc);
                   }
                }
             }
          }
          ts = this.u;
          if (ts != null && ts.getResourceType() == 1) {
             ts = this.p;
             if (ts == null) {
                a.S(str2);
             }
             if (!ts.b().a(3)) {
                this.z = RxBus.f.k(c.class, true).observeOn(d.a).subscribe(new LiveShopDynamicComponentPresenter$d(this));
             }
          }
       label_0146 :
          this.A = RxBus.f.f(a.class).observeOn(d.a).subscribe(new c(new LiveShopDynamicComponentPresenter$onBind$5(this)));
          a.t(MerchantCartLogBiz.LIVE_AUDIENCE_ON_SALE, str1, "onBind: updateData", str, this.u);
          ts = this.w;
          if (ts != null) {
             Map[] mapArray = new Map[true];
             mapArray[0] = hashMap;
             ts.n(this.m8(), mapArray);
          }
          if (this.x == null) {
             this.y = new LiveShopDynamicComponentPresenter$e(this, hashMap);
          }
          return;
       }
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, LiveShopDynamicComponentPresenter.class, "6")) {
          return;
       }
       LiveShopDynamicComponentPresenter tw = this.w;
       if (tw != null) {
          tw.i();
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, LiveShopDynamicComponentPresenter.class, "5")) {
          return;
       }
       b9.a(this.z);
       b9.a(this.A);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, LiveShopDynamicComponentPresenter.class, "1")) {
          return;
       }
       this.p = this.q8(a.class);
       this.q = this.r8("LIVE_BASE_CONTEXT");
       this.r = this.r8("LIVE_MERCHANT_LIVE_INTERNAL_ROUTER_SERVICE");
       this.s = this.r8("LIVE_CART_COMMAND_SERVICE");
       this.t = this.r8("ADAPTER_POSITION").intValue();
       this.u = this.r8("LIVE_CART_COMPONENT_INFO");
       this.v = this.s8(ComponentData.class);
       this.w = this.t8("LIVE_CART_RENDER_ENGINE");
       return;
    }
    public final void onTwinkleAnimEvent(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveShopDynamicComponentPresenter.class, "4")) {
          return;
       }
       LiveShopDynamicComponentPresenter tu = this.u;
       if (tu != null && u.q2(tu.getId(), p0.a, false, 2, null)) {
          LiveShopDynamicComponentPresenter tw = this.w;
          if (tw != null) {
             tw.h(this.m8(), "onStartTwinkle", "");
          }
       }
       return;
    }
}
