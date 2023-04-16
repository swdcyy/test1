package fd1.n;
import sfc.a;
import fd1.l;
import java.lang.String;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import xp5.i;
import fd1.o;

public class n extends a	// class@0022fc
{
    public final String c;
    public final String d;
    public final String e;
    public final l f;

    public void n(l p0,String p1,String p2,String p3){
       this.f = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public void accept(Object p0){
       this.b(p0);
    }
    public void b(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "1")) {
          return;
       }
       super.b(p0);
       o.d(this.f.r.a(), 8, this.c, this.d, this.e);
       return;
    }
}
