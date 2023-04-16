package i61.e;
import ok.o;
import i61.j;
import java.lang.Object;
import java.lang.Integer;
import java.util.Objects;
import com.kuaishou.live.bottombar.component.widget.a;

public final class e implements o	// class@002838
{
    public final j b;

    public void e(j p0){
       this.b = p0;
    }
    public final boolean apply(Object p0){
       e tb = this.b;
       Objects.requireNonNull(tb);
       boolean b = (p0 != null && !tb.f.E1(p0.intValue()))? true: false;
       return b;
    }
}
