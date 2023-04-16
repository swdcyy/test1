package gp2.b;
import op2.a;
import com.kuaishou.live.core.voiceparty.theater.player.theaterplayer.controller.TheaterPlayerController;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import mrd.a;
import com.kwai.video.waynelive.quality.LiveQualityItem;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.List;
import com.kwai.robust.PatchProxyResult;

public final class b implements a	// class@002b73
{
    public final t a;
    public final TheaterPlayerController b;
    public final long c;
    public final int d;

    public void b(TheaterPlayerController p0,long p1,int p2){
       a.p(p0, "playerController");
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.a = p0.k();
    }
    public void a(long p0){
    }
    public void b(LiveQualityItem p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "7")) {
          return;
       }
       a.p(p0, "quality");
       this.b.z(p0);
       return;
    }
    public void c(float p0,float p1){
    }
    public List getQualityList(){
       Object obj = PatchProxy.apply(null, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.m();
    }
    public void pause(){
       if (PatchProxy.applyVoid(null, this, b.class, "4")) {
          return;
       }
       this.b.p();
       return;
    }
    public void play(){
       if (PatchProxy.applyVoid(null, this, b.class, "3")) {
          return;
       }
       this.b.B(this.c);
       return;
    }
    public void release(){
       if (PatchProxy.applyVoid(null, this, b.class, "6")) {
          return;
       }
       this.b.q();
       return;
    }
    public void resume(){
       if (PatchProxy.applyVoid(null, this, b.class, "5")) {
          return;
       }
       this.b.v();
       return;
    }
}
