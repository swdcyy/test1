package l9a.h;
import erd.g;
import com.yxcorp.gifshow.detail.trigger.b;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;

public final class h implements g	// class@002d72
{
    public final b b;

    public void h(b p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       h tb = this.b;
       Objects.requireNonNull(tb);
       if (p0.booleanValue()) {
          tb.R8(7);
       }else {
          tb.P8(7);
       }
       return;
    }
}
