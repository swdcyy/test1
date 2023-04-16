package e1a.e;
import java.lang.Object;
import android.util.SparseBooleanArray;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public class e	// class@002046
{
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public SparseBooleanArray e;

    public void e(){
       super();
       this.a = 0;
       this.b = 1;
       this.c = 3;
       this.d = 4;
       this.e = new SparseBooleanArray();
    }
    public boolean a(int p0){
       e obj;
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoe, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = this.e;
       boolean b = false;
       if (obj != null && !obj.size()) {
          b = true;
       }
       return b;
    }
    public void b(){
       this.e = null;
    }
    public void c(int p0,boolean p1){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, uoe, "2")) {
          return;
       }
       uoe = this.e;
       if (uoe == null) {
          return;
       }
       if (p1) {
          uoe.put(p0, true);
       }else {
          uoe.delete(p0);
       }
       return;
    }
}
