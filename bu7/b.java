package bu7.b;
import erd.g;
import com.kwai.tokenshare.a;
import com.kwai.tokenshare.a$a;
import java.lang.Object;
import java.lang.Long;
import java.util.Objects;

public final class b implements g	// class@00047e
{
    public final a b;
    public final a$a c;

    public void b(a p0,a$a p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       b tb = this.b;
       b tc = this.c;
       Objects.requireNonNull(tb);
       if (tc.b()) {
          p0 = tb.b;
          if (p0 < 60) {
             p0++;
             tb.b = p0;
          }else {
             tb.b();
          }
       }else {
          tc.a();
          tb.b();
       }
       return;
    }
}
