package ep8.d$b;
import java.util.List;
import java.lang.Object;
import android.util.SparseArray;
import java.util.Iterator;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Number;

public class d$b	// class@002224
{
    public final SparseArray a;
    public int b;

    public void d$b(){
       super(null);
    }
    public void d$b(List p0){
       super();
       this.a = new SparseArray();
       this.b = 0;
       if (p0 != null) {
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             d$b tb = this.b;
             int i = tb + 1;
             this.b = i;
             this.a.put(tb, iterator.next());
          }
       }
       return;
    }
    public boolean a(View p0){
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       d$b uob = d$b.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, uob, "2");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       Object obj1 = PatchProxy.applyOneRefs(p0, this, uob, "1");
       boolean b = false;
       if (obj1 != patchProxyRe) {
          b1 = obj1.booleanValue();
       }else if(this.a.indexOfValue(p0) >= 0){
          b1 = true;
       }else {
          b1 = false;
       }
       if (b1) {
          return b;
       }else {
          uob = this.b;
          this.b = uob + 1;
          this.a.put(uob, p0);
          return true;
       }
    }
    public int b(int p0){
       d$b uob = d$b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uob, "6");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       p0 = (p0 >= 0 && p0 < this.a.size())? this.a.keyAt(p0): -1;
       return p0;
    }
    public View c(int p0){
       d$b uob = d$b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uob, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.a.get(p0);
    }
    public boolean d(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d$b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = this.a.indexOfValue(p0);
       if (i < 0) {
          return false;
       }
       this.a.removeAt(i);
       return true;
    }
    public int e(){
       Object obj = PatchProxy.apply(null, this, d$b.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.a.size();
    }
}
