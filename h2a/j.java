package h2a.j;
import erd.g;
import h2a.l;
import java.lang.Object;
import d2a.b;
import java.util.Objects;
import java.util.List;

public final class j implements g	// class@00254a
{
    public final l b;

    public void j(l p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       j tb = this.b;
       Objects.requireNonNull(tb);
       if (p0.b != null) {
          tb.u.add(p0.a);
       }else {
          tb.u.remove(p0.a);
       }
       return;
    }
}
