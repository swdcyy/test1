package aja.f;
import erd.g;
import aja.j;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import x2b.a;
import aja.g;
import java.lang.Runnable;
import android.view.ViewGroup;

public final class f implements g	// class@00008c
{
    public final j b;

    public void f(j p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       f tb = this.b;
       Objects.requireNonNull(tb);
       if (p0.booleanValue()) {
          tb.b.post(new g(tb));
       }
       return;
    }
}
