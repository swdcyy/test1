package uq.b;
import upd.b;
import javax.inject.Provider;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import uq.a;
import er.m;
import com.kuaishou.android.vader.persistent.a;
import ar.c;
import java.util.Map;

public final class b implements b	// class@002605
{
    public final Provider a;
    public final Provider b;
    public final Provider c;
    public final Provider d;
    public final Provider e;

    public void b(Provider p0,Provider p1,Provider p2,Provider p3,Provider p4){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
    }
    public static b a(Provider p0,Provider p1,Provider p2,Provider p3,Provider p4){
       Object obj;
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          obj = PatchProxy.apply(objArray, null, uob, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       b uob1 = new b(p0, p1, p2, p3, p4);
       return obj;
    }
    public a b(){
       Object obj = PatchProxy.apply(null, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a uoa = new a(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
       return obj;
    }
    public Object get(){
       return this.b();
    }
}
