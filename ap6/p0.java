package ap6.p0;
import erd.g;
import com.kwai.imsdk.group.b;
import java.lang.String;
import java.util.List;
import java.lang.Object;
import hp6.b;
import java.util.Objects;
import xp6.x;
import cp6.o;

public final class p0 implements g	// class@00035e
{
    public final b b;
    public final String c;
    public final List d;

    public void p0(b p0,String p1,List p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       p0 tb = this.b;
       p0 tc = this.c;
       p0 td = this.d;
       Objects.requireNonNull(tb);
       if (x.b(p0)) {
          o.a(tb.b).h(tc, true, td);
       }
       return;
    }
}
