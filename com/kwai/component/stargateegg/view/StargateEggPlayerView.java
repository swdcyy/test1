package com.kwai.component.stargateegg.view.StargateEggPlayerView;
import android.widget.FrameLayout;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.component.stargateegg.view.StargateEggPlayerView$a;
import wx4.b;
import wx4.b$a;
import android.os.Handler;
import com.kwai.component.stargateegg.player.StargateEggPlayerRunSafeThread;
import wx4.c;
import xx6.k;
import com.kwai.component.stargateegg.stargate.StargatePlayerLogger;
import com.kwai.component.stargateegg.view.StargateEggPlayerView$mVesLogger$1;
import msd.l;
import com.kwai.component.stargateegg.view.StargateEggPlayerView$mPlayerStateChangedListener$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.component.stargateegg.view.StargateEggPlayerView$g;
import com.kwai.component.stargateegg.view.StargateEggPlayerView$i;
import com.kwai.component.stargateegg.view.StargateEggPlayerView$f;
import com.kwai.component.stargateegg.view.StargateEggPlayerView$c;
import com.kwai.component.stargateegg.view.StargateEggPlayerView$e;
import com.kwai.component.stargateegg.view.StargateEggPlayerView$h;
import com.kwai.component.stargateegg.view.StargateEggPlayerView$d;
import com.kwai.component.stargateegg.view.StargateEggPlayerView$b;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.tk.api.view.player.TextureRenderView;
import android.view.TextureView;
import com.kwai.framework.player.core.b;
import com.kwai.robust.PatchProxyResult;
import com.kwai.component.stargateegg.view.StargateEggPlayerView$createPlayerShortVideoNormalUrl$1;
import com.kwai.component.stargateegg.view.StargateEggPlayerView$createPlayerShortVideoNormalUrl$2;
import java.lang.Integer;
import java.lang.Boolean;
import com.kwai.video.player.IKwaiMediaPlayer;
import com.kwai.video.player.IMediaPlayer;
import com.kwai.video.player.IMediaPlayer$OnErrorListener;
import com.kwai.video.player.IMediaPlayer$OnPreparedListener;
import com.kwai.video.player.IMediaPlayer$OnVideoSizeChangedListener;
import com.kwai.video.player.IMediaPlayer$OnCompletionListener;
import com.kwai.video.player.IMediaPlayer$OnInfoListener;
import com.kwai.video.player.IMediaPlayer$OnSeekCompleteListener;
import com.kwai.video.player.IMediaPlayer$OnBufferingUpdateListener;
import com.kwai.framework.player.core.b$b;
import wx4.a$c;
import com.kwai.component.stargateegg.view.StargateEggPlayerView$j;
import com.kwai.video.cache.AwesomeCacheCallback;
import java.lang.StringBuilder;
import java.lang.Throwable;
import ug5.b;
import java.lang.Runnable;
import com.kwai.component.stargateegg.view.StargateEggPlayerView$releasePlayer$1;
import com.kwai.component.stargateegg.view.StargateEggPlayerView$releasePlayer$2;
import android.view.ViewGroup;
import android.view.MotionEvent;
import android.view.View;
import com.kwai.component.stargateegg.view.StargateEggPlayerView$k;
import wg5.a;
import wx4.a;
import wx4.a$b;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import com.kwai.component.stargateegg.view.StargateEggPlayerView$l;
import android.view.View$OnTouchListener;
import java.lang.Float;
import java.lang.Math;

public final class StargateEggPlayerView extends FrameLayout	// class@000b63
{
    public b A;
    public a B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public c I;
    public Context J;
    public long K;
    public long L;
    public int M;
    public k N;
    public boolean O;
    public String P;
    public int Q;
    public StargatePlayerLogger R;
    public int S;
    public b$b T;
    public final p U;
    public a$b U0;
    public b V;
    public IMediaPlayer$OnVideoSizeChangedListener V0;
    public a W;
    public IMediaPlayer$OnPreparedListener W0;
    public final IMediaPlayer$OnCompletionListener X0;
    public IMediaPlayer$OnInfoListener Y0;
    public final IMediaPlayer$OnInfoListener Z0;
    public final IMediaPlayer$OnSeekCompleteListener a1;
    public int b;
    public IMediaPlayer$OnErrorListener b1;
    public int c;
    public final IMediaPlayer$OnErrorListener c1;
    public final Handler d;
    public final IMediaPlayer$OnBufferingUpdateListener d1;
    public Runnable e;
    public String f;
    public String g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public String l;
    public boolean m;
    public boolean n;
    public boolean o;
    public float p;
    public float q;
    public float r;
    public boolean s;
    public boolean t;
    public boolean u;
    public long v;
    public int w;
    public boolean x;
    public boolean y;
    public a$c z;

    public void StargateEggPlayerView(Context p0){
       a.p(p0, "context");
       super(p0);
       this.e = new StargateEggPlayerView$a(this);
       this.setClickable(false);
       this.setLongClickable(false);
       this.b = b.b.a()[0];
       this.c = -2;
       this.d = StargateEggPlayerRunSafeThread.a();
       this.f = "";
       this.g = "mp4";
       this.j = true;
       this.l = "contain";
       this.n = true;
       this.o = true;
       this.p = 0x3f800000;
       this.q = 100.00f;
       this.I = new c();
       this.K = -1;
       this.L = -1;
       this.N = new k();
       this.P = "StargateEgg";
       this.Q = 10;
       this.R = new StargatePlayerLogger(new StargateEggPlayerView$mVesLogger$1(this));
       this.S = 1;
       this.U = s.c(new StargateEggPlayerView$mPlayerStateChangedListener$2(this));
       this.U0 = new StargateEggPlayerView$g(this);
       this.V0 = new StargateEggPlayerView$i(this);
       this.W0 = new StargateEggPlayerView$f(this);
       this.X0 = new StargateEggPlayerView$c(this);
       this.Z0 = new StargateEggPlayerView$e(this);
       this.a1 = new StargateEggPlayerView$h(this);
       this.c1 = new StargateEggPlayerView$d(this);
       this.d1 = new StargateEggPlayerView$b(this);
    }
    public void StargateEggPlayerView(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1);
       this.e = new StargateEggPlayerView$a(this);
       this.setClickable(false);
       this.setLongClickable(false);
       this.b = b.b.a()[0];
       this.c = -2;
       this.d = StargateEggPlayerRunSafeThread.a();
       this.f = "";
       this.g = "mp4";
       this.j = true;
       this.l = "contain";
       this.n = true;
       this.o = true;
       this.p = 0x3f800000;
       this.q = 100.00f;
       this.I = new c();
       this.K = -1;
       this.L = -1;
       this.N = new k();
       this.P = "StargateEgg";
       this.Q = 10;
       this.R = new StargatePlayerLogger(new StargateEggPlayerView$mVesLogger$1(this));
       this.S = 1;
       this.U = s.c(new StargateEggPlayerView$mPlayerStateChangedListener$2(this));
       this.U0 = new StargateEggPlayerView$g(this);
       this.V0 = new StargateEggPlayerView$i(this);
       this.W0 = new StargateEggPlayerView$f(this);
       this.X0 = new StargateEggPlayerView$c(this);
       this.Z0 = new StargateEggPlayerView$e(this);
       this.a1 = new StargateEggPlayerView$h(this);
       this.c1 = new StargateEggPlayerView$d(this);
       this.d1 = new StargateEggPlayerView$b(this);
    }
    public void StargateEggPlayerView(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       this.e = new StargateEggPlayerView$a(this);
       this.setClickable(false);
       this.setLongClickable(false);
       this.b = b.b.a()[0];
       this.c = -2;
       this.d = StargateEggPlayerRunSafeThread.a();
       this.f = "";
       this.g = "mp4";
       this.j = true;
       this.l = "contain";
       this.n = true;
       this.o = true;
       this.p = 0x3f800000;
       this.q = 100.00f;
       this.I = new c();
       this.K = -1;
       this.L = -1;
       this.N = new k();
       this.P = "StargateEgg";
       this.Q = 10;
       this.R = new StargatePlayerLogger(new StargateEggPlayerView$mVesLogger$1(this));
       this.S = 1;
       this.U = s.c(new StargateEggPlayerView$mPlayerStateChangedListener$2(this));
       this.U0 = new StargateEggPlayerView$g(this);
       this.V0 = new StargateEggPlayerView$i(this);
       this.W0 = new StargateEggPlayerView$f(this);
       this.X0 = new StargateEggPlayerView$c(this);
       this.Z0 = new StargateEggPlayerView$e(this);
       this.a1 = new StargateEggPlayerView$h(this);
       this.c1 = new StargateEggPlayerView$d(this);
       this.d1 = new StargateEggPlayerView$b(this);
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, StargateEggPlayerView.class, "17")) {
          return;
       }
       StargateEggPlayerView tB = this.B;
       String str = "null cannot be cast to non-null type com.kuaishou.tk.api.view.player.TextureRenderView";
       Objects.requireNonNull(tB, str);
       if (!tB.getVisibility()) {
          return;
       }
       tB = this.A;
       if (tB == null || (!tB.isPrepared() || (!tB.isVideoRenderingStart() || (!tB.isBuffering() && !tB.isPaused())))) {
          tB = this.B;
          Objects.requireNonNull(tB, str);
          tB.setVisibility(0);
       }
    label_0044 :
       return;
    }
    public final b b(){
       Object obj = PatchProxy.apply(null, this, StargateEggPlayerView.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return StargateEggPlayerRunSafeThread.b(new StargateEggPlayerView$createPlayerShortVideoNormalUrl$1(this), new StargateEggPlayerView$createPlayerShortVideoNormalUrl$2(this));
    }
    public final boolean c(int p0,int p1){
       StargateEggPlayerView obj;
       if (PatchProxy.isSupport(StargateEggPlayerView.class)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, StargateEggPlayerView.class, "16");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = this.A;
       boolean b = false;
       if (obj != null) {
          IKwaiMediaPlayer iKwaiMediaPl = obj.getIKwaiMediaPlayer();
          if (iKwaiMediaPl != null) {
             StargateEggPlayerView tb1 = this.b1;
             if (tb1 != null) {
                b = tb1.onError(iKwaiMediaPl, p0, p1);
             }
          }
       }
       return b;
    }
    public final void d(){
       int i;
       IKwaiMediaPlayer iKwaiMediaPl;
       String str = "TKOlympicPlayer";
       if (PatchProxy.applyVoid(null, this, StargateEggPlayerView.class, "12")) {
          return;
       }
       if (a.g(this.f, "")) {
          return;
       }
       this.f();
       try{
          i = 0;
          Context context = this.getContext();
          a.o(context, "context");
          context = context.getApplicationContext();
          a.o(context, "context.applicationContext");
          this.J = context;
          b uob = this.b();
          this.A = uob;
          if (uob != null) {
             uob.addOnPreparedListener(this.W0);
          }
          StargateEggPlayerView tA1 = this.A;
          if (tA1 != null) {
             tA1.addOnVideoSizeChangedListener(this.V0);
          }
          tA1 = this.A;
          if (tA1 != null) {
             tA1.addOnCompletionListener(this.X0);
          }
          tA1 = this.A;
          if (tA1 != null) {
             tA1.addOnErrorListener(this.c1);
          }
          tA1 = this.A;
          if (tA1 != null) {
             tA1.addOnInfoListener(this.Z0);
          }
          tA1 = this.A;
          if (tA1 != null) {
             tA1.addOnSeekCompleteListener(this.a1);
          }
          tA1 = this.A;
          if (tA1 != null) {
             tA1.addOnBufferingUpdateListener(this.d1);
          }
          tA1 = this.A;
          if (tA1 != null) {
             tA1.w(this.getMPlayerStateChangedListener());
          }
          this.H = i;
          tA1 = this.z;
          if (tA1 != null) {
             tA1.a(this.A);
          }
          tA1 = this.A;
          if (tA1 != null) {
             tA1.addAwesomeCallBack(new StargateEggPlayerView$j(this));
          }
          this.setRepeatModifier(this.m);
          tA1 = this.A;
          if (tA1 != null) {
             tA1.prepareAsync();
          }
          this.c = i;
          return;
       }catch(java.io.IOException e6){
          b.c(str, this.P+" Unable to open content:"+this.f+10, e6);
          this.c = -1;
          StargateEggPlayerView tc1 = this.c1;
          StargateEggPlayerView tA = this.A;
          if (tA != null) {
             iKwaiMediaPl = tA.getIKwaiMediaPlayer();
          }
          tc1.onError(iKwaiMediaPl, 1, i);
          return;
       }catch(java.lang.IllegalArgumentException e6){
          b.c(str, this.P+" Unable to open content: "+this.f+10, e6);
          this.c = -1;
          tc1 = this.c1;
          tA = this.A;
          if (tA != null) {
             iKwaiMediaPl = tA.getIKwaiMediaPlayer();
          }
          tc1.onError(iKwaiMediaPl, 1, i);
          return;
       }
    }
    public final void e(){
       if (PatchProxy.applyVoid(null, this, StargateEggPlayerView.class, "8")) {
          return;
       }
       this.d.removeCallbacks(this.e);
       return;
    }
    public final void f(){
       if (PatchProxy.applyVoid(null, this, StargateEggPlayerView.class, "10")) {
          return;
       }
       StargateEggPlayerRunSafeThread.b(new StargateEggPlayerView$releasePlayer$1(this), new StargateEggPlayerView$releasePlayer$2(this));
       return;
    }
    public final b$b getMPlayerStateChangedListener(){
       Object obj = PatchProxy.apply(null, this, StargateEggPlayerView.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.U.getValue();
    }
    public void onAttachedToWindow(){
       if (PatchProxy.applyVoid(null, this, StargateEggPlayerView.class, "29")) {
          return;
       }
       super.onAttachedToWindow();
       this.setKeepScreenOn(this.o);
       return;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, StargateEggPlayerView.class, "28")) {
          return;
       }
       this.u = false;
       super.onDetachedFromWindow();
       this.setKeepScreenOn(false);
       return;
    }
    public boolean onTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, StargateEggPlayerView.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "event");
       return false;
    }
    public void requestLayout(){
       if (PatchProxy.applyVoid(null, this, StargateEggPlayerView.class, "3")) {
          return;
       }
       super.requestLayout();
       this.post(new StargateEggPlayerView$k(this));
       return;
    }
    public final void setBizType(String p0){
       if (p0 != null) {
          this.P = p0;
       }
       return;
    }
    public final void setCurrentAspectRatio(int p0){
       this.b = p0;
    }
    public final void setOnEndListener(a p0){
       this.W = p0;
    }
    public final void setOnInfoListener(IMediaPlayer$OnInfoListener p0){
       this.Y0 = p0;
    }
    public final void setOnPlayerError(IMediaPlayer$OnErrorListener p0){
       this.b1 = p0;
    }
    public final void setPausedModifier(Boolean p0){
       StargateEggPlayerView tA;
       StargateEggPlayerView tc;
       if (PatchProxy.applyVoidOneRefs(p0, this, StargateEggPlayerView.class, "24")) {
          return;
       }
       boolean b = false;
       boolean b1 = (p0 != null)? p0.booleanValue(): false;
       this.n = b1;
       if (this.u == null) {
          return;
       }else if(b1){
          tA = this.A;
          if (tA != null) {
             tA.pause();
          }
          this.c = 3;
          this.e();
       }else if(!this.I.b()){
          this.I.a();
       }
       tA = this.A;
       if (tA != null) {
          tc = this.c;
          if (tc != -1 && (tc != -2 && tc != null)) {
             tc = 1;
          label_004e :
             if (tc && tA != null) {
                tA.start();
             }
             this.c = 2;
             if (!PatchProxy.applyVoid(null, this, StargateEggPlayerView.class, "9")) {
                this.d.post(this.e);
             }
          }
       }
       tc = 0;
       goto label_004e ;
       if (this.n == null && this.o == 1) {
          b = true;
       }
       this.setKeepScreenOn(b);
       return;
    }
    public final void setPlayInBackground(boolean p0){
       this.s = p0;
    }
    public final void setPopupShowing(boolean p0){
       this.O = p0;
    }
    public final void setPreventsDisplaySleepDuringVideoPlaybackModifier(boolean p0){
       if (PatchProxy.isSupport(StargateEggPlayerView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, StargateEggPlayerView.class, "26")) {
          return;
       }
       this.o = p0;
       if (this.u == null) {
          return;
       }
       boolean b = true;
       if (p0 != b) {
          b = false;
       }
       this.setKeepScreenOn(b);
       return;
    }
    public final void setRenderView(TextureRenderView p0){
       StargateEggPlayerView tB1;
       a uoa1;
       if (PatchProxy.applyVoidOneRefs(p0, this, StargateEggPlayerView.class, "6")) {
          return;
       }
       StargateEggPlayerView tB = this.B;
       a uoa = null;
       if (tB != null) {
          View view = (tB != null)? tB.getView(): uoa;
          if (view != null) {
             tB = this.B;
             view = (tB != null)? tB.getView(): uoa;
             tB1 = this.B;
             if (tB1 != null) {
                tB1.b(this.U0);
             }
             this.removeView(view);
             this.B = uoa;
          }
       }
       this.B = p0;
       p0.setAspectRatio(this.b);
       tB = this.C;
       if (tB > null) {
          tB1 = this.D;
          if (tB1 > null) {
             p0.setVideoSize(tB, tB1);
          }
       }
       StargateEggPlayerView tB2 = this.B;
       View view1 = (tB2 != null)? tB2.getView(): uoa;
       if (view1 != null) {
          view1.setLayoutParams(new FrameLayout$LayoutParams(-2, -2, 17));
       }
       this.addView(view1);
       tB2 = this.B;
       if (tB2 != null) {
          tB2.a(this.U0);
       }
       tB2 = this.B;
       if (tB2 != null) {
          tB2.setVideoRotation(this.G);
       }
       tB2 = this.B;
       if (tB2 instanceof TextureRenderView) {
          uoa = tB2;
       }
       if (uoa != null) {
          uoa.setClickable(false);
          uoa.setLongClickable(false);
          uoa.setOnTouchListener(StargateEggPlayerView$l.b);
       }
       return;
    }
    public final void setRepeatModifier(boolean p0){
       if (PatchProxy.isSupport(StargateEggPlayerView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, StargateEggPlayerView.class, "23")) {
          return;
       }
       this.m = p0;
       StargateEggPlayerView tA = this.A;
       if (tA != null) {
          tA.setLooping(p0);
       }
       return;
    }
    public final void setResizeModeModifier(String p0){
       StargateEggPlayerView tB;
       if (PatchProxy.applyVoidOneRefs(p0, this, StargateEggPlayerView.class, "22")) {
          return;
       }
       a.p(p0, "resizeMode");
       this.l = p0;
       if (this.u != null) {
          int i = p0.hashCode();
          if (i != -1881872635) {
             if (i != -1802497111) {
                int i1 = 0;
                if (i) {
                   if (i != 0x5a753b7) {
                      if (i != 0x38b724d4) {
                         if (i == 0x624a0fdd && p0.equals("fourToThree")) {
                            tB = this.B;
                            if (tB != null) {
                               tB.setAspectRatio(5);
                            }
                         }
                      }else if(p0.equals("contain")){
                         tB = this.B;
                         if (tB != null) {
                            tB.setAspectRatio(i1);
                         }
                      }
                   }else if(p0.equals("cover")){
                      tB = this.B;
                      if (tB != null) {
                         tB.setAspectRatio(1);
                      }
                   }
                }else if(p0.equals("")){
                   tB = this.B;
                   if (tB != null) {
                      tB.setAspectRatio(i1);
                   }
                }
             }else if(p0.equals("sixteenToNine")){
                tB = this.B;
                if (tB != null) {
                   tB.setAspectRatio(4);
                }
             }
          }else if(p0.equals("stretch")){
             tB = this.B;
             if (tB != null) {
                tB.setAspectRatio(3);
             }
          }
          this.invalidate();
       }
       return;
    }
    public final void setTapForDismiss(boolean p0){
       this.y = p0;
    }
    public final void setVolumeModifier(float p0){
       if (PatchProxy.isSupport(StargateEggPlayerView.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, StargateEggPlayerView.class, "27")) {
          return;
       }
       this.p = p0;
       StargateEggPlayerView tA = this.A;
       if (tA != null) {
          tA.setVolume(Math.min(p0, 0x3f800000), Math.min(this.p, 0x3f800000));
       }
       return;
    }
}
