package ee1.r;
import z1.a;
import java.lang.Object;
import wv4.d1;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import wv4.a;
import tv4.a;

public final class r implements a	// class@00211d
{
    public static final r a;

    static {
       r.a = new r();
    }
    public void r(){
       super();
    }
    public final void accept(Object p0){
       Objects.requireNonNull(p0);
       if (PatchProxy.applyVoid(null, p0, d1.class, "9")) {
       }else {
          p0.a.h1();
       }
       return;
    }
}