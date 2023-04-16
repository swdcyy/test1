package hd9.p;
import com.yxcorp.gifshow.camera.record.followshoot.f;
import java.lang.Object;
import com.kwai.video.player.KsMediaPlayer$Builder;
import android.content.Context;
import lnc.a1;
import com.kwai.video.player.KsMediaPlayer;
import java.lang.String;
import kotlin.jvm.internal.a;
import nc6.e;
import hd9.p$a;
import com.kwai.video.player.IMediaPlayer$OnPreparedListener;
import com.kwai.video.player.AbstractMediaPlayer;
import hd9.p$b;
import com.kwai.video.player.IMediaPlayer$OnCompletionListener;
import hd9.p$c;
import com.kwai.video.player.IMediaPlayer$OnErrorListener;
import hd9.p$d;
import com.kwai.video.player.KsMediaPlayer$OnAudioProcessPCMListener;
import com.kwai.video.player.AbstractNativeMediaPlayer;
import hd9.p$e;
import com.kwai.video.player.IMediaPlayer$OnSeekCompleteListener;
import hd9.p$f;
import com.kwai.video.player.IMediaPlayer$OnInfoListener;
import hd9.p$g;
import com.kwai.video.player.IMediaPlayer$OnBufferingUpdateListener;
import com.yxcorp.gifshow.camera.record.followshoot.f$f;
import com.yxcorp.gifshow.camera.record.followshoot.f$e;
import com.yxcorp.gifshow.camera.record.followshoot.f$c;
import com.yxcorp.gifshow.camera.record.followshoot.f$a;
import com.yxcorp.gifshow.camera.record.followshoot.f$d;
import com.yxcorp.gifshow.camera.record.followshoot.f$g;
import com.yxcorp.gifshow.camera.record.followshoot.f$b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.video.player.MediaInfo;
import android.view.Surface;
import java.lang.Boolean;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import java.lang.Long;
import java.lang.Float;

public final class p implements f	// class@002627
{
    public final KsMediaPlayer a;
    public f$b b;
    public f$c c;
    public f$e d;
    public f$f e;
    public f$g f;
    public f$d g;
    public f$a h;
    public e i;

    public void p(){
       super();
       KsMediaPlayer ksMediaPlaye = new KsMediaPlayer$Builder(a1.c()).build();
       a.o(ksMediaPlaye, "KsMediaPlayer.Builder\(Co¡­onUtil.context\(\)\).build\(\)");
       this.a = ksMediaPlaye;
       this.i = new e();
       ksMediaPlaye.setBizFt("LocalSourceMediaPlayer");
       ksMediaPlaye.setOption(4, "start-on-prepared", 0);
       ksMediaPlaye.setOption(4, "enable-accurate-seek", 1);
       ksMediaPlaye.setOption(4, "framedrop", 8);
       ksMediaPlaye.setAudioStreamType(3);
       ksMediaPlaye.setOnPreparedListener(new p$a(this));
       ksMediaPlaye.setOnCompletionListener(new p$b(this));
       ksMediaPlaye.setOnErrorListener(new p$c(this));
       ksMediaPlaye.setOnAudioProcessPCMAvailableListener(new p$d(this));
       ksMediaPlaye.setOnSeekCompleteListener(new p$e(this));
       ksMediaPlaye.setOnInfoListener(new p$f(this));
       ksMediaPlaye.setOnBufferingUpdateListener(new p$g(this));
    }
    public void a(f$f p0){
       this.e = p0;
    }
    public void b(f$e p0){
       this.d = p0;
    }
    public void c(f$c p0){
       this.c = p0;
    }
    public void d(f$a p0){
       this.h = p0;
    }
    public void e(f$d p0){
       this.g = p0;
    }
    public void f(f$g p0){
       this.f = p0;
    }
    public void g(f$b p0){
       this.b = p0;
    }
    public long getCurrentPosition(){
       Object obj = PatchProxy.apply(null, this, p.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.a.getCurrentPosition();
    }
    public long getDuration(){
       Object obj = PatchProxy.apply(null, this, p.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.a.getDuration();
    }
    public MediaInfo getMediaInfo(){
       Object obj = PatchProxy.apply(null, this, p.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.getMediaInfo();
    }
    public Surface getSurface(){
       Object obj = PatchProxy.apply(null, this, p.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.getSurface();
    }
    public int getVideoHeight(){
       Object obj = PatchProxy.apply(null, this, p.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.a.getVideoHeight();
    }
    public int getVideoWidth(){
       Object obj = PatchProxy.apply(null, this, p.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.a.getVideoWidth();
    }
    public final KsMediaPlayer h(){
       return this.a;
    }
    public final void i(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p.class, "17")) {
          return;
       }
       a.p(p0, "path");
       this.a.setDataSource(p0);
       return;
    }
    public boolean isPlaying(){
       Object obj = PatchProxy.apply(null, this, p.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.a.isPlaying();
    }
    public final void j(long p0,String p1,ClientEvent$UrlPackage p2){
       if (PatchProxy.isSupport(p.class) && PatchProxy.applyVoidThreeRefs(Long.valueOf(p0), p1, p2, this, p.class, "19")) {
          return;
       }
       a.p(p1, "photoId");
       a.p(p2, "page");
       p ti = this.i;
       if (ti != null) {
          ti.d(p0);
          ti.h(p1);
       }
       return;
    }
    public final void k(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p.class, "18")) {
          return;
       }
       a.p(p0, "key");
       this.a.setCacheKey(p0);
       return;
    }
    public void pause(){
       if (PatchProxy.applyVoid(null, this, p.class, "8")) {
          return;
       }
       this.a.pause();
       return;
    }
    public void prepareAsync(){
       if (PatchProxy.applyVoid(null, this, p.class, "12")) {
          return;
       }
       this.a.prepareAsync();
       return;
    }
    public void release(){
       p op = p.class;
       if (PatchProxy.applyVoid(null, this, op, "4")) {
          return;
       }
       if (!PatchProxy.applyVoid(null, this, op, "20")) {
          op = this.i;
          if (op != null) {
             op.e(1);
             op.a(this.a.getVideoStatJson());
          }
          this.i = null;
       }
       this.a.release();
       return;
    }
    public void reset(){
       if (PatchProxy.applyVoid(null, this, p.class, "5")) {
          return;
       }
       this.a.reset();
       return;
    }
    public void seekTo(long p0){
       p op = p.class;
       if (PatchProxy.isSupport(op) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, op, "1")) {
          return;
       }
       this.a.seekTo(p0);
       return;
    }
    public void setSpeed(float p0){
       p op = p.class;
       if (PatchProxy.isSupport(op) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, op, "9")) {
          return;
       }
       this.a.setSpeed(p0);
       return;
    }
    public void setSurface(Surface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p.class, "10")) {
          return;
       }
       this.a.setSurface(p0);
       return;
    }
    public void setVolume(float p0,float p1){
       p op = p.class;
       if (PatchProxy.isSupport(op) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), Float.valueOf(p1), this, op, "6")) {
          return;
       }
       this.a.setVolume(p0, p1);
       return;
    }
    public void start(){
       if (PatchProxy.applyVoid(null, this, p.class, "7")) {
          return;
       }
       this.a.start();
       return;
    }
}
