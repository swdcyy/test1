package r92.b;
import lp3.e;
import t02.a0;
import java.lang.Object;
import r92.a;
import com.kuaishou.live.core.show.delayinfo.LiveAudienceDelayInfosResponse;
import p92.j;
import p92.e;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import vf1.a;
import lp3.c;
import vf1.b;

public abstract class b	// class@003f89
{
    public e a;
    public e b;
    public j c;
    public a0 d;
    public final b e;

    public void b(e p0,a0 p1){
       super();
       this.e = new a(this);
       this.a = p0;
       this.d = p1;
    }
    public void a(LiveAudienceDelayInfosResponse p0){
    }
    public void b(j p0,e p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "1")) {
          return;
       }
       this.b = p1;
       this.c = p0;
       this.a.a(a.class).Z9(this.e);
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       this.a.a(a.class).uh(this.e);
       return;
    }
}
