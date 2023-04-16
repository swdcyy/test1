package a2d.a;
import a2d.a$a;
import nsd.u;
import java.lang.Object;
import z1d.d;
import asd.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import c97.d;
import kotlin.jvm.internal.a;
import q97.c;
import java.lang.StringBuilder;
import qrd.l1;

public abstract class a	// class@000074
{
    public static final a$a a;

    static {
       a.a = new a$a(null);
    }
    public void a(){
       super();
    }
    public Object a(d p0,c p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       p0 = d.a();
       a.o(p0, "Azeroth.get\(\)");
       p0.f().d("LoginInterceptor", "execute "+this.getClass().getSimpleName());
       return l1.a;
    }
}
