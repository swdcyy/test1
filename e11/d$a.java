package e11.d$a;
import z61.c;
import java.lang.Object;
import o61.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import e11.f;

public final class d$a implements c	// class@002085
{
    public static final d$a a;

    static {
       d$a.a = new d$a();
    }
    public void d$a(){
       super();
    }
    public final b a(){
       Object obj = PatchProxy.apply(null, this, d$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new f();
    }
}
