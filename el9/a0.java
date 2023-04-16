package el9.a0;
import erd.g;
import com.yxcorp.gifshow.comment.presenter.global.g;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import com.yxcorp.gifshow.comment.log.a;

public final class a0 implements g	// class@0021d9
{
    public final g b;

    public void a0(g p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       a0 tb = this.b;
       Objects.requireNonNull(tb);
       if (p0.booleanValue()) {
          tb.y = true;
          tb.t.h(true);
       }else {
          tb.t.h(false);
       }
       return;
    }
}
