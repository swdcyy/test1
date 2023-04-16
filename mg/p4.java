package mg.p4;
import erd.r;
import com.feature.post.bridge.b1;
import f55.g;
import java.lang.Object;
import zq8.a;
import java.util.Objects;
import java.lang.String;
import mg.r1;

public final class p4 implements r	// class@00264c
{
    public final b1 b;
    public final g c;

    public void p4(b1 p0,g p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final boolean test(Object p0){
       boolean b;
       p4 tb = this.b;
       p4 tc = this.c;
       Objects.requireNonNull(tb);
       if (p0.b != null) {
          b = true;
       }else {
          tb.b(tc, 441, "");
          b = false;
       }
       return b;
    }
}
