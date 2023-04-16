package aa9.b;
import w99.g;
import aa9.b$a;
import nsd.u;
import aa9.c;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import v5a.g;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Boolean;
import java.util.Set;
import com.google.common.collect.o;
import p5a.h;
import aa9.b$e;
import aa9.b$b;
import aa9.b$d;
import aa9.b$c;
import aa9.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.player.IKwaiMediaPlayer;
import com.kwai.framework.player.core.f;
import com.kwai.framework.player.multisource.PlaySourceSwitcher$a;
import java.util.HashMap;
import java.util.Map;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import java.lang.StringBuilder;
import java.lang.Number;
import p5a.c;
import com.kwai.framework.player.core.b;
import java.lang.Float;
import com.kuaishou.android.model.feed.PhotoType;
import java.lang.Enum;
import u99.d;
import v5a.a$b;
import android.app.Application;
import o56.a;
import android.content.Context;
import v5a.a;
import wc6.d;
import com.kwai.video.wayne.player.builder.WayneBuildData;
import com.kwai.video.wayne.player.builder.PlayerCommonBuildData;
import v5a.f;
import nc6.d;
import u99.f;
import nc6.f;
import com.kwai.framework.player.multisource.e;
import com.kwai.video.player.IMediaPlayer$OnInfoListener;
import com.kwai.framework.player.core.b$b;
import com.kwai.video.player.IMediaPlayer$OnPreparedListener;
import android.view.Surface;
import java.lang.Long;

public final class b implements g	// class@000070
{
    public g b;
    public c c;
    public final QPhoto d;
    public long e;
    public int f;
    public final f g;
    public final boolean h;
    public final Set i;
    public final e j;
    public final IMediaPlayer$OnInfoListener k;
    public final b$b l;
    public final IMediaPlayer$OnPreparedListener m;
    public static final b$a n;

    static {
       b.n = new b$a(null);
    }
    public void b(c p0){
       a.p(p0, "moduleParam");
       super();
       this.b = new g();
       this.c = p0;
       QPhoto qPhoto = p0.a();
       this.d = qPhoto;
       this.g = p0.c;
       p0 = p0.d;
       boolean b = (p0 != null)? p0.booleanValue(): false;
       this.h = b;
       Set set = o.g();
       a.o(set, "Sets.newConcurrentHashSet\(\)");
       this.i = set;
       this.f = h.e(qPhoto);
       this.j = new b$e(this);
       this.k = new b$b(this);
       this.l = new b$d(this);
       this.m = new b$c(this);
       return;
    }
    public final void a(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "3")) {
          return;
       }
       a.p(p0, "autoPlayerListener");
       this.i.add(p0);
       return;
    }
    public final String b(){
       Object[] objArray = null;
       IKwaiMediaPlayer obj = PatchProxy.apply(objArray, this, b.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b.getIKwaiMediaPlayer();
       if (obj != null) {
          objArray = obj.getBriefVodStatJson();
       }
       return objArray;
    }
    public final PlaySourceSwitcher$a c(){
       Object obj = PatchProxy.apply(null, this, b.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.getCurrentPlaySource();
    }
    public final HashMap d(){
       HashMap obj = PatchProxy.apply(null, this, b.class, "40");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       obj.put("playModuleHash", String.valueOf(this.hashCode()));
       obj.put("feedId", r1.t1(this.c.a().mEntity));
       obj.put("userName", r1.V1(this.c.a().mEntity));
       obj.put("isPlaying", String.valueOf(this.isPlaying())+", "+String.valueOf(this.l()));
       return obj;
    }
    public final int e(){
       Object obj = PatchProxy.apply(null, this, b.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.U();
    }
    public final g f(){
       return this.b;
    }
    public final c g(){
       Object obj = PatchProxy.apply(null, this, b.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.j0();
    }
    public long getDuration(){
       c obj = PatchProxy.apply(null, this, b.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       obj = this.g();
       long duration = (obj != null)? obj.getDuration(): -1;
       return duration;
    }
    public String getPhotoId(){
       Object obj = PatchProxy.apply(null, this, b.class, "41");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "";
    }
    public final Float h(){
       Object[] objArray = null;
       IKwaiMediaPlayer obj = PatchProxy.apply(objArray, this, b.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b.getIKwaiMediaPlayer();
       if (obj != null) {
          objArray = Float.valueOf(obj.getVideoAvgFps());
       }
       return objArray;
    }
    public final String i(){
       Object[] objArray = null;
       IKwaiMediaPlayer obj = PatchProxy.apply(objArray, this, b.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b.getIKwaiMediaPlayer();
       if (obj != null) {
          objArray = obj.getVodStatJson();
       }
       return objArray;
    }
    public boolean isBuffering(){
       Object obj = PatchProxy.apply(null, this, b.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.b.isBuffering();
    }
    public boolean isPlaying(){
       Object obj = PatchProxy.apply(null, this, b.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.b.isPlaying();
    }
    public boolean isPreparing(){
       Object obj = PatchProxy.apply(null, this, b.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.b.isPreparing();
    }
    public final boolean j(){
       Object obj = PatchProxy.apply(null, this, b.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.b.j();
    }
    public String k(){
       Object obj = PatchProxy.apply(null, this, b.class, "37");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "feed type : "+r1.S1(this.d.mEntity).name()+"\nfeed id : "+this.d.getPhotoId()+"\nuser : "+this.d.getUserName();
    }
    public final boolean l(){
       Object obj = PatchProxy.apply(null, this, b.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.b.isPrepared();
    }
    public long m(){
       c obj = PatchProxy.apply(null, this, b.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       obj = this.g();
       long currentPosit = (obj != null)? obj.getCurrentPosition(): -1;
       return currentPosit;
    }
    public void mute(){
       if (PatchProxy.applyVoid(null, this, b.class, "35")) {
          return;
       }
       this.b.setVolume(0, 0);
       return;
    }
    public final boolean n(){
       Object obj = PatchProxy.apply(null, this, b.class, "33");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.b.isVideoRenderingStart();
    }
    public final void o(){
       b uob = b.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uob, "8")) {
          return;
       }
       d.h("VideoAutoPlayModule", "recreatePlayer", this.d());
       c uoc = this.g();
       if (uoc != null) {
          uoc.release();
       }
       if (!PatchProxy.applyVoid(objArray, this, uob, "2")) {
          uoc = this.g();
          int retryCount = (uoc != null)? uoc.getRetryCount(): 0;
          a uoa = new a$b(a.b(), this.d).a();
          a.o(uoa, "Builder\(AppEnv.getAppContext\(\), mQPhoto\).build\(\)");
          PlayerCommonBuildData playerCommon = uoa.c().setStartPosition(this.e).setBizFt(":ks-components:auto-play").setBizType(r1.o0(this.d.getEntity(), "VideoAutoPlay")).setMediaCodecPolicy(2);
          a.o(playerCommon, "playerBuildData.getPlaye¡­MediaCodecPolicy.DISABLE\)");
          playerCommon.setPlayIndex(retryCount);
          if (this.h != null) {
             d uod = uoa.c();
             a.o(uod, "playerBuildData.getPlayerVodBuildData3\(\)");
             uod.setVodManifestHdrAdaptiveMode(1);
          }
          f uof = new f();
          this.b.h0(uof, this.d);
          uof.J(uoa);
          uof.prepareAsync();
          if (!PatchProxy.applyVoid(objArray, this, uob, "5")) {
             d uod1 = this.b.x();
             b tg = this.g;
             if (tg != null) {
                objArray = tg.l;
             }
             uod1.g(objArray);
             this.b.x().h(this.d.getPhotoId());
             if (this.d.isVideoType()) {
                this.b.x().e(1);
             }else {
                this.b.x().e(2);
             }
          }
       }
       return;
    }
    public final void p(){
       if (PatchProxy.applyVoid(null, this, b.class, "39")) {
          return;
       }
       this.b.d(this.j);
       this.b.addOnInfoListener(this.k);
       this.b.w(this.l);
       this.b.addOnPreparedListener(this.m);
       return;
    }
    public void pause(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "13")) {
          return;
       }
       a.p(p0, "type");
       d.h("VideoAutoPlayModule", "pause", this.d());
       c uoc = this.g();
       if (uoc != null) {
          uoc.pause();
       }
       return;
    }
    public final void q(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "4")) {
          return;
       }
       a.p(p0, "autoPlayerListener");
       this.i.remove(p0);
       return;
    }
    public final void r(){
       if (PatchProxy.applyVoid(null, this, b.class, "15")) {
          return;
       }
       this.b.x().f();
       return;
    }
    public void release(){
       b uob = b.class;
       if (PatchProxy.applyVoid(null, this, uob, "6")) {
          return;
       }
       d.h("VideoAutoPlayModule", "release", this.d());
       if (!PatchProxy.applyVoidOneRefs(null, this, uob, "24")) {
          this.b.setSurface(null);
       }
       c uoc = this.g();
       if (uoc != null) {
          uoc.release();
       }
       this.b.i0();
       return;
    }
    public void resume(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "12")) {
          return;
       }
       a.p(p0, "type");
       d.h("VideoAutoPlayModule", "resume", this.d());
       b tg = this.g;
       if (tg != null) {
          tg.i();
       }
       if (this.g() != null) {
          c uoc = this.g();
          if (uoc != null) {
             uoc.start();
          }
       }else {
          this.o();
       }
       return;
    }
    public final void s(){
       if (PatchProxy.applyVoid(null, this, b.class, "38")) {
          return;
       }
       this.b.e(this.j);
       this.b.removeOnPreparedListener(this.m);
       this.b.O(this.l);
       return;
    }
    public void seekTo(long p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uob, "14")) {
          return;
       }
       d.h("VideoAutoPlayModule", "seekTo", this.d());
       c uoc = this.g();
       if (uoc != null) {
          uoc.seekTo(p0);
       }
       return;
    }
    public void startPlay(){
       if (PatchProxy.applyVoid(null, this, b.class, "10")) {
          return;
       }
       d.h("VideoAutoPlayModule", "startPlay", this.d());
       b tg = this.g;
       if (tg != null) {
          tg.i();
       }
       if (!this.l()) {
          this.o();
       }else {
          c uoc = this.g();
          if (uoc != null) {
             uoc.start();
          }
       }
       return;
    }
    public void stopPlay(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "11")) {
          return;
       }
       a.p(p0, "type");
       d.h("VideoAutoPlayModule", "stopPlay", this.d());
       c uoc = this.g();
       if (uoc != null) {
          uoc.stop();
       }
       return;
    }
    public boolean t(){
       Object obj = PatchProxy.apply(null, this, b.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.b.isPlaying();
    }
    public void unMute(){
       if (PatchProxy.applyVoid(null, this, b.class, "36")) {
          return;
       }
       this.b.setVolume(0x3f800000, 0x3f800000);
       return;
    }
}
