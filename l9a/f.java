package l9a.f;
import erd.g;
import com.yxcorp.gifshow.detail.trigger.b;
import java.lang.Object;
import rd5.j;
import java.util.Objects;

public final class f implements g	// class@002d70
{
    public final b b;

    public void f(b p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       f tb = this.b;
       Objects.requireNonNull(tb);
       if (p0.b != null) {
          tb.P8(1);
       }else {
          tb.R8(1);
       }
       return;
    }
}
