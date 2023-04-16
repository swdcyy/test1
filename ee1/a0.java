package ee1.a0;
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

public final class a0 implements h	// class@0020f9
{
    public static final a0 b;

    static {
       a0.b = new a0();
    }
    public void a0(){
       super();
    }
    public final Object apply(Object p0){
       int i;
       Objects.requireNonNull(p0);
       Object obj = PatchProxy.apply(null, p0, d1.class, "29");
       if (obj != PatchProxyResult.class) {
          i = obj.intValue();
       }else {
          p0 = p0.h;
          Objects.requireNonNull(p0);
          obj = PatchProxy.apply(null, p0, f1.class, "23");
          i = (obj != PatchProxyResult.class)? obj.intValue(): p0.a.A0();
       }
       return Integer.valueOf(i);
    }
}
