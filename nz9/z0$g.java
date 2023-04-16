package nz9.z0$g;
import com.yxcorp.gifshow.autoplay.live.LiveAutoPlay$b;
import nz9.z0;
import java.lang.Object;
import rj3.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qp7.x0;
import qp7.b;
import os7.a;
import nz9.a1;
import z1.a;
import java.lang.Runnable;
import ekd.k1;
import t99.c;
import as7.a;
import q87.c;

public class z0$g implements LiveAutoPlay$b	// class@00325e
{
    public final z0 a;

    public void z0$g(z0 p0){
       this.a = p0;
       super();
    }
    public void a(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, z0$g.class, "1")) {
          return;
       }
       this.a.E().i(new a1(this));
       return;
    }
    public void onAnchorEndLive(){
       if (PatchProxy.applyVoid(null, this, z0$g.class, "3")) {
          return;
       }
       k1.m(this.a.l1);
       k1.m(this.a.k1);
       this.a.x0();
       return;
    }
    public void onAudioStart(){
       c.b(this);
    }
    public void onPlayerCached(){
       c.c(this);
    }
    public void onPlayerRetrieved(){
       c.d(this);
    }
    public void onRenderStop(){
       c.f(this);
    }
    public void onVideoStart(){
       if (PatchProxy.applyVoid(null, this, z0$g.class, "2")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.C().s("AvatarAndFollowBaseElement", "onVideoStart", objArray);
       this.a.X0 = true;
       return;
    }
}
