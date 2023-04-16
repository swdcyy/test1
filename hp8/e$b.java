package hp8.e$b;
import java.lang.Object;
import android.util.SparseArray;
import hp8.e$a;
import android.graphics.Typeface;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;

public class e$b	// class@0025cb
{
    public boolean a;
    public SparseArray b;

    public void e$b(){
       super();
       this.b = new SparseArray(4);
    }
    public void e$b(e$a p0){
       super();
       this.b = new SparseArray(4);
    }
    public Typeface a(int p0){
       e$b uob = e$b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uob, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       Typeface typeface = (this.a == null)? this.b.get(0): this.b.get(p0);
       return typeface;
    }
    public void b(boolean p0){
       this.a = p0;
    }
    public void c(int p0,Typeface p1){
       e$b uob = e$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uob, "2")) {
          return;
       }
       if (this.a == null) {
          this.b.put(0, p1);
       }else {
          this.b.put(p0, p1);
       }
       return;
    }
}
