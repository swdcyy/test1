package com.kuaishou.tk.api.view.player.TKOlympicPlayerView;
import android.widget.FrameLayout;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.tk.api.view.player.TKOlympicPlayerView$a;
import wx4.b;
import wx4.b$a;
import android.os.Handler;
import com.kuaishou.tk.api.view.player.TKPlayerRunSafeThread;
import wx4.c;
import com.kuaishou.tk.api.view.player.logger.DftTKOlympicPlayerLogger;
import com.kuaishou.tk.api.view.player.TKOlympicPlayerView$mVesLogger$1;
import msd.l;
import com.kuaishou.tk.api.view.player.TKOlympicPlayerView$mPlayerStateChangedListener$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kuaishou.tk.api.view.player.TKOlympicPlayerView$mAbLoopLnr$2;
import com.kuaishou.tk.api.view.player.TKOlympicPlayerView$g;
import com.kuaishou.tk.api.view.player.TKOlympicPlayerView$i;
import com.kuaishou.tk.api.view.player.TKOlympicPlayerView$f;
import com.kuaishou.tk.api.view.player.TKOlympicPlayerView$c;
import com.kuaishou.tk.api.view.player.TKOlympicPlayerView$e;
import com.kuaishou.tk.api.view.player.TKOlympicPlayerView$h;
import com.kuaishou.tk.api.view.player.TKOlympicPlayerView$d;
import com.kuaishou.tk.api.view.player.TKOlympicPlayerView$b;
import android.util.AttributeSet;
import com.kwai.framework.player.core.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.tk.api.view.player.TKOlympicPlayerView$createPlayerShortVideoNormalUrl$1;
import com.kuaishou.tk.api.view.player.TKOlympicPlayerView$createPlayerShortVideoNormalUrl$2;
import java.lang.Integer;
import java.lang.Boolean;
import com.kwai.video.player.IKwaiMediaPlayer;
import com.kwai.video.player.IMediaPlayer;
import com.kwai.video.player.IMediaPlayer$OnErrorListener;
import java.lang.Runnable;
import com.kuaishou.tk.api.view.player.TKOlympicPlayerView$releasePlayer$1;
import com.kuaishou.tk.api.view.player.TKOlympicPlayerView$releasePlayer$2;
import java.lang.Number;
import com.kwai.video.player.IMediaPlayer$OnABLoopEndOfCounterListener;
import com.kwai.framework.player.core.b$b;
import nc6.d;
import android.view.ViewGroup;
import com.kuaishou.tk.api.view.player.TextureRenderView;
import android.view.MotionEvent;
import android.view.View;
import com.kuaishou.tk.api.view.player.TKOlympicPlayerView$j;
import yx4.a;
import com.kwai.video.player.IMediaPlayer$OnInfoListener;
import yx4.b;
import wx4.a;
import wx4.a$b;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import com.kuaishou.tk.api.view.player.TKOlympicPlayerView$k;
import android.view.View$OnClickListener;
import java.lang.Float;
import java.lang.Math;

public final class TKOlympicPlayerView extends FrameLayout	// class@000fae
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
    public String K;
    public int L;
    public a M;
    public int N;
    public b$b O;
    public final p P;
    public b Q;
    public a R;
    public IMediaPlayer$OnABLoopEndOfCounterListener S;
    public final p T;
    public long U;
    public a$b U0;
    public long V;
    public IMediaPlayer$OnVideoSizeChangedListener V0;
    public int W;
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
    public HashMap e1;
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

    public void TKOlympicPlayerView(Context p0){
       a.p(p0, "context");
       super(p0);
       this.e = new TKOlympicPlayerView$a(this);
       this.b = b.b.a()[0];
       this.c = -2;
       this.d = TKPlayerRunSafeThread.a();
       this.f = "";
       this.g = "mp4";
       this.j = true;
       this.l = "contain";
       this.n = true;
       this.o = true;
       this.p = 0x3f800000;
       this.q = 100.00f;
       this.I = new c();
       this.K = "tk_olympic";
       this.L = 10;
       this.M = new DftTKOlympicPlayerLogger(new TKOlympicPlayerView$mVesLogger$1(this));
       this.N = 1;
       this.P = s.c(new TKOlympicPlayerView$mPlayerStateChangedListener$2(this));
       this.T = s.c(new TKOlympicPlayerView$mAbLoopLnr$2(this));
       this.U = -1;
       this.V = -1;
       this.U0 = new TKOlympicPlayerView$g(this);
       this.V0 = new TKOlympicPlayerView$i(this);
       this.W0 = new TKOlympicPlayerView$f(this);
       this.X0 = new TKOlympicPlayerView$c(this);
       this.Z0 = new TKOlympicPlayerView$e(this);
       this.a1 = new TKOlympicPlayerView$h(this);
       this.c1 = new TKOlympicPlayerView$d(this);
       this.d1 = new TKOlympicPlayerView$b(this);
    }
    public void TKOlympicPlayerView(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1);
       this.e = new TKOlympicPlayerView$a(this);
       this.b = b.b.a()[0];
       this.c = -2;
       this.d = TKPlayerRunSafeThread.a();
       this.f = "";
       this.g = "mp4";
       this.j = true;
       this.l = "contain";
       this.n = true;
       this.o = true;
       this.p = 0x3f800000;
       this.q = 100.00f;
       this.I = new c();
       this.K = "tk_olympic";
       this.L = 10;
       this.M = new DftTKOlympicPlayerLogger(new TKOlympicPlayerView$mVesLogger$1(this));
       this.N = 1;
       this.P = s.c(new TKOlympicPlayerView$mPlayerStateChangedListener$2(this));
       this.T = s.c(new TKOlympicPlayerView$mAbLoopLnr$2(this));
       this.U = -1;
       this.V = -1;
       this.U0 = new TKOlympicPlayerView$g(this);
       this.V0 = new TKOlympicPlayerView$i(this);
       this.W0 = new TKOlympicPlayerView$f(this);
       this.X0 = new TKOlympicPlayerView$c(this);
       this.Z0 = new TKOlympicPlayerView$e(this);
       this.a1 = new TKOlympicPlayerView$h(this);
       this.c1 = new TKOlympicPlayerView$d(this);
       this.d1 = new TKOlympicPlayerView$b(this);
    }
    public void TKOlympicPlayerView(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       this.e = new TKOlympicPlayerView$a(this);
       this.b = b.b.a()[0];
       this.c = -2;
       this.d = TKPlayerRunSafeThread.a();
       this.f = "";
       this.g = "mp4";
       this.j = true;
       this.l = "contain";
       this.n = true;
       this.o = true;
       this.p = 0x3f800000;
       this.q = 100.00f;
       this.I = new c();
       this.K = "tk_olympic";
       this.L = 10;
       this.M = new DftTKOlympicPlayerLogger(new TKOlympicPlayerView$mVesLogger$1(this));
       this.N = 1;
       this.P = s.c(new TKOlympicPlayerView$mPlayerStateChangedListener$2(this));
       this.T = s.c(new TKOlympicPlayerView$mAbLoopLnr$2(this));
       this.U = -1;
       this.V = -1;
       this.U0 = new TKOlympicPlayerView$g(this);
       this.V0 = new TKOlympicPlayerView$i(this);
       this.W0 = new TKOlympicPlayerView$f(this);
       this.X0 = new TKOlympicPlayerView$c(this);
       this.Z0 = new TKOlympicPlayerView$e(this);
       this.a1 = new TKOlympicPlayerView$h(this);
       this.c1 = new TKOlympicPlayerView$d(this);
       this.d1 = new TKOlympicPlayerView$b(this);
    }
    public final b a(){
       Object obj = PatchProxy.apply(null, this, TKOlympicPlayerView.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return TKPlayerRunSafeThread.b(new TKOlympicPlayerView$createPlayerShortVideoNormalUrl$1(this), TKOlympicPlayerView$createPlayerShortVideoNormalUrl$2.INSTANCE);
    }
    public final boolean b(int p0,int p1){
       TKOlympicPlayerView obj;
       if (PatchProxy.isSupport(TKOlympicPlayerView.class)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, TKOlympicPlayerView.class, "19");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = this.A;
       boolean b = false;
       if (obj != null) {
          IKwaiMediaPlayer iKwaiMediaPl = obj.getIKwaiMediaPlayer();
          if (iKwaiMediaPl != null) {
             TKOlympicPlayerView tb1 = this.b1;
             if (tb1 != null) {
                b = tb1.onError(iKwaiMediaPl, p0, p1);
             }
          }
       }
       return b;
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, TKOlympicPlayerView.class, "11")) {
          return;
       }
       this.d.removeCallbacks(this.e);
       return;
    }
    public final void d(){
       if (PatchProxy.applyVoid(null, this, TKOlympicPlayerView.class, "13")) {
          return;
       }
       TKPlayerRunSafeThread.b(new TKOlympicPlayerView$releasePlayer$1(this), TKOlympicPlayerView$releasePlayer$2.INSTANCE);
       return;
    }
    public final long getCurrentPosition(){
       TKOlympicPlayerView obj = PatchProxy.apply(null, this, TKOlympicPlayerView.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       obj = this.A;
       long currentPosit = (obj != null)? obj.getCurrentPosition(): 0;
       return currentPosit;
    }
    public final b getInnerPlayer(){
       return this.A;
    }
    public final IMediaPlayer$OnABLoopEndOfCounterListener getMAbLoopLnr(){
       Object obj = PatchProxy.apply(null, this, TKOlympicPlayerView.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.T.getValue();
    }
    public final b$b getMPlayerStateChangedListener(){
       Object obj = PatchProxy.apply(null, this, TKOlympicPlayerView.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.P.getValue();
    }
    public final d getPlayerLogger(){
       Object[] objArray = null;
       TKOlympicPlayerView obj = PatchProxy.apply(objArray, this, TKOlympicPlayerView.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.A;
       if (obj != null) {
          objArray = obj.x();
       }
       return objArray;
    }
    public final float getVolume(){
       return this.p;
    }
    public void onAttachedToWindow(){
       if (PatchProxy.applyVoid(null, this, TKOlympicPlayerView.class, "32")) {
          return;
       }
       super.onAttachedToWindow();
       TKOlympicPlayerView tf = this.f;
       TKOlympicPlayerView tj = this.j;
       TKOlympicPlayerView tg = this.g;
       TKOlympicPlayerView th = this.h;
       TKOlympicPlayerView ti = this.i;
       TKOlympicPlayerView tk = this.k;
       if (PatchProxy.isSupport(TKOlympicPlayerView.class)) {
          Object[] objArray = new Object[]{tf,Boolean.valueOf(tj),tg,Boolean.valueOf(th),Boolean.valueOf(ti),Boolean.valueOf(tk)};
          if (PatchProxy.applyVoid(objArray, this, TKOlympicPlayerView.class, "23")) {
          label_0084 :
             this.setKeepScreenOn(this.o);
             return;
          }
       }
       a.p(tf, "uriString");
       a.p(tg, "type");
       this.f = tf;
       this.j = tj;
       this.g = tg;
       this.h = th;
       this.i = ti;
       this.k = tk;
       this.u = false;
       this.v = 0;
       this.w = 0;
       Context context = this.getContext();
       a.o(context, "context");
       this.setRenderView(new TextureRenderView(context));
       this.x = false;
       goto label_0084 ;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, TKOlympicPlayerView.class, "31")) {
          return;
       }
       this.u = false;
       super.onDetachedFromWindow();
       this.setKeepScreenOn(false);
       return;
    }
    public boolean onTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TKOlympicPlayerView.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "event");
       return super.onTouchEvent(p0);
    }
    public void requestLayout(){
       if (PatchProxy.applyVoid(null, this, TKOlympicPlayerView.class, "7")) {
          return;
       }
       super.requestLayout();
       this.post(new TKOlympicPlayerView$j(this));
       return;
    }
    public final void setOnABLoopListener(IMediaPlayer$OnABLoopEndOfCounterListener p0){
       this.S = p0;
    }
    public final void setOnEndListener(a p0){
       this.R = p0;
    }
    public final void setOnPlayerError(IMediaPlayer$OnErrorListener p0){
       this.b1 = p0;
    }
    public final void setOnPlayerInfoDidChange(IMediaPlayer$OnInfoListener p0){
       this.Y0 = p0;
    }
    public final void setOnPlayerStatusDidChange(b$b p0){
       this.O = p0;
    }
    public final void setOnProgressListener(b p0){
       this.Q = p0;
    }
    public final void setPausedModifier(Boolean p0){
       TKOlympicPlayerView tA;
       TKOlympicPlayerView tc;
       if (PatchProxy.applyVoidOneRefs(p0, this, TKOlympicPlayerView.class, "26")) {
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
          this.c();
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
             if (!PatchProxy.applyVoid(null, this, TKOlympicPlayerView.class, "12")) {
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
    public final void setPreventsDisplaySleepDuringVideoPlaybackModifier(boolean p0){
       if (PatchProxy.isSupport(TKOlympicPlayerView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, TKOlympicPlayerView.class, "28")) {
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
    public final void setProgressUpdateInterval(float p0){
       this.q = p0;
    }
    public final void setRenderView(TextureRenderView p0){
       a uoa1;
       if (PatchProxy.applyVoidOneRefs(p0, this, TKOlympicPlayerView.class, "9")) {
          return;
       }
       TKOlympicPlayerView tB = this.B;
       if (tB != null) {
          a uoa = null;
          View view = (tB != null)? tB.getView(): uoa;
          if (view != null) {
             tB = this.B;
             view = (tB != null)? tB.getView(): uoa;
             TKOlympicPlayerView tB1 = this.B;
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
          TKOlympicPlayerView tD = this.D;
          if (tD > null) {
             p0.setVideoSize(tB, tD);
          }
       }
       TKOlympicPlayerView tB2 = this.B;
       a.m(tB2);
       View view1 = tB2.getView();
       a.m(view1);
       view1.setLayoutParams(new FrameLayout$LayoutParams(-2, -2, 17));
       this.addView(view1);
       tB2 = this.B;
       a.m(tB2);
       tB2.a(this.U0);
       tB2 = this.B;
       a.m(tB2);
       tB2.setVideoRotation(this.G);
       tB2 = this.B;
       a.m(tB2);
       view1 = tB2.getView();
       if (view1 != null) {
          view1.setOnClickListener(new TKOlympicPlayerView$k(this));
       }
       return;
    }
    public final void setRepeatModifier(boolean p0){
       if (PatchProxy.isSupport(TKOlympicPlayerView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, TKOlympicPlayerView.class, "25")) {
          return;
       }
       this.m = p0;
       if (this.u != null) {
          TKOlympicPlayerView tA = this.A;
          if (tA != null) {
             tA.setLooping(p0);
          }
       }
       return;
    }
    public final void setResizeModeModifier(String p0){
       TKOlympicPlayerView tB;
       if (PatchProxy.applyVoidOneRefs(p0, this, TKOlympicPlayerView.class, "24")) {
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
       if (PatchProxy.isSupport(TKOlympicPlayerView.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, TKOlympicPlayerView.class, "29")) {
          return;
       }
       this.p = p0;
       TKOlympicPlayerView tA = this.A;
       if (tA != null) {
          tA.setVolume(Math.min(p0, 0x3f800000), Math.min(this.p, 0x3f800000));
       }
       return;
    }
}
