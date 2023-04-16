package cb3.e$a;
import ws5.c;
import android.view.View;
import java.lang.Object;
import crd.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import ws5.b;
import cb3.e$a$a;
import java.lang.Runnable;
import crd.c;

public final class e$a implements c	// class@0004e0
{
    public final View a;

    public void e$a(View p0){
       this.a = p0;
       super();
    }
    public b a(View p0){
       b obj = PatchProxy.applyOneRefs(p0, this, e$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "placeHolder");
       obj = new b(this.a, p0, true);
       obj.b();
       b uob = c.d(new e$a$a(obj));
       a.o(uob, "Disposables.fromRunnable { tracker.stopTrack\(\) }");
       return uob;
    }
}
