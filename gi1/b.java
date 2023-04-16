package gi1.b;
import gi1.a;
import h03.a;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kuaishou.live.effect.resource.download.common.e;
import pz2.c;
import java.util.List;

public class b implements a	// class@0024ed
{
    public final a a;

    public void b(a p0){
       this.a = p0;
       super();
    }
    public long C1(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return e.b().C1(p0);
    }
    public void D(){
       if (PatchProxy.applyVoid(null, this, b.class, "4")) {
          return;
       }
       this.a.D();
       return;
    }
    public c H(){
       Object obj = PatchProxy.apply(null, this, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.H();
    }
    public void H0(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       this.a.H0(p0);
       return;
    }
    public void a(c p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "2")) {
          return;
       }
       this.a.C0(p0, p1);
       return;
    }
}
