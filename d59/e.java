package d59.e;
import android.view.View$OnClickListener;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import x49.a;
import java.util.Objects;
import yx.j0;
import android.util.LruCache;

public final class e implements View$OnClickListener	// class@002048
{
    public static final e b;

    static {
       e.b = new e();
    }
    public void e(){
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
          return;
       }
       a b = a.b;
       Objects.requireNonNull(b);
       if (!PatchProxy.applyVoid(null, b, a.class, "7")) {
          Object[] objArray = new Object[0];
          j0.f("AdMKPageJsonManager", "clear all page json ", objArray);
          a.a.evictAll();
       }
       return;
    }
}
