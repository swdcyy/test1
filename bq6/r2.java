package bq6.r2;
import erd.g;
import bq6.x2;
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

public final class r2 implements g	// class@0005b5
{
    public final x2 b;
    public final c c;

    public void r2(x2 p0,c p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       r2 tb = this.b;
       Objects.requireNonNull(tb);
       b.c(this.c.e(p0));
       s os = s.t(tb.a);
       Map map = os.x("IMSDK.ConversationTag.Fetch");
       p0 = os.z(p0);
       os.c(map, p0.first.intValue(), p0.second);
       os.B(map, 0.00f);
    }
}
