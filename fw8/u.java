package fw8.u;
import ok.h;
import com.yxcorp.gifshow.activity.x;
import java.lang.Object;
import com.yxcorp.gifshow.log.b;
import java.util.Objects;
import java.lang.Boolean;

public final class u implements h	// class@00236c
{
    public final x b;

    public void u(x p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       u tb = this.b;
       Objects.requireNonNull(tb);
       boolean b = (p0.E() == tb.c.hashCode())? true: false;
       return Boolean.valueOf(b);
    }
}
