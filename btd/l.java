package btd.l;
import btd.p;
import msd.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import btd.o;
import btd.p$b;
import btd.s;
import nsd.u;

public final class l	// class@0002ec
{

    public static final double a(p p0,a p1){
       a.p(p0, "$this$measureTime");
       a.p(p1, "block");
       p1.invoke();
       return p0.a().a();
    }
    public static final double b(a p0){
       a.p(p0, "block");
       p0.invoke();
       return p$b.c.a().a();
    }
    public static final s c(p p0,a p1){
       a.p(p0, "$this$measureTimedValue");
       a.p(p1, "block");
       return new s(p1.invoke(), p0.a().a(), null);
    }
    public static final s d(a p0){
       a.p(p0, "block");
       return new s(p0.invoke(), p$b.c.a().a(), null);
    }
}
