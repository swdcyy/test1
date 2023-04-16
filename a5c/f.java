package a5c.f;
import erd.g;
import com.yxcorp.gifshow.profile.presenter.profile.hover.e;
import java.lang.Object;
import j5c.d;
import java.util.Objects;
import com.yxcorp.gifshow.widget.ExpandableFloatButton;

public final class f implements g	// class@00007e
{
    public final e b;

    public void f(e p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       f tb = this.b;
       Objects.requireNonNull(tb);
       int i = (p0.a > tb.D)? 1: 0;
       e x = tb.x;
       i = (i)? 3: 2;
       x.t(i);
       return;
    }
}
