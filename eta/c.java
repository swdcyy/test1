package eta.c;
import erd.g;
import eta.i;
import java.util.Map;
import java.lang.Object;
import q1.b;
import java.util.Objects;
import android.graphics.drawable.Drawable;
import sn5.e;

public final class c implements g	// class@0027db
{
    public final i b;
    public final boolean c;
    public final Map d;

    public void c(i p0,boolean p1,Map p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       c tb = this.b;
       Objects.requireNonNull(tb);
       tb.s(e.a(p0, this.c, this.d));
    }
}
