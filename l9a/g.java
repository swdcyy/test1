package l9a.g;
import erd.g;
import com.yxcorp.gifshow.detail.trigger.b;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;

public final class g implements g	// class@002d71
{
    public final b b;

    public void g(b p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       g tb = this.b;
       Objects.requireNonNull(tb);
       if (!p0.booleanValue()) {
          tb.P8(3);
       }else {
          tb.R8(3);
       }
       return;
    }
}
