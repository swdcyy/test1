package ifd.f;
import erd.g;
import ifd.h;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;

public final class f implements g	// class@001006
{
    public final h b;

    public void f(h p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       f tb = this.b;
       Objects.requireNonNull(tb);
       tb.P8((p0.booleanValue() ^ 0x01));
    }
}
