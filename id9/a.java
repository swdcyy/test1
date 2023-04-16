package id9.a;
import com.yxcorp.gifshow.camera.record.base.b$a;
import id9.d;
import java.lang.Object;
import java.util.Objects;
import hd9.n;
import id9.z;
import id9.t;
import com.yxcorp.gifshow.camera.record.followshoot.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.player.KsMediaPlayer;
import com.yxcorp.gifshow.camera.record.followshoot.d;

public final class a implements b$a	// class@0027e6
{
    public final d a;

    public void a(d p0){
       this.a = p0;
    }
    public final Object getData(){
       long currentPosit;
       a ta = this.a;
       Objects.requireNonNull(ta);
       n on = new n(true);
       on.b = ta.r;
       on.g = ta.w.w;
       on.c = ta.y.r;
       on.h = ta.g2();
       on.i = ta.x.M2();
       d x = ta.x;
       Objects.requireNonNull(x);
       if (PatchProxy.applyVoidOneRefs(on, x, b.class, "5")) {
       }else if(x.r() != null){
          currentPosit = x.r().getCurrentPosition();
       }else {
          currentPosit = 0;
       }
       on.f = currentPosit;
       on.e = x.v2();
       on.d = x.u2();
       return on;
    }
}
