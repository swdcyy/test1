package i61.i;
import ok.o;
import i61.j$a;
import java.lang.Object;
import java.lang.Integer;
import java.util.Objects;
import i61.j;
import com.kuaishou.live.bottombar.component.widget.a;

public final class i implements o	// class@00283c
{
    public final j$a b;

    public void i(j$a p0){
       this.b = p0;
    }
    public final boolean apply(Object p0){
       i tb = this.b;
       Objects.requireNonNull(tb);
       boolean b = (p0 != null && !tb.a.f.E1(p0.intValue()))? true: false;
       return b;
    }
}
