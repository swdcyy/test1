package az5.b;
import erd.g;
import az5.i;
import java.lang.Object;
import eda.n;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.collection.LruCache;

public final class b implements g	// class@0003cf
{
    public final i b;

    public void b(i p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       b tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, i.class, "3")) {
       }else {
          tb.a = null;
          p0 = tb.b;
          if (p0 != null) {
             p0.evictAll();
             tb.b = null;
          }
       }
       return;
    }
}
