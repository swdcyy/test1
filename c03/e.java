package c03.e;
import erd.g;
import c03.k;
import sz2.a;
import java.lang.String;
import c03.l;
import java.lang.Object;
import java.lang.Throwable;
import java.util.Objects;
import java.util.List;
import sz2.g;
import java.util.Map;
import c03.k$b;
import com.kuaishou.live.effect.resource.download.v2.Status;
import android.util.Log;
import xz2.a;
import java.lang.StringBuilder;
import com.kuaishou.android.live.log.b;

public final class e implements g	// class@00048b
{
    public final k b;
    public final a c;
    public final String d;
    public final l e;
    public final int f;

    public void e(k p0,a p1,String p2,l p3,int p4){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
    }
    public final void accept(Object p0){
       e tb = this.b;
       e tc = this.c;
       e td = this.d;
       e te = this.e;
       e tf = this.f;
       Objects.requireNonNull(tb);
       String str = g.b(tc.a());
       k$b uob = tb.b.get(td);
       if (uob != null) {
          uob.b(str, Status.DOWNLOAD_FAIL);
          tb.a(uob, te, tf);
       }
       a.a(td, false, null, tc.a(), tf, Log.getStackTraceString(p0));
       b.y(tb.a, "[download], from = "+tf+", downloadList = "+tc.a(), p0);
       return;
    }
}
