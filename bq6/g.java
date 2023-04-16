package bq6.g;
import erd.g;
import bq6.l;
import l85.c;
import java.lang.Object;
import java.lang.Throwable;
import java.util.Objects;
import java.lang.String;
import l85.b;
import nq6.s;
import java.util.Map;
import android.util.Pair;
import java.lang.Integer;

public final class g implements g	// class@000588
{
    public final l b;
    public final c c;

    public void g(l p0,c p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       g tb = this.b;
       Objects.requireNonNull(tb);
       b.c(this.c.e(p0));
       s os = s.t(tb.a);
       Map map = os.x("IMSDK.MessageAttachment.Sync");
       p0 = os.z(p0);
       os.c(map, p0.first.intValue(), p0.second);
       os.B(map, 0.00f);
    }
}
