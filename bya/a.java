package bya.a;
import java.lang.String;
import android.content.Context;
import com.kwai.video.player.IMediaPlayer$OnErrorListener;
import com.kwai.video.player.IMediaPlayer$OnPreparedListener;
import com.kwai.video.player.IMediaPlayer$OnVideoSizeChangedListener;
import com.kwai.video.cache.AwesomeCacheCallback;
import com.kwai.video.player.IMediaPlayer$OnInfoListener;
import com.kwai.video.player.IMediaPlayer$OnCompletionListener;
import bya.a$a;
import java.lang.Object;
import gq.a;
import q87.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import wc6.d;
import com.kwai.video.wayne.player.builder.WayneBuildData;
import com.kwai.video.wayne.player.builder.PlayerCommonBuildData;
import com.kwai.video.wayne.player.util.CacheKeyUtil;
import com.kwai.video.wayne.player.main.IWaynePlayer;
import com.kwai.video.wayne.player.main.WaynePlayerFactory;
import com.kwai.video.player.IKwaiMediaPlayer;
import com.kwai.framework.player.core.a;
import com.kwai.video.wayne.player.main.IPlayerListener;
import com.kwai.video.wayne.player.listeners.OnWayneErrorListener;
import com.kwai.video.player.kwai_player.AspectAwesomeCache;
import com.kwai.video.wayne.player.main.IMediaPlayerApi;
import android.view.Surface;
import java.lang.Throwable;
import lnc.i1;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.graphics.SurfaceTexture;
import java.lang.RuntimeException;
import com.yxcorp.gifshow.util.PostUtils;

public class a	// class@00048a
{
    public IWaynePlayer a;
    public Surface b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final IMediaPlayer$OnErrorListener f;
    public final IMediaPlayer$OnPreparedListener g;
    public final IMediaPlayer$OnCompletionListener h;
    public final IMediaPlayer$OnInfoListener i;
    public final IMediaPlayer$OnVideoSizeChangedListener j;
    public final AwesomeCacheCallback k;

    public void a(String p0,boolean p1,Context p2,boolean p3,IMediaPlayer$OnErrorListener p4,IMediaPlayer$OnPreparedListener p5,IMediaPlayer$OnVideoSizeChangedListener p6,AwesomeCacheCallback p7,IMediaPlayer$OnInfoListener p8,IMediaPlayer$OnCompletionListener p9,a$a p10){
       super();
       Object[] objArray = new Object[0];
       a.D().w("PostKwaiMediaPlayer", "Start to build media player", objArray);
       this.c = p0;
       this.d = p1;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       this.j = p6;
       this.k = p7;
       this.i = p8;
       this.h = p9;
       this.a();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       d uod = new d("KuaishanPlayer");
       uod.setBizType("KuaishanPlayer").setStartPlayType(0).setBizFt(":ks-features:ft-post:internal-shared-impls").setNormalUrl(this.c, 1);
       if (this.d != null) {
          uod.setCacheKey(CacheKeyUtil.getCacheKey(this.c, 0));
       }
       try{
          IWaynePlayer iWaynePlayer = WaynePlayerFactory.createPlayer(uod);
          this.a = iWaynePlayer;
          a.a(iWaynePlayer.getKernelPlayer());
          a tf = this.f;
          if (tf != null) {
             this.a.addOnErrorListener(tf);
          }
          this.a.addOnWayneErrorListener(new a$a(this));
          tf = this.g;
          if (tf != null) {
             this.a.addOnPreparedListener(tf);
          }
          tf = this.j;
          if (tf != null) {
             this.a.addOnVideoSizeChangedListener(tf);
          }
          if (this.k != null) {
             this.a.getAspectAwesomeCache().setAwesomeCacheCallback(this.k);
          }
          tf = this.i;
          if (tf != null) {
             this.a.addOnInfoListener(tf);
          }
          tf = this.h;
          if (tf != null) {
             this.a.addOnCompletionListener(tf);
          }
          this.a.setLooping(this.e);
          this.a.setSurface(this.b);
          this.a.prepareAsync();
          return;
       }catch(java.lang.Exception e0){
          i1.c(e0);
          return;
       }
    }
    public boolean b(){
       boolean b = (this.a != null)? true: false;
       return b;
    }
    public boolean c(){
       a obj = PatchProxy.apply(null, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.a;
       boolean b = (obj != null && obj.isPlaying())? true: false;
       return b;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, a.class, "5")) {
          return;
       }
       a ta = this.a;
       if (ta == null) {
          return;
       }
       ta.pause();
       return;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, a.class, "9")) {
          return;
       }
       this.f();
       this.g();
       return;
    }
    public void f(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a.class, "8")) {
          return;
       }
       a ta = this.a;
       if (ta != null) {
          ta.pause();
          this.a.setSurface(objArray);
          this.a.removeOnPreparedListener(this.g);
          this.a.removeOnInfoListener(this.i);
          this.a.removeOnCompletionListener(this.h);
          this.a.removeOnErrorListener(this.f);
          this.a.releaseAsync();
          this.a = objArray;
          objArray = new Object[0];
          a.D().w("PostKwaiMediaPlayer", "media player released", objArray);
       }
       return;
    }
    public final void g(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a.class, "7")) {
          return;
       }
       a tb = this.b;
       if (tb != null) {
          tb.release();
          this.b = objArray;
          objArray = new Object[0];
          a.D().s("PostKwaiMediaPlayer", "surface released ", objArray);
       }
       return;
    }
    public void h(SurfaceTexture p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       if (this.a == null) {
          PostUtils.D("PostKwaiMediaPlayer", "setSurface", new RuntimeException("mKwaiMediaPlayer is released"));
          return;
       }else {
          this.g();
          Surface surface = new Surface(p0);
          this.b = surface;
          this.a.setSurface(surface);
          this.a.stepFrame();
          return;
       }
    }
    public void i(){
       if (PatchProxy.applyVoid(null, this, a.class, "6")) {
          return;
       }
       a ta = this.a;
       if (ta == null) {
          i1.c(new RuntimeException("PostKwaiMediaPlayer start\(\) called, player is released"));
          return;
       }else {
          ta.start();
          return;
       }
    }
    public void j(){
       if (PatchProxy.applyVoid(null, this, a.class, "4")) {
          return;
       }
       a ta = this.a;
       if (ta == null) {
          i1.c(new RuntimeException("PostKwaiMediaPlayer stepFrame\(\) called, player is released"));
          return;
       }else if(ta.isPlaying()){
          return;
       }else {
          this.a.stepFrame();
          return;
       }
    }
}
