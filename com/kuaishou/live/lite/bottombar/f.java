package com.kuaishou.live.lite.bottombar.f;
import com.kuaishou.live.viewcontroller.ViewController;
import xp5.i;
import or5.d;
import tj3.e;
import com.kuaishou.live.lite.bottombar.LiteBottomBarDataSource;
import i93.f;
import com.kuaishou.live.lite.bottombar.f$a;
import com.kuaishou.live.lite.util.viewupdater.a;
import com.kuaishou.live.lite.util.viewupdater.a$a;
import vd3.a;
import java.util.HashMap;
import java.util.List;
import java.util.Collections;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.Context;
import android.view.View;
import ha1.b;
import lnc.a1;
import k51.d;
import com.kuaishou.live.lite.layoutmanager.LayoutViewType;
import java.lang.Enum;
import vd3.c;
import com.kuaishou.live.lite.bottombar.a;
import z1.a;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.lite.util.viewupdater.f;
import com.kuaishou.live.lite.bottombar.LiveLiteBottomBarService$a;
import com.google.common.base.Optional;
import com.kwai.robust.PatchProxyResult;
import java.util.Map;
import com.kuaishou.live.lite.bottombar.LiveLiteBottomBarService$BottomBarItemChangeReason;
import java.util.Objects;
import kotlin.jvm.internal.a;
import java.lang.Iterable;
import trd.u;
import trd.s0;
import usd.q;
import java.util.LinkedHashMap;
import java.util.Iterator;
import com.kuaishou.live.lite.bottombar.LiveLiteBottomBarService$BottomBarType;
import java.lang.Integer;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiteBottomBarConfig;
import java.util.ArrayList;
import wsd.m;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.kuaishou.live.lite.bottombar.LiteBottomBarDataSource$getBottomBarItemInSlot$1;
import msd.l;
import kotlin.sequences.SequencesKt___SequencesKt;
import i93.c;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiteBottomBarItemConfig;
import java.lang.Number;
import java.util.Collection;
import qk.m;
import com.kuaishou.live.lite.bottombar.c;
import ok.h;
import com.google.common.collect.ImmutableList;
import android.widget.LinearLayout;
import android.view.ViewGroup;
import com.kuaishou.live.lite.bottombar.b;
import i93.a;
import com.kuaishou.live.lite.bottombar.d;
import com.kuaishou.live.lite.bottombar.LiveLiteBottomBarService$b;
import tj3.k;
import java.lang.System;
import java.lang.Long;

public class f extends ViewController	// class@001ed0
{
    public final i j;
    public final d k;
    public final e l;
    public final f$a m;
    public f n;
    public final a o;
    public final Map p;
    public final LiteBottomBarDataSource q;
    public List r;
    public final Map s;
    public boolean t;
    public final f u;

    public void f(i p0,d p1,e p2,LiteBottomBarDataSource p3,f p4,f$a p5){
       super();
       this.o = new a(a.a());
       this.p = new HashMap();
       this.r = Collections.emptyList();
       this.s = new HashMap();
       this.t = false;
       this.j = p0;
       this.k = p1;
       this.l = p2;
       this.m = p5;
       this.q = p3;
       this.u = p4;
    }
    public void F2(){
       if (PatchProxy.applyVoid(null, this, f.class, "1")) {
          return;
       }
       View view = b.e(this.D2(), R.layout.lite_bottombar_container);
       view.setMinimumHeight(a1.d(R.dimen.arg_RES_7f07030d));
       view.setTag(d.a, LayoutViewType.BottomBar.name());
       this.R2(view);
       this.u.i().e(new a(this));
       return;
    }
    public void J2(){
       if (PatchProxy.applyVoid(null, this, f.class, "6")) {
          return;
       }
       b.Z(LiveLiteLogTag.BOTTOM_BAR, "LiteBottomBarContainerController.onDestroy");
       this.o.b();
       f tn = this.n;
       if (tn != null) {
          tn.release();
       }
       return;
    }
    public final Optional V2(LiveLiteBottomBarService$a p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Optional.fromNullable(this.s.remove(p0));
    }
    public final LiveLiteBottomBarService$a W2(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p0.getTag(0x7f0a17e8);
    }
    public final void X2(List p0){
       LinkedHashMap obj1;
       f uof2;
       String str3;
       Iterator iterator1;
       Object obj2;
       LiveConfigStartupResponse$LiteBottomBarConfig mSlots;
       int i1;
       Object obj3;
       Object obj4;
       ArrayList obj5;
       f uof = this;
       Object obj = p0;
       f uof1 = f.class;
       String str = "9";
       if (PatchProxy.applyVoidOneRefs(obj, uof, uof1, str)) {
          return;
       }
       f q = uof.q;
       Objects.requireNonNull(q);
       LiteBottomBarDataSource liteBottomBa = LiteBottomBarDataSource.class;
       List list = PatchProxy.applyOneRefs(obj, q, liteBottomBa, "5");
       String str1 = "bottomBarConfig.mSlots";
       String str2 = 16;
       int i = 10;
       if (list != PatchProxyResult.class) {
       }else {
          a.p(obj, "prepareShowItems");
          obj1 = new LinkedHashMap(q.n(s0.j(u.Y(obj, i)), str2));
          Iterator iterator6 = p0.iterator();
          while (iterator6.hasNext()) {
             obj5 = iterator6.next();
             obj1.put(Integer.valueOf(obj5.getType().getId()), obj5);
          }
          LiveConfigStartupResponse$LiteBottomBarConfig mSlots1 = q.b().mSlots;
          a.o(mSlots1, str1);
          obj5 = new ArrayList(mSlots1.length);
          i1 = mSlots1.length;
          for (int i3 = 0; i3 < i1; i3 = i3 + 1) {
             obj5.add(q.d(mSlots1[i3]));
          }
          ArrayList uArrayList4 = new ArrayList();
          Iterator iterator7 = obj5.iterator();
          while (iterator7.hasNext()) {
             List list2 = iterator7.next();
             obj2 = PatchProxy.applyTwoRefs(list2, obj1, q, liteBottomBa, "6");
             if (obj2 != PatchProxyResult.class) {
             }else {
                obj2 = SequencesKt___SequencesKt.w0(SequencesKt___SequencesKt.o0(SequencesKt___SequencesKt.b1(CollectionsKt___CollectionsKt.l1(list2), new LiteBottomBarDataSource$getBottomBarItemInSlot$1(obj1))));
             }
             if (obj2 != null) {
                uArrayList4.add(obj2);
             }
          }
          list = CollectionsKt___CollectionsKt.G5(uArrayList4);
       }
       obj1 = list;
       q = uof.q;
       f r = uof.r;
       c uoc = new c(uof);
       Objects.requireNonNull(q);
       if (!PatchProxy.applyVoidThreeRefs(r, obj1, uoc, q, LiteBottomBarDataSource.class, "7")) {
          a.p(r, "lastShowingItems");
          a.p(obj1, "pendingShowingItems");
          a.p(uoc, "callback");
          ArrayList uArrayList1 = new ArrayList(u.Y(r, i));
          Iterator iterator2 = r.iterator();
          while (iterator2.hasNext()) {
             uArrayList1.add(Integer.valueOf(iterator2.next().getType().getId()));
          }
          LinkedHashMap linkedHashMa = new LinkedHashMap(q.n(s0.j(u.Y(r, i)), str2));
          iterator1 = r.iterator();
          while (iterator1.hasNext()) {
             obj2 = iterator1.next();
             linkedHashMa.put(Integer.valueOf(obj2.getType().getId()), obj2);
          }
          ArrayList uArrayList2 = new ArrayList(u.Y(obj1, i));
          Iterator iterator3 = obj1.iterator();
          while (iterator3.hasNext()) {
             uArrayList2.add(Integer.valueOf(iterator3.next().getType().getId()));
          }
          LinkedHashMap linkedHashMa1 = new LinkedHashMap(q.n(s0.j(u.Y(obj1, i)), str2));
          Iterator iterator4 = obj1.iterator();
          while (iterator4.hasNext()) {
             obj2 = iterator4.next();
             linkedHashMa1.put(Integer.valueOf(obj2.getType().getId()), obj2);
             i = 10;
          }
          mSlots = q.b().mSlots;
          a.o(mSlots, str1);
          int len = mSlots.length;
          i = 0;
          while (i < len) {
             i1 = mSlots[i];
             int i2 = len;
             List list1 = q.d(i1);
             LiveConfigStartupResponse$LiteBottomBarConfig liteBottomBa1 = mSlots;
             uof2 = uof1;
             str3 = str;
             ArrayList uArrayList3 = new ArrayList(u.Y(list1, 10));
             Iterator iterator5 = list1.iterator();
             while (iterator5.hasNext()) {
                uArrayList3.add(Integer.valueOf(iterator5.next().mId));
             }
             iterator5 = uArrayList3.iterator();
             while (true) {
                if (iterator5.hasNext()) {
                   obj3 = iterator5.next();
                   if (uArrayList1.contains(Integer.valueOf(obj3.intValue()))) {
                   label_0217 :
                      iterator5 = uArrayList3.iterator();
                      while (true) {
                         if (iterator5.hasNext()) {
                            obj4 = iterator5.next();
                            if (!uArrayList2.contains(Integer.valueOf(obj4.intValue()))) {
                               continue ;
                            }
                         }else {
                            obj4 = null;
                         }
                         if (obj3 != null || (obj4 != null && !a.g(obj3, obj4))) {
                            LiveLiteBottomBarService$a uoa = (obj3 != null)? linkedHashMa.get(obj3): null;
                            LiveLiteBottomBarService$a uoa1 = (obj4 != null)? linkedHashMa1.get(obj4): null;
                            if (uoa != null || uoa1 != null) {
                               if (uoa == null && uoa1 != null) {
                                  uoc.a(i1, uoa1, LiveLiteBottomBarService$BottomBarItemChangeReason.NORMAL_ADD);
                               }else if(uoa != null && uoa1 == null){
                                  uoc.a(i1, uoa, LiveLiteBottomBarService$BottomBarItemChangeReason.NORMAL_REMOVE);
                               }else if(uoa != null && uoa1 != null){
                                  if (q.c(obj4) >= q.c(obj3)) {
                                     uoc.a(i1, uoa1, LiveLiteBottomBarService$BottomBarItemChangeReason.NORMAL_ADD);
                                     uoc.a(i1, uoa, LiveLiteBottomBarService$BottomBarItemChangeReason.SLOT_HAS_HIGH_PRIORITY_ITEM);
                                  }else {
                                     uoc.a(i1, uoa1, LiveLiteBottomBarService$BottomBarItemChangeReason.SLOT_HIGH_PRIORITY_ITEM_REMOVED);
                                     uoc.a(i1, uoa, LiveLiteBottomBarService$BottomBarItemChangeReason.NORMAL_REMOVE);
                                  }
                               }
                            }
                         }
                      label_0298 :
                         i = i + 1;
                         len = i2;
                         mSlots = liteBottomBa1;
                         uof1 = uof2;
                         str = str3;
                      }
                   }else {
                      Integer integer = 10;
                   }
                }else {
                   obj3 = null;
                   goto label_0217 ;
                }
             }
          }
       }
       uof2 = uof1;
       str3 = str;
       uof1 = uof.r;
       ArrayList uArrayList = PatchProxy.applyThreeRefs(p0, uof1, obj1, this, f.class, "11");
       if (uArrayList != PatchProxyResult.class) {
       }else {
          uArrayList = new ArrayList(obj);
          uArrayList.removeAll(uof1);
          uArrayList.removeAll(obj1);
       }
       Iterator iterator = uArrayList.iterator();
       while (iterator.hasNext()) {
          iterator.next().g(LiveLiteBottomBarService$BottomBarItemChangeReason.SLOT_HAS_HIGH_PRIORITY_ITEM);
       }
       ImmutableList immutableLis = m.s(obj1).F(new c(uof)).B();
       f uof3 = uof2;
       r = PatchProxy.apply(null, uof, uof3, "2");
       if (r != PatchProxyResult.class) {
       }else if(uof.n == null){
          r = uof.m.a(this.P2().findViewById(R.id.live_lite_bottom_container_view));
          uof.n = r;
          r.setAddViewCallback(new b(uof));
          uof.n.setRemoveViewCallback(new a(uof));
       }
       r = uof.n;
       r.a(immutableLis);
       uof.r = obj1;
       if (!PatchProxy.applyVoidOneRefs(obj1, uof, uof3, "10")) {
          immutableLis = m.s(obj1).F(d.b).B();
          r = uof.u;
          Objects.requireNonNull(r);
          if (!PatchProxy.applyVoidOneRefs(immutableLis, r, f.class, str3)) {
             a.p(immutableLis, "items");
             iterator1 = r.c.iterator();
             while (iterator1.hasNext()) {
                iterator1.next().a(immutableLis);
             }
          }
       }
       if (!PatchProxy.applyVoid(null, uof, uof3, "13") && uof.t == null) {
          uof.t = true;
          k ok = uof.l.x();
          long l = System.currentTimeMillis();
          Objects.requireNonNull(ok);
          k ok1 = k.class;
          if (!PatchProxy.isSupport(ok1) || !PatchProxy.applyVoidOneRefs(Long.valueOf(l), ok, ok1, "12")) {
             ok.G0.put("page_will_appear_to_bottom_bar_appear_duration", Long.valueOf((l - ok.b0)));
          }
       }
       return;
    }
}
