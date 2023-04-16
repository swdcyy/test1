package dsb.b;
import ok.h;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import on5.a;

public final class b implements h	// class@00251b
{
    public static final b b;

    static {
       b.b = new b();
    }
    public void b(){
       super();
    }
    public Object apply(Object p0){
       String str = PatchProxy.applyOneRefs(p0, this, b.class, "1");
       if (str != PatchProxyResult.class) {
       }else {
          a.m(p0);
          a.o(p0, "it!!");
          str = a.g(p0.intValue());
       }
       return str;
    }
}
