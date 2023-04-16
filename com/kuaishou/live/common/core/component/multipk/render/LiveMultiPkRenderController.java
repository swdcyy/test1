package com.kuaishou.live.common.core.component.multipk.render.LiveMultiPkRenderController;
import du1.d;
import com.kuaishou.live.viewcontroller.ViewController;
import zs1.b;
import sp5.b;
import ut1.d;
import st1.a;
import ht1.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.multipk.render.LiveMultiPkRenderController$renderViewModel$2;
import com.kuaishou.live.common.core.component.multipk.render.LiveMultiPkRenderController$$special$$inlined$viewModels$1;
import androidx.lifecycle.ViewModelLazy;
import cu1.e;
import java.lang.Class;
import vsd.d;
import nsd.m0;
import com.kuaishou.live.common.core.component.multipk.render.LiveMultiPkRenderController$$special$$inlined$viewModels$2;
import msd.a;
import com.kuaishou.live.common.core.component.multipk.render.LiveMultiPkRenderController$a;
import android.view.MotionEvent;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.basic.debuglog.LiveCommonLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import android.view.View;
import java.util.Objects;
import android.view.ViewGroup;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import hu1.c;
import eu1.a;
import cu1.a;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import cu1.c;
import com.kuaishou.live.common.core.component.multipk.render.LiveMultiPkRenderController$initDataBinding$1;
import msd.p;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import o63.d;
import com.kwai.framework.model.user.UserInfo;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import qrd.p;
import ut1.f;
import ut1.p;
import hu1.b;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import eu1.c;
import com.kuaishou.live.livestage.basic.LayoutConfig;
import fe3.a;
import java.lang.StringBuilder;
import java.util.HashMap;
import java.util.Iterator;
import java.lang.Iterable;
import fe3.e;
import fe3.d;
import java.util.Map;
import java.util.Collection;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.lang.Float;
import ut1.k;
import android.graphics.Rect;
import ut1.l;
import fe3.g;
import eu1.b;
import java.lang.Throwable;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import brd.t;
import java.lang.Integer;
import l02.f;
import ut1.b;
import k2b.e0;
import p63.a;

public final class LiveMultiPkRenderController extends ViewController implements d	// class@001671
{
    public ViewGroup j;
    public c k;
    public a l;
    public c m;
    public final p n;
    public d o;
    public LiveData p;
    public final Observer q;
    public final b r;
    public final d s;
    public b t;
    public final d u;
    public final a v;
    public final a w;

    public void LiveMultiPkRenderController(b p0,d p1,b p2,d p3,a p4,a p5){
       a.p(p0, "pkCoreModel");
       a.p(p1, "pkDelegate");
       a.p(p2, "parentContainerSize");
       a.p(p3, "countDownModel");
       a.p(p4, "logDelegate");
       a.p(p5, "skinManager");
       super();
       this.r = p0;
       this.s = p1;
       this.t = p2;
       this.u = p3;
       this.v = p4;
       this.w = p5;
       this.n = new ViewModelLazy(m0.d(e.class), new LiveMultiPkRenderController$$special$$inlined$viewModels$2(new LiveMultiPkRenderController$$special$$inlined$viewModels$1(this)), new LiveMultiPkRenderController$renderViewModel$2(this));
       this.q = new LiveMultiPkRenderController$a(this);
    }
    public void A(MotionEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMultiPkRenderController.class, "17")) {
          return;
       }
       a.p(p0, "e");
       this.s.A(p0);
       return;
    }
    public void F2(){
       LiveMultiPkRenderController liveMultiPkR = LiveMultiPkRenderController.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, liveMultiPkR, "4")) {
          return;
       }
       b.c0(LiveCommonLogTag.MULTI_PK, "render vc on create", "logParam", this.r.p());
       if (!PatchProxy.applyVoid(objArray, this, liveMultiPkR, "5")) {
          this.Q2(R.layout.arg_RES_7f0d0cc9);
          View view = this.P2();
          Objects.requireNonNull(view, "null cannot be cast to non-null type android.view.ViewGroup");
          this.j = view;
          ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
          Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
          layoutParams.gravity = 1;
          view.setLayoutParams(layoutParams);
       }
       this.Z2();
       if (!PatchProxy.applyVoid(objArray, this, liveMultiPkR, "7")) {
          this.m = new c();
       }
       if (!PatchProxy.applyVoid(objArray, this, liveMultiPkR, "8")) {
          a uoa = new a(this.t, this);
          this.l = uoa;
          uoa.d.observe(this, new a(this));
       }
       if (!PatchProxy.applyVoid(objArray, this, liveMultiPkR, "13")) {
          LiveMultiPkRenderController tj = this.j;
          if (tj == null) {
             a.S("multiPkRenderContainer");
          }
          LiveMultiPkRenderController tm = this.m;
          if (tm == null) {
             a.S("renderModel");
          }
          c uoc = new c(tj, this, tm, this.r, new LiveMultiPkRenderController$initDataBinding$1(this), this.v, this.w);
          this.k = v2;
          e uoe = this.W2();
          if (!PatchProxy.applyVoidOneRefs(uoe, v2, c.class, "1")) {
             a.p(uoe, "viewModel");
             uoe.u0().observeForever(v2.b);
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, liveMultiPkR, "9")) {
          liveMultiPkR = this.m;
          if (liveMultiPkR == null) {
             a.S("renderModel");
          }
          LiveData liveData = Transformations.distinctUntilChanged(liveMultiPkR.b());
          a.h(liveData, "Transformations.distinctUntilChanged\(this\)");
          this.p = liveData;
          if (liveData == null) {
             a.S("renderStyleLiveData");
          }
          liveData.observeForever(this.q);
       }
       return;
    }
    public void J2(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveMultiPkRenderController.class, "14")) {
          return;
       }
       LiveMultiPkRenderController tk = this.k;
       if (tk == null) {
          a.S("dataBinding");
       }
       e uoe = this.W2();
       Objects.requireNonNull(tk);
       if (!PatchProxy.applyVoidOneRefs(uoe, tk, c.class, "9")) {
          a.p(uoe, "viewModel");
          uoe.u0().removeObserver(tk.b);
       }
       tk = this.o;
       if (tk != null) {
          tk.L();
          this.o = objArray;
       }
       tk = this.p;
       if (tk == null) {
          a.S("renderStyleLiveData");
       }
       tk.removeObserver(this.q);
       b.c0(LiveCommonLogTag.MULTI_PK, "render vc on destroy", "logParam", this.r.p());
       return;
    }
    public void N1(UserInfo p0,boolean p1){
       LiveMultiPkRenderController liveMultiPkR = LiveMultiPkRenderController.class;
       if (PatchProxy.isSupport(liveMultiPkR) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, liveMultiPkR, "29")) {
          return;
       }
       a.p(p0, "userInfo");
       this.s.N1(p0, p1);
       return;
    }
    public String R(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveMultiPkRenderController.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.s.R(p0);
    }
    public boolean S(){
       Object obj = PatchProxy.apply(null, this, LiveMultiPkRenderController.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.s.S();
    }
    public void T(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMultiPkRenderController.class, "36")) {
          return;
       }
       a.p(p0, "router");
       this.s.T(p0);
       return;
    }
    public final c V2(){
       LiveMultiPkRenderController obj = PatchProxy.apply(null, this, LiveMultiPkRenderController.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.m;
       if (obj == null) {
          a.S("renderModel");
       }
       return obj;
    }
    public final e W2(){
       Object obj = PatchProxy.apply(null, this, LiveMultiPkRenderController.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.n.getValue();
    }
    public final void X2(){
       MutableLiveData obj1;
       a uoa;
       b a;
       Iterator iterator3;
       HashMap hashMap3;
       Iterator iterator4;
       a obj = this;
       LiveMultiPkRenderController liveMultiPkR = LiveMultiPkRenderController.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, obj, liveMultiPkR, "11")) {
          return;
       }
       if (PatchProxy.applyVoid(objArray, obj, liveMultiPkR, "12")) {
          obj1 = obj;
       }else {
          obj1 = obj.r.l();
          MutableLiveData mutableLiveD = obj.r.o();
          if (obj1.getValue() != null && mutableLiveD.getValue() != null) {
             LiveMultiPkRenderController l = obj.l;
             if (l == null) {
                a.S("layoutDataModel");
             }
             a value = obj1.getValue();
             a.m(value);
             a.o(value, "liveMultiPkInfoModel.value!!");
             Object obj2 = value;
             value = mutableLiveD.getValue();
             a.m(value);
             a.o(value, "liveMultiPkViewConfig.value!!");
             Object obj3 = value;
             Objects.requireNonNull(l);
             value = a.class;
             if (!PatchProxy.applyVoidTwoRefs(obj2, obj3, l, value, "1")) {
                a.p(obj2, "pkInfoModel");
                a.p(obj3, "pkViewConfig");
                a e = l.e;
                if (e == null) {
                   l.a.setValue(new b(CollectionsKt__CollectionsKt.E(), CollectionsKt__CollectionsKt.E(), CollectionsKt__CollectionsKt.E()));
                }else {
                   String obj4 = PatchProxy.applyTwoRefs(obj2, obj3, l, value, "2");
                   if (obj4 != PatchProxyResult.class) {
                      objArray = obj4;
                      uoa = e;
                   }else {
                      obj4 = l.g.d();
                      if (obj4 == null) {
                         obj4 = "";
                      }
                      String str = obj4;
                      LayoutConfig layoutConfig = obj3.a();
                      a uoa1 = (layoutConfig != null)? layoutConfig.d(): objArray;
                      LiveCommonLogTag mULTI_PK = LiveCommonLogTag.MULTI_PK;
                      b.Z(mULTI_PK, "stageSize: "+uoa1+", anchor: "+str);
                      if (uoa1 == null || uoa1.d() <= 0) {
                         uoa = e;
                         b.B(mULTI_PK, "stageSize is invalid");
                      }else {
                         b uob = new b(uoa1.d(), uoa1.c());
                         a = l.f.a;
                         float f = (float)a / (float)uob.a;
                         b uob1 = new b(a, (int)((float)uob.b * f));
                         HashMap hashMap = new HashMap();
                         Iterator iterator = layoutConfig.e().iterator();
                         while (iterator.hasNext()) {
                            e uoe = iterator.next();
                            d uod = uoe.h();
                            if (uod != null) {
                               String str1 = uod.b();
                               if (str1 != null) {
                                  hashMap.put(str1, uoe);
                               }
                            }
                         }
                         HashMap hashMap1 = new HashMap();
                         HashMap hashMap2 = new HashMap();
                         List list2 = CollectionsKt___CollectionsKt.G5(obj2.l().values());
                         if (PatchProxy.isSupport(value)) {
                            Object[] objArray1 = new Object[]{hashMap1,hashMap2,hashMap,list2,Float.valueOf(f)};
                            if (PatchProxy.applyVoid(objArray1, l, value, "3")) {
                            }
                         }
                         Iterator iterator1 = list2.iterator();
                         while (iterator1.hasNext()) {
                            k ok = iterator1.next();
                            Rect rect = new Rect();
                            Iterator iterator2 = ok.f().values().iterator();
                            while (iterator2.hasNext()) {
                               UserInfo mId = iterator2.next().c().mId;
                               e uoe1 = hashMap.get(mId);
                               if (uoe1 != null) {
                                  g og = uoe1.e();
                                  if (og != null) {
                                     iterator3 = iterator1;
                                     hashMap3 = hashMap;
                                     float f1 = (float)og.c() * f;
                                     iterator4 = iterator2;
                                     float f2 = (float)og.d() * f;
                                     int i1 = og.b() + og.c();
                                     float f3 = (float)i1 * f;
                                     uoa = e;
                                     int i2 = og.a() + og.d();
                                     float f4 = (float)i2 * f;
                                     Rect rect1 = new Rect((int)f1, (int)f2, (int)f3, (int)f4);
                                     a.o(mId, "userId");
                                     hashMap2.put(mId, rect1);
                                     rect.union(rect1);
                                     b.Z(LiveCommonLogTag.MULTI_PK, "mergeRect: "+rect);
                                  label_0223 :
                                     iterator1 = iterator3;
                                     hashMap = hashMap3;
                                     iterator2 = iterator4;
                                     e = uoa;
                                  }
                               }
                               iterator3 = iterator1;
                               hashMap3 = hashMap;
                               uoa = e;
                               iterator4 = iterator2;
                               b.Z(LiveCommonLogTag.MULTI_PK, "mergedRectError userId:"+mId+" can not get interactiveChatWindow");
                               goto label_0223 ;
                            }
                            hashMap1.put(ok.e(), rect);
                            b.Z(LiveCommonLogTag.MULTI_PK, "mergedRect: "+rect+" teamId: "+ok.e());
                            iterator1 = iterator1;
                            hashMap = hashMap;
                         }
                         uoa = e;
                         c uoc = new c(str, l.g.e(), uob1, hashMap1, hashMap2, obj2, obj3);
                      }
                   }
                   if (objArray != null) {
                      b.Z(LiveCommonLogTag.MULTI_PK, "liveMultiPkUIInfo: "+objArray.toString());
                      l.c.setValue(objArray);
                      obj = uoa;
                      List list = obj.b(objArray);
                      List list1 = obj.d(objArray);
                      l.a.setValue(new b(list, list1, obj.c(objArray)));
                   }
                }
             }
             int i = this;
          }else {
             b.H(LiveCommonLogTag.MULTI_PK, "startRender data error", "logParam", this.r.p(), objArray);
          }
       }
       return;
    }
    public final void Y2(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMultiPkRenderController.class, "16")) {
          return;
       }
       a.p(p0, "size");
       b.d0(LiveCommonLogTag.MULTI_PK, "setParentContainerSize", "size", p0, "logParam", this.r.p());
       this.t = p0;
       LiveMultiPkRenderController tl = this.l;
       if (tl != null) {
          if (tl == null) {
             a.S("layoutDataModel");
          }
          LiveMultiPkRenderController tt = this.t;
          Objects.requireNonNull(tl);
          if (!PatchProxy.applyVoidOneRefs(tt, tl, a.class, "4")) {
             a.p(tt, "size");
             tl.f = tt;
          }
       }
       this.Z2();
       this.X2();
       return;
    }
    public final void Z2(){
       b a;
       if (PatchProxy.applyVoid(null, this, LiveMultiPkRenderController.class, "6")) {
          return;
       }
       LiveMultiPkRenderController tj = this.j;
       if (tj == null) {
          a.S("multiPkRenderContainer");
       }
       ViewGroup$LayoutParams layoutParams = tj.getLayoutParams();
       Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
       LiveMultiPkRenderController tt = this.t;
       a = tt.a;
       if (a > null) {
          b b = tt.b;
          if (b > null) {
             layoutParams.width = a;
             layoutParams.height = b;
          }
       }
       tj.setLayoutParams(layoutParams);
       return;
    }
    public ClientContent$LiveStreamPackage a(){
       Object obj = PatchProxy.apply(null, this, LiveMultiPkRenderController.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.s.a();
    }
    public void a1(){
       if (PatchProxy.applyVoid(null, this, LiveMultiPkRenderController.class, "35")) {
          return;
       }
       this.s.a1();
       return;
    }
    public t a2(){
       Object obj = PatchProxy.apply(null, this, LiveMultiPkRenderController.class, "37");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.s.a2();
    }
    public void b1(String p0,int p1,boolean p2){
       if (PatchProxy.isSupport(LiveMultiPkRenderController.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Boolean.valueOf(p2), this, LiveMultiPkRenderController.class, "18")) {
          return;
       }
       this.s.b1(p0, p1, p2);
       return;
    }
    public void c1(UserInfo p0,int p1){
       LiveMultiPkRenderController liveMultiPkR = LiveMultiPkRenderController.class;
       if (PatchProxy.isSupport(liveMultiPkR) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, liveMultiPkR, "34")) {
          return;
       }
       a.p(p0, "userInfo");
       this.s.c1(p0, p1);
       return;
    }
    public String d(){
       Object obj = PatchProxy.apply(null, this, LiveMultiPkRenderController.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.s.d();
    }
    public void d1(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMultiPkRenderController.class, "38")) {
          return;
       }
       a.p(p0, "listener");
       this.s.d1(p0);
       return;
    }
    public boolean e(){
       Object obj = PatchProxy.apply(null, this, LiveMultiPkRenderController.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.s.e();
    }
    public void e1(){
       if (PatchProxy.applyVoid(null, this, LiveMultiPkRenderController.class, "31")) {
          return;
       }
       this.s.e1();
       return;
    }
    public void f1(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMultiPkRenderController.class, "32")) {
          return;
       }
       a.p(p0, "wishListType");
       this.s.f1(p0);
       return;
    }
    public void g1(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMultiPkRenderController.class, "33")) {
          return;
       }
       a.p(p0, "listener");
       this.s.g1(p0);
       return;
    }
    public String getLiveStreamId(){
       Object obj = PatchProxy.apply(null, this, LiveMultiPkRenderController.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.s.getLiveStreamId();
    }
    public b h1(boolean p0,boolean p1){
       LiveMultiPkRenderController liveMultiPkR = LiveMultiPkRenderController.class;
       if (PatchProxy.isSupport(liveMultiPkR)) {
          Object obj = PatchProxy.applyTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, liveMultiPkR, "20");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.s.h1(p0, p1);
    }
    public e0 i(){
       Object obj = PatchProxy.apply(null, this, LiveMultiPkRenderController.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.s.i();
    }
    public void i1(){
       if (PatchProxy.applyVoid(null, this, LiveMultiPkRenderController.class, "28")) {
          return;
       }
       this.s.i1();
       return;
    }
    public String j1(){
       Object obj = PatchProxy.apply(null, this, LiveMultiPkRenderController.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.s.j1();
    }
    public void k1(UserInfo p0,boolean p1){
       LiveMultiPkRenderController liveMultiPkR = LiveMultiPkRenderController.class;
       if (PatchProxy.isSupport(liveMultiPkR) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, liveMultiPkR, "30")) {
          return;
       }
       a.p(p0, "userInfo");
       this.s.k1(p0, p1);
       return;
    }
    public d r1(a p0){
       LiveMultiPkRenderController obj = PatchProxy.applyOneRefs(p0, this, LiveMultiPkRenderController.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "param");
       obj = this.o;
       if (obj != null) {
          obj.L();
          this.o = null;
       }
       d uod = this.s.r1(p0);
       this.o = uod;
       return uod;
    }
}
