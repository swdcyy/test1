package d0b.c;
import java.lang.Object;
import crd.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.util.resource.Category;
import boc.b;
import brd.t;
import com.yxcorp.gifshow.util.resource.p;
import d0b.c$a;
import erd.g;
import kotlin.jvm.internal.a;
import java.lang.Boolean;
import wza.b;
import java.util.Objects;
import java.io.File;

public final class c	// class@00240c
{
    public static final c a;

    static {
       c.a = new c();
    }
    public void c(){
       super();
    }
    public static final b a(){
       b obj = PatchProxy.apply(null, null, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p.f(Category.SCREENCAST_PATCH).subscribe(c$a.b);
       a.o(obj, "ResourceManagerUtils.isN¡­_PATCH\)\n        }\n      }");
       return obj;
    }
    public static final boolean b(){
       Object obj = PatchProxy.apply(null, null, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       Objects.requireNonNull(b.j);
       return new File(b.i).exists();
    }
}
