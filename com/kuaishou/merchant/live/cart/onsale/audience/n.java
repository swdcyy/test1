package com.kuaishou.merchant.live.cart.onsale.audience.n;
import com.kuaishou.merchant.live.cart.onsale.audience.model.CommodityListGuestResponse;
import qvb.i;
import com.kuaishou.merchant.live.cart.onsale.audience.c;
import ks3.k0;
import ks3.l;
import java.lang.Object;
import com.kuaishou.merchant.live.cart.onsale.audience.n$a;
import java.util.List;
import java.util.Collection;
import ekd.q;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.livestream.message.nano.SCActionSignal;
import brd.t;
import com.kuaishou.merchant.live.cart.onsale.audience.m;
import erd.r;
import com.kuaishou.merchant.live.cart.onsale.audience.l;
import erd.o;
import t45.d;
import brd.z;
import com.kuaishou.merchant.live.cart.onsale.audience.k;
import k34.e0;
import com.kuaishou.merchant.live.cart.onsale.audience.j;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.util.rx.RxBus;
import p14.c;
import k34.d0;
import ks3.l$a;
import bs3.a;
import java.lang.Boolean;
import java.util.Iterator;
import com.kuaishou.merchant.api.core.model.Commodity;
import h54.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.merchant.api.core.model.Commodity$ExtraInfo;
import lnc.a1;
import k34.o;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.merchant.api.core.model.live.shop.LiveShopFrameModel;
import java.util.ArrayList;
import com.kuaishou.merchant.live.cart.onsale.audience.n$b;
import java.lang.Runnable;
import ekd.k1;

public class n	// class@001967
{
    public CommodityListGuestResponse a;
    public i b;
    public c c;
    public k0 d;
    public l e;
    public b f;
    public b g;
    public final l$a h;

    public void n(CommodityListGuestResponse p0,i p1,c p2,k0 p3,l p4){
       super();
       n$a uoa = new n$a(this);
       this.h = uoa;
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       if (!q.f(p1.getItems())) {
          Object[] objArray = null;
          if (!PatchProxy.applyVoid(objArray, this, n.class, "1")) {
             n td = this.d;
             if (td != null) {
                z a = d.a;
                this.f = td.b(510, SCActionSignal.class).filter(m.b).flatMap(l.b).observeOn(d.c).map(k.b).observeOn(a).subscribe(new e0(this), j.b);
                if (!this.a.isForbidComponent(3)) {
                   this.g = RxBus.f.k(c.class, true).observeOn(a).subscribe(new d0(this));
                }
             }
          }
          if (!PatchProxy.applyVoid(objArray, this, n.class, "8")) {
             n te = this.e;
             if (te != null) {
                te.a(uoa);
             }
          }
       }
    label_0093 :
       return;
    }
    public void a(a p0,boolean p1){
       n on = n.class;
       if (PatchProxy.isSupport(on) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, on, "9")) {
          return;
       }
       List items = this.b.getItems();
       if (q.f(items)) {
          return;
       }
       Iterator iterator = items.iterator();
       while (iterator.hasNext()) {
          Object obj = iterator.next();
          Commodity uCommodity = a.a(obj);
          if (uCommodity != null && (uCommodity.mId).equals(p0.b.mId)) {
             p0 = (p1)? p0.o: p0.l;
             if (!TextUtils.x(p0)) {
                uCommodity.mDisplayPrice = p0;
                Commodity$ExtraInfo extraInfo = uCommodity.getExtraInfo();
                int i = (p1)? 0x7f10026f: 0x7f10026c;
                extraInfo.mPriceSuffix = a1.p(i);
             }
             this.c(obj);
             break ;
          }
       }
       return;
    }
    public final Commodity b(Commodity p0,o p1){
       o obj = PatchProxy.applyTwoRefs(p0, p1, this, n.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Commodity uCommodity = null;
       if (p0.mLiveShopFrames == null) {
          return uCommodity;
       }
       obj = p1.b;
       if (q.f(obj)) {
          return uCommodity;
       }
       if (obj.get(0).isCompleteFrame()) {
          p0.mLiveShopFrames = obj;
          p0.mCurrentFrameIndex = 0;
          p0.mCurrentFrame = obj.get(0);
       }else if(p1.c != null){
          ArrayList uArrayList = new ArrayList();
          p0.mCurrentFrame.incrementMerge(obj.get(0));
          uArrayList.add(p0.mCurrentFrame);
          uArrayList.addAll(obj.subList(1, obj.size()));
          p0.mLiveShopFrames = uArrayList;
          p0.mCurrentFrameIndex = 0;
       }else {
          p0.mCurrentFrame.incrementMerge(obj.get(0));
       }
       return p0;
    }
    public final void c(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "11")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       k1.p(new n$b(this, p0), this);
       return;
    }
}
