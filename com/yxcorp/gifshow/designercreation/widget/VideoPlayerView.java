package com.yxcorp.gifshow.designercreation.widget.VideoPlayerView;
import android.view.View$OnClickListener;
import android.widget.FrameLayout;
import com.yxcorp.gifshow.designercreation.widget.VideoPlayerView$a;
import nsd.u;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.designercreation.widget.VideoPlayerView$c;
import com.yxcorp.gifshow.designercreation.widget.VideoPlayerView$onInfoListener$1;
import com.yxcorp.gifshow.designercreation.widget.VideoPlayerView$onErrorListener$1;
import com.yxcorp.gifshow.designercreation.widget.VideoPlayerView$onVideoSizeChangedListener$1;
import com.yxcorp.gifshow.designercreation.widget.VideoPlayerView$b;
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
import android.widget.ImageView;
import hw9.a;
import hw9.a$a;
import q87.c;
import pw9.a;
import pw9.a$a;
import java.util.List;
import iw9.a;
import com.yxcorp.gifshow.model.CDNUrl;
import pw9.d;
import msd.q;
import com.kwai.video.player.IMediaPlayer$OnErrorListener;
import pw9.e;
import com.kwai.video.player.IMediaPlayer$OnInfoListener;
import pw9.f;
import msd.s;
import com.kwai.video.player.IMediaPlayer$OnVideoSizeChangedListener;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.RuntimeException;
import java.lang.Throwable;
import lnc.i1;
import com.kwai.video.player.IMediaPlayer$OnPreparedListener;
import com.kwai.video.cache.AwesomeCacheCallback;
import com.kwai.video.player.IMediaPlayer$OnCompletionListener;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
import java.lang.Boolean;
import java.util.Collection;
import com.kwai.video.wayne.player.main.IMediaPlayerApi;
import androidx.core.view.ViewKt;
import lnc.a1;
import android.view.Surface;
import com.kwai.video.wayne.player.main.IWaynePlayer;
import com.kwai.video.wayne.player.main.IPlayerListener;
import java.lang.Integer;
import android.view.ViewGroup$LayoutParams;
import java.lang.StringBuilder;
import java.util.Objects;
import ub.b;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.yxcorp.gifshow.designercreation.widget.VideoPlayerView$d;

public final class VideoPlayerView extends FrameLayout implements View$OnClickListener	// class@001323
{
    public SafeTextureView b;
    public KwaiImageView c;
    public KwaiLoadingView d;
    public ImageView e;
    public a f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public b l;
    public a m;
    public final IMediaPlayer$OnPreparedListener n;
    public final q o;
    public final q p;
    public final s q;
    public final VideoPlayerView$b r;
    public HashMap s;
    public static final VideoPlayerView$a t;

    static {
       VideoPlayerView.t = new VideoPlayerView$a(null);
    }
    public void VideoPlayerView(Context p0){
       super(p0, null, 0, 6, null);
    }
    public void VideoPlayerView(Context p0,AttributeSet p1){
       super(p0, p1, 0, 4, null);
    }
    public void VideoPlayerView(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       this.n = new VideoPlayerView$c(this);
       this.o = new VideoPlayerView$onInfoListener$1(this);
       this.p = new VideoPlayerView$onErrorListener$1(this);
       this.q = new VideoPlayerView$onVideoSizeChangedListener$1(this);
       this.r = new VideoPlayerView$b(this);
       LayoutInflater.from(p0).inflate(R.layout.arg_RES_7f0d1664, this);
       if (PatchProxy.applyVoid(null, this, VideoPlayerView.class, "1")) {
       }else {
          this.b = this.findViewById(0x7f0a3c22);
          this.c = this.findViewById(0x7f0a0a11);
          this.d = this.findViewById(0x7f0a2921);
          this.l = new b(this.findViewById(0x7f0a0d89));
          this.e = this.findViewById(0x7f0a43ee);
          this.setOnClickListener(this);
       }
       return;
    }
    public void VideoPlayerView(Context p0,AttributeSet p1,int p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = 0;
       }
       super(p0, p1, p2);
       return;
    }
    public final void a(){
       String url;
       d uod;
       e uoe;
       f uof;
       a uoa = this;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, uoa, VideoPlayerView.class, "3")) {
          return;
       }
       a$a c = a.c;
       Object[] objArray1 = new Object[0];
       c.a().w("VideoPlayerView", "initPlayer\(\) called", objArray1);
       VideoPlayerView f = uoa.f;
       if (f != null) {
          a.m(f);
          if (f.b()) {
             objArray = new Object[0];
             c.a().w("VideoPlayerView", "initPlayer: mediaPlayer is created", objArray);
             return;
          }
       }
       if (this.b()) {
          objArray = new Object[0];
          c.a().w("VideoPlayerView", "initPlayer: url is null", objArray);
          this.j();
          return;
       }else {
          f = uoa.f;
          if (f != null) {
             a.m(f);
             if (!f.b()) {
                VideoPlayerView f1 = uoa.f;
                a.m(f1);
                f1.a();
                return;
             }
          }
          VideoPlayerView m = uoa.m;
          a.m(m);
          url = m.videoUrls().get(0).getUrl();
          a.o(url, "videoData!!.videoUrls\(\)[0].url");
          a$a uoa1 = new a$a(url);
          uoa1.b = true;
          uoa1.a = true;
          m = uoa.p;
          if (m != null) {
             uod = new d(m);
          }
          uoa1.c = uod;
          uoa1.d = uoa.n;
          m = uoa.o;
          if (m != null) {
             uoe = new e(m);
          }
          uoa1.g = uoe;
          m = uoa.q;
          if (m != null) {
             uof = new f(m);
          }
          uoa1.e = uof;
          Object obj = PatchProxy.apply(objArray, uoa1, a$a.class, "1");
          if (obj != PatchProxyResult.class) {
             objArray = obj;
          }else if(TextUtils.x(uoa1.i)){
             i1.c(new RuntimeException("KwaiMediaPlayer failed to build media player, wrong source"));
          }else {
             a uoa2 = new a(uoa1.i, uoa1.a, uoa1.b, uoa1.c, uoa1.d, uoa1.e, uoa1.f, uoa1.g, uoa1.h, null);
          }
          uoa.f = objArray;
          VideoPlayerView b = uoa.b;
          if (b != null) {
             SurfaceTexture surfaceTextu = b.getSurfaceTexture();
             if (surfaceTextu != null) {
                f = uoa.f;
                if (f != null) {
                   f.c(surfaceTextu);
                }
             }
          }
          objArray = new Object[0];
          c.a().w("VideoPlayerView", "initPlayer", objArray);
          return;
       }
    }
    public final boolean b(){
       Object[] objArray = null;
       VideoPlayerView obj = PatchProxy.apply(objArray, this, VideoPlayerView.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.m;
       if (obj != null) {
          objArray = obj.videoUrls();
       }
       boolean b = (objArray == null || objArray.isEmpty())? true: false;
       return b;
    }
    public final void c(boolean p0){
       if (PatchProxy.isSupport(VideoPlayerView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, VideoPlayerView.class, "10")) {
          return;
       }
       this.h = p0 ^ 0x01;
       if (!p0) {
          VideoPlayerView tl = this.l;
          if (tl != null && (tl.b() == true && !this.b())) {
             this.f();
          }
       }
       return;
    }
    public final void d(boolean p0){
       a a;
       if (PatchProxy.isSupport(VideoPlayerView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, VideoPlayerView.class, "16")) {
          return;
       }
       this.i = false;
       VideoPlayerView tf = this.f;
       if (tf != null && !PatchProxy.applyVoid(null, tf, a.class, "5")) {
          a = tf.a;
          if (a != null) {
             a.pause();
          }
       }
       tf = this.e;
       if (tf != null) {
          ViewKt.g(tf, p0);
       }
       return;
    }
    public final void e(){
       if (PatchProxy.applyVoid(null, this, VideoPlayerView.class, "9")) {
          return;
       }
       this.a();
       Object[] objArray = new Object[0];
       a.c.a().w("VideoPlayerView", "previewPlay\(\) ", objArray);
       if (this.g != null && this.k != null) {
          VideoPlayerView tf = this.f;
          if (tf != null) {
             tf.d();
          }
       }
       this.i = true;
       return;
    }
    public final void f(){
       if (PatchProxy.applyVoid(null, this, VideoPlayerView.class, "6")) {
          return;
       }
       VideoPlayerView tl = this.l;
       if (tl != null) {
          View view = tl.a(R.id.error_container);
          if (view != null) {
             view.setBackgroundColor(a1.a(R.color.arg_RES_7f0600a7));
          }
       }
       return;
    }
    public final void g(){
       a a;
       if (PatchProxy.applyVoid(null, this, VideoPlayerView.class, "17")) {
          return;
       }
       a$a c = a.c;
       Object[] objArray = new Object[0];
       c.a().w("VideoPlayerView", "releasePlayer\(\) called", objArray);
       VideoPlayerView tf = this.f;
       if (tf != null && !PatchProxy.applyVoid(null, tf, a.class, "8")) {
          a = tf.a;
          if (a != null) {
             a.pause();
          }
          a = tf.a;
          if (a != null) {
             a.setSurface(null);
          }
          a = tf.a;
          if (a != null) {
             a.removeOnPreparedListener(tf.g);
          }
          a = tf.a;
          if (a != null) {
             a.removeOnInfoListener(tf.j);
          }
          a = tf.a;
          if (a != null) {
             a.removeOnCompletionListener(tf.k);
          }
          a = tf.a;
          if (a != null) {
             a.removeOnErrorListener(tf.f);
          }
          a = tf.a;
          if (a != null) {
             a.releaseAsync();
          }
          tf.a = null;
          Object[] objArray1 = new Object[0];
          c.a().w("KwaiMediaPlayer", "media player released", objArray1);
       }
       this.f = null;
       this.g = false;
       this.i = false;
       return;
    }
    public final void h(View p0,int p1,int p2){
       if (PatchProxy.isSupport(VideoPlayerView.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, VideoPlayerView.class, "8")) {
          return;
       }
       if (p0.getWidth() > 0 && p0.getHeight() > 0) {
          ViewGroup$LayoutParams layoutParams = p0.getLayoutParams();
          a$a c = a.c;
          Object[] objArray = new Object[0];
          c.a().w("VideoPlayerView", "resizeView WH: "+p1+' '+p2+" , "+p0.getWidth()+' '+p0.getHeight(), objArray);
          float f = ((float)p1 * 0x3f800000) / (float)p2;
          float f1 = ((float)p0.getWidth() * 0x3f800000) / (float)p0.getHeight();
          if (f - 0x3f400000 >= 0 || f - f1 < 0) {
             layoutParams.width = p0.getWidth();
             layoutParams.height = (int)((float)p0.getWidth() / f);
          }else {
             layoutParams.height = p0.getHeight();
             layoutParams.width = (int)((float)p0.getHeight() * f);
          }
          Object[] objArray1 = new Object[0];
          c.a().w("VideoPlayerView", "adjustPlayerLayout result: "+layoutParams.height+' '+layoutParams.width, objArray1);
          p0.requestLayout();
       }
       return;
    }
    public final void i(){
       if (PatchProxy.applyVoid(null, this, VideoPlayerView.class, "13")) {
          return;
       }
       VideoPlayerView tm = this.m;
       List list = (tm != null)? tm.coverUrls(): null;
       int i = 0;
       boolean b = true;
       int i1 = (list == null || list.isEmpty())? 1: 0;
       if (i1) {
          this.c(b);
       }else {
          VideoPlayerView tc = this.c;
          if (tc != null) {
             CDNUrl[] uCDNUrlArray = new CDNUrl[i];
             Object[] objArray = list.toArray(uCDNUrlArray);
             Objects.requireNonNull(objArray, "null cannot be cast to non-null type kotlin.Array<T>");
             tc.Y(objArray, null, this.r);
          }
       }
       return;
    }
    public final void j(){
       if (PatchProxy.applyVoid(null, this, VideoPlayerView.class, "5")) {
          return;
       }
       VideoPlayerView td = this.d;
       if (td != null) {
          td.setVisibility(8);
       }
       if (this.b()) {
          return;
       }else {
          td = this.l;
          if (td != null) {
             View view = td.a(R.id.error_container);
             if (view != null) {
                view.setVisibility(0);
                view = view.findViewById(R.id.error_btn);
                if (view != null) {
                   view.setOnClickListener(new VideoPlayerView$d(this));
                }
             }
          }
          if (!this.b()) {
             this.f();
          }
          return;
       }
    }
    public final void k(){
       if (PatchProxy.applyVoid(null, this, VideoPlayerView.class, "15")) {
          return;
       }
       this.i = true;
       this.e();
       VideoPlayerView te = this.e;
       if (te != null) {
          ViewKt.g(te, false);
       }
       return;
    }
    public void onClick(View p0){
       boolean b;
       a a;
       if (PatchProxy.applyVoidOneRefs(p0, this, VideoPlayerView.class, "18")) {
          return;
       }
       if (this.g == null) {
          return;
       }
       VideoPlayerView tf = this.f;
       if (tf != null) {
          Object obj = PatchProxy.apply(null, tf, a.class, "3");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else {
             a = tf.a;
             b = (a != null && a.isPlaying() == true)? true: false;
          }
          if (b == true) {
             this.d(true);
          label_003f :
             return;
          }
       }
       this.k();
       goto label_003f ;
    }
}
