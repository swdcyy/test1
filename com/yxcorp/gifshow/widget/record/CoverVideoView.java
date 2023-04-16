package com.yxcorp.gifshow.widget.record.CoverVideoView;
import android.widget.FrameLayout;
import com.yxcorp.gifshow.widget.record.CoverVideoView$a;
import nsd.u;
import com.yxcorp.gifshow.model.CDNUrl;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import ozc.g;
import com.yxcorp.gifshow.widget.record.CoverVideoView$onInfoListener$1;
import com.yxcorp.gifshow.widget.record.CoverVideoView$onErrorListener$1;
import com.yxcorp.gifshow.widget.record.CoverVideoView$onVideoSizeChangedListener$1;
import ozc.e;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.library.widget.surface.SafeTextureView;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kwai.library.widget.refresh.KwaiLoadingView;
import uzc.b;
import android.view.ViewStub;
import j8c.a;
import q87.c;
import ozc.f;
import android.view.TextureView$SurfaceTextureListener;
import android.view.TextureView;
import ozc.d;
import android.view.ViewOutlineProvider;
import bya.a;
import java.lang.CharSequence;
import bya.a$b;
import ozc.h;
import msd.q;
import com.kwai.video.player.IMediaPlayer$OnErrorListener;
import com.kwai.video.player.IMediaPlayer$OnPreparedListener;
import ozc.i;
import com.kwai.video.player.IMediaPlayer$OnInfoListener;
import ozc.j;
import msd.s;
import com.kwai.video.player.IMediaPlayer$OnVideoSizeChangedListener;
import android.graphics.SurfaceTexture;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import lnc.a1;
import ub.b;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.yxcorp.gifshow.widget.record.CoverVideoView$b;
import android.view.View$OnClickListener;

public final class CoverVideoView extends FrameLayout	// class@0019b9
{
    public SafeTextureView b;
    public KwaiImageView c;
    public KwaiLoadingView d;
    public a e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public b k;
    public final IMediaPlayer$OnPreparedListener l;
    public final q m;
    public final q n;
    public final s o;
    public final e p;
    public final CDNUrl q;
    public final CDNUrl r;
    public static final CoverVideoView$a s;

    static {
       CoverVideoView.s = new CoverVideoView$a(null);
    }
    public void CoverVideoView(CDNUrl p0,CDNUrl p1,Context p2,AttributeSet p3,int p4,u p5){
       a.p(p0, "videoUrl");
       a.p(p1, "coverUrl");
       a.p(p2, "context");
       super(p2, null);
       this.q = p0;
       this.r = p1;
       this.l = new g(this);
       this.m = new CoverVideoView$onInfoListener$1(this);
       this.n = new CoverVideoView$onErrorListener$1(this);
       this.o = new CoverVideoView$onVideoSizeChangedListener$1(this);
       this.p = new e(this);
       LayoutInflater.from(p2).inflate(R.layout.arg_RES_7f0d12d7, this);
       if (PatchProxy.applyVoid(null, this, CoverVideoView.class, "2")) {
       }else {
          View view = this.findViewById(R.id.record_guide_surface);
          a.o(view, "findViewById\(R.id.record_guide_surface\)");
          this.b = view;
          view = this.findViewById(R.id.record_guide_video_cover);
          a.o(view, "findViewById\(R.id.record_guide_video_cover\)");
          this.c = view;
          view = this.findViewById(R.id.record_guide_loading);
          a.o(view, "findViewById\(R.id.record_guide_loading\)");
          this.d = view;
          this.k = new b(this.findViewById(0x7f0a34ab));
          this.j();
          this.c();
          if (!PatchProxy.applyVoid(null, this, CoverVideoView.class, "4")) {
             Object[] objArray = new Object[0];
             a.D().w("CoverVideoView", "initSurface: ", objArray);
             CoverVideoView tb = this.b;
             if (tb == null) {
                a.S("textureView");
             }
             tb.setSurfaceTextureListener(new f(this));
          }
          if (!PatchProxy.applyVoid(null, this, CoverVideoView.class, "1")) {
             this.setOutlineProvider(new d());
             this.setClipToOutline(true);
          }
       }
       return;
    }
    public static final KwaiImageView a(CoverVideoView p0){
       p0 = p0.c;
       if (p0 == null) {
          a.S("coverImage");
       }
       return p0;
    }
    public static final KwaiLoadingView b(CoverVideoView p0){
       p0 = p0.d;
       if (p0 == null) {
          a.S("loadingView");
       }
       return p0;
    }
    public final void c(){
       Object[] objArray1;
       i oi;
       j oj;
       if (PatchProxy.applyVoid(null, this, CoverVideoView.class, "3")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("CoverVideoView", "initPlayer\(\) called", objArray);
       CoverVideoView te = this.e;
       if (te != null) {
          a.m(te);
          if (te.b()) {
             objArray1 = new Object[i];
             a.D().w("CoverVideoView", "initPlayer: mediaPlayer is created", objArray1);
             return;
          }
       }
       String url = this.q.getUrl();
       a.o(url, "videoUrl.url");
       String str = 1;
       a uoa = (!url.length())? 1: null;
       if (uoa) {
          objArray1 = new Object[i];
          a.D().w("CoverVideoView", "initPlayer: url is null", objArray1);
          this.k();
          return;
       }else {
          te = this.e;
          if (te != null) {
             a.m(te);
             if (!te.b()) {
                te = this.e;
                a.m(te);
                te.a();
                return;
             }
          }
          a$b uob = new a$b(this.q.getUrl(), this.getContext());
          uob.b(str);
          uob.d(str);
          CoverVideoView tn = this.n;
          if (tn != null) {
             tn = new h(tn);
          }
          uob.e(tn);
          uob.g(this.l);
          tn = this.m;
          if (tn != null) {
             oi = new i(tn);
          }
          uob.f(oi);
          tn = this.o;
          if (tn != null) {
             oj = new j(tn);
          }
          uob.h(oj);
          this.e = uob.a();
          te = this.b;
          if (te == null) {
             a.S("textureView");
          }
          SurfaceTexture surfaceTextu = te.getSurfaceTexture();
          if (surfaceTextu != null) {
             tn = this.e;
             if (tn != null) {
                tn.h(surfaceTextu);
             }
          }
          objArray1 = new Object[i];
          a.D().w("CoverVideoView", "initPlayer", objArray1);
          return;
       }
    }
    public final boolean d(){
       String obj = PatchProxy.apply(null, this, CoverVideoView.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.q.getUrl();
       a.o(obj, "videoUrl.url");
       boolean b = (!obj.length())? true: false;
       return b;
    }
    public final void e(boolean p0){
       if (PatchProxy.isSupport(CoverVideoView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, CoverVideoView.class, "9")) {
          return;
       }
       this.g = p0 ^ 0x01;
       if (!p0) {
          CoverVideoView tk = this.k;
          if (tk != null && (tk.b() == true && !this.d())) {
             this.h();
          }
       }
       return;
    }
    public final void f(){
       if (PatchProxy.applyVoid(null, this, CoverVideoView.class, "15")) {
          return;
       }
       this.h = false;
       CoverVideoView te = this.e;
       if (te != null) {
          te.d();
       }
       return;
    }
    public final void g(){
       if (PatchProxy.applyVoid(null, this, CoverVideoView.class, "8")) {
          return;
       }
       this.c();
       Object[] objArray = new Object[0];
       a.D().w("CoverVideoView", "previewPlay\(\) ", objArray);
       if (this.f != null && this.j != null) {
          CoverVideoView te = this.e;
          if (te != null) {
             te.i();
          }
       }
       this.h = true;
       return;
    }
    public final void h(){
       if (PatchProxy.applyVoid(null, this, CoverVideoView.class, "6")) {
          return;
       }
       CoverVideoView tk = this.k;
       if (tk != null) {
          View view = tk.a(R.id.record_guide_error_container);
          if (view != null) {
             view.setBackgroundColor(a1.a(R.color.arg_RES_7f0600a7));
          }
       }
       return;
    }
    public final void i(){
       if (PatchProxy.applyVoid(null, this, CoverVideoView.class, "16")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("CoverVideoView", "releasePlayer\(\) called", objArray);
       CoverVideoView te = this.e;
       if (te != null) {
          te.f();
       }
       this.e = null;
       this.f = false;
       this.h = false;
       return;
    }
    public final void j(){
       if (PatchProxy.applyVoid(null, this, CoverVideoView.class, "12")) {
          return;
       }
       String url = this.r.getUrl();
       a.o(url, "coverUrl.url");
       int i = 0;
       int i1 = 1;
       CoverVideoView uCoverVideoV = (url.length() > 0)? 1: null;
       if (uCoverVideoV) {
          uCoverVideoV = this.c;
          if (uCoverVideoV == null) {
             a.S("coverImage");
          }
          CDNUrl[] uCDNUrlArray = new CDNUrl[i1];
          uCDNUrlArray[i] = this.r;
          uCoverVideoV.Y(uCDNUrlArray, null, this.p);
       }else {
          this.e(i1);
       }
       return;
    }
    public final void k(){
       if (PatchProxy.applyVoid(null, this, CoverVideoView.class, "5")) {
          return;
       }
       CoverVideoView td = this.d;
       if (td == null) {
          a.S("loadingView");
       }
       td.setVisibility(8);
       if (this.d()) {
          return;
       }else {
          td = this.k;
          if (td != null) {
             View view = td.a(R.id.record_guide_error_container);
             if (view != null) {
                view.setVisibility(0);
                view = view.findViewById(R.id.record_guide_error_btn);
                if (view != null) {
                   view.setOnClickListener(new CoverVideoView$b(this));
                }
             }
          }
          if (!this.d()) {
             this.h();
          }
          return;
       }
    }
    public final void l(){
       if (PatchProxy.applyVoid(null, this, CoverVideoView.class, "14")) {
          return;
       }
       this.h = true;
       this.g();
       return;
    }
}
