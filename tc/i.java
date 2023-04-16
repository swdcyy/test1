package tc.i;
import tc.k$a;
import java.lang.Object;
import tc.l$a;
import com.facebook.common.references.a;
import bd.b;
import android.graphics.Bitmap;
import com.yxcorp.image.memory.RecycledBitmapExceptionTracker;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import com.yxcorp.image.memory.RecycledBitmapExceptionTracker$subscriberMap$1;
import java.util.HashSet;
import com.yxcorp.image.common.log.Log;
import java.util.Collection;

public final class i implements k$a	// class@0024b7
{
    public static final i a;

    static {
       i.a = new i();
    }
    public void i(){
       super();
    }
    public final void a(Object p0){
       RecycledBitmapExceptionTracker$subscriberMap$1 a;
       if (p0 != null) {
          l$a b = p0.b;
          if (b != null && b.j() instanceof b) {
             p0 = p0.b.j().g();
             if (p0 != null && p0.isRecycled()) {
                RecycledBitmapExceptionTracker c = RecycledBitmapExceptionTracker.c;
                _monitor_enter(c);
                if (PatchProxy.applyVoidOneRefs(p0, c, RecycledBitmapExceptionTracker.class, "5")) {
                   _monitor_exit(c);
                }else {
                   a.p(p0, "bitmap");
                   a = RecycledBitmapExceptionTracker.a;
                   Log.a("RecycledBitmapExceptionTracker", "find recycled bitmap, subscribed by "+a.get(c.c(p0)));
                   p0 = a.get(c.c(p0));
                   if (p0 != null) {
                      RecycledBitmapExceptionTracker.b.addAll(p0);
                   }
                   _monitor_exit(c);
                }
             }
          }
       }
       return;
    }
}
