package b4d.f;
import erd.g;
import b4d.j;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import java.lang.StringBuilder;
import java.lang.String;
import com.yxcorp.utility.Log;

public final class f implements g	// class@00036c
{
    public final j b;

    public void f(j p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       f tb = this.b;
       Objects.requireNonNull(tb);
       Log.g("FinishButtonAnimPr", "show gif emotion: ..."+p0);
       if (!p0.booleanValue()) {
          tb.V8(true);
       }
       return;
    }
}
