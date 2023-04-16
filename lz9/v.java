package lz9.v;
import erd.g;
import lz9.b0;
import java.lang.Object;
import lm5.c;
import java.util.Objects;

public final class v implements g	// class@002eec
{
    public final b0 b;

    public void v(b0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       v tb = this.b;
       Objects.requireNonNull(tb);
       if (p0.a == 1) {
          tb.r0();
       }
       return;
    }
}
