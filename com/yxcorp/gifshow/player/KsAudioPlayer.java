package com.yxcorp.gifshow.player.KsAudioPlayer;
import java.lang.String;
import java.lang.Object;
import crd.a;
import gq.a;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.player.KsAudioPlayerState;
import ekd.y0;
import android.os.Looper;
import rxb.c;
import java.lang.Runnable;
import java.io.File;
import qkd.b;
import lnc.i1;
import com.yxcorp.gifshow.player.KsAudioPlayer$KsAudioPlayerException;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import java.lang.IllegalArgumentException;
import crd.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.util.List;
import rxb.e;
import com.yxcorp.gifshow.player.KsAudioPlayer$a;
import java.lang.Enum;
import android.media.MediaPlayer$OnCompletionListener;
import android.media.MediaPlayer;
import rxb.d;
import java.util.concurrent.Callable;
import brd.a0;
import t45.d;
import brd.z;
import erd.g;
import io.reactivex.internal.functions.Functions;
import lq.f;
import java.lang.System;
import com.yxcorp.gifshow.util.PostUtils;
import ekd.k1;
import com.yxcorp.gifshow.player.a;
import rxb.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.Collection;
import ekd.q;
import java.lang.Integer;
import java.lang.RuntimeException;
import com.yxcorp.gifshow.player.KsAudioPlayer$c;
import java.lang.Float;

public class KsAudioPlayer	// class@000fb4
{
    public MediaPlayer a;
    public int b;
    public int c;
    public int d;
    public float e;
    public boolean f;
    public String g;
    public String h;
    public y0 i;
    public final a j;
    public KsAudioPlayerState k;
    public KsAudioPlayerState l;
    public boolean m;
    public KsAudioPlayer$c n;

    public void KsAudioPlayer(String p0,int p1,int p2,float p3){
       super();
       this.c = -1;
       this.e = 0x3f800000;
       this.f = false;
       this.j = new a();
       this.m = false;
       Object[] objArray = new Object[false];
       a.D().w("KsAudioPlayer", "KsAudioPlayer audioFilePath:"+p0+",startTime:"+p1+",duration:"+p2, objArray);
       KsAudioPlayerState iDLE = KsAudioPlayerState.IDLE;
       this.k = iDLE;
       this.l = iDLE;
       this.b = p1;
       this.d = p2;
       this.g = p0;
       this.e = p3;
       y0 oy0 = new y0(Looper.getMainLooper(), 100, new c(this));
       this.i = oy0;
       oy0.e();
       if (!b.S(new File(p0))) {
          throw new IllegalArgumentException("KsAudioPlayer error audioFilePath invalid");
       }
       if (this.b < null) {
          i1.a("KsAudioPlayer", "error startTime invalid");
          ExceptionHandler.handleCaughtException(new KsAudioPlayer$KsAudioPlayerException("startTime is : "+this.b+" startTime invalid"));
          this.b = 0;
       }
       if (this.d <= null) {
          i1.a("KsAudioPlayer", "error duration invalid");
          ExceptionHandler.handleCaughtException(new KsAudioPlayer$KsAudioPlayerException("duration is: "+this.d+" duration invalid"));
          this.d = Integer.MAX_VALUE;
       }
       return;
    }
    public void a(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KsAudioPlayer.class, "21")) {
          return;
       }
       this.j.c(p0);
       return;
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, KsAudioPlayer.class, "14")) {
          return;
       }
       this.c(true);
       return;
    }
    public final void c(boolean p0){
       Object[] objArray1;
       KsAudioPlayer ta;
       KsAudioPlayer ksAudioPlaye = KsAudioPlayer.class;
       if (PatchProxy.isSupport(ksAudioPlaye) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ksAudioPlaye, "15")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("KsAudioPlayer", "changeState mTargetState:"+this.l+",callMediaPause:"+p0, objArray);
       List list = e.a(this.k, this.l);
       if (list == null) {
          throw new IllegalArgumentException("KsAudioPlayer changeState can not from "+this.k+"to "+this.l);
       }
       if (list.isEmpty()) {
          objArray1 = new Object[0];
          a.D().w("KsAudioPlayer", "changeState recursive complete to:"+this.l+",mCurrentState:"+this.k, objArray1);
          return;
       }else {
          KsAudioPlayerState ksAudioPlaye1 = list.get(0);
          int i = KsAudioPlayer$a.a[ksAudioPlaye1.ordinal()];
          if (i != 2) {
             MediaPlayer$OnCompletionListener onCompletion = null;
             if (i != 3) {
                if (i != 4) {
                   if (i == 5) {
                      this.k = KsAudioPlayerState.RELEASED;
                      ta = this.a;
                      ta.setOnCompletionListener(onCompletion);
                      this.a = onCompletion;
                      this.a(a0.y(new d(this, ta)).T(d.c).R(Functions.d(), f.b));
                   }
                }else if(PatchProxy.isSupport(ksAudioPlaye) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ksAudioPlaye, "18")){
                   long l = System.currentTimeMillis();
                   if (p0) {
                      try{
                         this.a.pause();
                      }catch(java.lang.RuntimeException e9){
                         PostUtils.D("KsAudioPlayer", "pauseInner\(\) ", e9);
                      }
                   }
                }
                this.k = KsAudioPlayerState.PAUSED;
                this.b();
             }else if(PatchProxy.applyVoid(onCompletion, this, ksAudioPlaye, "17")){
                this.a.start();
                Object[] objArray2 = new Object[0];
                a.D().w("KsAudioPlayer", "startInner cost:"+k1.t(System.currentTimeMillis()), objArray2);
                this.w(true);
             }
             this.k = KsAudioPlayerState.STARTED;
             ta = this.c;
             if (ta >= null) {
                this.o(ta);
                this.c = -1;
             }
             this.b();
          }else {
             this.a(a0.y(new a(this)).T(d.c).G(d.a).R(new b(this), f.b));
          }
          objArray1 = new Object[0];
          a.D().w("KsAudioPlayer", "changeState ksAudioPlayerState:"+ksAudioPlaye1, objArray1);
          return;
       }
    }
    public final boolean d(){
       Object obj = PatchProxy.apply(null, this, KsAudioPlayer.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = 0;
       if (this.a.getCurrentPosition() < (this.b + this.d)) {
          return i;
       }
       Object[] objArray = new Object[i];
       a.D().w("KsAudioPlayer", "exceedEndPoint", objArray);
       return true;
    }
    public String e(){
       return this.g;
    }
    public String f(){
       return this.h;
    }
    public int g(){
       Object obj = PatchProxy.apply(null, this, KsAudioPlayer.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Object[] objArray = new Object[0];
       a.D().w("KsAudioPlayer", "getDuration duration:"+this.d, objArray);
       return this.d;
    }
    public void h(){
       if (PatchProxy.applyVoid(null, this, KsAudioPlayer.class, "1")) {
          return;
       }
       KsAudioPlayerState iNITIALIZED = KsAudioPlayerState.INITIALIZED;
       if (!q.f(e.a(this.l, iNITIALIZED))) {
          this.l = iNITIALIZED;
          this.m = true;
          this.b();
       }
       return;
    }
    public boolean i(){
       boolean b = (this.f != null || this.e <= 0)? true: false;
       return b;
    }
    public final boolean j(){
       KsAudioPlayer tk = this.k;
       boolean b = (tk == KsAudioPlayerState.PAUSED || tk == KsAudioPlayerState.STARTED)? true: false;
       return b;
    }
    public boolean k(){
       Object obj = PatchProxy.apply(null, this, KsAudioPlayer.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.j() && this.a.isPlaying())? true: false;
       return b;
    }
    public void l(){
       if (PatchProxy.applyVoid(null, this, KsAudioPlayer.class, "11")) {
          return;
       }
       this.m(true);
       return;
    }
    public void m(boolean p0){
       KsAudioPlayer ksAudioPlaye = KsAudioPlayer.class;
       if (PatchProxy.isSupport(ksAudioPlaye) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ksAudioPlaye, "12")) {
          return;
       }
       KsAudioPlayerState pAUSED = KsAudioPlayerState.PAUSED;
       if (!q.f(e.a(this.l, pAUSED))) {
          this.l = pAUSED;
          if (this.m == null) {
             this.c(p0);
          }else {
             Object[] objArray = new Object[0];
             a.D().w("KsAudioPlayer", "pause waiting initialized", objArray);
          }
       }
       return;
    }
    public void n(){
       if (PatchProxy.applyVoid(null, this, KsAudioPlayer.class, "13")) {
          return;
       }
       KsAudioPlayerState rELEASED = KsAudioPlayerState.RELEASED;
       if (!q.f(e.a(this.l, rELEASED))) {
          this.l = rELEASED;
          if (this.m == null) {
             this.b();
             this.i.e();
          }else {
             Object[] objArray = new Object[0];
             a.D().w("KsAudioPlayer", "release waiting initialized", objArray);
          }
       }
       return;
    }
    public void o(int p0){
       KsAudioPlayer ksAudioPlaye = KsAudioPlayer.class;
       if (PatchProxy.isSupport(ksAudioPlaye) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ksAudioPlaye, "4")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("KsAudioPlayer", "seekTo seekTimeMil:"+p0, objArray);
       ksAudioPlaye = this.b;
       if (p0 < ksAudioPlaye || p0 > (ksAudioPlaye + this.d)) {
          i1.c(new IllegalArgumentException("KsAudioPlayer seekTo error seekTimeMil out of boundary"));
          return;
       }else if(this.j()){
          this.a.seekTo(p0);
       }else if(this.m != null){
          this.c = p0;
       }else {
          i1.c(new RuntimeException("KsAudioPlayer seekTo error player not prepared"));
       }
       return;
    }
    public void p(){
       if (PatchProxy.applyVoid(null, this, KsAudioPlayer.class, "3")) {
          return;
       }
       this.o(this.b);
       return;
    }
    public void q(int p0){
       KsAudioPlayer ksAudioPlaye = KsAudioPlayer.class;
       if (PatchProxy.isSupport(ksAudioPlaye) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ksAudioPlaye, "8")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("KsAudioPlayer", "setDuration duration:"+p0, objArray);
       if (this.d <= null) {
          i1.c(new RuntimeException("KsAudioPlayer setDuration invalid duration"));
          return;
       }else {
          this.d = p0;
          return;
       }
    }
    public void r(KsAudioPlayer$c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KsAudioPlayer.class, "5")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("KsAudioPlayer", "setListener listener:"+p0, objArray);
       this.n = p0;
       return;
    }
    public void s(boolean p0){
       KsAudioPlayer ksAudioPlaye = KsAudioPlayer.class;
       if (PatchProxy.isSupport(ksAudioPlaye) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ksAudioPlaye, "10")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("KsAudioPlayer", "setMuted mMuted:"+this.f+",muted:"+p0, objArray);
       if (this.j()) {
          if (p0 && this.f == null) {
             this.a.setVolume(0, 0);
          }else if(!p0 && this.f != null){
             this.a.setVolume(this.e, this.e);
          }else {
             Object[] objArray1 = new Object[i];
             a.D().w("KsAudioPlayer", "setMuted already enable or disable", objArray1);
          }
          this.f = p0;
       }else {
          i1.c(new RuntimeException("KsAudioPlayer setMuted error player not prepared"));
       }
       return;
    }
    public void t(int p0){
       KsAudioPlayer ksAudioPlaye = KsAudioPlayer.class;
       if (PatchProxy.isSupport(ksAudioPlaye) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ksAudioPlaye, "7")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("KsAudioPlayer", "setStartTime startTime:"+p0, objArray);
       if (p0 < 0) {
          i1.c(new RuntimeException("KsAudioPlayer setStartTime invalid startTime"));
          return;
       }else {
          this.b = p0;
          return;
       }
    }
    public void u(float p0){
       KsAudioPlayer ksAudioPlaye = KsAudioPlayer.class;
       if (PatchProxy.isSupport(ksAudioPlaye) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, ksAudioPlaye, "6")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("KsAudioPlayer", "setVolume volume:"+p0, objArray);
       this.e = p0;
       if (this.j()) {
          this.a.setVolume(p0, p0);
       }
       return;
    }
    public void v(){
       if (PatchProxy.applyVoid(null, this, KsAudioPlayer.class, "2")) {
          return;
       }
       KsAudioPlayerState sTARTED = KsAudioPlayerState.STARTED;
       if (!q.f(e.a(this.l, sTARTED))) {
          this.l = sTARTED;
          if (this.m == null) {
             this.b();
          }else {
             Object[] objArray = new Object[0];
             a.D().w("KsAudioPlayer", "start waiting initialized", objArray);
          }
       }
       return;
    }
    public final void w(boolean p0){
       KsAudioPlayer ksAudioPlaye = KsAudioPlayer.class;
       if (PatchProxy.isSupport(ksAudioPlaye) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ksAudioPlaye, "22")) {
          return;
       }
       if (this.i.c() && !p0) {
          this.i.e();
       }else if(!this.i.c() && p0){
          this.i.d();
       }
       return;
    }
}
