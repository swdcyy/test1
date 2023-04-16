package a08.b;
import erd.g;
import com.kwaishou.merchant.daccore.b;
import l08.c;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.String;
import f08.f;
import com.kwaishou.merchant.daccore.PendantHolder;
import a08.p;

public final class b implements g	// class@000007
{
    public final b b;
    public final c c;

    public void b(b p0,c p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       b tb = this.b;
       b tc = this.c;
       f.b(tb.l, tc.e(), "renderObservable error", p0);
       p0 = tb.c;
       if (p0 != null) {
          tb = tb.b;
          if (tb != null) {
             p0.a(tb.j(tc.e()));
          }
       }
       return;
    }
}
