package ee1.z;
import ok.h;
import java.lang.Object;
import wv4.d1;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Number;
import wv4.f1;
import wv4.a;
import tv4.a;
import java.lang.Integer;

public final class z implements h	// class@00212e
{
    public static final z b;

    static {
       z.b = new z();
    }
    public void z(){
       super();
    }
    public final Object apply(Object p0){
       int i;
       Objects.requireNonNull(p0);
       Object obj = PatchProxy.apply(null, p0, d1.class, "28");
       if (obj != PatchProxyResult.class) {
          i = obj.intValue();
       }else {
          p0 = p0.h;
          Objects.requireNonNull(p0);
          obj = PatchProxy.apply(null, p0, f1.class, "22");
          i = (obj != PatchProxyResult.class)? obj.intValue(): p0.a.q0();
       }
       return Integer.valueOf(i);
    }
}
