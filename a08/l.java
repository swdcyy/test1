package a08.l;
import erd.g;
import com.kwaishou.merchant.daccore.b;
import java.lang.Object;
import java.lang.Throwable;
import java.util.Objects;
import f08.f;
import f08.f$a;
import java.lang.String;
import java.util.Map;

public final class l implements g	// class@000011
{
    public final b b;

    public void l(b p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       l tb = this.b;
       Objects.requireNonNull(tb);
       f$a.v(f.a, tb.l, "observer business data error", p0, false, null, 24, null);
    }
}
