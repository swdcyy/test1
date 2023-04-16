package nq1.c;
import ok.h;
import java.lang.Object;
import ee3.j0;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import fe3.d;

public final class c implements h	// class@0033a9
{
    public static final c b;

    static {
       c.b = new c();
    }
    public void c(){
       super();
    }
    public Object apply(Object p0){
       String str = PatchProxy.applyOneRefs(p0, this, c.class, "1");
       if (str != PatchProxyResult.class) {
       }else {
          a.m(p0);
          p0 = p0.b;
          a.m(p0);
          str = p0.b();
       }
       return str;
    }
}
