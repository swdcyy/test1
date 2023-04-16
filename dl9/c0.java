package dl9.c0;
import erd.r;
import dl9.m0;
import java.lang.Object;
import java.lang.Integer;
import java.util.Objects;

public final class c0 implements r	// class@001f4e
{
    public final m0 b;

    public void c0(m0 p0){
       this.b = p0;
    }
    public final boolean test(Object p0){
       c0 tb = this.b;
       Objects.requireNonNull(tb);
       boolean b = true;
       if (p0.intValue() == b || tb.A == null) {
          b = false;
       }
       return b;
    }
}
