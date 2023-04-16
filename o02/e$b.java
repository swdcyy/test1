package o02.e$b;
import sfc.a;
import android.content.Context;
import h91.a;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class e$b extends a	// class@00344d
{
    public final a c;

    public void e$b(Context p0,a p1){
       this.c = p1;
       super(p0);
    }
    public void accept(Object p0){
       this.b(p0);
    }
    public void b(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$b.class, "1")) {
          return;
       }
       super.b(p0);
       e$b tc = this.c;
       if (tc != null) {
          tc.onError(p0);
       }
       return;
    }
}
