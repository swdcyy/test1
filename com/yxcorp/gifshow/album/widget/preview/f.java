package com.yxcorp.gifshow.album.widget.preview.f;
import u79.o;
import r79.e;
import j79.m0;
import androidx.lifecycle.ViewModel;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import android.widget.RelativeLayout;
import java.lang.Long;
import android.view.ViewGroup;
import com.yxcorp.gifshow.album.viewbinder.AbsPreviewItemViewBinder;
import com.yxcorp.utility.Log;
import android.animation.AnimatorSet;
import o79.d;
import java.lang.StringBuilder;
import android.view.View;
import android.animation.ObjectAnimator;
import p79.c;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import o79.i;
import android.animation.Animator;
import android.animation.AnimatorSet$Builder;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.library.widget.popup.common.c;
import u07.t$a;
import android.content.Context;
import android.app.Activity;
import u07.f;
import com.yxcorp.gifshow.album.widget.preview.f$a;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c$b;
import u07.t;
import q79.d;
import com.yxcorp.gifshow.album.widget.preview.KsAlbumVideoPlayerView;
import com.yxcorp.gifshow.album.widget.preview.a;
import com.yxcorp.gifshow.album.widget.preview.a$a;
import ga9.b;
import crd.b;
import g79.a;
import w69.y0;
import android.widget.SeekBar;
import r79.a;
import w69.k;
import android.widget.TextView;
import r79.c;
import ic7.a;
import java.lang.CharSequence;
import u79.u;
import android.widget.SeekBar$OnSeekBarChangeListener;
import java.lang.Float;
import j79.l0;
import ekd.b0;
import u79.n;
import java.util.Objects;
import java.io.File;
import qkd.b;
import u79.s;
import java.util.concurrent.Callable;
import brd.t;
import w69.p0;
import brd.z;
import u79.r;
import erd.g;
import android.widget.ImageView;
import android.widget.RelativeLayout$LayoutParams;
import u79.k;
import android.view.View$OnClickListener;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ShowEvent;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import w69.x;
import com.yxcorp.gifshow.album.widget.preview.m;
import u79.p;
import com.kuaishou.gifshow.kuaishan.ui.preview.a;
import u79.q;
import java.lang.Runnable;
import java.lang.Throwable;
import ic7.b;

public class f implements o	// class@001b39
{
    public d A;
    public b0 B;
    public String C;
    public boolean D;
    public AbsPreviewItemViewBinder b;
    public KsAlbumVideoPlayerView c;
    public ViewGroup d;
    public final e e;
    public int f;
    public boolean g;
    public b h;
    public t i;
    public ViewModel j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public int p;
    public boolean q;
    public m0 r;
    public boolean s;
    public boolean t;
    public b u;
    public b v;
    public b w;
    public ObjectAnimator x;
    public ObjectAnimator y;
    public AnimatorSet z;

    public void f(int p0,e p1,m0 p2,ViewModel p3){
       super();
       this.g = true;
       this.k = false;
       this.l = false;
       this.m = false;
       this.n = false;
       this.o = false;
       this.p = 0;
       this.q = false;
       this.s = true;
       this.t = false;
       this.D = false;
       this.f = p0;
       this.e = p1;
       this.r = p2;
       this.j = p3;
    }
    public void A(boolean p0){
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uof, "32")) {
          return;
       }
       uof = this.c;
       if (uof == null) {
          return;
       }
       if (this.n != null) {
          return;
       }
       uof.setKeepScreenOn(p0);
       return;
    }
    public final void B(boolean p0,long p1,boolean p2,boolean p3){
       int i3;
       if (PatchProxy.isSupport(f.class) && PatchProxy.applyVoidFourRefs(Boolean.valueOf(p0), Long.valueOf(p1), Boolean.valueOf(p2), Boolean.valueOf(p3), this, f.class, "12")) {
          return;
       }
       ViewGroup viewGroup = this.b.q();
       if (viewGroup == null) {
          Log.g("VideoSdkPlayerPreviewItem", "setPreviewBubbleVisible, not show because bubbleContainer is null..");
          return;
       }else {
          f tz = this.z;
          if (tz != null) {
             tz.cancel();
             ObjectAnimator objectAnimat = null;
             this.x = objectAnimat;
             this.y = objectAnimat;
          }
          if (p0 && this.m != null) {
             d.o(this.C);
             Log.g("VideoSdkPlayerPreviewItem", "logPreviewBubbleShow, index="+this.f+", type="+this.C);
          }
          this.z = new AnimatorSet();
          int i = (p0)? 0: 4;
          Log.g("VideoSdkPlayerPreviewItem", "setPreviewBubbleVisible, index="+this.f+", requestShow="+p0);
          this.x = c.c(viewGroup, i, p1);
          if (p2) {
             Log.g("VideoSdkPlayerPreviewItem", "translate anim, index="+this.f+", requestShow="+p0);
             FrameLayout$LayoutParams bottomMargin = viewGroup.getLayoutParams().bottomMargin;
             int i1 = i.c(R.dimen.arg_RES_7f0704b3);
             int i2 = i.c(R.dimen.arg_RES_7f0704f2);
             Log.g("VideoSdkPlayerPreviewItem", "index="+this.f+", selectContainerH="+i2+", bubbleMarginBottom="+bottomMargin+", additionBottomMargin="+i1);
             if ((bottomMargin - i2) < i1) {
                if (p0 || p3) {
                   i3 = - ((i2 + i1) - bottomMargin);
                   i1 = 0;
                }else {
                   i1 = - ((i2 + i1) - bottomMargin);
                   i3 = 0;
                }
                Log.g("VideoSdkPlayerPreviewItem", "index="+this.f+", requestShow="+p0+", from="+i3+", to="+i1);
                this.y = c.d(viewGroup, (float)i3, (float)i1, 300);
             }
          }
          f ty = this.y;
          if (ty != null) {
             Animator[] uAnimatorArr = new Animator[]{this.x,ty};
             this.z.playTogether(uAnimatorArr);
          }else {
             this.z.play(this.x);
          }
          this.z.start();
          return;
       }
    }
    public int C(int p0){
       ViewGroup obj;
       f uof = f.class;
       if (PatchProxy.isSupport(uof)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uof, "13");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       obj = this.b.q();
       if (obj == null) {
          Log.g("VideoSdkPlayerPreviewItem", "setPreviewBubbleVisible, not show because bubbleContainer is null..");
          return -1;
       }else {
          int visibility = obj.getVisibility();
          if (visibility != p0) {
             obj.setVisibility(p0);
             if (!p0 && this.m != null) {
                d.o(this.C);
                Log.g("VideoSdkPlayerPreviewItem", "logPreviewBubbleShow, index="+this.f+", type="+this.C);
             }
          }
          return visibility;
       }
    }
    public void D(){
       if (PatchProxy.applyVoid(null, this, f.class, "20")) {
          return;
       }
       f ti = this.i;
       if (ti != null && ti.K()) {
          return;
       }
       t$a uoa = f.e(new t$a(this.c.getContext()));
       uoa.W0(R.string.arg_RES_7f1018dc);
       uoa.S0(R.string.arg_RES_7f101899);
       this.i = uoa.Y(new f$a(this));
       return;
    }
    public AbsPreviewItemViewBinder O1(){
       return this.b;
    }
    public void a(int p0){
       this.f = p0;
    }
    public void b(d p0){
       this.A = p0;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, f.class, "26")) {
          return;
       }
       f tc = this.c;
       if (tc != null) {
          tc.d();
          a playerContro = this.c.getPlayerController();
          if (playerContro != null) {
             playerContro.p("VideoSdkPlayerPreviewItem", null);
          }
          this.c.f();
          this.A(false);
       }
       return;
    }
    public void d(View p0){
       f uof = f.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uof, "2")) {
          return;
       }
       this.b.e(p0);
       this.d = p0;
       this.c = p0.findViewById(0x7f0a1625);
       f tu = this.u;
       if (tu != null) {
          tu.dispose();
       }
       if (this.D == null) {
          this.u = this.x();
       }
       tu = this.c;
       if (tu != null) {
          this.n = tu.getKeepScreenOn();
          tu = this.c;
          f te = this.e;
          a uoa = PatchProxy.applyTwoRefs(tu, te, null, a.class, "1");
          if (uoa != PatchProxyResult.class) {
          }else {
             uoa = a.c.d().c(tu, te);
          }
          tu.setPlayerController(uoa);
          Log.g("VideoSdkPlayerPreviewItem", "bind mVideoSDKPlayerView="+this.c+",controller="+this.c.getPlayerController());
       }
       this.m();
       if (this.m != null && this.p == null) {
          this.y();
       }
       if (!PatchProxy.applyVoid(null, this, uof, "15") && this.b.o() != null) {
          if (this.A.s0().m().o() && this.b.p() != null) {
             FrameLayout$LayoutParams layoutParams = this.b.p().getLayoutParams();
             layoutParams.bottomMargin = i.d(65.00f);
             this.b.p().setLayoutParams(layoutParams);
          }
          if (this.b.v() != null) {
             this.b.v().setText(a.c(this.e.getDuration()));
          }
          if (this.b.n() != null) {
             this.b.n().setText(a.c(0));
          }
          this.b.o().setMax(0x2710);
          this.b.o().setOnSeekBarChangeListener(new u(this));
       }
       return;
    }
    public void e(float p0){
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uof, "35")) {
          return;
       }
       ViewGroup viewGroup = this.b.q();
       if (viewGroup == null) {
          Log.g("VideoSdkPlayerPreviewItem", "changePreviewBubbleAlpha, not show because bubbleContainer is null..");
          return;
       }else if(!viewGroup.getVisibility()){
          viewGroup.setAlpha(p0);
          Log.g("VideoSdkPlayerPreviewItem", "changePreviewBubbleAlpha, alpha="+p0);
       }
       return;
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, f.class, "4")) {
          return;
       }
       this.D = true;
       Log.g("VideoSdkPlayerPreviewItem", "notifyPreviewBubblePaddingShow, index="+this.f);
       return;
    }
    public void g(boolean p0){
       boolean b1;
       boolean b2;
       float f;
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uof, "10")) {
          return;
       }
       Log.g("VideoSdkPlayerPreviewItem", "decideVideoBubbleVisibleIfNeed, index="+this.f);
       f tb = this.b;
       if (tb == null) {
          Log.g("VideoSdkPlayerPreviewItem", "decideVideoBubbleVisibleIfNeed, viewBinder == null, index="+this.f);
          return;
       }else if(this.j == null){
          Log.g("VideoSdkPlayerPreviewItem", "decideVideoBubbleVisibleIfNeed, mViewModel == null, index="+this.f);
          return;
       }else if(tb.q() == null){
          Log.g("VideoSdkPlayerPreviewItem", "not show because bubbleContainer is null..");
          return;
       }else {
          tb = this.j;
          String str = 1;
          boolean b = false;
          if (tb != null && tb instanceof l0) {
             tb = (tb.I0() || !this.A.s0().m().o())? 1: null;
             b1 = this.j.G0();
             b2 = tb;
          }else {
             b1 = false;
             b2 = false;
          }
          tb = this.A;
          boolean b3 = (tb != null)? tb.O0(this.e.getPath()): false;
          b0 obj = PatchProxy.apply(null, this, uof, "11");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else {
             uof = this.B;
             if (uof != null) {
                b0 a = uof.a;
                if (a > null) {
                   obj = uof.b;
                   if (obj > null) {
                      f = (float)a / (float)obj;
                      Log.g("VideoSdkPlayerPreviewItem", "isAspectRatioLegal, index="+this.f+", w="+a+", h="+obj+", aspect="+f);
                      if (a <= obj) {
                         if (f - 0x3ee66666 < 0) {
                         label_0113 :
                            str = null;
                         }
                      }else if(f - 0x400e38e4 <= 0){
                      }
                      b = str;
                   }
                }
             }
             Log.g("VideoSdkPlayerPreviewItem", "isAspectRatioLegal=false, dimension="+this.B);
          }
          Log.g("VideoSdkPlayerPreviewItem", "index = "+this.f+", mIsCurrent = "+this.m+", bubbleAdded = "+this.t+", hasSelectedMedia = "+b1+", screenClean = "+b2+", dismissByClose = "+b3+", isAspectLegal = "+b);
          if (this.t != null && (!b1 && (!b2 && (!b3 && b != null)))) {
             this.B(true, 150, p0, b2);
          }else {
             this.B(false, 150, p0, b2);
          }
          return;
       }
    }
    public int getIndex(){
       return this.f;
    }
    public View getView(){
       return this.d;
    }
    public void h(AbsPreviewItemViewBinder p0){
       this.b = p0;
    }
    public void i(){
       if (PatchProxy.applyVoid(null, this, f.class, "23")) {
          return;
       }
       if (this.p != 2) {
          Log.g("VideoSdkPlayerPreviewItem", "previewPause: is unbinded ignore this");
          return;
       }else if(this.c == null){
          return;
       }else {
          Log.g("VideoSdkPlayerPreviewItem", "previewPause\(\) called mIndex="+this.f);
          this.c.d();
          return;
       }
    }
    public boolean isPlaying(){
       f obj = PatchProxy.apply(null, this, f.class, "33");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.c;
       boolean b = (obj != null && obj.b())? true: false;
       return b;
    }
    public boolean isPrepared(){
       boolean b = (this.c != null)? true: false;
       return b;
    }
    public int k(){
       return 2;
    }
    public void l(){
       if (PatchProxy.applyVoid(null, this, f.class, "5")) {
          return;
       }
       Log.g("VideoSdkPlayerPreviewItem", "notifyPreviewViewPagerShow, index="+this.f);
       if (this.D != null && this.d != null) {
          this.D = false;
          this.u = this.x();
       }
       return;
    }
    public void m(){
       n.l(this);
    }
    public void n(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, f.class, "29")) {
          return;
       }
       String str = "VideoSdkPlayerPreviewItem";
       Log.g(str, "onActivityPaused\(\) called");
       f tc = this.c;
       if (tc == null) {
          Log.g(str, "onActivityPaused: is unbinded ignore this");
          return;
       }else {
          this.l = true;
          this.s = tc.b();
          f tc1 = this.c;
          Objects.requireNonNull(tc1);
          if (!PatchProxy.applyVoid(objArray, tc1, KsAlbumVideoPlayerView.class, "20")) {
             Log.b(KsAlbumVideoPlayerView.t, "onPause TextureView "+tc1);
             KsAlbumVideoPlayerView b = tc1.b;
             if (b != null) {
                b.i();
             }
          }
          this.c.d();
          return;
       }
    }
    public View o(ViewGroup p0){
       return n.b(this, p0);
    }
    public void p(){
       if (PatchProxy.applyVoid(null, this, f.class, "27")) {
          return;
       }
       this.c();
       this.k = false;
       this.m = false;
       return;
    }
    public void q(boolean p0){
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uof, "24")) {
          return;
       }
       if (this.p != 2) {
          Log.g("VideoSdkPlayerPreviewItem", "previewPlay: is unbinded ignore this");
          this.q = p0;
          return;
       }else {
          this.r();
          return;
       }
    }
    public void r(){
       if (PatchProxy.applyVoid(null, this, f.class, "25")) {
          return;
       }
       if (this.p != 2) {
          Log.g("VideoSdkPlayerPreviewItem", "previewPlay: is unbinded ignore this");
          return;
       }else if(this.l != null || this.k != null){
          Log.g("VideoSdkPlayerPreviewItem", "previewPlay: now is paused state cancel play mOnPagePaused="+this.l+" mOnUserPaused="+this.k);
          return;
       }else {
          Log.g("VideoSdkPlayerPreviewItem", "previewPlay\(\) called mIndex="+this.f);
          this.c.e();
          return;
       }
    }
    public boolean s(){
       Object obj = PatchProxy.apply(null, this, f.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return b.S(this.e.getThumbnailFile());
    }
    public void t(){
       if (PatchProxy.applyVoid(null, this, f.class, "28")) {
          return;
       }
       this.k = true;
       this.m = true;
       this.y();
       f tb = this.b;
       if (tb != null && tb.o() != null) {
          this.b.o().setProgress(0);
       }
       tb = this.b;
       if (tb != null && tb.n() != null) {
          this.b.n().setText(a.c(0));
       }
       this.g(0);
       return;
    }
    public void u(int p0,float p1){
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Float.valueOf(p1), this, uof, "34")) {
          return;
       }
       uof = this.b;
       if (uof != null && uof.t() != null) {
          this.b.t().setVisibility(p0);
          this.b.t().setAlpha(p1);
       }
       return;
    }
    public void unbind(){
       f uof = f.class;
       if (PatchProxy.applyVoid(null, this, uof, "22")) {
          return;
       }
       Log.g("VideoSdkPlayerPreviewItem", "unbind");
       this.p = 0;
       this.c();
       this.c = null;
       f th = this.h;
       if (th != null && !th.isDisposed()) {
          this.h.dispose();
       }
       if (!PatchProxy.applyVoid(null, this, uof, "6")) {
          uof = this.u;
          if (uof != null) {
             uof.dispose();
          }
          uof = this.v;
          if (uof != null) {
             uof.dispose();
          }
          uof = this.w;
          if (uof != null) {
             uof.dispose();
          }
       }
       uof = this.b;
       if (uof != null) {
          uof.onDestroy();
       }
       this.d = null;
       this.i = null;
       return;
    }
    public void v(){
       if (PatchProxy.applyVoid(null, this, f.class, "30")) {
          return;
       }
       String str = "VideoSdkPlayerPreviewItem";
       Log.g(str, "onActivityResumed: ");
       f tc = this.c;
       if (tc == null) {
          Log.g(str, "onActivityResumed: is unbinded ignore this");
          return;
       }else {
          this.l = false;
          tc.c();
          f tj = this.j;
          if (tj instanceof l0 && (tj.J0() && this.s != null)) {
             this.s = true;
             tj = this.c;
             if (tj != null) {
                tj.e();
             }
          }
          return;
       }
    }
    public void w(boolean p0,boolean p1){
    }
    public final b x(){
       Object obj = PatchProxy.apply(null, this, f.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a c = a.c;
       return t.fromCallable(new s(this)).subscribeOn(c.i().d()).observeOn(c.i().b()).subscribe(new r(this));
    }
    public final void y(){
       ClientEvent$UrlPackage obj;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       f uof = f.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uof, "16")) {
          return;
       }
       f tc = this.c;
       String str = "VideoSdkPlayerPreviewItem";
       if (tc == null) {
          Log.g(str, "initPlayer: is unbinded, ignore this click .");
          return;
       }else {
          tc.setHideCoverWhenPlay(true);
          this.c.setEnablePlayerStatusChanged(true);
          tc = this.c;
          f tj = this.j;
          boolean b = false;
          boolean b1 = (tj instanceof l0 && tj.J0())? true: false;
          tc.setUseBottomIcon(b1);
          tc = this.j;
          if (tc instanceof l0 && tc.J0()) {
             this.c.h(R.drawable.arg_RES_7f080f9d, KsAlbumVideoPlayerView.q, KsAlbumVideoPlayerView.r);
             tc = this.c;
             Objects.requireNonNull(tc);
             if (!PatchProxy.applyVoid(objArray, tc, KsAlbumVideoPlayerView.class, "7")) {
                RelativeLayout$LayoutParams layoutParams = tc.e.getLayoutParams();
                layoutParams.addRule(12);
                layoutParams.bottomMargin = KsAlbumVideoPlayerView.s;
                tc.e.setLayoutParams(layoutParams);
             }
             tc = this.c;
             Objects.requireNonNull(tc);
             if (!PatchProxy.applyVoid(objArray, tc, KsAlbumVideoPlayerView.class, "15")) {
                tc.e.setOnClickListener(new k(tc));
             }
             this.z(b);
             if (this.p == null) {
                this.c.i(this.q, true);
             }
          }else if(this.p == null){
             this.c.i(this.q, b);
          }
          if (!PatchProxy.applyVoid(objArray, objArray, d.class, "25")) {
             ClientEvent$ShowEvent showEvent = new ClientEvent$ShowEvent();
             obj = new ClientEvent$UrlPackage();
             showEvent.urlPackage = obj;
             obj.params = "task_id="+d.a;
             showEvent.urlPackage.page = 187;
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "PHOTO_PROGRESS_BAR";
             showEvent.elementPackage = uElementPack;
             a.c.f().h(showEvent);
          }
          try{
             tc = this.c;
             Objects.requireNonNull(tc);
             obj = PatchProxy.apply(objArray, tc, KsAlbumVideoPlayerView.class, "13");
             if (obj != patchProxyRe) {
                b = obj.booleanValue();
             }else {
                KsAlbumVideoPlayerView b4 = tc.b;
                if (b4 != null) {
                   b = b4.f();
                }
             }
             if (b) {
                this.c.a();
             }
             this.c.setLoop(this.g);
             if (!PatchProxy.applyVoid(objArray, this, uof, "19")) {
                a playerContro = this.c.getPlayerController();
                if (playerContro != null) {
                   playerContro.p(str, new m(this));
                }
             }
             this.c.setOnClickListener(new p(this));
             uof = this.c;
             tc = this.e;
             a b2 = a.b;
             q oq = new q(this);
             Objects.requireNonNull(uof);
             obj = PatchProxy.applyThreeRefs(tc, b2, oq, uof, KsAlbumVideoPlayerView.class, "5");
             if (obj != patchProxyRe) {
                objArray = obj;
             }else {
                KsAlbumVideoPlayerView b3 = uof.b;
                if (b3 != null) {
                   objArray = b3.g(tc, b2, oq);
                }
             }
             this.h = objArray;
             this.p = 1;
          }catch(java.lang.Exception e0){
             b.a(e0);
          }
          return;
       }
    }
    public void z(boolean p0){
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uof, "18")) {
          return;
       }
       uof = this.b;
       if (uof != null) {
          int i = (p0)? 0: 8;
          uof.o().setVisibility(i);
          this.b.n().setVisibility(i);
          this.b.v().setVisibility(i);
       }
       return;
    }
}
