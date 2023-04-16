package g59.k$a;
import android.util.LruCache;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.lang.Boolean;
import java.lang.Number;

public final class k$a extends LruCache	// class@002408
{
    public final int a;

    public void k$a(int p0,int p1){
       this.a = p0;
       super(p1);
    }
    public Object create(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, k$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "key");
       return null;
    }
    public void entryRemoved(boolean p0,Object p1,Object p2,Object p3){
       if (PatchProxy.isSupport(k$a.class) && PatchProxy.applyVoidFourRefs(Boolean.valueOf(p0), p1, p2, p3, this, k$a.class, "3")) {
          return;
       }
       a.p(p1, "key");
       a.p(p2, "oldValue");
       return;
    }
    public int sizeOf(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, k$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       a.p(p0, "key");
       a.p(p1, "value");
       return 1;
    }
}
