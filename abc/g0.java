package abc.g0;
import erd.r;
import com.yxcorp.gifshow.relation.intimate.dialog.s$a;
import java.lang.Object;
import java.lang.Integer;
import java.util.Objects;
import y8c.d;

public final class g0 implements r	// class@0000d0
{
    public final s$a b;

    public void g0(s$a p0){
       this.b = p0;
    }
    public final boolean test(Object p0){
       g0 tb = this.b;
       Objects.requireNonNull(tb);
       boolean b = (p0.intValue() == tb.q.get() || (tb.B != null && p0.intValue() != tb.q.get()))? true: false;
       return b;
    }
}
