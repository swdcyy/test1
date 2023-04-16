package em1.b0;
import em1.c0;
import java.lang.Object;
import java.util.Objects;
import em1.c0$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ok.x;

public final class b0	// class@0021ae
{

    static {
    }
    public static c0 a(){
       c0$a a = c0.a;
       Objects.requireNonNull(a);
       c0 uoc0 = PatchProxy.apply(null, a, c0$a.class, "1");
       if (uoc0 != PatchProxyResult.class) {
       }else {
          uoc0 = c0$a.a.get();
       }
       return uoc0;
    }
}
