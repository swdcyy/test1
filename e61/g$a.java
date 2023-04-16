package e61.g$a;
import android.util.LruCache;
import e61.g;
import e61.e;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;

public class g$a extends LruCache	// class@0020ae
{
    public final e a;
    public final g b;

    public void g$a(g p0,int p1,e p2){
       this.b = p0;
       this.a = p2;
       super(p1);
    }
    public int sizeOf(Object p0,Object p1){
       int i;
       g$a obj = PatchProxy.applyTwoRefs(p0, p1, this, g$a.class, "1");
       if (obj != PatchProxyResult.class) {
          i = obj.intValue();
       }else {
          obj = this.a;
          i = (obj != null)? obj.a(p0, p1): super.sizeOf(p0, p1);
       }
       return i;
    }
}
