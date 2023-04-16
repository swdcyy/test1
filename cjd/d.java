package cjd.d;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.Object;
import java.util.Objects;
import cjd.b;
import cjd.c;

public class d	// class@000332
{
    public static final AtomicInteger a;
    public static final AtomicInteger b;
    public static final a c;
    public static final g d;

    static {
       AtomicInteger uAtomicInteg = new AtomicInteger(0);
       d.a = uAtomicInteg;
       d.b = new AtomicInteger(0);
       Objects.requireNonNull(uAtomicInteg);
       d.c = new b(uAtomicInteg);
       d.d = c.b;
    }
}
