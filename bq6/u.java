package bq6.u;
import erd.g;
import bq6.p2;
import l85.c;
import java.lang.Object;
import java.lang.Throwable;
import java.util.Objects;
import java.lang.String;
import l85.b;
import com.kwai.imsdk.callback.KwaiIMException;

public final class u implements g	// class@0005c2
{
    public final p2 b;
    public final c c;

    public void u(p2 p0,c p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       u tb = this.b;
       Objects.requireNonNull(tb);
       b.f(this.c.e(p0), p0);
       tb.e = false;
       if (p0 instanceof KwaiIMException) {
          tb.n(p0.getErrorCode(), p0.getMessage());
       }else {
          tb.n(-1, p0.getMessage());
       }
       return;
    }
}
