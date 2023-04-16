package com.kuaishou.android.live.doublelist.danmaku.h;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import op.p;
import com.kuaishou.android.live.doublelist.danmaku.h$a;
import com.kuaishou.android.live.doublelist.danmaku.h$b;
import java.lang.Boolean;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kuaishou.android.live.model.LiveStreamModel;
import java.lang.String;
import ba9.a;
import v99.a;
import com.kuaishou.android.live.doublelist.danmaku.b;
import y99.k;
import k2b.e0;
import op.m;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Runnable;
import android.widget.ImageView;
import tkd.b;
import tkd.d;
import os5.l;
import brd.t;
import op.o;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.model.LivePlayConfig;
import op.n;
import com.kuaishou.android.live.doublelist.danmaku.b$a;
import t99.y;
import com.yxcorp.gifshow.autoplay.live.LiveAutoPlayModule;
import s99.i;
import com.yxcorp.gifshow.autoplay.widget.FrameAutoPlayCard;
import android.view.ViewStub;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.live.doublelist.danmaku.g;
import com.kuaishou.android.live.doublelist.danmaku.f;
import com.kuaishou.android.live.doublelist.danmaku.e;
import com.kuaishou.android.live.doublelist.danmaku.d;
import d61.k0$a;
import com.google.common.base.Optional;
import d61.k0;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import xl8.b;
import t99.w;
import java.lang.Long;

public class h extends PresenterV2	// class@0007d3
{
    public FrameAutoPlayCard A;
    public b B;
    public final Runnable C;
    public final i D;
    public final y E;
    public LivePlayConfig p;
    public QPhoto q;
    public RecyclerFragment r;
    public k s;
    public LiveAutoPlayModule t;
    public a u;
    public b v;
    public KwaiImageView w;
    public ViewStub x;
    public long y;
    public boolean z;

    public void h(){
       super();
       this.C = new p(this);
       this.D = new h$a(this);
       this.E = new h$b(this);
    }
    public static void P8(h p0,Boolean p1){
       p0.e9(p1);
    }
    public static BaseFeed R8(QPhoto p0){
       return h.a9(p0);
    }
    public static LiveStreamFeed S8(BaseFeed p0){
       return h.b9(p0);
    }
    public static void V8(h p0){
       p0.j9();
    }
    public static Boolean W8(LiveStreamModel p0){
       return h.d9(p0);
    }
    public static void X8(h p0,QPhoto p1,int p2){
       p0.h9(p1, p2);
    }
    public static LiveStreamModel Y8(LiveStreamFeed p0){
       return h.c9(p0);
    }
    public static BaseFeed a9(QPhoto p0){
       return p0.mEntity;
    }
    public static LiveStreamFeed b9(BaseFeed p0){
       if (p0 instanceof LiveStreamFeed) {
          return p0;
       }
       return null;
    }
    public static LiveStreamModel c9(LiveStreamFeed p0){
       return p0.mLiveStreamModel;
    }
    public static Boolean d9(LiveStreamModel p0){
       return Boolean.valueOf((p0.mDisableComment ^ 0x01));
    }
    private void e9(Boolean p0){
       if (p0.booleanValue()) {
          this.u.v("float_window_show", this.A);
          if (this.u.g(this.A)) {
             this.B.D();
          }
       }else {
          this.s.a();
       }
       return;
    }
    private void h9(QPhoto p0,int p1){
       m.a(this.r, p0, p1);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, h.class, "4")) {
          return;
       }
       this.w.post(this.C);
       this.X7(d.a(-1492894991).Jy().subscribe(new o(this)));
       h tp = this.p;
       boolean b = (tp != null && (tp.mEnableCommentBullet != null && this.Z8(this.q)))? true: false;
       this.B.m(this.q, b, 8, new n(this));
       this.t.O(this.E);
       this.A.y(this.D);
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, h.class, "2")) {
          return;
       }
       this.B = new b(this.x);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, h.class, "5")) {
          return;
       }
       this.w.removeCallbacks(this.C);
       this.A.A(this.D);
       this.t.e0(this.E);
       return;
    }
    public final boolean Z8(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, h.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return k0.d(p0, g.a, f.a, e.a, d.a).or(Boolean.TRUE).booleanValue();
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "3")) {
          return;
       }
       this.A = m1.f(p0, 0x7f0a30e1);
       this.x = m1.f(p0, 0x7f0a0a46);
       this.w = m1.f(p0, 0x7f0a1c85);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, h.class, "1")) {
          return;
       }
       this.q = this.q8(QPhoto.class);
       this.r = this.r8("FRAGMENT");
       this.s = this.r8("AUTO_PLAY_DISPATCH_FOCUS_STATE");
       this.p = this.t8("HOME_LIVE_PLAY_CONFIG");
       this.t = this.r8("AUTO_PLAY_LIVE_MODULE");
       this.u = this.r8("AUTO_PLAY_MANAGER");
       this.v = this.t8("HOME_LIVE_AUTO_PLAYING");
       return;
    }
    public final void j9(){
       if (PatchProxy.applyVoid(null, this, h.class, "7")) {
          return;
       }
       this.B.B(w.a(this.w.getMeasuredWidth(), this.w.getMeasuredHeight()));
       return;
    }
    public void k9(long p0){
       h oh = h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, oh, "6")) {
          return;
       }
       m.b("2455846", this.r, this.q, p0);
       this.y = 0;
       return;
    }
}
