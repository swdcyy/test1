package a7c.e$a;
import d7c.a;
import java.lang.Object;
import androidx.collection.SparseArrayCompat;
import d7c.b;
import d7c.c;
import d7c.g;
import d7c.f;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class e$a	// class@000092
{
    public final SparseArrayCompat a;
    public final boolean b;

    public void e$a(boolean p0){
       a uoa = a.class;
       super();
       SparseArrayCompat sparseArrayC = new SparseArrayCompat(10);
       this.a = sparseArrayC;
       this.b = p0;
       if (p0) {
          sparseArrayC.put(11, uoa);
          sparseArrayC.put(15, b.class);
       }else {
          sparseArrayC.put(11, uoa);
          sparseArrayC.put(12, c.class);
          sparseArrayC.put(14, g.class);
          sparseArrayC.put(13, f.class);
       }
       return;
    }
    public e$a a(Class p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, e$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          this.a.remove(12);
       }else {
          this.a.put(12, p0);
       }
       return this;
    }
}
