package com.kuaishou.live.common.core.component.pendant.pendantgroup.i;
import ml8.d;
import pq5.a;
import dw1.a;
import java.lang.Object;
import java.util.BitSet;
import cw1.d0;
import java.util.HashSet;
import java.util.ArrayList;
import android.util.SparseArray;
import com.kuaishou.live.common.core.component.pendant.pendantgroup.i$a;
import com.kuaishou.live.common.core.component.pendant.pendantgroup.i$b;
import dw1.a$b;
import com.kwai.feature.api.live.base.service.pendant.pendantgroup.LivePendantRelation;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import java.lang.Enum;
import java.lang.StringBuilder;
import com.kuaishou.live.common.core.component.pendant.pendantgroup.i$c;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import java.util.Collection;
import java.util.Iterator;
import com.kwai.feature.api.live.base.service.pendant.pendantgroup.LivePendantContainerScene;
import com.kuaishou.live.common.core.component.pendant.pendantgroup.g;
import java.lang.Number;
import android.view.View;
import lnc.a1;
import rq5.a;
import com.kuaishou.live.common.core.component.pendant.LivePendantLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import cw1.n0;
import com.kwai.feature.api.live.base.service.scenetype.LiveSceneType;
import p91.m;
import lp3.e;
import rd1.f;
import lp3.c;
import xd1.c;
import com.kuaishou.live.common.core.component.chat.LiveAudienceChatService;
import android.widget.RelativeLayout;
import va1.n0;
import java.lang.Integer;
import com.kwai.feature.api.live.base.service.pendant.pendantgroup.LivePendantContainerPosition;
import com.kwai.feature.api.live.base.service.pendant.pendantgroup.LivePendantHideReason;
import ekd.q;
import java.util.Collections;
import com.kuaishou.live.common.core.component.pendant.pendantgroup.LiveRightPendantView;
import android.widget.LinearLayout;
import com.kwai.feature.api.live.base.service.pendant.pendantgroup.LivePendantPriority;
import ya1.m;
import com.kuaishou.android.live.log.c$b;
import com.kuaishou.android.live.log.c;
import lv1.e;
import hz1.a;
import gz1.b;
import ekd.j;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import java.lang.Math;
import ekd.k1;
import cw1.r0;
import java.lang.Runnable;
import java.util.Set;
import cw1.b0;
import com.kwai.feature.api.live.base.service.pendant.LivePendantContainerHideFlags;
import lp3.b;
import ekd.m1;
import android.content.Context;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.view.ViewParent;
import java.lang.Long;
import ea1.a;
import com.kuaishou.live.common.core.component.pendant.pendantgroup.h;
import android.util.Pair;
import android.view.View$OnLayoutChangeListener;
import com.kuaishou.live.common.core.component.pendant.pendantgroup.i$e;

public class i implements d, a	// class@001724
{
    public final ViewTreeObserver$OnGlobalLayoutListener A;
    public float B;
    public boolean C;
    public boolean D;
    public a E;
    public m b;
    public a c;
    public final a d;
    public View e;
    public RelativeLayout f;
    public RelativeLayout g;
    public RelativeLayout h;
    public LiveRightPendantView i;
    public int j;
    public int k;
    public int l;
    public int m;
    public final BitSet n;
    public final BitSet o;
    public final BitSet p;
    public final d0 q;
    public g r;
    public d s;
    public b t;
    public final Set u;
    public boolean v;
    public boolean w;
    public final List x;
    public final SparseArray y;
    public final Object z;

    public void i(a p0){
       super();
       this.m = -1;
       this.n = new BitSet();
       this.o = new BitSet();
       this.p = new BitSet();
       this.q = new d0();
       this.u = new HashSet();
       this.v = true;
       this.w = false;
       this.x = new ArrayList();
       this.y = new SparseArray();
       this.z = new Object();
       this.A = new i$a(this);
       this.B = 0x3f800000;
       this.C = false;
       this.D = false;
       this.d = p0;
       p0.we(new i$b(this));
    }
    public static void r(i p0,LivePendantRelation p1,boolean p2){
       Objects.requireNonNull(p0);
       i oi = i.class;
       if (!PatchProxy.isSupport(oi) || (!PatchProxy.applyVoidTwoRefs(p1, Boolean.valueOf(p2), p0, oi, "11") && p2 != p0.p.get(p1.ordinal()))) {
          p0.p.set(p1.ordinal(), p2);
          p0.Rk("notifyRelationChanged: relation = "+p1+", enabled = "+p2);
       }
       return;
    }
    public final void B3(){
       i oi = i.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oi, "6")) {
          return;
       }
       this.q.a = new i$c(this);
       i tr = this.r;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Iterator obj = PatchProxy.apply(objArray, this, oi, "36");
       if (obj != patchProxyRe) {
       }else {
          oi = this.q;
          Objects.requireNonNull(oi);
          ArrayList uArrayList = PatchProxy.apply(objArray, oi, d0.class, "4");
          if (uArrayList != patchProxyRe) {
          }else {
             uArrayList = new ArrayList();
             if (oi.c.size() > 0) {
                uArrayList.addAll(oi.c);
             }
             if (oi.d.size() > 0) {
                obj = oi.d.iterator();
                while (obj.hasNext()) {
                   LivePendantContainerScene livePendantC = obj.next();
                   if (!uArrayList.contains(livePendantC)) {
                      uArrayList.add(livePendantC);
                   }
                }
             }
          }
          obj = uArrayList;
       }
       tr.a(obj);
       return;
    }
    public final int C1(){
       int i;
       Object obj = PatchProxy.apply(null, this, i.class, "44");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       i = this.J2();
       float f = 8.00f;
       if (i > 0) {
          return (((this.e.getHeight() - i) + a1.e(f)) + a1.e(f));
       }
       return this.N(0x7f0a1b1c, (a1.e(f) + a1.e(f)));
    }
    public void G(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "25")) {
          return;
       }
       String str = "LiveRightPendantContainerManager";
       if (this.w != null) {
          b.P(LivePendantLogTag.LIVE_PENDANT.appendTag(str), p0.i()+"addPendant, mIsReleased");
          return;
       }else if(this.x.contains(p0) || p0.H() == null){
          b.S(LivePendantLogTag.LIVE_PENDANT.appendTag(str), p0.i()+"addPendant, exist or getPendantView\(\) == null", "exist", Boolean.valueOf(this.x.contains(p0)));
          return;
       }else {
          p0.v(this);
          this.x.add(p0);
          i ts = this.s;
          if (ts != null) {
             ts.a(p0.c());
          }else {
             ts = this.t;
             if (ts != null) {
                ts.a(p0.c());
             }
          }
          this.q4(100, "onPendantAdded");
          return;
       }
    }
    public final int J2(){
       int i;
       Object[] objArray = null;
       i obj = PatchProxy.apply(objArray, this, i.class, "48");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.b;
       if (obj != null && obj.u5() == LiveSceneType.Anchor) {
          objArray = this.b.t5().a(f.class).p();
       }else {
          obj = this.b;
          if (obj != null && obj.u5() == LiveSceneType.Audience) {
             objArray = this.b.t5().a(LiveAudienceChatService.class).p();
          }
       }
       i = (objArray != null)? objArray.W(): 0;
       return i;
    }
    public void K5(){
       if (PatchProxy.applyVoid(null, this, i.class, "10")) {
          return;
       }
       b.d0(LivePendantLogTag.LIVE_PENDANT, "notifySceneChanged", "top scene", this.q.b().name(), "bottom scene", this.q.a().name());
       if (this.W4()) {
          return;
       }
       this.q4(100, "notifySceneChanged");
       return;
    }
    public final RelativeLayout M1(){
       Object obj = PatchProxy.apply(null, this, i.class, "55");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.h == null) {
          this.h = n0.g(this.e, 0x7f0a2528, 0x7f0a2527);
       }
       return this.h;
    }
    public final int N(int p0,int p1){
       i oi = i.class;
       if (PatchProxy.isSupport(oi)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, oi, "49");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (this.e.findViewById(p0) == null) {
          return 0;
       }else {
          this.w(LivePendantContainerPosition.BOTTOM, p0);
          return ((this.e.getHeight() - this.e2(this.e, p0)) + p1);
       }
    }
    public void N5(a p0){
       i oi;
       LivePendantRelation[] livePendantR1;
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "26")) {
          return;
       }
       if (this.w != null) {
          return;
       }
       if (!this.x.contains(p0)) {
          return;
       }
       Objects.requireNonNull(p0);
       if (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidOneRefs(Boolean.TRUE, p0, a.class, "4")) {
          p0.l(1, LivePendantHideReason.REMOVED);
       }
       p0.v(null);
       this.x.remove(p0);
       if (!q.f(p0.c())) {
          Iterator iterator = p0.c().iterator();
          while (iterator.hasNext()) {
             LivePendantRelation livePendantR = iterator.next();
             Iterator iterator1 = this.x.iterator();
             while (true) {
                if (iterator1.hasNext()) {
                   List list = iterator1.next().c();
                   if (!q.f(list) && list.contains(livePendantR)) {
                      oi = null;
                   }
                }else {
                   oi = 1;
                }
                if (oi) {
                   oi = this.s;
                   if (oi != null) {
                      livePendantR1 = new LivePendantRelation[]{livePendantR};
                      oi.e(livePendantR1);
                   }else {
                      oi = this.t;
                      if (oi != null) {
                         livePendantR1 = new LivePendantRelation[]{livePendantR};
                         oi.e(livePendantR1);
                         continue ;
                      }else {
                         continue ;
                      }
                   }
                }else {
                   continue ;
                }
             }
          }
       }
       if (p0.h() != null) {
          this.p.set(p0.h().ordinal(), 0);
       }
       this.q4(100, "removePendant");
       return;
    }
    public final int P(int p0){
       i oi = i.class;
       if (PatchProxy.isSupport(oi)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, oi, "41");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.t1(p0, a1.e(8.00f));
    }
    public void Rk(String p0){
       a[] uoaArray2;
       int i5;
       int i6;
       boolean i8;
       int b;
       i i9;
       int i10;
       BitSet obj3;
       Iterator obj4;
       int i = this;
       Object[] obj = p0;
       i oi = i.class;
       if (PatchProxy.applyVoidOneRefs(obj, i, oi, "14")) {
          return;
       }
       if (this.W4()) {
          return;
       }
       String str = "invalidateInnerPendants";
       b.c0(LivePendantLogTag.LIVE_PENDANT, str, "reason", obj);
       obj = null;
       if (!PatchProxy.applyVoid(obj, i, oi, "13")) {
          Collections.sort(i.x);
       }
       i i1 = i.i;
       Objects.requireNonNull(i1);
       if (!PatchProxy.applyVoid(obj, i1, LiveRightPendantView.class, "3")) {
          i1.b.removeAllViews();
       }
       i1 = i.i;
       Objects.requireNonNull(i1);
       if (!PatchProxy.applyVoid(obj, i1, LiveRightPendantView.class, "4")) {
          i1.c.removeAllViews();
       }
       int i2 = 0;
       i.i.a(i2, i2, i2, i2);
       i.k = i2;
       i.l = i2;
       i1 = i.j;
       ArrayList uArrayList = new ArrayList();
       a[] uoaArray = new a[i2];
       a[] uoaArray1 = i.x.toArray(uoaArray);
       int len = uoaArray1.length;
       int i3 = 0;
       int i4 = 0;
       while (i3 < len) {
          object oobject = uoaArray1[i3];
          View view = oobject.H();
          String str1 = "hide";
          if (oobject.d() != LivePendantContainerPosition.TOP || (i.i.getTopContainerVisibility() || (oobject.d() == LivePendantContainerPosition.BOTTOM && i.i.getBottomContainerVisibility()))) {
             i.v = i2;
             b.d0(LivePendantLogTag.LIVE_PENDANT, oobject.i()+str1, "pendant", oobject.f().name(), "reason", "container not visible");
             i.a3(oobject, LivePendantHideReason.CONTAINER_NOT_VISIBLE);
          label_00cf :
             uoaArray2 = uoaArray1;
             i5 = len;
             i6 = i3;
          }else if(view instanceof m){
             view.setScale(i.B);
          }
          i.v = true;
          float f = 8.00f;
          int i7 = (i4 > 0)? a1.e(f): null;
          if (view == null) {
             b.C(LivePendantLogTag.LIVE_PENDANT, oobject.i()+"invalidateInnerPendants, pendantView == null", c.k("pendantPriority", String.valueOf(oobject.f()), "pendantRelation", String.valueOf(oobject.h())));
             goto label_00cf ;
          }else if(oobject.a() != a.f){
             i8 = oobject.a();
          }else {
             i8 = e.b(view, true);
          }
          LivePendantLogTag lIVE_PENDANT = LivePendantLogTag.LIVE_PENDANT;
          uoaArray2 = uoaArray1;
          String str2 = "LiveRightPendantContainerManager";
          lIVE_PENDANT.appendTag(str2);
          i5 = len;
          i6 = i3;
          b.V(lIVE_PENDANT, oobject.i()+str, "pendant", oobject.f().name()+", pendant index:"+i4, "blankHeight", Integer.valueOf(i1), "pendantHeight", Integer.valueOf(i8), "dividerPadding", Integer.valueOf(i7));
          i7 = i7 + i8;
          if (i1 < i7) {
             i.a3(oobject, LivePendantHideReason.CONTAINER_HEIGHT_NOT_ENOUGH);
             lIVE_PENDANT.appendTag(str2);
             b.V(lIVE_PENDANT, oobject.i()+str1, "pendant", oobject.f().name(), "reason", "not high enough", "blankHeight", Integer.valueOf(i1), "pendantHeight", Integer.valueOf(i8));
          }else {
             a obj1 = PatchProxy.applyOneRefs(oobject, i, oi, "12");
             String str3 = "2";
             if (obj1 != PatchProxyResult.class) {
                i8 = obj1.booleanValue();
             }else if(q.f(oobject.c())){
                i8 = false;
             }else {
                i9 = i.p;
                obj3 = PatchProxy.apply(null, oobject, a.class, str3);
                if (obj3 != PatchProxyResult.class) {
                }else {
                   obj3 = new BitSet();
                   List list = oobject.c();
                   if (!q.f(list)) {
                      Iterator iterator = list.iterator();
                      while (iterator.hasNext()) {
                         obj3.set(iterator.next().ordinal());
                         iterator = iterator;
                      }
                   }
                }
                i8 = i9.intersects(obj3);
             }
             if (i8) {
                i.a3(oobject, LivePendantHideReason.INCOMPATIBLE);
                b.d0(LivePendantLogTag.LIVE_PENDANT, oobject.i()+str1, "pendant", oobject.f().name(), "reason", "incompatible");
             }else {
                obj1 = a.class;
                i obj2 = PatchProxy.applyOneRefs(oobject, i, oi, "15");
                String str4 = "1";
                if (obj2 != PatchProxyResult.class) {
                   b = obj2.booleanValue();
                }else {
                   obj2 = i.b;
                   if (obj2 != null && (!obj2.e() && (i.b.t5() != null && (i.b.t5().a(obj1) != null && i.b.t5().a(obj1).ci())))) {
                      LivePendantPriority livePendantP = oobject.f();
                      obj3 = PatchProxy.applyOneRefs(livePendantP, null, b.class, str4);
                      i8 = (obj3 != PatchProxyResult.class)? obj3.booleanValue(): j.d(b.a, livePendantP);
                      b = i8;
                   }else {
                      b = true;
                   }
                }
                if (b) {
                   if (view.getLayoutParams() == null) {
                      view.setLayoutParams(new LinearLayout$LayoutParams(-2, -2));
                   }
                   if (oobject.d() == LivePendantContainerPosition.TOP) {
                      i9 = i.i;
                      Objects.requireNonNull(i9);
                      if (!PatchProxy.applyVoidOneRefs(view, i9, LiveRightPendantView.class, str4)) {
                         i9.b.addView(view);
                      }
                   }else if(oobject.d() == LivePendantContainerPosition.BOTTOM){
                      i9 = i.i;
                      len = oobject.b();
                      Objects.requireNonNull(i9);
                      if (!PatchProxy.isSupport(LiveRightPendantView.class) || !PatchProxy.applyVoidTwoRefs(view, Integer.valueOf(len), i9, LiveRightPendantView.class, str3)) {
                         i3 = 0x7f0a2249;
                         view.setTag(i3, Integer.valueOf(len));
                         i2 = i9.c.getChildCount();
                         b = 0;
                         while (true) {
                            if (b < i2) {
                               int i11 = i2;
                               if (len < i9.c.getChildAt(b).getTag(i3).intValue()) {
                               label_033a :
                                  i9.c.addView(view, b);
                               }else {
                                  b = b + 1;
                                  i2 = i11;
                               }
                            }else {
                               b = -1;
                               goto label_033a ;
                            }
                         }
                      }
                      view.getLayoutParams().rightMargin = oobject.g();
                      i.i.a(0, a1.e(8.00f), 0, 0);
                   }
                   i10 = i1 - i7;
                   LivePendantLogTag lIVE_PENDANT1 = LivePendantLogTag.LIVE_PENDANT;
                   lIVE_PENDANT1.appendTag(str2);
                   LivePendantLogTag livePendantL = lIVE_PENDANT1;
                   b.T(livePendantL, oobject.i()+str, "show", oobject.f(), "left blankHeight", Integer.valueOf(i10));
                   LivePendantContainerPosition tOP = LivePendantContainerPosition.TOP;
                   if (oobject.d() == tOP) {
                      i8 = Math.max(i.k, e.c(view, false));
                      i.k = i8;
                      i.b5(i8, oobject);
                      i.e7(oobject, tOP);
                   }else {
                      boolean b1 = false;
                      tOP = LivePendantContainerPosition.BOTTOM;
                      if (oobject.d() == tOP) {
                         i8 = Math.max(i.l, e.c(view, b1));
                         i.l = i8;
                         i.b5(i8, oobject);
                         i.e7(oobject, tOP);
                         uArrayList.add(oobject);
                      }
                   }
                   i4 = i4 + 1;
                label_03bc :
                   i3 = i6 + 1;
                   uoaArray1 = uoaArray2;
                   len = i5;
                   i2 = false;
                }
             }
          }
          uoaArray1 = null;
          goto label_03bc ;
       }
       if (i.v != null) {
          obj4 = PatchProxy.apply(null, i, oi, "16");
          if (obj4 != PatchProxyResult.class) {
             i8 = obj4.booleanValue();
          }else {
             LivePendantContainerScene livePendantC = i.q.b();
             i8 = (livePendantC != LivePendantContainerScene.MULTI_TAB_STYLE && (livePendantC != LivePendantContainerScene.GZONE_BANNER && (livePendantC != LivePendantContainerScene.PK && (livePendantC != LivePendantContainerScene.GZONE_NEW_TAB_STYLE_SCREEN_LANDSCAPE && (livePendantC != LivePendantContainerScene.REBROADCAST_PENDANT_RIGHT_TOP && (livePendantC != LivePendantContainerScene.PLAY_CONFIG_LANDSCAPE && (livePendantC != LivePendantContainerScene.SCREEN_LANDSCAPE && (livePendantC == LivePendantContainerScene.RECRUIT_EXPLAIN || livePendantC == LivePendantContainerScene.PLAY_CONFIG_PORTRAIT))))))))? true: false;
          }
          if (i8 && (!PatchProxy.isSupport(oi) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i1), i, oi, "17"))) {
             k1.n(i.z);
             k1.s(new r0(i, i1), i.z, 100);
          }
       }
    label_042f :
       obj4 = i.u.iterator();
       while (obj4.hasNext()) {
          obj4.next().n2();
       }
       obj4 = uArrayList.iterator();
       while (obj4.hasNext()) {
          a uoa = obj4.next();
          i1 = i.i;
          View view1 = uoa.H();
          Objects.requireNonNull(i1);
          Object obj5 = PatchProxy.applyOneRefs(view1, i1, LiveRightPendantView.class, "17");
          i10 = (obj5 != PatchProxyResult.class)? obj5.intValue(): i1.c.indexOfChild(view1);
          i2 = i.i.getBottomContainerChildCount() - 1;
          i10 = (i10 == i2)? true: false;
          if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(i10), uoa, a.class, "10")) {
             continue ;
          }
          uoa.r(i10);
       }
       return;
    }
    public final boolean W4(){
       Object obj = PatchProxy.apply(null, this, i.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!this.e.getHeight())? true: false;
       return b;
    }
    public final void a3(a p0,LivePendantHideReason p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, i.class, "21")) {
          return;
       }
       p0.l(false, p1);
       if (p0.h() != null) {
          this.p.set(p0.h().ordinal(), false);
       }
       return;
    }
    public final void b5(int p0,a p1){
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, oi, "18")) {
          return;
       }
       LivePendantLogTag lIVE_PENDANT = LivePendantLogTag.LIVE_PENDANT;
       Integer integer = Integer.valueOf(p0);
       ViewGroup$LayoutParams width = (p1.H().getLayoutParams() != null)? p1.H().getLayoutParams().width: 0;
       b.d0(lIVE_PENDANT, "invalidateInnerPendants", "width", integer, "layout param width", Integer.valueOf(width));
       return;
    }
    public void c6(int p0,int p1,LivePendantContainerHideFlags p2){
       if (PatchProxy.isSupport(i.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, i.class, "27")) {
          return;
       }
       if (this.f == null) {
          return;
       }
       if (p0) {
          if ((LivePendantContainerPosition.TOP.flag & p1) > 0) {
             this.n.set(p2.ordinal());
          }
          if ((LivePendantContainerPosition.BOTTOM.flag & p1) > 0) {
             this.o.set(p2.ordinal());
          }
       }
       if (p0 == this.i.getTopContainerVisibility() && ((LivePendantContainerPosition.TOP.flag & p1) > 0 && (p0 == this.i.getBottomContainerVisibility() && (LivePendantContainerPosition.BOTTOM.flag & p1) > 0))) {
          return;
       }else if((LivePendantContainerPosition.TOP.flag & p1) > 0){
          if (!p0) {
             this.n.clear(p2.ordinal());
             if (!this.n.cardinality()) {
                this.i.setTopContainerVisibility(0);
             }
          }else {
             this.n.set(p2.ordinal());
             this.i.setTopContainerVisibility(p0);
          }
       }
       if ((p1 & LivePendantContainerPosition.BOTTOM.flag) > 0) {
          if (!p0) {
             this.o.clear(p2.ordinal());
             if (!this.o.cardinality()) {
                this.i.setBottomContainerVisibility(0);
             }
          }else {
             this.o.set(p2.ordinal());
             this.i.setBottomContainerVisibility(p0);
          }
       }
       this.ik("setContainerVisibility");
       Iterator iterator = this.u.iterator();
       while (iterator.hasNext()) {
          iterator.next().q(p0);
       }
       return;
    }
    public void create(e p0){
       b.a(this, p0);
    }
    public void destroy(){
       b.b(this);
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "1")) {
          return;
       }
       this.e = p0;
       RelativeLayout relativeLayo = m1.f(p0, R.id.live_right_pendant_group_container_view);
       this.g = relativeLayo;
       this.f = relativeLayo;
       LiveRightPendantView liveRightPen = new LiveRightPendantView(p0.getContext());
       this.i = liveRightPen;
       this.f.addView(liveRightPen);
       if (this.e.getHeight() || this.e.getWidth()) {
          this.ik("doBindView");
       }else {
          this.e.getViewTreeObserver().addOnGlobalLayoutListener(this.A);
       }
       return;
    }
    public int e2(View p0,int p1){
       i oi = i.class;
       if (PatchProxy.isSupport(oi)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, oi, "34");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       View view = p0.findViewById(p1);
       if (view == null) {
          return 0;
       }else {
          int top = view.getTop();
          while (true) {
             if (view.getParent() == p0) {
                return top;
             }
             view = view.getParent();
             if (view == null) {
                break ;
             }else {
                top = top + view.getTop();
             }
          }
          return 0;
       }
    }
    public final void e7(a p0,LivePendantContainerPosition p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, i.class, "20")) {
          return;
       }
       if (p1 == LivePendantContainerPosition.TOP && this.C == null) {
          this.C = true;
          p0.s(true);
       }
       if (p1 == LivePendantContainerPosition.BOTTOM && this.D == null) {
          this.D = true;
          p0.s(true);
       }
       if (!PatchProxy.applyVoid(null, p0, a.class, "3")) {
          if (!p0.j()) {
             p0.c = true;
             p0.n();
          }
          p0.onShow();
       }
       if (p0.h() != null) {
          this.p.set(p0.h().ordinal(), true);
       }
       return;
    }
    public void ik(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "19")) {
          return;
       }
       this.q4(100, p0);
       return;
    }
    public void q4(long p0,String p1){
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), p1, this, oi, "22")) {
          return;
       }
       if (this.w != null) {
          b.S(LivePendantLogTag.LIVE_PENDANT.appendTag("LiveRightPendantContainerManager"), "invalidateDelay mIsReleased", "reason", p1);
          return;
       }else {
          oi = this.E;
          if (oi != null && !oi.a()) {
             b.S(LivePendantLogTag.LIVE_PENDANT.appendTag("LiveRightPendantContainerManager"), "invalidateDelay mChoreographer not finished", "reason", p1);
             return;
          }else {
             k1.n(this);
             k1.s(new h(this, p1), this, p0);
             return;
          }
       }
    }
    public final int t1(int p0,int p1){
       View obj;
       i oi = i.class;
       if (PatchProxy.isSupport(oi)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, oi, "42");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       obj = this.e.findViewById(p0);
       if (obj == null) {
          return 0;
       }else {
          this.w(LivePendantContainerPosition.TOP, p0);
          return ((this.e2(this.e, p0) + obj.getHeight()) + p1);
       }
    }
    public final boolean t4(){
       i obj = PatchProxy.apply(null, this, i.class, "56");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.b;
       boolean b = (obj != null && obj.u5() == LiveSceneType.Anchor)? true: false;
       return b;
    }
    public final void w(LivePendantContainerPosition p0,int p1){
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, oi, "32")) {
          return;
       }
       View view = this.e.findViewById(p1);
       if (view == null) {
          return;
       }
       Pair pair = this.y.get(p0.ordinal());
       if (pair != null) {
          if (pair.second.getId() == p1) {
             return;
          }else {
             pair.second.removeOnLayoutChangeListener(pair.first);
          }
       }
       Pair pair1 = new Pair(new i$e(this), view);
       this.y.put(p0.ordinal(), pair1);
       view.addOnLayoutChangeListener(pair1.first);
       return;
    }
    public boolean x4(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       i obj = PatchProxy.apply(objArray, this, i.class, "52");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.q;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.apply(objArray, obj, d0.class, "5");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else if(obj.b() == LivePendantContainerScene.PLAY_CONFIG_PORTRAIT){
          b = 1;
       }else {
          b = 0;
       }
       return (b ^ 1);
    }
    public final int y1(){
       int i;
       Object obj = PatchProxy.apply(null, this, i.class, "45");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       i = this.J2();
       if (i > 0) {
          return ((this.e.getHeight() - i) + a1.e(8.00f));
       }
       return this.N(0x7f0a1b1c, 0);
    }
}
