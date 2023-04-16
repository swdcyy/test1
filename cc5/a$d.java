package cc5.a$d;
import erd.o;
import android.util.Pair;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.e0;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import xp6.k;
import brd.a0;

public final class a$d implements o	// class@000692
{
    public final Pair b;

    public void a$d(Pair p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       a0 uoa0 = PatchProxy.applyOneRefs(p0, this, a$d.class, "1");
       if (uoa0 != PatchProxyResult.class) {
       }else {
          a.p(p0, "throwable");
          if (this.b != null) {
             k.a("IMLogin token getFailed oldToken is reused "+p0);
             p0 = a0.B(this.b);
          }else {
             k.a("IMLogin token getFailed throw error "+p0);
             p0 = a0.s(p0);
          }
          uoa0 = p0;
       }
       return uoa0;
    }
}
