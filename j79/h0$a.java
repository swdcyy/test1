package j79.h0$a;
import rsd.c;
import java.lang.Object;
import j79.h0;
import vsd.n;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class h0$a extends c	// class@002777
{
    public final Object b;
    public final h0 c;

    public void h0$a(Object p0,Object p1,h0 p2){
       this.b = p0;
       this.c = p2;
       super(p1);
    }
    public void c(n p0,Object p1,Object p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, h0$a.class, "1")) {
          return;
       }
       a.p(p0, "property");
       this.c.i();
       return;
    }
}
