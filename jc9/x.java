package jc9.x;
import erd.g;
import jc9.b0;
import java.lang.Object;
import lc9.b;
import java.lang.Float;
import java.util.Objects;
import ad9.i;
import android.widget.ProgressBar;
import hc9.f;
import hc9.e;

public final class x implements g	// class@002950
{
    public final b0 b;
    public final Object c;
    public final b d;

    public void x(b0 p0,Object p1,b p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       x tb = this.b;
       Objects.requireNonNull(tb);
       int i = (int)(p0.floatValue() * 100.00f);
       tb.d.c.setProgress(i);
       tb.g(this.c, this.d, 3, tb.e.a().o(), i);
    }
}
