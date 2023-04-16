package com.yxcorp.gifshow.albumwrapper.player.KpMidPlayerController;
import com.yxcorp.gifshow.album.widget.preview.a;
import com.yxcorp.gifshow.album.widget.preview.KsAlbumVideoPlayerView;
import com.yxcorp.gifshow.albumwrapper.player.KpMidPlayerController$eventListener$1;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.player.debuginfo.model.KwaiPlayerDebugInfo;
import com.kwai.player.debuginfo.KwaiPlayerDebugInfoProvider;
import java.lang.StringBuilder;
import java.lang.Number;
import com.kwai.video.wayne.player.main.IMediaPlayerApi;
import java.lang.Boolean;
import com.kwai.video.wayne.player.main.IWaynePlayer;
import r79.e;
import java.lang.Runnable;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.albumwrapper.player.KpMidPlayerController$a;
import io.reactivex.i;
import brd.a0;
import g79.a;
import w69.p0;
import brd.z;
import com.yxcorp.gifshow.albumwrapper.player.KpMidPlayerController$b;
import kotlin.jvm.internal.a;
import android.view.ViewGroup;
import android.view.View;
import android.view.TextureView;
import android.content.Context;
import com.yxcorp.gifshow.albumwrapper.player.KpMidPlayerController$c;
import android.view.TextureView$SurfaceTextureListener;
import gp.a;
import q87.c;
import com.kwai.video.wayne.player.listeners.OnPlayerStateChangedListener;
import com.kwai.video.wayne.player.main.IPlayerListener;
import com.kwai.video.player.IMediaPlayer$OnErrorListener;
import com.kwai.video.player.IMediaPlayer$OnVideoSizeChangedListener;
import com.kwai.video.player.IMediaPlayer$OnInfoListener;
import java.lang.Double;
import com.yxcorp.gifshow.albumwrapper.player.KpMidPlayerController$d;
import z1.a;
import ekd.y0;

public final class KpMidPlayerController extends a	// class@001b7d
{
    public final String d;
    public IWaynePlayer e;
    public TextureView f;
    public y0 g;
    public e h;
    public final String i;
    public KpMidPlayerController$eventListener$1 j;

    public void KpMidPlayerController(KsAlbumVideoPlayerView p0){
       super(p0);
       this.d = "KpMidPlayerController";
       this.i = "EnableSeekContinuous";
       this.j = new KpMidPlayerController$eventListener$1(this);
    }
    public String b(){
       Object[] objArray = null;
       KpMidPlayerController obj = PatchProxy.apply(objArray, this, KpMidPlayerController.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.e;
       if (obj != null) {
          KwaiPlayerDebugInfo debugInfo = obj.getDebugInfo();
          if (debugInfo != null) {
             objArray = "KpMid Player\nsdk version: "+debugInfo.mSdkVersion+10+"current time: "+this.q()+"s / "+this.c()+"s\n";
          }
       }
       return objArray;
    }
    public double c(){
       KpMidPlayerController obj = PatchProxy.apply(null, this, KpMidPlayerController.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       obj = this.e;
       double d = (obj != null)? (double)obj.getDuration(): 0;
       return (d / (double)1000);
    }
    public void d(){
    }
    public boolean e(){
       KpMidPlayerController obj = PatchProxy.apply(null, this, KpMidPlayerController.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.e;
       boolean b = true;
       if (obj == null || obj.isPlaying() != b) {
          b = false;
       }
       return b;
    }
    public boolean f(){
       boolean b = (this.e == null)? true: false;
       return b;
    }
    public b g(e p0,Runnable p1,g p2){
       a obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, KpMidPlayerController.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.c;
       b uob = a0.k(new KpMidPlayerController$a(this, p0)).T(obj.i().b()).G(obj.i().b()).R(new KpMidPlayerController$b(this, p1), p2);
       a.o(uob, "Single.create<String> { \x20\x02?.run\(\)\n      }, onError\)\x00");
       return uob;
    }
    public View h(ViewGroup p0){
       TextureView obj = PatchProxy.applyOneRefs(p0, this, KpMidPlayerController.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "parent");
       obj = new TextureView(p0.getContext());
       this.f = obj;
       obj.setSurfaceTextureListener(new KpMidPlayerController$c(this));
       KpMidPlayerController tf = this.f;
       a.m(tf);
       return tf;
    }
    public void i(){
       PatchProxy.applyVoid(null, this, KpMidPlayerController.class, "7");
    }
    public void j(){
       PatchProxy.applyVoid(null, this, KpMidPlayerController.class, "6");
    }
    public void k(){
       if (PatchProxy.applyVoid(null, this, KpMidPlayerController.class, "5")) {
          return;
       }
       KpMidPlayerController te = this.e;
       if (te != null) {
          te.pause();
       }
       return;
    }
    public void l(){
       if (PatchProxy.applyVoid(null, this, KpMidPlayerController.class, "4")) {
          return;
       }
       KpMidPlayerController te = this.e;
       if (te != null) {
          te.start();
       }
       return;
    }
    public void m(){
       if (PatchProxy.applyVoid(null, this, KpMidPlayerController.class, "3")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.C().s(this.d, "release\(\) called", objArray);
       KpMidPlayerController te = this.e;
       if (te != null) {
          te.releaseAsync();
       }
       te = this.e;
       if (te != null) {
          te.unregisterPlayerStateChangedListener(this.j);
       }
       te = this.e;
       if (te != null) {
          te.removeOnErrorListener(this.j);
       }
       te = this.e;
       if (te != null) {
          te.removeOnVideoSizeChangedListener(this.j);
       }
       te = this.e;
       if (te != null) {
          te.removeOnInfoListener(this.j);
       }
       this.s();
       this.e = null;
       return;
    }
    public void n(double p0){
       KpMidPlayerController kpMidPlayerC = KpMidPlayerController.class;
       if (PatchProxy.isSupport(kpMidPlayerC) && PatchProxy.applyVoidOneRefs(Double.valueOf(p0), this, kpMidPlayerC, "8")) {
          return;
       }
       try{
          kpMidPlayerC = this.e;
          if (kpMidPlayerC != null) {
             kpMidPlayerC.seekTo((long)(p0 * (double)1000));
          }
          this.r();
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public final double q(){
       KpMidPlayerController obj = PatchProxy.apply(null, this, KpMidPlayerController.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       obj = this.e;
       double d = (obj != null)? (double)obj.getCurrentPosition(): 0;
       return (d / (double)1000);
    }
    public final void r(){
       if (PatchProxy.applyVoid(null, this, KpMidPlayerController.class, "13")) {
          return;
       }
       this.a(new KpMidPlayerController$d(this));
       return;
    }
    public final void s(){
       if (PatchProxy.applyVoid(null, this, KpMidPlayerController.class, "15")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.C().s(this.d, "stopProgressSchedule\(\) called mProgressUpdateHandler="+this.g, objArray);
       KpMidPlayerController tg = this.g;
       if (tg != null) {
          tg.e();
       }
       return;
    }
}
