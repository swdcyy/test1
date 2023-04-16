package dta.x0;
import erd.g;
import com.yxcorp.gifshow.homepage.kcube.presenter.i;
import java.util.Map;
import java.lang.Object;
import q1.b;
import java.util.Objects;
import android.graphics.drawable.Drawable;
import sn5.e;

public final class x0 implements g	// class@002557
{
    public final i b;
    public final boolean c;
    public final Map d;

    public void x0(i p0,boolean p1,Map p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       x0 tb = this.b;
       Objects.requireNonNull(tb);
       tb.X8(e.a(p0, this.c, this.d));
    }
}
