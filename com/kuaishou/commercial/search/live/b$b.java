package com.kuaishou.commercial.search.live.b$b;
import t99.y;
import com.kuaishou.commercial.search.live.b;
import java.lang.Object;
import t99.x;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import mxb.j0;
import mxb.i0;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import vy.c;
import erd.g;
import mxb.h;
import java.util.Objects;
import ekd.y0;
import com.yxcorp.gifshow.autoplay.live.LiveAutoPlayerState;

public class b$b implements y	// class@001564
{
    public final b b;

    public void b$b(b p0){
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
       if (PatchProxy.applyVoid(null, this, b$b.class, "3")) {
          return;
       }
       this.b.X8();
       i0.a().e(66, this.b.p.mEntity).d(new c(this)).a();
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
       if (PatchProxy.applyVoid(null, this, b$b.class, "2")) {
          return;
       }
       this.b.X8();
       this.b.r.e();
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
       if (PatchProxy.applyVoid(objArray, this, b$b.class, "1")) {
          return;
       }
       b$b tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, b.class, "9")) {
          b u = tb.u;
          if (u != null) {
             u.d();
          }
       }
       this.b.r.d();
       return;
    }
    public void onVideoStateChange(LiveAutoPlayerState p0){
       x.m(this, p0);
    }
}
