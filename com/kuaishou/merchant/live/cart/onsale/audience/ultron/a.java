package com.kuaishou.merchant.live.cart.onsale.audience.ultron.a;
import androidx.fragment.app.Fragment;
import ks3.k0;
import ks3.l;
import ds3.a;
import ds3.l;
import java.lang.Object;
import com.kuaishou.merchant.live.cart.onsale.audience.ultron.a$a;
import c54.o;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.livestream.message.nano.SCActionSignal;
import brd.t;
import g44.g;
import erd.r;
import g44.h;
import erd.o;
import t45.d;
import brd.z;
import com.kuaishou.merchant.live.cart.onsale.audience.ultron.UltronDataSourceController$registerSignalMessage$3;
import g44.k;
import msd.l;
import com.kuaishou.merchant.live.cart.onsale.audience.ultron.UltronDataSourceController$registerSignalMessage$4;
import g44.j;
import g44.i;
import erd.g;
import crd.b;
import com.kuaishou.merchant.live.cart.search.LiveYellowCartSearchFragment;
import w44.b;
import com.kuaishou.merchant.live.cart.onsale.audience.ultron.log.LiveCartNode;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCLiveCarUpdateCallBack;
import c54.f;
import com.yxcorp.gifshow.util.rx.RxBus;
import p14.c;
import com.kuaishou.merchant.live.cart.onsale.audience.ultron.UltronDataSourceController$registerPopCommodityEvent$1;
import ks3.l$a;
import bs3.a;
import java.lang.Boolean;
import d54.b;
import com.kuaishou.merchant.api.core.model.Commodity;
import com.kuaishou.bowl.core.component.a;
import com.kuaishou.merchant.api.core.model.Commodity$ExtraInfo;
import lnc.a1;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import com.kuaishou.merchant.api.core.model.Commodity$a;
import com.kuaishou.merchant.message.nano.LiveRoomSignalMessage$LiveItemVolumeChangeSignal;
import com.kuaishou.merchant.message.nano.LiveRoomSignalMessage$ItemInfo;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.yxcorp.gifshow.model.CDNUrl;
import lnc.e0;
import java.lang.StringBuilder;
import nsd.s0;
import java.util.Objects;
import java.util.Map;
import a44.b;
import a44.c;
import com.kuaishou.pagedy.b;
import k34.o;
import com.kwai.robust.PatchProxyResult;
import java.util.Collection;
import ekd.q;
import com.kuaishou.merchant.api.core.model.live.shop.LiveShopFrameModel;
import java.util.ArrayList;
import ekd.k1;
import com.kuaishou.merchant.live.cart.onsale.audience.ultron.a$b;
import java.lang.Runnable;
import lnc.b9;
import crd.a;

public final class a	// class@001982
{
    public final String a;
    public Fragment b;
    public k0 c;
    public o d;
    public b e;
    public b f;
    public final l$a g;
    public l h;
    public a i;
    public l j;

    public void a(Fragment p0,k0 p1,l p2,a p3,l p4){
       super();
       this.h = p2;
       this.i = p3;
       this.j = p4;
       String str = "UltronDataSourceController";
       this.a = str;
       this.b = p0;
       this.c = p1;
       a$a uoa = new a$a(this);
       this.g = uoa;
       this.d = new o();
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a.class, "3")) {
       }else {
          p3 = this.c;
          if (p3 != null) {
             a.m(p3);
             t ot = p3.b(510, SCActionSignal.class).filter(g.b).flatMap(h.b).observeOn(d.c);
             UltronDataSourceController$registerSignalMessage$3 iNSTANCE = UltronDataSourceController$registerSignalMessage$3.INSTANCE;
             if (iNSTANCE != null) {
                iNSTANCE = new k(iNSTANCE);
             }
             this.e = ot.map(iNSTANCE).observeOn(d.a).subscribe(new j(new UltronDataSourceController$registerSignalMessage$4(this)), new i(this));
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, a.class, "4")) {
          p3 = this.b;
          if (p3 instanceof LiveYellowCartSearchFragment) {
             b.a.e(p3, LiveCartNode.SIGNAL_COMMODITY_CHANGE, str, "search fragment no need init real time update");
          }else {
             a td = this.d;
             if (td != null) {
                a tc = this.c;
                a ti = this.i;
                a tj = this.j;
                if (!PatchProxy.applyVoidFourRefs(p3, tc, ti, tj, td, o.class, "1")) {
                   td.c = p3;
                   td.d = ti;
                   td.e = tj;
                   if (tc == null) {
                      b.a.e(p3, LiveCartNode.SIGNAL_UPDATE, "RealTimeUpdateManager", "no signal service");
                   }else {
                      td.a = tc.b(1080, LiveStreamMessages$SCLiveCarUpdateCallBack.class).observeOn(d.a).subscribe(new f(td));
                   }
                }
             }
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, a.class, "5")) {
          this.f = RxBus.f.k(c.class, true).observeOn(d.a).subscribe(new j(new UltronDataSourceController$registerPopCommodityEvent$1(this)));
       }
       if (!PatchProxy.applyVoid(objArray, this, a.class, "6")) {
          a th = this.h;
          if (th != null) {
             th.a(uoa);
          }
       }
       return;
    }
    public final void a(a p0,boolean p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uoa, "9")) {
          return;
       }
       uoa = b.a.c(this.b, p0.b.mId);
       p0 = (p1)? p0.o: p0.l;
       Commodity modelObj = (uoa != null)? uoa.getModelObj(): null;
       if (modelObj instanceof Commodity) {
          modelObj.mDisplayPrice = p0;
          Commodity$ExtraInfo extraInfo = modelObj.getExtraInfo();
          int i = (p1)? 0x7f10026f: 0x7f10026c;
          extraInfo.mPriceSuffix = a1.p(i);
       }
       this.e("onAuctionInfoChange", uoa);
       return;
    }
    public final void b(c p0){
       c c;
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "10")) {
          return;
       }
       b.a.f(this.b, LiveCartNode.POP_COMMODITY, this.a, "收到热卖气泡数据", "content", p0);
       if (p0 == null) {
          return;
       }
       List list = b.a.d(this.b, p0.b);
       if (list != null) {
          Iterator iterator = list.iterator();
          while (iterator.hasNext()) {
             a uoa = iterator.next();
             Object modelObj = uoa.getModelObj();
             if (modelObj instanceof Commodity) {
                if (a.g(modelObj.mId, p0.b)) {
                   Commodity mPopCommodit = modelObj.mPopCommodityEvent;
                   mPopCommodit.a = true;
                   mPopCommodit.b = p0.a;
                   c = p0.c;
                   if (c != null) {
                      mPopCommodit.c = c.lastVolume;
                      mPopCommodit.d = c.volume;
                      mPopCommodit.e = c.displayIntervalMillis;
                      LiveRoomSignalMessage$LiveItemVolumeChangeSignal itemInfo = c.itemInfo;
                      if (itemInfo != null) {
                         mPopCommodit.f = e0.i(itemInfo.smallHotSaleAnimateUrl);
                      }
                   }
                   modelObj.mPopCommodityEvent.g = p0.d;
                   b.a.e(this.b, LiveCartNode.POP_COMMODITY, "pop commodity", "onPopCommodityEvent "+p0.a);
                }
             }else if(s0.H(modelObj)){
                Objects.requireNonNull(modelObj, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.Any>");
                s0.k(modelObj).put("popCommodityInfo", c.a(p0));
             }
             b.p(uoa);
             uoa.invoke("onPopCommodityInfoChange", c.a(p0));
          }
       }
       if (p0.a == null) {
          RxBus.f.d(c.class);
       }
       return;
    }
    public final Commodity c(Commodity p0,o p1){
       o obj = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "15");
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
       Commodity mCurrentFram = p0.mCurrentFrame;
       if (mCurrentFram != null && mCurrentFram.mToast != null) {
          k1.n(this);
          k1.s(new a$b(this, p0), this, 500);
       }
       return p0;
    }
    public final void d(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.b = null;
       a td = this.d;
       if (td != null && !PatchProxy.applyVoid(null, td, o.class, "2")) {
          b9.a(td.f);
          td.f = new a();
          b9.a(td.a);
          b9.a(td.b);
          td.c = null;
          td.d = null;
          td.e = null;
          k1.n(td);
       }
       this.d = null;
       b9.a(this.e);
       b9.a(this.f);
       td = this.h;
       if (td != null) {
          td.b(this.g);
       }
       k1.n(this);
       this.i = null;
       this.j = null;
       return;
    }
    public final void e(String p0,a p1){
       b a;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "11")) {
          return;
       }
       a = b.a;
       a tb = this.b;
       LiveCartNode sIGNAL_COMMO = LiveCartNode.SIGNAL_COMMODITY_CHANGE;
       a ta = this.a;
       String instanceId = (p1 != null)? p1.getInstanceId(): null;
       a.g(tb, sIGNAL_COMMO, ta, "更新组件", "key", p0, "component", instanceId);
       b.p(p1);
       if (p1 != null) {
          p1.invoke(p0, p1.getModelObj());
       }
       return;
    }
}
