package com.kuaishou.live.common.core.component.gift.giftpanel.pagerlist.pager.LiveGiftPanelNormalPagerVM;
import yh3.a;
import com.kuaishou.live.common.core.component.gift.giftpanel.pagerlist.pager.LiveGiftPanelNormalPagerVM$a;
import nsd.u;
import androidx.lifecycle.LifecycleOwner;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.config.LiveGiftPanelConfig;
import androidx.lifecycle.LiveData;
import com.kuaishou.live.common.core.component.gift.giftpanel.model.SelectGiftModelWrapper;
import wl1.c;
import ah1.c;
import z1.k;
import msd.l;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.lifecycle.MutableLiveData;
import com.kuaishou.live.common.core.component.gift.giftpanel.pagerlist.pager.LiveGiftPanelNormalPagerVM$sortTypeObserver$1;
import com.kuaishou.live.common.core.component.gift.giftpanel.pagerlist.pager.LiveGiftPanelNormalPagerVM$d;
import com.kuaishou.live.common.core.component.gift.giftpanel.pagerlist.pager.LiveGiftPanelNormalPagerVM$refreshObserver$1;
import androidx.lifecycle.Observer;
import com.kuaishou.live.common.core.component.gift.base.model.Model$a;
import com.kuaishou.live.common.core.component.gift.base.model.Model;
import com.kuaishou.live.common.core.component.gift.giftpanel.pagerlist.pager.LiveGiftPanelNormalPagerVM$1;
import ul1.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.util.Collection;
import ekd.q;
import wl1.g;
import ul1.a;
import java.util.List;
import ch1.c;
import com.yxcorp.gifshow.models.Gift;
import java.util.Iterator;
import java.lang.Iterable;
import kotlin.Pair;
import java.lang.Integer;
import com.kuaishou.live.common.core.component.gift.giftpanel.pagerlist.pager.LiveGiftPanelNormalPagerVM$b;
import com.kuaishou.live.common.core.component.gift.giftpanel.pagerlist.pager.LiveGiftPanelNormalPagerVM$b$b;
import com.kuaishou.live.common.core.component.gift.giftpanel.pagerlist.pager.LiveGiftPanelNormalPagerVM$b$e;
import com.kuaishou.live.common.core.component.gift.giftpanel.pagerlist.pager.LiveGiftPanelNormalPagerVM$b$c;
import java.lang.Math;
import ul1.c;
import com.kuaishou.live.common.core.component.gift.giftpanel.pagerlist.pager.LiveGiftPanelNormalPagerVM$b$d;
import com.kuaishou.live.common.core.component.gift.giftpanel.pagerlist.pager.LiveGiftPanelNormalPagerVM$b$a;
import java.util.ArrayList;
import trd.u;
import java.lang.Number;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.util.Objects;
import java.util.Map;
import wl1.b;
import com.kuaishou.live.common.core.component.gift.giftpanel.pagerlist.pager.LiveGiftPanelNormalPagerVM$PagerStatus;
import com.kuaishou.live.common.core.component.gift.giftpanel.pagerlist.pager.LiveGiftPanelNormalPagerVM$e;
import wl1.e;
import wl1.d;
import yg1.a;
import yg1.e;
import eh1.d;
import ih1.c;
import ih1.f;
import yg1.f;
import ih1.s;
import eh1.c;
import ih1.o;

public final class LiveGiftPanelNormalPagerVM extends a	// class@0012fa
{
    public final LiveData a;
    public final LiveData b;
    public final LiveData c;
    public final LiveData d;
    public final LiveGiftPanelNormalPagerVM$sortTypeObserver$1 e;
    public boolean f;
    public c g;
    public final Observer h;
    public final LiveGiftPanelNormalPagerVM$refreshObserver$1 i;
    public final LifecycleOwner j;
    public final LiveGiftPanelConfig k;
    public final LiveData l;
    public final SelectGiftModelWrapper m;
    public final c n;
    public final c o;
    public final c p;
    public final c q;
    public final int r;
    public final k s;
    public final l t;
    public static final LiveGiftPanelNormalPagerVM$a u;

    static {
       LiveGiftPanelNormalPagerVM.u = new LiveGiftPanelNormalPagerVM$a(null);
    }
    public void LiveGiftPanelNormalPagerVM(LifecycleOwner p0,LiveGiftPanelConfig p1,LiveData p2,SelectGiftModelWrapper p3,c p4,c p5,c p6,c p7,int p8,k p9,l p10){
       a.p(p0, "lifecycleOwner");
       a.p(p1, "panelConfig");
       a.p(p2, "dataProvider");
       a.p(p3, "selectGiftModelWrapper");
       a.p(p4, "completeVisibleModelWrapper");
       a.p(p5, "showGiftModel");
       a.p(p6, "showPagerItemModel");
       a.p(p7, "refreshTriggerModel");
       a.p(p9, "currentUser");
       a.p(p10, "sortTypeModelSupplier");
       super();
       this.j = p0;
       this.k = p1;
       this.l = p2;
       this.m = p3;
       this.n = p4;
       this.o = p5;
       this.p = p6;
       this.q = p7;
       this.r = p8;
       this.s = p9;
       this.t = p10;
       MutableLiveData mutableLiveD = new MutableLiveData();
       this.o0(mutableLiveD);
       this.a = mutableLiveD;
       mutableLiveD = new MutableLiveData();
       this.o0(mutableLiveD);
       this.b = mutableLiveD;
       mutableLiveD = new MutableLiveData();
       this.o0(mutableLiveD);
       this.c = mutableLiveD;
       mutableLiveD = new MutableLiveData();
       this.o0(mutableLiveD);
       this.d = mutableLiveD;
       this.e = new LiveGiftPanelNormalPagerVM$sortTypeObserver$1(this);
       LiveGiftPanelNormalPagerVM$d uod = new LiveGiftPanelNormalPagerVM$d(this);
       this.h = uod;
       LiveGiftPanelNormalPagerVM$refreshObserver$1 orefreshObse = new LiveGiftPanelNormalPagerVM$refreshObserver$1(this);
       this.i = orefreshObse;
       p2.observe(p0, uod);
       p7.b(p0, orefreshObse);
       p3.b(p0, new LiveGiftPanelNormalPagerVM$1(this));
    }
    public static void z0(LiveGiftPanelNormalPagerVM p0,b p1,boolean p2,boolean p3,int p4,int p5,Object p6){
       if (p5 & 0x02) {
          p2 = true;
       }
       if (p5 & 0x04) {
          p3 = true;
       }
       if (p5 & 0x08) {
          p4 = 0;
       }
       p0.y0(p1, p2, p3, p4);
       return;
    }
    public final void A0(boolean p0){
       List value1;
       a uoa1;
       Iterator iterator;
       Gift obj;
       Pair pair;
       Integer first;
       int i2;
       int i3;
       LiveGiftPanelNormalPagerVM liveGiftPane = LiveGiftPanelNormalPagerVM.class;
       if (PatchProxy.isSupport(liveGiftPane) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, liveGiftPane, "7")) {
          return;
       }
       if (q.f(this.a.getValue())) {
          return;
       }
       b value = this.l.getValue();
       if (value != null) {
          String str = value.a();
          if (str != null) {
             g og = this.m.a(str);
             Integer integer = null;
             a uoa = (og != null)? og.a(): integer;
             int i = 0;
             if (p0) {
                value1 = this.a.getValue();
                if (value1 != null) {
                   uoa1 = value1.get(i);
                label_0058 :
                   liveGiftPane = null;
                label_0138 :
                   if (uoa1 == null) {
                      value1 = this.a.getValue();
                      if (value1 != null) {
                         integer = value1.get(i);
                      }
                      uoa1 = integer;
                   }else {
                      i = liveGiftPane;
                   }
                   this.r0(this.c).setValue(Integer.valueOf(i));
                   this.m.c("[LiveGiftPanelNormalPagerVM][updateSelectGift]", uoa1);
                }
             }else if(uoa != null){
                c uoc = uoa.b();
                if (uoc != null) {
                   Gift gift = uoc.b();
                label_0069 :
                   if (gift != null) {
                      value1 = this.a.getValue();
                      if (value1 != null) {
                         iterator = value1.iterator();
                         int i1 = 0;
                         while (true) {
                            if (iterator.hasNext()) {
                               obj = iterator.next();
                               Gift gift1 = obj.b().b();
                               Object obj1 = (gift1 != null && gift1.mId == uoa.b().b().mId)? 1: null;
                               if (obj1) {
                                  pair = new Pair(Integer.valueOf(i1), obj);
                               label_00b3 :
                                  uoa = (pair != null)? pair.getSecond(): integer;
                                  if (pair != null) {
                                     first = pair.getFirst();
                                     if (first != null) {
                                        i2 = first.intValue();
                                     label_00cd :
                                        i2 = i2 / 8;
                                     }
                                  }
                                  i2 = 0;
                                  goto label_00cd ;
                               }else {
                                  i1 = i1 + 1;
                               }
                            }
                         }
                      }
                      first = integer;
                      goto label_00b3 ;
                   }else if(this.r != -1){
                      value1 = this.a.getValue();
                      if (value1 != null) {
                         iterator = value1.iterator();
                         i3 = 0;
                         while (true) {
                            if (iterator.hasNext()) {
                               Object obj2 = iterator.next();
                               obj = obj2.b().b();
                               Object obj3 = (obj != null && obj.mId == this.r)? 1: null;
                               if (obj3) {
                                  pair = new Pair(Integer.valueOf(i3), obj2);
                               label_0118 :
                                  Integer integer1 = (pair != null)? pair.getSecond(): integer;
                                  if (pair != null) {
                                     first = pair.getFirst();
                                     if (first != null) {
                                        i2 = first.intValue();
                                     label_0132 :
                                        i2 = i2 / 8;
                                     }
                                  }
                                  i2 = 0;
                                  goto label_0132 ;
                               }else {
                                  i3 = i3 + 1;
                               }
                            }
                         }
                      }
                      first = integer;
                      goto label_0118 ;
                   }
                   i3 = i2;
                   uoa1 = uoa;
                   goto label_0138 ;
                }
             }
             first = integer;
             goto label_0069 ;
             uoa1 = integer;
             goto label_0058 ;
          }
       }
       return;
    }
    public final LiveData u0(){
       return this.a;
    }
    public final LiveGiftPanelConfig v0(){
       return this.k;
    }
    public final LiveData w0(){
       return this.d;
    }
    public void x0(LiveGiftPanelNormalPagerVM$b p0){
       LiveGiftPanelNormalPagerVM$b$c a;
       List value;
       ArrayList obj;
       LiveGiftPanelNormalPagerVM liveGiftPane = LiveGiftPanelNormalPagerVM.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, liveGiftPane, "1")) {
          return;
       }
       a.p(p0, "intent");
       if (!a.g(p0, LiveGiftPanelNormalPagerVM$b$b.a)) {
          boolean b = false;
          if (a.g(p0, LiveGiftPanelNormalPagerVM$b$e.a)) {
             this.A0(b);
          }else if(p0 instanceof LiveGiftPanelNormalPagerVM$b$c){
             a = p0.a;
             value = this.r0(this.a).getValue();
             b value1 = this.l.getValue();
             if (value1 != null && value != null) {
                int i = a * 8;
                c uoc = new c(value1.a(), value.subList(i, Math.min((i + 8), value.size())), false, 4, null);
                this.p.e("[LiveGiftPanelNormalPagerVM][PagerSelected]", v10);
             }
          }else if(p0 instanceof LiveGiftPanelNormalPagerVM$b$d){
             obj = this.l.getValue();
             if (obj != null) {
                a.o(obj, "it");
                LiveGiftPanelNormalPagerVM.z0(this, obj, false, false, 0, 14, null);
             }
          }else if(!p0 instanceof LiveGiftPanelNormalPagerVM$b$a || PatchProxy.applyVoidOneRefs(p0, this, liveGiftPane, "2")){
             value = this.a.getValue();
             if (value != null && !value.isEmpty()) {
                LiveGiftPanelNormalPagerVM$b$a a1 = p0.a;
                obj = new ArrayList(u.Y(a1, 10));
                Iterator iterator = a1.iterator();
                while (iterator.hasNext()) {
                   obj.add(value.get(iterator.next().intValue()));
                }
                List list = CollectionsKt___CollectionsKt.G5(obj);
                String str = value.get(b).d();
                LiveGiftPanelNormalPagerVM tn = this.n;
                Objects.requireNonNull(tn);
                if (!PatchProxy.applyVoidThreeRefs("[LiveGiftPanelNormalPagerVM][handleIntent]", str, list, tn, c.class, "2")) {
                   a.p("[LiveGiftPanelNormalPagerVM][handleIntent]", "source");
                   a.p(str, "tabId");
                   Map map = tn.a.a();
                   b uob = (map != null)? map.get(str): null;
                   if (uob != null) {
                      uob.e("[LiveGiftPanelNormalPagerVM][handleIntent]", list);
                   }
                }
             }
          }
       }
       return;
    }
    public final void y0(b p0,boolean p1,boolean p2,int p3){
       String this;
       Object obj;
       e uoe1;
       LiveGiftPanelNormalPagerVM liveGiftPane = this;
       b uob = p0;
       if (PatchProxy.isSupport(LiveGiftPanelNormalPagerVM.class) && PatchProxy.applyVoidFourRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), Integer.valueOf(p3), this, LiveGiftPanelNormalPagerVM.class, "5")) {
          return;
       }
       if (p2) {
          liveGiftPane.r0(liveGiftPane.b).setValue(LiveGiftPanelNormalPagerVM$PagerStatus.LOADING);
       }
       b a = uob.a;
       LiveGiftPanelNormalPagerVM$e uoe = new LiveGiftPanelNormalPagerVM$e(liveGiftPane, uob, p3);
       Objects.requireNonNull(a);
       if (!PatchProxy.isSupport(e.class) || !PatchProxy.applyVoidThreeRefs("[LiveGiftPanelNormalPagerVM][requestData]", uoe, Boolean.valueOf(p1), a, e.class, "1")) {
          a.p("[LiveGiftPanelNormalPagerVM][requestData]", "source");
          a.p(uoe, "callback");
          d uod = new d(a, uoe);
          e l = a.l;
          int i = l.hashCode();
          this = "liveStreamId.get\(\)";
          if (i != -653311135) {
             if (i == -127030193 && l.equals("FansGroupGift")) {
                obj = a.i.get();
                a.o(obj, this);
                uoe1 = new e(new d(obj));
                if (p1) {
                   c uoc1 = a.k.b();
                   Objects.requireNonNull(uoc1);
                   if (!PatchProxy.applyVoidThreeRefs("[LiveGiftPanelNormalPagerVM][requestData]", uoe1, uod, uoc1, c.class, "1")) {
                      a.p("[LiveGiftPanelNormalPagerVM][requestData]", "source");
                      a.p(uoe1, "request");
                      a.p(uod, "callback");
                      c b1 = uoc1.b;
                      if (b1 != null && b1.e()) {
                         uod.a("[LiveGiftPanelNormalPagerVM][requestData]", b1);
                      }else {
                         uoc1.b("[LiveGiftPanelNormalPagerVM][requestData]", uoe1, uod);
                      }
                   }
                }else {
                   a.k.b().b("[LiveGiftPanelNormalPagerVM][requestData]", uoe1, uod);
                }
             }
          }else if(l.equals("PrivilegeGift")){
             obj = a.i.get();
             a.o(obj, this);
             uoe1 = new e(new d(obj));
             if (p1) {
                s os = a.k.d();
                Objects.requireNonNull(os);
                if (!PatchProxy.applyVoidThreeRefs("[LiveGiftPanelNormalPagerVM][requestData]", uoe1, uod, os, s.class, "1")) {
                   a.p("[LiveGiftPanelNormalPagerVM][requestData]", "source");
                   a.p(uoe1, "request");
                   a.p(uod, "callback");
                   s b2 = os.b;
                   if (b2 != null && b2.e()) {
                      uod.a("[LiveGiftPanelNormalPagerVM][requestData]", b2);
                   }else {
                      os.b("[LiveGiftPanelNormalPagerVM][requestData]", uoe1, uod);
                   }
                }
             }else {
                a.k.d().b("[LiveGiftPanelNormalPagerVM][requestData]", uoe1, uod);
             }
          }
          obj = a.i.get();
          a.o(obj, this);
          Object obj1 = obj;
          obj = a.j.get();
          a.o(obj, "giftApiRequestSuffix.get\(\)");
          c uoc = new c(obj1, obj, 0, false, 12, null);
          uoe1 = new e(l);
          if (p1) {
             o oo = a.k.c();
             Objects.requireNonNull(oo);
             if (!PatchProxy.applyVoidThreeRefs("[LiveGiftPanelNormalPagerVM][requestData]", uoe1, uod, oo, o.class, "1")) {
                a.p("[LiveGiftPanelNormalPagerVM][requestData]", "source");
                a.p(uoe1, "request");
                a.p(uod, "callback");
                o b = oo.b;
                if (b != null && b.e()) {
                   uod.a("[LiveGiftPanelNormalPagerVM][requestData]", b);
                }else {
                   oo.b("[LiveGiftPanelNormalPagerVM][requestData]", uoe1, uod);
                }
             }
          }else {
             a.k.c().b("[LiveGiftPanelNormalPagerVM][requestData]", uoe1, uod);
          }
       }
    label_01af :
       return;
    }
}
