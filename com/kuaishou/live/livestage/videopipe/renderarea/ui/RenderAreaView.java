package com.kuaishou.live.livestage.videopipe.renderarea.ui.RenderAreaView;
import re3.c;
import re3.f;
import com.kuaishou.live.livestage.videopipe.base.VideoSink4;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.util.AttributeSet;
import com.kuaishou.live.livestage.ScaleType;
import mrd.a;
import com.kuaishou.live.livestage.VideoRenderMode;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.view.View;
import ag6.a;
import com.kuaishou.live.livestage.videopipe.renderarea.ui.VideoContainerLayout;
import com.kuaishou.live.livestage.videopipe.renderarea.ui.ImageRenderRecyclerView;
import androidx.recyclerview.widget.RecyclerView;
import com.kuaishou.live.livestage.videopipe.renderarea.ui.RenderAreaView$a;
import android.os.Handler;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.livestage.utils.CommonUtil;
import com.kuaishou.live.livestage.basic.LayoutConfig;
import re3.j;
import re3.d;
import msd.l;
import re3.e;
import pe3.e;
import java.lang.Exception;
import oe3.e;
import java.lang.StringBuilder;
import java.lang.Throwable;
import com.kuaishou.live.livestage.videopipe.renderarea.VideoRenderDataFlow;
import re3.o;
import ue3.c;
import crd.b;
import pe3.a;
import ue3.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import fe3.f;
import java.util.Set;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.kuaishou.live.livestage.videopipe.renderarea.ImageRenderDataFlow;
import te3.a;
import pe3.c;
import fe3.c;
import ue3.e;
import oe3.c;
import re3.c$a;
import wsd.m;
import androidx.core.view.ViewGroupKt;
import androidx.core.view.ViewGroupKt$a;
import kotlin.text.StringsKt__IndentKt;
import android.view.View$OnLayoutChangeListener;
import crd.a;
import oe3.i;
import java.lang.Boolean;
import java.util.List;
import je3.a;
import com.kuaishou.live.livestage.RenderType;
import re3.o$a;
import trd.u;
import java.util.Collection;
import se3.n;
import re3.l;
import java.util.Objects;
import se3.o;
import se3.d;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import se3.f;
import se3.f$b;
import oe3.h;
import je3.n;
import re3.c$b;
import com.kuaishou.live.livestage.videopipe.renderarea.ui.RenderAreaView$setup$renderLayoutFlow$1;
import com.kuaishou.live.livestage.videopipe.renderarea.ui.RenderAreaView$setup$renderLayoutFlow$2;
import msd.a;
import brd.t;
import ee3.h0;
import se3.p;
import oe3.f;
import com.kuaishou.live.livestage.videopipe.renderarea.ui.RenderAreaView$setup$3;
import ee3.z;
import re3.k;
import com.kuaishou.live.livestage.videopipe.renderarea.ui.RenderAreaView$setup$4;
import re3.m;
import brd.w;
import erd.c;
import re3.n;
import erd.g;
import com.kuaishou.live.livestage.utils.ReactiveExtensionKt;
import se3.k;
import se3.l;
import se3.m;
import kotlin.jvm.internal.Ref$ObjectRef;
import re3.g;
import krd.a;
import re3.h;
import re3.i;
import pe3.d;
import java.lang.IllegalStateException;

public final class RenderAreaView extends ConstraintLayout implements c, f, VideoSink4	// class@000c16
{
    public final VideoContainerLayout B;
    public final ImageRenderRecyclerView C;
    public final RecyclerView D;
    public final ConstraintLayout E;
    public a F;
    public j G;
    public i H;
    public ImageRenderDataFlow I;
    public d J;
    public VideoRenderDataFlow K;
    public l L;
    public f M;
    public n N;
    public final a O;
    public VideoRenderMode P;
    public ScaleType Q;
    public d R;
    public e S;
    public l T;
    public l U;
    public final View$OnLayoutChangeListener V;

    public void RenderAreaView(Context p0){
       a.p(p0, "context");
       super(p0, null, 0);
       ScaleType cENTER_INSID = ScaleType.CENTER_INSIDE;
       a uoa = a.h(cENTER_INSID);
       a.o(uoa, "BehaviorSubject.createDe¡­\(ScaleType.CENTER_INSIDE\)");
       this.O = uoa;
       this.P = VideoRenderMode.ALWAYS;
       a.c(LayoutInflater.from(this.getContext()), R.layout.arg_RES_7f0d0de3, this, true);
       View view = this.findViewById(R.id.live_stage_render_area_video_container);
       a.o(view, "findViewById\(R.id.live_s¡­der_area_video_container\)");
       this.B = view;
       View view1 = this.findViewById(R.id.live_stage_render_area_image_recycler_view);
       a.o(view1, "findViewById\(R.id.live_s¡­area_image_recycler_view\)");
       this.C = view1;
       View view2 = this.findViewById(R.id.live_stage_render_area_overlay_recycler_view);
       a.o(view2, "findViewById\(R.id.live_s¡­ea_overlay_recycler_view\)");
       this.D = view2;
       view2 = this.findViewById(R.id.live_stage_render_area_overlay_container);
       a.o(view2, "findViewById\(R.id.live_s¡­r_area_overlay_container\)");
       this.E = view2;
       view1.y(view);
       this.Q = cENTER_INSID;
       this.V = new RenderAreaView$a(this);
    }
    public void RenderAreaView(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1, 0);
       ScaleType cENTER_INSID = ScaleType.CENTER_INSIDE;
       a uoa = a.h(cENTER_INSID);
       a.o(uoa, "BehaviorSubject.createDe¡­\(ScaleType.CENTER_INSIDE\)");
       this.O = uoa;
       this.P = VideoRenderMode.ALWAYS;
       a.c(LayoutInflater.from(this.getContext()), R.layout.arg_RES_7f0d0de3, this, true);
       View view = this.findViewById(R.id.live_stage_render_area_video_container);
       a.o(view, "findViewById\(R.id.live_s¡­der_area_video_container\)");
       this.B = view;
       View view1 = this.findViewById(R.id.live_stage_render_area_image_recycler_view);
       a.o(view1, "findViewById\(R.id.live_s¡­area_image_recycler_view\)");
       this.C = view1;
       View view2 = this.findViewById(R.id.live_stage_render_area_overlay_recycler_view);
       a.o(view2, "findViewById\(R.id.live_s¡­ea_overlay_recycler_view\)");
       this.D = view2;
       view2 = this.findViewById(R.id.live_stage_render_area_overlay_container);
       a.o(view2, "findViewById\(R.id.live_s¡­r_area_overlay_container\)");
       this.E = view2;
       view1.y(view);
       this.Q = cENTER_INSID;
       this.V = new RenderAreaView$a(this);
    }
    public void RenderAreaView(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       ScaleType cENTER_INSID = ScaleType.CENTER_INSIDE;
       a uoa = a.h(cENTER_INSID);
       a.o(uoa, "BehaviorSubject.createDe¡­\(ScaleType.CENTER_INSIDE\)");
       this.O = uoa;
       this.P = VideoRenderMode.ALWAYS;
       a.c(LayoutInflater.from(this.getContext()), R.layout.arg_RES_7f0d0de3, this, true);
       View view = this.findViewById(R.id.live_stage_render_area_video_container);
       a.o(view, "findViewById\(R.id.live_s¡­der_area_video_container\)");
       this.B = view;
       View view1 = this.findViewById(R.id.live_stage_render_area_image_recycler_view);
       a.o(view1, "findViewById\(R.id.live_s¡­area_image_recycler_view\)");
       this.C = view1;
       View view2 = this.findViewById(R.id.live_stage_render_area_overlay_recycler_view);
       a.o(view2, "findViewById\(R.id.live_s¡­ea_overlay_recycler_view\)");
       this.D = view2;
       view2 = this.findViewById(R.id.live_stage_render_area_overlay_container);
       a.o(view2, "findViewById\(R.id.live_s¡­r_area_overlay_container\)");
       this.E = view2;
       view1.y(view);
       this.Q = cENTER_INSID;
       this.V = new RenderAreaView$a(this);
    }
    public Handler createDataDispatcher(){
       Object obj = PatchProxy.apply(null, this, RenderAreaView.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return CommonUtil.e.c();
    }
    public LayoutConfig getLatestLayout(){
       Object[] objArray = null;
       RenderAreaView obj = PatchProxy.apply(objArray, this, RenderAreaView.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.G;
       if (obj != null) {
          a uoa = obj.a();
          if (uoa != null) {
             objArray = uoa.i();
          }
       }
       return objArray;
    }
    public d getLayoutInterceptor(){
       return this.R;
    }
    public ConstraintLayout getOverlayContainer(){
       return this.E;
    }
    public RecyclerView getOverlayRecyclerView(){
       return this.D;
    }
    public l getPlayerViewPositionObserver(){
       return this.T;
    }
    public l getPlayerViewVisibilityObserver(){
       return this.U;
    }
    public e getPositionCalculator(){
       return this.S;
    }
    public final ScaleType getScaleType(){
       return this.Q;
    }
    public void onEndOfInput(e p0,Exception p1){
       Object obj = this;
       Object obj1 = p0;
       if (PatchProxy.applyVoidTwoRefs(obj1, p1, obj, RenderAreaView.class, "16")) {
          return;
       }
       String str = "source";
       a.p(obj1, str);
       e d = e.d;
       e.d(d, "LiveStage", "[Render] "+obj1+" is EndOfInput", null, 4, null);
       if (obj.K == null) {
          e.d(d, "LiveStage", "[Render] [WARN] dataFlow is null, skip EndOfInput", null, 4, null);
       }
       if (obj.I == null) {
          e.d(d, "LiveStage", "[Render] [WARN] dataFlow is null, skip EndOfInput", null, 4, null);
       }
       RenderAreaView k = obj.K;
       if (k != null) {
          VideoRenderDataFlow videoRenderD = VideoRenderDataFlow.class;
          if (!PatchProxy.applyVoidOneRefs(obj1, k, videoRenderD, "5")) {
             a.p(obj1, str);
             VideoRenderDataFlow i = k.i;
             ArrayList obj2 = null;
             e uoe = (i != null)? i.d(): obj2;
             if (a.g(obj1, uoe)) {
             label_0096 :
                VideoRenderDataFlow.g(k, k.i, false, 2, obj2);
                i = k.n;
                if (i != null) {
                   i.dispose();
                }
                k.n = obj2;
                k.i = obj2;
                k.c = obj2;
             }else {
                i = k.c;
                uoe = (i != null)? i.getSource(): obj2;
                if (a.g(obj1, uoe)) {
                   goto label_0096 ;
                }else {
                   i = k.d;
                   uoe = (i != null)? i.getSource(): obj2;
                   if (a.g(obj1, uoe)) {
                      k.d = obj2;
                   }else {
                      i = k.e;
                      uoe = (i != null)? i.getSource(): obj2;
                      if (a.g(obj1, uoe)) {
                         k.e = obj2;
                      }
                   }
                }
             }
             obj2 = new ArrayList();
             Iterator iterator = k.h.iterator();
             while (iterator.hasNext()) {
                Object obj3 = iterator.next();
                if (a.g(obj3.d(), obj1)) {
                   obj2.add(obj3);
                }
             }
             iterator = obj2.iterator();
             while (iterator.hasNext()) {
                o oo = iterator.next();
                oo.i();
                f uof = oo.f();
                if (!PatchProxy.applyVoidOneRefs(uof, k, videoRenderD, "18") && k.a.remove(uof)) {
                   e.d(e.d, "LiveStage", "[Render] "+"stop render window "+uof+", windowHasFrame:"+k.a, null, 4, null);
                   k.b.onNext(CollectionsKt___CollectionsKt.L5(k.a));
                }
             }
          }
       }
       k = obj.I;
       if (k != null && !PatchProxy.applyVoidOneRefs(obj1, k, ImageRenderDataFlow.class, "3")) {
          a.p(obj1, str);
          k.d.a(obj1);
          k.a();
       }
       return;
    }
    public void onFrame1(c p0){
       this.onFrame1(p0);
    }
    public void onFrame1(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RenderAreaView.class, "12")) {
          return;
       }
       String str = "frame";
       a.p(p0, str);
       if (this.K == null) {
          e.d(e.d, "LiveStage", "[Render] [WARN] dataFlow is null, skip frame", null, 4, null);
       }
       RenderAreaView tK = this.K;
       if (tK != null && !PatchProxy.applyVoidOneRefs(p0, tK, VideoRenderDataFlow.class, "2")) {
          a.p(p0, str);
          o oo = tK.i(p0);
          if (oo != null) {
             tK.d(oo, p0);
          }else {
             tK.c = p0;
             e.d(e.d, "LiveStage", "[Render] "+"NO WINDOW FOR PLAYER VIDEO "+p0.getStreamId(), null, 4, null);
          }
       }
       return;
    }
    public void onFrame2(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RenderAreaView.class, "13")) {
          return;
       }
       String str = "frame";
       a.p(p0, str);
       if (this.K == null) {
          e.d(e.d, "LiveStage", "[Render] [WARN] dataFlow is null, skip ByteBufferVideoFrame", null, 4, null);
       }
       RenderAreaView tK = this.K;
       if (tK != null && !PatchProxy.applyVoidOneRefs(p0, tK, VideoRenderDataFlow.class, "3")) {
          a.p(p0, str);
          o oo = tK.i(p0);
          if (oo != null) {
             tK.b(oo, p0);
          }else {
             tK.d = p0;
             e.d(e.d, "LiveStage", "[Render] "+"NO WINDOW FOR RTC/Arya VIDEO "+p0.getStreamId(), null, 4, null);
          }
       }
       return;
    }
    public void onFrame2(c p0){
       this.onFrame2(p0);
    }
    public void onFrame3(c p0){
       this.onFrame3(p0);
    }
    public void onFrame3(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RenderAreaView.class, "14")) {
          return;
       }
       String str = "frame";
       a.p(p0, str);
       if (this.K == null) {
          e.d(e.d, "LiveStage", "[Render] [WARN] dataFlow is null, skip CameraVideoFrame", null, 4, null);
       }
       RenderAreaView tK = this.K;
       if (tK != null && !PatchProxy.applyVoidOneRefs(p0, tK, VideoRenderDataFlow.class, "4")) {
          a.p(p0, str);
          o oo = tK.i(p0);
          if (oo != null) {
             tK.c(oo, p0);
          }else {
             tK.e = p0;
             e.d(e.d, "LiveStage", "[Render] "+"NO WINDOW FOR Camera VIDEO "+p0.getStreamId(), null, 4, null);
          }
       }
       return;
    }
    public void onFrame4(c p0){
       this.onFrame4(p0);
    }
    public void onFrame4(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RenderAreaView.class, "15")) {
          return;
       }
       a.p(p0, "frame");
       if (this.I == null) {
          e.d(e.d, "LiveStage", "[Render] [WARN] dataFlow is null, skip ImageVideoFrame", null, 4, null);
       }
       RenderAreaView tI = this.I;
       if (tI != null && !PatchProxy.applyVoidOneRefs(p0, tI, ImageRenderDataFlow.class, "1")) {
          a.p(p0, "imageVideoFrame");
          tI.d.b(p0);
          tI.a();
       }
       return;
    }
    public c$a release(c p0){
       n on;
       ArrayList obj2;
       c obj3;
       VideoRenderDataFlow l;
       i oi = this;
       StringBuilder obj = p0;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       StringBuilder obj1 = PatchProxy.applyOneRefs(obj, oi, RenderAreaView.class, "11");
       if (obj1 != patchProxyRe) {
          return obj1;
       }
       a.p(obj, "internalOnly");
       e d = e.d;
       obj1 = "[Render] ";
       obj = obj1;
       StringBuilder str = "\n        | release renderAreaView\n        | "+oi+" ,\n        |  videoContainerChild=";
       StringBuilder str1 = "";
       Iterator iterator = ViewGroupKt.b(oi.B).iterator();
       while (iterator.hasNext()) {
          str1 = str1+iterator.next().toString()+",";
          a.o(str1, "builder.append\(view.toString\(\)\).append\(\",\"\)");
       }
       e.d(d, "LiveStage", obj+StringsKt__IndentKt.r(str+str1+"\n        |", null, 1, null), null, 4, null);
       oi.setPlayerViewPositionObserver(null);
       oi.setPlayerViewVisibilityObserver(null);
       oi.removeOnLayoutChangeListener(oi.V);
       RenderAreaView f = oi.F;
       if (f != null) {
          f.dispose();
       }
       f = oi.H;
       a.m(f);
       f.b();
       oi.H = null;
       f = oi.G;
       String str2 = "3";
       if (f != null && !PatchProxy.applyVoid(null, f, j.class, str2)) {
          f.a.d();
       }
       oi.G = null;
       f = oi.K;
       if (f != null) {
          VideoRenderDataFlow videoRenderD = VideoRenderDataFlow.class;
          if (PatchProxy.isSupport(videoRenderD)) {
             on = PatchProxy.applyOneRefs(Boolean.TRUE, f, videoRenderD, "6");
             if (on != patchProxyRe) {
             }
          }
          ArrayList uArrayList = new ArrayList();
          Iterator iterator1 = CollectionsKt___CollectionsKt.G5(f.h).iterator();
          boolean b1 = false;
          while (iterator1.hasNext()) {
             obj2 = iterator1.next();
             obj3 = obj2;
             if (obj3.c() != null && obj3.b() != null) {
                b1 = true;
             }
             if (b1) {
                uArrayList.add(obj2);
             }
          }
          ArrayList uArrayList1 = new ArrayList();
          iterator = uArrayList.iterator();
          while (iterator.hasNext()) {
             obj3 = iterator.next();
             if (f.a.contains(obj3.f())) {
                uArrayList1.add(obj3);
             }
          }
          obj2 = new ArrayList();
          iterator1 = uArrayList1.iterator();
          while (iterator1.hasNext()) {
             obj3 = iterator1.next().e();
             if (obj3 != null) {
                obj2.add(obj3);
             }
          }
          Set set = CollectionsKt___CollectionsKt.L5(obj2);
          VideoRenderDataFlow i = f.i;
          o$a uoa = (i != null)? i.a(): null;
          ArrayList uArrayList2 = new ArrayList(u.Y(uArrayList, 10));
          Iterator iterator2 = uArrayList.iterator();
          while (iterator2.hasNext()) {
             uArrayList2.add(iterator2.next().a());
          }
          n on1 = new n(set, uoa, CollectionsKt___CollectionsKt.J5(uArrayList2));
          l = f.l;
          if (l != null) {
             l.dispose();
          }
          f.l = null;
          l = f.n;
          if (l != null) {
             l.dispose();
          }
          f.n = null;
          f.f(f.i, b1);
          f.i = null;
          iterator1 = CollectionsKt___CollectionsKt.G5(f.h).iterator();
          while (iterator1.hasNext()) {
             f.f(iterator1.next(), b1);
          }
          f.h.clear();
          f.f = null;
          f.c = null;
          f.e = null;
          f.d = null;
          f.a.clear();
          obj1 = f;
          e.d(e.d, "LiveStage", obj1+obj1+" clear then persist state "+on1+' ', null, 4, null);
          on = on1;
       }else {
          on = null;
       }
       oi.K = null;
       f = oi.L;
       if (f != null && !PatchProxy.applyVoid(null, f, l.class, "2")) {
          f.a.dispose();
       }
       oi.L = null;
       f = oi.B;
       Objects.requireNonNull(f);
       if (!PatchProxy.applyVoid(null, f, VideoContainerLayout.class, str2)) {
          e.d(e.d, "LiveStage", "[Render] clear", null, 4, null);
          VideoContainerLayout b = f.B;
          if (b != null) {
             b.clear();
          }
       }
       oi.B.setVideoContainerPlayerViewVisibilityDelegate$centaur_release(null);
       f = oi.J;
       String str3 = "1";
       if (f != null && !PatchProxy.applyVoid(null, f, d.class, str3)) {
          f.b.dispose();
          f.d.setAdapter(null);
          f.d.setLayoutManager(null);
       }
       oi.J = null;
       f = oi.I;
       if (f != null && !PatchProxy.applyVoid(null, f, ImageRenderDataFlow.class, "4")) {
          f.c.dispose();
       }
       oi.I = null;
       f = oi.M;
       if (f != null && !PatchProxy.applyVoid(null, f, f.class, str3)) {
          f.c.setAdapter(null);
          f.a.e(null);
          f.b.dispose();
       }
       oi.M = null;
       this.getOverlayContainer().removeAllViews();
       oi.F = null;
       return on;
    }
    public void setLayoutInterceptor(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RenderAreaView.class, "3")) {
          return;
       }
       e.d(e.d, "LiveStage", "[Render] "+"layoutInterceptor="+p0, null, 4, null);
       this.R = p0;
       RenderAreaView tG = this.G;
       if (tG != null && !PatchProxy.applyVoidOneRefs(p0, tG, j.class, "1")) {
          tG.c = p0;
          tG.e.onNext(new h(p0));
       }
       return;
    }
    public void setPlayerViewPositionObserver(l p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RenderAreaView.class, "5")) {
          return;
       }
       e.d(e.d, "LiveStage", "[Render] "+"playerViewPositionObserver="+p0, null, 4, null);
       this.T = p0;
       RenderAreaView tN = this.N;
       if (tN != null) {
          tN.b(p0);
       }
       return;
    }
    public void setPlayerViewVisibilityObserver(l p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RenderAreaView.class, "6")) {
          return;
       }
       e.d(e.d, "LiveStage", "[Render] "+"playerViewVisibilityObserver="+p0, null, 4, null);
       this.U = p0;
       RenderAreaView tN = this.N;
       if (tN != null) {
          tN.d(p0);
       }
       return;
    }
    public void setPositionCalculator(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RenderAreaView.class, "4")) {
          return;
       }
       e.d(e.d, "LiveStage", "[Render] "+"positionCalculator="+p0, null, 4, null);
       this.S = p0;
       return;
    }
    public final void setScaleType(ScaleType p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RenderAreaView.class, "2")) {
          return;
       }
       a.p(p0, "value");
       this.Q = p0;
       this.O.onNext(p0);
       return;
    }
    public void setup(c$b p0){
       c$b e;
       a uoa = this;
       Object obj = p0;
       if (PatchProxy.applyVoidOneRefs(obj, uoa, RenderAreaView.class, "7")) {
          return;
       }
       a.p(obj, "param");
       e.d(e.d, "LiveStage", "[Render] "+"setup "+uoa, null, 4, null);
       a uoa1 = (uoa.F == null)? 1: null;
       if (uoa1) {
          uoa.F = new a();
          uoa.H = p0.b();
          uoa.P = obj.i;
          uoa.N = p0.a();
          p0.a().b(this.getPlayerViewPositionObserver());
          p0.a().d(this.getPlayerViewVisibilityObserver());
          j oj = new j(uoa, new RenderAreaView$setup$renderLayoutFlow$1(uoa), new RenderAreaView$setup$renderLayoutFlow$2(uoa), this.getLayoutInterceptor());
          uoa.G = oj;
          uoa.I = new ImageRenderDataFlow(oj.a(), obj.f);
          RenderAreaView i = uoa.I;
          a.m(i);
          uoa.J = new d(oj.a(), i.b, uoa.C, p0.d());
          a uoa2 = oj.a();
          e = obj.e;
          c$b b = obj.b;
          Object obj1 = null;
          if (!b instanceof n) {
             b = obj1;
          }
          VideoRenderDataFlow videoRenderD = new VideoRenderDataFlow(uoa2, e, b);
          uoa.K = videoRenderD;
          a.m(videoRenderD);
          p op = new p(obj.a.b, obj.j, videoRenderD, oj.a(), new RenderAreaView$setup$3(uoa));
          uoa.B.setVideoContainerPlayerViewVisibilityDelegate$centaur_release(e);
          RenderAreaView k = uoa.K;
          a.m(k);
          VideoRenderDataFlow o = k.o;
          a.o(o, "this.videoRenderDataFlow¡­.windowHasFrameObservable");
          i = uoa.K;
          a.m(i);
          VideoRenderDataFlow p = i.p;
          a.o(p, "this.videoRenderDataFlow!!.videoRendersObservable");
          o videoContain = uoa.B.getVideoContainerPlayerViewVisibilityDelegate$centaur_release();
          a.m(videoContain);
          l ol = new l(uoa.B, p0.a(), p0.d(), oj.a(), o, p, obj.k, videoContain.e());
          uoa.L = uoa2;
          RenderAreaView k1 = uoa.K;
          a.m(k1);
          RenderAreaView$setup$4 osetup$4 = new RenderAreaView$setup$4(uoa);
          Objects.requireNonNull(k1);
          if (!PatchProxy.applyVoidOneRefs(osetup$4, k1, VideoRenderDataFlow.class, "1")) {
             a.p(osetup$4, "onNewRenderCreated");
             k1.g = osetup$4;
             t ot2 = t.combineLatest(k1.q, k1.j, m.a);
             a.o(ot2, "Observable.combineLatest¡­ layoutConfig to player }");
             k1.l = ReactiveExtensionKt.f(ot2, new n(k1));
          }
          uoa.M = new f(this.getOverlayRecyclerView(), oj.a());
          t ot = p0.c();
          if (!PatchProxy.applyVoidOneRefs(ot, uoa, RenderAreaView.class, "8")) {
             ReactiveExtensionKt.f(ot, new k(uoa));
          }
          uoa2 = oj.a();
          if (!PatchProxy.applyVoidOneRefs(uoa2, uoa, RenderAreaView.class, "10")) {
             ot = t.combineLatest(uoa2, uoa.O, l.a);
             a.o(ot, "Observable.combineLatest¡­\) { l, s -> l.size to s }");
             ReactiveExtensionKt.f(ot, new m(uoa));
          }
          uoa.addOnLayoutChangeListener(uoa.V);
          ot = ReactiveExtensionKt.e(p0.c());
          a.o(ot, "param.renderLayout.filterNotNull\(\)");
          if (!PatchProxy.applyVoidOneRefs(ot, oj, j.class, "2")) {
             a.p(ot, "renderLayout");
             Ref$ObjectRef objectRef = new Ref$ObjectRef();
             objectRef.element = obj1;
             a.b(oj.a, ReactiveExtensionKt.f(ot, new g(oj, objectRef)));
             t ot1 = t.combineLatest(oj.d, oj.e, h.a);
             a.o(ot1, "Observable.combineLatest¡­\n    \) { a, b -> a to b }");
             a.b(oj.a, ReactiveExtensionKt.f(ot1, new i(oj, objectRef)));
          }
          p0.b().a(uoa);
          return;
       }else {
          throw new IllegalStateException("[RenderArea] already initialized !".toString());
       }
    }
    public final void updateContainerVisibility(LayoutConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RenderAreaView.class, "9")) {
          return;
       }
       if (p0 == null) {
          e.d(e.d, "LiveStage", "[Render] hide overlayRecyclerView", null, 4, null);
          this.getOverlayRecyclerView().setVisibility(4);
       }else {
          this.getOverlayRecyclerView().setVisibility(0);
       }
       if (p0 == null || this.P == VideoRenderMode.NONE) {
          e.d(e.d, "LiveStage", "[Render] hide videoRender/imageRender", null, 4, null);
          this.B.setVisibility(4);
          this.C.setVisibility(4);
       }else {
          this.B.setVisibility(0);
          this.C.setVisibility(0);
       }
       return;
    }
}
