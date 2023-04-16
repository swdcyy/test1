package f72.c;
import erd.g;
import f72.f;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;

public final class c implements g	// class@0028c5
{
    public final f b;

    public void c(f p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       c tb = this.b;
       Objects.requireNonNull(tb);
       tb.r = p0.booleanValue();
    }
}
