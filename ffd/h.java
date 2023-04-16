package ffd.h;
import java.lang.Object;
import ffd.c;
import brd.t;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import z6d.l;
import z6d.k;
import ffd.g;
import erd.o;

public class h	// class@000e1e
{

    public void h(){
       super();
    }
    public static t a(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, h.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return k.b().q(p0.d).map(new g(p0));
    }
}
