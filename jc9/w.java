package jc9.w;
import erd.g;
import jc9.b0;
import java.lang.Object;
import java.lang.Throwable;
import java.util.Objects;
import j8c.a;
import java.lang.String;
import q87.c;
import hc9.e;

public final class w implements g	// class@00294f
{
    public final b0 b;
    public final Object c;

    public void w(b0 p0,Object p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       w tb = this.b;
       Objects.requireNonNull(tb);
       Object[] objArray = new Object[0];
       a.D().A("AutoDownloadBarHandler", p0.getMessage(), objArray);
       tb.e.d(4, this.c);
    }
}
