package lz9.w;
import erd.g;
import lz9.b0;
import java.lang.Object;
import java.lang.Boolean;

public final class w implements g	// class@002eed
{
    public final b0 b;

    public void w(b0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       w tb = this.b;
       tb.G = false;
       if (!p0.booleanValue() && tb.H != null) {
          tb.s0();
       }
       return;
    }
}
