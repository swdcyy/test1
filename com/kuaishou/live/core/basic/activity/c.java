package com.kuaishou.live.core.basic.activity.c;
import com.kuaishou.live.core.basic.activity.LivePlayLoader$b;
import com.kwai.feature.api.live.base.model.LiveAudienceParam;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kwai.feature.api.live.service.basic.bizrelation.LiveBizParam;
import java.lang.Object;
import com.kuaishou.live.core.basic.activity.b;
import com.kuaishou.android.live.model.QLivePlayConfig;
import java.lang.Runnable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.String;
import android.view.View;
import m02.f;
import n12.e;
import com.kwai.robust.PatchProxyResult;
import java.util.Objects;
import n12.e$a;
import kotlin.jvm.internal.a;
import nsd.u;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver$OnDrawListener;
import android.view.View$OnAttachStateChangeListener;
import java.lang.System;
import android.os.SystemClock;
import com.kwai.feature.api.live.base.model.LiveStyleParams;
import android.animation.ObjectAnimator;
import com.kuaishou.live.common.core.basic.degrade.j;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import d61.h;
import androidx.fragment.app.Fragment;
import xp5.a;
import u53.b;
import android.view.ViewStub;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.content.Context;
import ekd.p1;
import tkd.b;
import tkd.d;
import ym5.a;
import com.kuaishou.live.core.basic.activity.c$a;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import pp.c;
import com.kuaishou.android.live.log.b;
import c12.o;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.Integer;
import java.util.Collection;
import ekd.q;
import java.util.List;
import r12.f$a;
import r12.g;
import com.kuaishou.live.core.basic.bulletin.CommentAreaOptABContext;
import k51.b;
import android.widget.RelativeLayout$LayoutParams;

public class c	// class@001830
{
    public final LivePlayLoader$b a;
    public final LiveAudienceParam b;
    public final LiveStreamFeedWrapper c;
    public final QLivePlayConfig d;
    public final LiveBizParam e;
    public ViewGroup f;
    public long g;
    public long h;
    public boolean i;
    public long j;
    public long k;
    public boolean l;
    public a m;
    public boolean n;
    public boolean o;
    public boolean p;
    public o q;
    public boolean r;
    public boolean s;
    public final c t;
    public boolean u;

    public void c(LivePlayLoader$b p0,LiveAudienceParam p1,LiveStreamFeedWrapper p2,LiveBizParam p3,boolean p4,boolean p5){
       super();
       this.s = false;
       this.t = b.b;
       this.u = false;
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p2.getLivePlayConfig();
       this.e = p3;
       this.p = p4;
       this.n = p5;
    }
    public final void a(long p0,Runnable p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), p1, this, uoc, "4")) {
          return;
       }
       if (PatchProxy.applyVoidOneRefs(p1, this, uoc, "12") || (this.b.getStartActivityTime() - null > 0 && !this.a.U1())) {
          View view = this.a.u1().findViewById(R.id.live_play_clearable_layer);
          f uof = new f(p1);
          PatchProxyResult patchProxyRe = PatchProxyResult.class;
          if (PatchProxy.applyTwoRefs(view, uof, null, e.class, "5") != patchProxyRe) {
          }else {
             e$a f = e.f;
             Objects.requireNonNull(f);
             if (PatchProxy.applyTwoRefs(view, uof, f, e$a.class, "1") != patchProxyRe) {
             }else {
                a.p(view, "view");
                a.p(uof, "runnable");
                e uoe = new e(view, uof, null);
                view.getViewTreeObserver().addOnDrawListener(uoe);
                view.addOnAttachStateChangeListener(uoe);
             }
          }
       }
       this.h = System.currentTimeMillis();
       this.g = SystemClock.elapsedRealtime() - p0;
       LiveBizParam mLiveStylePa = this.e.mLiveStyleParams;
       if (mLiveStylePa.mEnableBizLayoutFadeInAnimation != null && mLiveStylePa.mHasShownBizLayoutAnimation == null) {
          mLiveStylePa.mHasShownBizLayoutAnimation = true;
          j.a(this.f, new float[2]{0,0x3f800000}).setDuration(330).start();
       }
       return;
    }
    public final void b(){
       c uoc = c.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoc, "3")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, uoc, "10")) {
          View view1 = this.a.u1().findViewById(R.id.live_loading_view);
          h.h(view1);
          this.f.findViewById(R.id.live_play_loading_view_container).addView(view1);
       }
       a uoa = b.a(this.a.b());
       if (uoa.e() && uoa.d()) {
          if (!PatchProxy.applyVoid(objArray, this, uoc, "11")) {
             ViewStub viewStub = this.a.u1().findViewById(R.id.live_show_layout_stub);
             viewStub.setLayoutResource(R.layout.arg_RES_7f0d0bda);
             View view = viewStub.inflate();
             ViewGroup$MarginLayoutParams layoutParams = view.getLayoutParams();
             layoutParams.topMargin = p1.f(view.getContext());
             view.setLayoutParams(layoutParams);
             this.c(view);
          }
       }else {
          this.f();
       }
       return;
    }
    public final void c(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "6")) {
          return;
       }
       if (d.a(0x4c5dd1b8).f2()) {
          p0.getViewTreeObserver().addOnGlobalLayoutListener(new c$a(this, p0));
       }
       return;
    }
    public final void d(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "15")) {
          return;
       }
       b.d0(this.t, "flushComponentTasks", "reason", p0, "liveStreamId", this.d.getLiveStreamId());
       c tq = this.q;
       if (tq != null && !PatchProxy.applyVoidOneRefs(p0, tq, o.class, "5")) {
          b.e0(LiveLogTag.LIVE_SCATTER_LOADER, "loadRemainPresenterImmediately", "reason", p0, "index", Integer.valueOf(tq.f), "liveStreamId", tq.g);
          if (!q.f(tq.b)) {
             tq.f();
             tq.c(tq.b, Long.MAX_VALUE);
             tq.e();
          }
       }
       return;
    }
    public final f$a e(){
       Object obj = PatchProxy.apply(null, this, c.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new f$a(0x7f0d0d1d, g.c("biz", this.c.getUserId()));
    }
    public final void f(){
       View view;
       if (PatchProxy.applyVoid(null, this, c.class, "5")) {
          return;
       }
       b.Z(this.t, "inflateBulletinViewByAb");
       ViewStub viewStub = this.a.u1().findViewById(R.id.live_show_layout_stub);
       if (CommentAreaOptABContext.a(this.a.b()).c()) {
          viewStub.setLayoutResource(R.layout.arg_RES_7f0d0d0a);
          view = viewStub.inflate();
          ViewGroup$MarginLayoutParams layoutParams = view.getLayoutParams();
          layoutParams.topMargin = p1.f(view.getContext());
          view.setLayoutParams(layoutParams);
          this.c(view);
       }else {
          viewStub.setLayoutResource(b.a(R.layout.arg_RES_7f0d0d0b, 0x7f0d0d0c));
          view = viewStub.inflate();
          RelativeLayout$LayoutParams layoutParams1 = view.getLayoutParams();
          layoutParams1.addRule(3, R.id.top_bar);
          view.setLayoutParams(layoutParams1);
          this.c(view);
       }
       return;
    }
}
