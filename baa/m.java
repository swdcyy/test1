package baa.m;
import erd.o;
import java.lang.Object;
import daa.n;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import kotlin.jvm.internal.a;
import brd.t;
import baa.p;

public final class m implements o	// class@00043c
{
    public static final m b;

    static {
       m.b = new m();
    }
    public void m(){
       super();
    }
    public Object apply(Object p0){
       t ot = PatchProxy.applyOneRefs(p0, this, m.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          ot = p.b(p0.url);
       }
       return ot;
    }
}
