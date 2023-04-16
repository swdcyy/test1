package com.kwai.library.kwaiplayerkit.domain.play.PlayModule;
import mx6.a;
import com.kwai.video.wayne.player.listeners.OnPlayerStateChangedListener;
import com.kwai.video.player.IMediaPlayer$OnInfoListener;
import com.kwai.video.player.IMediaPlayer$OnErrorListener;
import com.kwai.video.player.IMediaPlayer$OnPreparedListener;
import com.kwai.video.wayne.player.listeners.OnPlayerLoadingChangedListener;
import com.kwai.library.kwaiplayerkit.framework.module.function.FunctionModule;
import com.kwai.library.kwaiplayerkit.domain.play.PlayModule$a;
import nsd.u;
import com.kwai.library.kwaiplayerkit.domain.play.PlayModule$b;
import java.lang.String;
import com.kwai.video.wayne.player.main.IWaynePlayer;
import java.lang.Object;
import com.kwai.video.wayne.player.main.PlayerState;
import kotlin.jvm.internal.a;
import px6.b;
import com.kwai.library.kwaiplayerkit.framework.KwaiPlayerKit;
import wx6.c;
import com.kwai.library.kwaiplayerkit.framework.session.PlaySession;
import java.util.List;
import tx6.b;
import mx6.c;
import java.lang.Class;
import tx6.a;
import mx6.d;
import kotlin.collections.CollectionsKt__CollectionsKt;
import tx6.c;
import com.kwai.video.wayne.player.main.IPlayerListener;
import zx6.b;
import com.kwai.library.kwaiplayerkit.domain.play.PlayModule$attachListener$2$1;
import msd.l;
import com.kwai.video.wayne.player.main.LoadingType;
import java.lang.StringBuilder;
import com.kwai.library.kwaiplayerkit.domain.play.PlayModule$onChanged$1;
import com.kwai.video.player.IMediaPlayer;
import ay6.k;
import px6.e;
import com.kwai.library.kwaiplayerkit.domain.play.PlayModule$onInfo$1;
import com.kwai.library.kwaiplayerkit.domain.play.PlayModule$onStateChanged$1;
import com.kwai.video.wayne.player.main.IMediaPlayerApi;

public final class PlayModule extends FunctionModule implements a, OnPlayerStateChangedListener, IMediaPlayer$OnInfoListener, IMediaPlayer$OnErrorListener, IMediaPlayer$OnPreparedListener, OnPlayerLoadingChangedListener	// class@000852
{
    public final PlayModule$b e;
    public static final PlayModule$a f;

    static {
       PlayModule.f = new PlayModule$a(null);
    }
    public void PlayModule(){
       super();
       this.e = new PlayModule$b(this);
    }
    public static void r(PlayModule p0,String p1,IWaynePlayer p2,int p3,Object p4){
       p2 = (p3 & 0x02)? p0.getPlayer(): null;
       p0.q(p1, p2);
       return;
    }
    public PlayerState b(){
       IWaynePlayer player = this.getPlayer();
       PlayerState state = (player != null)? player.getState(): null;
       return state;
    }
    public void d(){
       this.o(this.getPlayer());
    }
    public void e(IWaynePlayer p0){
       a.p(p0, "player");
       super.e(p0);
       this.o(p0);
    }
    public void f(IWaynePlayer p0){
       a.p(p0, "player");
       super.f(p0);
       this.p(p0);
    }
    public IWaynePlayer getPlayer(){
       FunctionModule tb = this.b;
       KwaiPlayerKit kwaiPlayerKi = 1;
       if (tb == null || tb.j() != kwaiPlayerKi) {
          kwaiPlayerKi = null;
       }
       IWaynePlayer iWaynePlayer = null;
       if (kwaiPlayerKi) {
          kwaiPlayerKi = KwaiPlayerKit.d;
          FunctionModule tb1 = this.b;
          c uoc = (tb1 != null)? tb1.g(): iWaynePlayer;
          PlaySession playSession = kwaiPlayerKi.c(uoc);
          if (playSession != null) {
             iWaynePlayer = playSession.e();
          }
       }
       return iWaynePlayer;
    }
    public void h(){
       this.p(this.getPlayer());
    }
    public List j(){
       b[] uobArray = new b[]{new b(c.class, null, 2, null),new b(d.class, null, 2, null)};
       return CollectionsKt__CollectionsKt.L(uobArray);
    }
    public c k(){
       return new c(a.class, this);
    }
    public final void o(IWaynePlayer p0){
       this.q("attachListener", p0);
       if (p0 != null) {
          p0.registerPlayerStateChangedListener(this);
       }
       if (p0 != null) {
          p0.addOnInfoListener(this);
       }
       if (p0 != null) {
          p0.addOnErrorListener(this);
       }
       if (p0 != null) {
          p0.addOnPreparedListener(this);
       }
       if (p0 != null) {
          p0.addOnPlayerLoadingChangedListener(this);
       }
       if (p0 != null && p0.isPlaying()) {
          this.e.c();
       }
       if (p0 != null) {
          b uob = this.n();
          if (uob != null) {
             a uoa = uob.d(c.class);
             if (uoa != null) {
                uoa.a(new PlayModule$attachListener$2$1(p0));
             }
          }
       }
       return;
    }
    public void onChanged(boolean p0,LoadingType p1){
       PlayModule.r(this, "loading "+p0+", type "+p1, null, 2, null);
       b uob = this.n();
       if (uob != null) {
          a uoa = uob.d(c.class);
          if (uoa != null) {
             uoa.a(new PlayModule$onChanged$1(p0));
          }
       }
       return;
    }
    public boolean onError(IMediaPlayer p0,int p1,int p2){
       e.a().e("PlayModule", "what:"+p1+"  extra:"+p2);
       return false;
    }
    public boolean onInfo(IMediaPlayer p0,int p1,int p2){
       b uob = this.n();
       if (uob != null) {
          a uoa = uob.d(c.class);
          if (uoa != null) {
             uoa.a(new PlayModule$onInfo$1(p0, p1, p2));
          }
       }
       return false;
    }
    public void onPrepared(IMediaPlayer p0){
       PlayModule.r(this, "onPrepared", null, 2, null);
    }
    public void onStateChanged(PlayerState p0){
       a.p(p0, "state");
       PlayModule.r(this, "onStateChanged "+p0, null, 2, null);
       IWaynePlayer player = this.getPlayer();
       if (player != null && player.isPlaying() == true) {
          this.e.c();
       }else {
          this.e.d();
       }
       b uob = this.n();
       if (uob != null) {
          a uoa = uob.d(c.class);
          if (uoa != null) {
             uoa.a(new PlayModule$onStateChanged$1(p0));
          }
       }
       return;
    }
    public final void p(IWaynePlayer p0){
       this.q("detachListener", p0);
       if (p0 != null) {
          p0.unregisterPlayerStateChangedListener(this);
       }
       if (p0 != null) {
          p0.removeOnInfoListener(this);
       }
       if (p0 != null) {
          p0.removeOnErrorListener(this);
       }
       if (p0 != null) {
          p0.removeOnPreparedListener(this);
       }
       if (p0 != null) {
          p0.removeOnPlayerLoadingChangedListener(this);
       }
       this.e.d();
       return;
    }
    public void pause(){
       IWaynePlayer player = this.getPlayer();
       if (player != null) {
          player.pause();
       }
       return;
    }
    public final void q(String p0,IWaynePlayer p1){
       e.a().i("PlayModule", '['+p1+"], context:"+this.n()+", "+p0);
    }
    public void start(){
       IWaynePlayer player = this.getPlayer();
       if (player != null) {
          player.start();
       }
       return;
    }
    public void toggle(){
       IWaynePlayer player = this.getPlayer();
       if (player != null && player.isPlaying() == true) {
          this.pause();
       }else {
          this.start();
       }
       return;
    }
}
