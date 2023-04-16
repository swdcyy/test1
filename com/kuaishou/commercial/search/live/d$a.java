package com.kuaishou.commercial.search.live.d$a;
import t99.y;
import com.kuaishou.commercial.search.live.d;
import java.lang.Object;
import t99.x;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import ekd.y0;
import com.yxcorp.gifshow.autoplay.live.LiveAutoPlayerState;

public class d$a implements y	// class@001567
{
    public final d b;

    public void d$a(d p0){
       this.b = p0;
       super();
    }
    public void a(int p0,int p1,int p2){
       x.d(this, p0, p1, p2);
    }
    public void c(int p0,int p1,int p2){
       x.j(this, p0, p1, p2);
    }
    public void onAnchorEndLive(){
       if (PatchProxy.applyVoid(null, this, d$a.class, "3")) {
          return;
       }
       this.b.V8();
       return;
    }
    public void onAudioStart(){
       x.b(this);
    }
    public void onCachedPlayerResumePlay(){
       x.c(this);
    }
    public void onPlayTimeFinished(){
       x.e(this);
    }
    public void onPlayerCached(){
       x.f(this);
    }
    public void onPlayerRetrieved(){
       x.g(this);
    }
    public void onRenderStop(){
       if (PatchProxy.applyVoid(null, this, d$a.class, "2")) {
          return;
       }
       this.b.V8();
       return;
    }
    public void onSeiInfo(byte[] p0,int p1,int p2){
       x.i(this, p0, p1, p2);
    }
    public void onVideoSizeChangedWithType(int p0,int p1,int p2){
       x.k(this, p0, p1, p2);
    }
    public void onVideoStart(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, d$a.class, "1")) {
          return;
       }
       d$a tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, d.class, "7")) {
          d u = tb.u;
          if (u != null) {
             u.d();
          }
       }
       return;
    }
    public void onVideoStateChange(LiveAutoPlayerState p0){
       x.m(this, p0);
    }
}
