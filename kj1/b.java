package kj1.b;
import kj1.c;
import java.lang.Object;
import java.util.Objects;
import kj1.c$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ok.x;

public final class b	// class@002d52
{

    static {
    }
    public static c a(){
       c$a a = c.a;
       Objects.requireNonNull(a);
       c uoc = PatchProxy.apply(null, a, c$a.class, "1");
       if (uoc != PatchProxyResult.class) {
       }else {
          uoc = c$a.a.get();
       }
       return uoc;
    }
}
