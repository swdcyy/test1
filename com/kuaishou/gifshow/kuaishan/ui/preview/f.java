package com.kuaishou.gifshow.kuaishan.ui.preview.f;
import u79.o;
import ml8.d;
import java.lang.String;
import android.content.Context;
import java.lang.Object;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import com.yxcorp.gifshow.album.viewbinder.AbsPreviewItemViewBinder;
import u79.n;
import q79.d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import u80.e;
import q87.c;
import bya.a;
import android.view.View;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.widget.PlayerLayout;
import ekd.m1;
import android.view.TextureView;
import com.yxcorp.gifshow.image.KwaiImageView;
import r90.e0;
import android.view.View$OnClickListener;
import r90.f0;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import w46.b;
import r90.g0;
import r90.h0;
import bya.a$b;
import com.kuaishou.gifshow.kuaishan.ui.preview.e;
import com.kwai.video.player.IMediaPlayer$OnErrorListener;
import com.kwai.video.player.IMediaPlayer$OnPreparedListener;
import com.kwai.video.player.IMediaPlayer$OnInfoListener;
import com.kwai.video.player.IMediaPlayer$OnVideoSizeChangedListener;
import com.kwai.video.cache.AwesomeCacheCallback;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import java.io.File;
import android.net.Uri;
import ekd.w0;
import com.facebook.imagepipeline.request.ImageRequest;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.view.ViewGroup;
import android.view.TextureView$SurfaceTextureListener;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import com.kuaishou.gifshow.kuaishan.ui.preview.f$a;

public class f implements o, d	// class@001af0
{
    public final int b;
    public final String c;
    public final String d;
    public final boolean e;
    public Context f;
    public View g;
    public a h;
    public boolean i;
    public boolean j;
    public boolean k;
    public AwesomeCacheCallback l;
    public IMediaPlayer$OnInfoListener m;
    public IMediaPlayer$OnVideoSizeChangedListener n;
    public IMediaPlayer$OnPreparedListener o;
    public List p;
    public boolean q;
    public boolean r;
    public KwaiImageView s;
    public KwaiImageView t;
    public TextureView u;
    public PlayerLayout v;

    public void f(int p0,String p1,String p2,boolean p3,Context p4){
       super();
       this.i = false;
       this.j = false;
       this.k = false;
       this.p = Lists.b();
       this.q = false;
       this.r = false;
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
    }
    public AbsPreviewItemViewBinder O1(){
       return n.d(this);
    }
    public void a(int p0){
    }
    public void b(d p0){
       n.j(this, p0);
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, f.class, "12")) {
          return;
       }
       Object[] objArray = new Object[0];
       e.D().w("VideoIjkPlayerPreviewItem", "releasePlayer\(\) called", objArray);
       f th = this.h;
       if (th != null) {
          th.f();
          this.q = false;
       }
       return;
    }
    public void d(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "3")) {
          return;
       }
       Object[] objArray = new Object[0];
       e.D().w("VideoIjkPlayerPreviewItem", "bind called, index = "+this.b, objArray);
       this.g = p0;
       this.doBindView(p0);
       this.m();
       this.w(true, 0);
       this.v.setRatio(0);
       this.r = true;
       this.j();
       this.x();
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "1")) {
          return;
       }
       this.u = m1.f(p0, 0x7f0a3e7d);
       this.v = m1.f(p0, 0x7f0a4408);
       this.s = m1.f(p0, 0x7f0a4402);
       this.t = m1.f(p0, 0x7f0a31e5);
       m1.a(p0, new e0(this), R.id.video_play_controller);
       m1.a(p0, new f0(this), R.id.texture_view);
       return;
    }
    public void e(float p0){
       n.a(this, p0);
    }
    public void f(){
       n.g(this);
    }
    public void g(boolean p0){
       n.c(this, p0);
    }
    public int getIndex(){
       return this.b;
    }
    public View getView(){
       return this.g;
    }
    public void h(AbsPreviewItemViewBinder p0){
    }
    public void i(){
       Object[] objArray;
       if (PatchProxy.applyVoid(null, this, f.class, "10")) {
          return;
       }
       int i = 0;
       if (this.g == null) {
          objArray = new Object[i];
          e.D().w("VideoIjkPlayerPreviewItem", "previewPause: is unbinded ignore this", objArray);
          return;
       }else {
          f th = this.h;
          if (th != null && th.b()) {
             objArray = new Object[i];
             e.D().s("VideoIjkPlayerPreviewItem", "previewPause\(\) called mIndex="+this.b, objArray);
             this.h.d();
          }
          return;
       }
    }
    public boolean isPlaying(){
       f obj = PatchProxy.apply(null, this, f.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.h;
       boolean b = (obj != null && obj.c())? true: false;
       return b;
    }
    public boolean isPrepared(){
       boolean b = (this.g != null)? true: false;
       return b;
    }
    public final void j(){
       Object[] objArray1;
       if (PatchProxy.applyVoid(null, this, f.class, "5")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       e.D().w("VideoIjkPlayerPreviewItem", "initPlayer\(\) called", objArray);
       f th = this.h;
       if (th != null && th.b()) {
          objArray1 = new Object[i];
          e.D().w("VideoIjkPlayerPreviewItem", "initPlayer: mKwaiMediaPlayer is created", objArray1);
          return;
       }else if(this.g == null || this.t == null){
          objArray1 = new Object[i];
          e.D().w("VideoIjkPlayerPreviewItem", "initPlayer: is unbinded ignore this", objArray1);
          return;
       }else if(TextUtils.x(this.c)){
          objArray1 = new Object[i];
          e.D().t("VideoIjkPlayerPreviewItem", " initPlayer: wrong video source", objArray1);
          return;
       }else {
          th = this.h;
          if (th != null && !th.b()) {
             this.h.a();
             return;
          }else {
             this.o = new g0(this);
             if (this.r != null) {
                this.n = new h0(this);
             }
             a$b uob = new a$b(this.c, this.f);
             uob.b(true);
             uob.d(true);
             uob.e(e.b);
             f to = this.o;
             if (to != null) {
                uob.g(to);
             }
             to = this.m;
             if (to != null) {
                uob.f(to);
             }
             to = this.n;
             if (to != null) {
                uob.h(to);
             }
             if (this.e != null) {
                to = this.l;
                if (to != null) {
                   uob.c(to);
                }
             }
             this.h = uob.a();
             objArray1 = new Object[i];
             e.D().w("VideoIjkPlayerPreviewItem", "initPlayer: index="+this.b, objArray1);
             return;
          }
       }
    }
    public int k(){
       return 1;
    }
    public void l(){
       n.h(this);
    }
    public void m(){
       if (PatchProxy.applyVoid(null, this, f.class, "4")) {
          return;
       }
       int i = 0;
       if (this.g != null) {
          f tt = this.t;
          if (tt != null) {
             tt.setPlaceHolderImage(new ColorDrawable(0xff000000));
             if (!TextUtils.x(this.d)) {
                if (this.e != null) {
                   this.t.L(this.d);
                }else {
                   this.t.A(w0.c(new File(this.d)), i, i);
                }
                this.t.setVisibility(i);
             }else {
                this.v.setVisibility(4);
             }
             return;
          }
       }
       Object[] objArray = new Object[i];
       e.D().s("VideoIjkPlayerPreviewItem", "showCover: is unbinded ignore this", objArray);
       return;
    }
    public void n(){
       this.j = true;
    }
    public View o(ViewGroup p0){
       return null;
    }
    public void p(){
       if (PatchProxy.applyVoid(null, this, f.class, "14")) {
          return;
       }
       Object[] objArray = new Object[0];
       e.D().w("VideoIjkPlayerPreviewItem", "unSelectItem called, index = "+this.b, objArray);
       this.i = false;
       this.k = false;
       this.j = false;
       return;
    }
    public void q(boolean p0){
    }
    public void r(){
       Object[] objArray;
       if (PatchProxy.applyVoid(null, this, f.class, "11")) {
          return;
       }
       int i = 0;
       if (this.g == null) {
          objArray = new Object[i];
          e.D().w("VideoIjkPlayerPreviewItem", "previewPlay: is unbinded ignore this", objArray);
          return;
       }else if(this.j != null || this.i != null){
          objArray = new Object[i];
          e.D().s("VideoIjkPlayerPreviewItem", "previewPlay: now is paused state cancel play mOnPagePaused="+this.j+" mOnUserPaused="+this.i, objArray);
          return;
       }else {
          f th = this.h;
          if (th == null || !th.b()) {
             this.j();
          }
          objArray = new Object[i];
          e.D().w("VideoIjkPlayerPreviewItem", "previewPlay\(\) called mIndex="+this.b, objArray);
          th = this.h;
          if (th != null) {
             th.i();
          }
          return;
       }
    }
    public boolean s(){
       Object obj = PatchProxy.apply(null, this, f.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (TextUtils.x(this.d) ^ 0x01);
    }
    public void t(){
       if (PatchProxy.applyVoid(null, this, f.class, "15")) {
          return;
       }
       Object[] objArray = new Object[0];
       e.D().w("VideoIjkPlayerPreviewItem", "selectItem called, index = "+this.b, objArray);
       this.k = true;
       this.i = true;
       return;
    }
    public void u(int p0,float p1){
       n.e(this, p0, p1);
    }
    public void unbind(){
       if (PatchProxy.applyVoid(null, this, f.class, "9")) {
          return;
       }
       Object[] objArray = new Object[0];
       e.D().w("VideoIjkPlayerPreviewItem", "unbindView\(\) called index="+this.b, objArray);
       this.g = null;
       f tt = this.t;
       if (tt != null) {
          tt.setVisibility(0);
          this.t = null;
       }
       tt = this.u;
       if (tt != null) {
          tt.setSurfaceTextureListener(null);
          this.u = null;
       }
       if (this.h != null) {
          if (this.q != null) {
             objArray = new Object[0];
             e.D().w("VideoIjkPlayerPreviewItem", "mKwaiMediaPlayer released by unbind callback, index: "+this.b, objArray);
          }
          this.h.e();
          this.h = null;
          this.q = false;
       }
       return;
    }
    public void v(){
       if (PatchProxy.applyVoid(null, this, f.class, "16")) {
          return;
       }
       boolean b = false;
       this.j = b;
       if (this.g == null) {
          Object[] objArray = new Object[b];
          e.D().s("VideoIjkPlayerPreviewItem", "onActivityResumed: is unbinded ignore this", objArray);
          return;
       }else {
          this.m();
          if (this.k != null) {
             this.r();
          }
          return;
       }
    }
    public void w(boolean p0,boolean p1){
       float f;
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uof, "13")) {
          return;
       }
       int i = 0;
       if (this.g == null || this.s == null) {
          Object[] objArray = new Object[i];
          e.D().w("VideoIjkPlayerPreviewItem", "setPlayButtonVisible: not bind ignore", objArray);
          return;
       }else {
          Object[] objArray1 = new Object[i];
          e.D().s("VideoIjkPlayerPreviewItem", "setPlayButtonVisible\(\) called with: show = ["+p0+"], animation = ["+p1+"]", objArray1);
          this.s.clearAnimation();
          uof = 4;
          if (!p1) {
             f ts = this.s;
             if (!p0) {
                i = 4;
             }
             ts.setVisibility(i);
             return;
          }else if(!p0 || (!this.s.getVisibility() || (!p0 && this.s.getVisibility() == uof))){
             return;
          }else {
             this.s.setVisibility(i);
             f = 0;
             float f1 = 0x3f800000;
             AlphaAnimation uAlphaAnimat = (p0)? new AlphaAnimation(f, f1): new AlphaAnimation(f1, f);
             uAlphaAnimat.setDuration(200);
             uAlphaAnimat.setFillAfter(true);
             this.s.startAnimation(uAlphaAnimat);
             return;
          }
       }
    }
    public final void x(){
       if (PatchProxy.applyVoid(null, this, f.class, "7")) {
          return;
       }
       Object[] objArray = new Object[0];
       e.D().w("VideoIjkPlayerPreviewItem", "initSurface: ", objArray);
       f tu = this.u;
       if (tu == null) {
          return;
       }
       tu.setSurfaceTextureListener(new f$a(this));
       return;
    }
    public void y(){
       if (PatchProxy.applyVoid(null, this, f.class, "8")) {
          return;
       }
       String str = "VideoIjkPlayerPreviewItem";
       int i = 0;
       if (this.g == null) {
          Object[] objArray = new Object[i];
          e.D().w(str, "onClickPlayBtn: is unbinded, ignore this click .", objArray);
          return;
       }else {
          f th = this.h;
          if (th == null || !th.b()) {
             this.j();
          }
          if (this.h == null) {
             return;
          }else {
             Object[] objArray1 = new Object[i];
             e.D().s(str, "onClickPlayBtn: ", objArray1);
             if (this.h.c()) {
                this.i = true;
                this.i();
                this.w(true, true);
             }else {
                this.i = i;
                this.r();
                this.w(i, true);
             }
             return;
          }
       }
    }
}
