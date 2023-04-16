package ce8.b;
import java.lang.Runnable;
import ce8.a;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class b implements Runnable	// class@0003fc
{
    public final a b;

    public void b(a p0){
       this.b = p0;
    }
    public final void run(){
       b tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, a.class, "1")) {
       }else {
          tb.b = null;
       }
       return;
    }
}
