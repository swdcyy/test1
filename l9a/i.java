package l9a.i;
import erd.g;
import com.yxcorp.gifshow.detail.trigger.b;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;

public final class i implements g	// class@002d73
{
    public final b b;

    public void i(b p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       i tb = this.b;
       Objects.requireNonNull(tb);
       if (p0.booleanValue()) {
          tb.R8(7);
       }else {
          tb.P8(7);
       }
       return;
    }
}
