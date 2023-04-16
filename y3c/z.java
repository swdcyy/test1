package y3c.z;
import java.lang.Object;
import y3c.z$a;
import tkd.b;
import tkd.d;
import kob.r;
import com.yxcorp.gifshow.common_music_player.MusicExperienceUtils;
import java.util.List;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import qvb.i;
import qvb.q;
import qvb.j;

public abstract class z	// class@0049d2
{
    public final r a;
    public i b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public String g;
    public final q h;

    public void z(){
       super();
       this.d = false;
       this.e = true;
       this.h = new z$a(this);
       this.a = d.a(-1687636538);
       this.f = MusicExperienceUtils.d();
    }
    public abstract List a(List p0);
    public void b(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, z.class, "2")) {
          return;
       }
       z tb = this.b;
       if (tb != null) {
          this.a.R1(this.a(tb.getItems()), p0);
       }
       return;
    }
    public void c(i p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, z.class, "1")) {
          return;
       }
       z tb = this.b;
       if (tb != null) {
          tb.f(this.h);
       }
       p0.h(this.h);
       this.b = p0;
       return;
    }
}
