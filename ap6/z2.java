package ap6.z2;
import erd.g;
import com.kwai.imsdk.group.g;
import l85.c;
import java.lang.Object;
import java.util.List;
import java.util.Objects;
import java.lang.StringBuilder;
import java.lang.String;
import l85.b;
import cp6.o;
import java.lang.Throwable;

public final class z2 implements g	// class@00038c
{
    public final g b;
    public final c c;

    public void z2(g p0,c p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       z2 tb = this.b;
       Objects.requireNonNull(tb);
       b.a(this.c.d(" kwaiGroupGeneralInfos size: ")+p0.size());
       if (p0.size() > 0) {
          o.a(tb.c).f(p0);
       }
       return;
    }
}
