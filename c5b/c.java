package c5b.c;
import java.lang.Object;
import c5b.d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import wkd.b;
import ia0.g;
import com.kwai.framework.model.router.RouteType;
import t45.d;
import brd.z;
import com.yxcorp.retrofit.a;
import com.yxcorp.retrofit.e;
import kotlin.jvm.internal.a;

public final class c	// class@0004b5
{
    public static d a;
    public static final c b;

    static {
       c.b = new c();
    }
    public void c(){
       super();
    }
    public synchronized final d a(){
       d obj = PatchProxy.apply(null, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (c.a == null) {
          c.a = e.b(b.a(-1961311520).a(RouteType.API, d.b), d.class);
       }
       obj = c.a;
       a.m(obj);
       return obj;
    }
}
