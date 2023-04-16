package f72.e;
import erd.r;
import f72.f;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;

public final class e implements r	// class@0028c9
{
    public final f b;

    public void e(f p0){
       this.b = p0;
    }
    public final boolean test(Object p0){
       e tb = this.b;
       Objects.requireNonNull(tb);
       if (!p0.booleanValue() && tb.s != null) {
          tb.s = false;
       }else {
          boolean b = true;
       }
       return false;
    }
}
