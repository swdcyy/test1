package dlc.w0;
import erd.g;
import dlc.x0;
import java.lang.Object;
import java.lang.Integer;
import java.util.Objects;

public final class w0 implements g	// class@002277
{
    public final x0 b;

    public void w0(x0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       w0 tb = this.b;
       Objects.requireNonNull(tb);
       tb.w = p0.intValue();
    }
}
