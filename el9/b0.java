package el9.b0;
import erd.g;
import com.yxcorp.gifshow.comment.presenter.global.g;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import com.yxcorp.gifshow.comment.log.a;

public final class b0 implements g	// class@0021db
{
    public final g b;

    public void b0(g p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       b0 tb = this.b;
       Objects.requireNonNull(tb);
       tb.A = p0.booleanValue();
       if (p0.booleanValue()) {
          tb.t.e();
          tb.S8();
       }
       tb.R8();
       return;
    }
}
