package com.kuaishou.live.livestage.videopipe.streamer.AnchorSnowEngineStreamer;
import com.kuaishou.live.livestage.videopipe.streamer.SnowEngineStreamer;
import je3.k;
import fe3.d;
import brd.t;
import ke3.b;
import mrd.a;
import ee3.f;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import crd.a;
import te3.b;
import te3.a;
import ve3.d;
import ve3.c;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.live.livestage.utils.CommonUtil;
import brd.z;
import com.kuaishou.live.livestage.videopipe.streamer.AnchorDirectorVideoMixDataFlow$invoke$layoutConfigWithImagePipeData$1;
import com.kuaishou.live.livestage.utils.ReactiveExtensionKt;
import oe3.n;
import msd.q;
import brd.w;
import erd.h;
import kotlin.jvm.internal.Ref$ObjectRef;
import ve3.e;
import java.util.concurrent.TimeUnit;
import ve3.f;
import erd.o;
import ve3.g;
import ve3.h;
import erd.g;
import crd.b;
import krd.a;
import ve3.p;
import ve3.q;
import erd.a;
import crd.c;
import ve3.n;
import xv4.i;
import ve3.m;
import ve3.o;
import android.graphics.Bitmap;
import java.lang.Integer;
import oe3.e;
import java.lang.StringBuilder;
import java.lang.Throwable;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import java.util.HashSet;
import java.util.Iterator;
import java.lang.Iterable;
import fe3.c$b;
import trd.e1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map$Entry;
import te3.a$a;
import ue3.e;
import qrd.r0;
import java.util.List;
import ue3.a;
import pe3.e;
import java.lang.Exception;
import pe3.c;
import pe3.a;
import cw4.b;
import ee3.h0;
import trd.t0;
import ve3.u;
import ve3.s;
import java.lang.Boolean;
import com.kuaishou.live.livestage.basic.LayoutConfig;
import ke3.e;
import ve3.c$a;

public final class AnchorSnowEngineStreamer extends SnowEngineStreamer	// class@000c1e
{
    public a e;
    public final b f;
    public final a g;
    public final d h;
    public final c i;

    public void AnchorSnowEngineStreamer(k p0,d p1,t p2,t p3,t p4,b p5,a p6,f p7){
       Object obj6;
       AnchorSnowEngineStreamer uAnchorSnowE1;
       a uoa2;
       a uoa = this;
       PatchProxyResult obj = p0;
       AnchorDirectorVideoMixDataFlow$invoke$layoutConfigWithImagePipeData$1 obj1 = p1;
       t obj2 = p2;
       Object obj3 = p3;
       AnchorSnowEngineStreamer obj4 = p4;
       z obj5 = p5;
       AnchorSnowEngineStreamer uAnchorSnowE = AnchorSnowEngineStreamer.class;
       a.p(obj, "snow");
       String str = "anchor";
       a.p(obj1, str);
       a.p(obj2, "streamingLayoutConfig");
       String str1 = "directorLayoutExtension";
       a.p(obj3, str1);
       String str2 = "imagePipeData";
       a.p(obj4, str2);
       a.p(obj5, "protoProcessor");
       a.p(p6, "anchorStreamCropLayoutObservable");
       a.p(p7, "serverTimeClock");
       super(p0);
       uoa.e = new a();
       b uob = new b();
       uoa.f = uob;
       a uoa1 = new a();
       uoa.g = uoa1;
       d uod = new d();
       uoa.h = uod;
       uoa.i = new c(obj);
       obj = PatchProxyResult.class;
       int i = 0;
       int i1 = 1;
       int i2 = 2;
       String str3 = "protoProcessor";
       int i3 = 5;
       if (PatchProxy.isSupport(uAnchorSnowE)) {
          Object[] objArray = new Object[i3];
          objArray[i] = obj1;
          objArray[i1] = obj3;
          objArray[i2] = obj2;
          objArray[3] = obj4;
          objArray[4] = obj5;
          if (PatchProxy.applyVoid(objArray, uoa, uAnchorSnowE, "7")) {
             obj6 = p7;
             uAnchorSnowE1 = uAnchorSnowE;
          label_01f1 :
             obj2 = p1;
             obj3 = p6;
             obj4 = uAnchorSnowE1;
             if (!PatchProxy.applyVoidTwoRefs(obj2, obj3, uoa, obj4, "9")) {
                n on = new n(obj2, obj3);
                this.getSnow().p2(on);
                b uob1 = c.c(new m(uoa, on));
                a.o(uob1, "Disposables.fromAction {…server\(rtcObserver\)\n    }");
                a.b(uoa.e, uob1);
             }
             if (!PatchProxy.applyVoidOneRefs(obj6, uoa, obj4, "8")) {
                obj2 = t.interval(null, 30, TimeUnit.SECONDS, CommonUtil.e.a());
                a.o(obj2, "Observable.interval\(0L, …IMMEDIATE_MAIN_SCHEDULER\)");
                a.b(uoa.e, ReactiveExtensionKt.f(obj2, new o(uoa, obj6)));
             }
             return;
          }
       }
       AnchorSnowEngineStreamer e = uoa.e;
       Objects.requireNonNull(uob);
       AnchorSnowEngineStreamer uAnchorSnowE2 = uAnchorSnowE;
       String str4 = "1";
       t ot = PatchProxy.apply(null, uob, b.class, str4);
       String str5 = "_activeStreamId.distinctUntilChanged\(\)";
       if (ot != obj) {
       }else {
          ot = uob.c.distinctUntilChanged();
          a.o(ot, str5);
       }
       Object obj7 = ot;
       Objects.requireNonNull(uoa1);
       String str6 = str1;
       ot = PatchProxy.apply(null, uoa1, a.class, str4);
       if (ot != obj) {
       }else {
          ot = uoa1.c.distinctUntilChanged();
          a.o(ot, str5);
       }
       SnowEngineStreamer obj8 = ot;
       z oz = CommonUtil.e.a();
       Objects.requireNonNull(uod);
       d uod1 = d.class;
       if (PatchProxy.isSupport(uod1)) {
          Object[] objArray1 = new Object[9];
          objArray1[i] = e;
          objArray1[i1] = obj1;
          objArray1[i2] = obj2;
          objArray1[3] = obj4;
          objArray1[4] = obj7;
          objArray1[5] = obj8;
          objArray1[6] = obj3;
          objArray1[7] = obj5;
          objArray1[8] = oz;
          uoa2 = PatchProxy.apply(objArray1, uod, uod1, str4);
          if (uoa2 != obj) {
             obj8 = this;
             obj6 = p7;
             uAnchorSnowE1 = uAnchorSnowE2;
          label_01d0 :
             a.b(obj8.e, ReactiveExtensionKt.f(uoa2, new p(obj8)));
             b uob2 = c.c(new q(obj8));
             a.o(uob2, "Disposables.fromAction {…setDirectorLayout\(\)\n    }");
             a.b(obj8.e, uob2);
             goto label_01f1 ;
          }
       }
       a.p(e, "disposables");
       a.p(obj1, str);
       a.p(obj2, "layoutConfig");
       a.p(obj4, str2);
       a.p(obj7, "activeVideoStream");
       a.p(obj8, "activeImageStream");
       a.p(obj3, str6);
       a.p(obj5, str3);
       a.p(oz, "scheduler");
       AnchorDirectorVideoMixDataFlow$invoke$layoutConfigWithImagePipeData$1 iNSTANCE = AnchorDirectorVideoMixDataFlow$invoke$layoutConfigWithImagePipeData$1.INSTANCE;
       AnchorDirectorVideoMixDataFlow$invoke$layoutConfigWithImagePipeData$1 oinvoke$layo = iNSTANCE;
       obj5 = obj7;
       z oz1 = oz;
       obj1 = iNSTANCE;
       uAnchorSnowE1 = uAnchorSnowE2;
       t ot1 = PatchProxy.applyFourRefs(p2, p4, p3, oinvoke$layo, 0, ReactiveExtensionKt.class, "7");
       if (ot1 != obj) {
       }else {
          a.p(obj2, "lhs");
          a.p(obj4, "rhs");
          a.p(obj3, "ths");
          a.p(obj1, "mapper");
          t ot2 = t.combineLatest(obj2, obj4, obj3, new n(obj1));
          a.o(ot2, "Observable.combineLatest… Maybe\(mapper\(r, s, t\)\) }");
          ot1 = ReactiveExtensionKt.e(ot2);
          a.o(ot1, "Observable.combineLatest…\)\) }\n    .filterNotNull\(\)");
       }
       Ref$ObjectRef objectRef = new Ref$ObjectRef();
       objectRef.element = null;
       uoa2 = a.g();
       a.o(uoa2, "BehaviorSubject.create<T\x20\x02outExtension, Bitmap?>>\(\)\x00");
       obj5 = oz1;
       obj6 = p7;
       f uof = new f(uod, p1, p5, obj5, objectRef);
       b uob3 = t.combineLatest(ot1, obj5, obj8, e.a).distinctUntilChanged().throttleLatest(1, TimeUnit.MILLISECONDS, obj5).switchMap(ot1).subscribe(new g(objectRef, uoa2), h.b);
       a.o(uob3, "Observable.combineLatest…ror.accept\(it\)\n        }\)");
       a.b(e, uob3);
       obj8 = this;
       goto label_01d0 ;
    }
    public final void a(Bitmap p0,int p1){
       AnchorSnowEngineStreamer uAnchorSnowE = AnchorSnowEngineStreamer.class;
       if (PatchProxy.isSupport(uAnchorSnowE) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uAnchorSnowE, "13")) {
          return;
       }
       e.d(e.d, "LiveStage", "[Streamer] "+"director input image "+p0.getWidth()+'x'+p0.getHeight()+", sourceId:"+p1, null, 4, null);
       this.getSnow().q(p0, p1);
       return;
    }
    public final void b(Map p0){
       Iterator iterator;
       ArrayList obj;
       if (PatchProxy.applyVoidOneRefs(p0, this, AnchorSnowEngineStreamer.class, "12")) {
          return;
       }
       AnchorSnowEngineStreamer tg = this.g;
       Set set = p0.keySet();
       Objects.requireNonNull(tg);
       Pair pair = PatchProxy.applyOneRefs(set, tg, a.class, "5");
       if (pair != PatchProxyResult.class) {
       }else {
          a.p(set, "activeStreamId");
          HashSet hashSet = new HashSet();
          iterator = set.iterator();
          while (iterator.hasNext()) {
             obj = iterator.next();
             if (obj instanceof c$b) {
                hashSet.add(obj);
             }
          }
          set = e1.x(tg.a, hashSet);
          tg.a = hashSet;
          obj = new ArrayList();
          Iterator iterator1 = tg.b.entrySet().iterator();
          while (iterator1.hasNext()) {
             Map$Entry uEntry = iterator1.next();
             c$b key = uEntry.getKey();
             a$a value = uEntry.getValue();
             if (hashSet.contains(key) && !value.a()) {
                value.c(true);
                e uoe1 = value.b();
                a.m(uoe1);
                obj.add(uoe1);
             }
             if (set.contains(key)) {
                value.c(false);
             }
          }
          pair = r0.a(set, obj);
       }
       List list = pair.component2();
       iterator = pair.component1().iterator();
       while (iterator.hasNext()) {
          e.d(e.d, "LiveStage", "[Streamer] "+"delete source: "+iterator.next().a(), null, 4, null);
       }
       iterator = list.iterator();
       while (iterator.hasNext()) {
          e uoe = iterator.next();
          Bitmap uBitmap = uoe.b();
          this.a(uBitmap, uoe.a().a());
       }
       return;
    }
    public void onCameraFrame(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AnchorSnowEngineStreamer.class, "5")) {
          return;
       }
       a.p(p0, "frame");
       super.onReceiveCameraFrame(p0);
       return;
    }
    public synchronized void onEndOfInput(e p0,Exception p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, AnchorSnowEngineStreamer.class, "4")) {
          return;
       }
       a.p(p0, "source");
       super.onEndOfInput(p0, p1);
       this.g.a(p0);
       this.f.a(p0);
       return;
    }
    public void onFrame1(c p0){
       this.onFrame1(p0);
    }
    public synchronized void onFrame1(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AnchorSnowEngineStreamer.class, "1")) {
          return;
       }
       a.p(p0, "frame");
       super.onFrame1(p0);
       this.f.b(p0);
       return;
    }
    public synchronized void onFrame2(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AnchorSnowEngineStreamer.class, "2")) {
          return;
       }
       a.p(p0, "frame");
       super.onFrame2(p0);
       this.f.b(p0);
       return;
    }
    public void onFrame2(c p0){
       this.onFrame2(p0);
    }
    public void onFrame3(c p0){
       this.onFrame3(p0);
    }
    public synchronized void onFrame3(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AnchorSnowEngineStreamer.class, "3")) {
          return;
       }
       a.p(p0, "frame");
       super.onFrame3(p0);
       if (this.g.b(p0)) {
          this.a(p0.b(), p0.a().a());
       }
       return;
    }
    public void release(){
       if (PatchProxy.applyVoid(null, this, AnchorSnowEngineStreamer.class, "6")) {
          return;
       }
       this.e.dispose();
       return;
    }
    public final void resetDirectorLayout(){
       if (PatchProxy.applyVoid(null, this, AnchorSnowEngineStreamer.class, "11")) {
          return;
       }
       AnchorSnowEngineStreamer ti = this.i;
       Objects.requireNonNull(ti);
       if (!PatchProxy.applyVoid(null, ti, c.class, "2")) {
          e.d(e.d, "LiveStage", "[Streamer] destroy director layout", null, 4, null);
          ti.a = null;
          ti.d.b0(null);
          ti.a(null);
       }
       this.b(t0.z());
       return;
    }
    public final void updateDirectorLayout(u p0,s p1,Bitmap p2){
       boolean b;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, AnchorSnowEngineStreamer.class, "10")) {
          return;
       }
       AnchorSnowEngineStreamer ti = this.i;
       Objects.requireNonNull(ti);
       c uoc = c.class;
       s obj = PatchProxy.applyTwoRefs(p0, p1, ti, uoc, "1");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          a.p(p1, "directorLayoutExtension");
          if (p0 == null || p0.l().isEmpty()) {
             e.d(e.d, "LiveStage", "[Streamer] director is empty, skip update. WARNING: 推流没有窗口且没有配置静态图，可能会出现无法推流问题", null, 4, null);
          }else if(a.g(ti.a, p0)){
             e.d(e.d, "LiveStage", "[Streamer] director layout the same, skip reload.", null, 4, null);
          }else {
             ti.a = p0;
             ti.d.t(null);
             obj = p1.c;
             if (!PatchProxy.applyVoidTwoRefs(p0, obj, ti, uoc, "4")) {
                int i = (obj != null)? obj.a(p0.m()): 4;
                if (ti.b != i) {
                   e.d(e.d, "LiveStage", "[Streamer] "+"Update VideoMixType = "+i+", current = "+ti.b, null, 4, null);
                   ti.b = i;
                   ti.d.p(i);
                }
             }
             e.d(e.d, "LiveStage", "[Streamer] "+"reload director "+p0, null, 4, null);
             ti.d.b0(p0);
             ti.a(new c$a(p1.b, p0.m()));
             b = true;
          }
          b = false;
       }
       if (!b) {
          return;
       }else {
          a.m(p0);
          this.b(p0.l());
          if (p2 != null) {
             e.d(e.d, "LiveStage", "[Streamer] "+"set default image: "+p2, null, 4, null);
             this.a(p2, 0);
          }
          return;
       }
    }
}
