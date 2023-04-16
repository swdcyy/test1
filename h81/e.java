package h81.e;
import java.lang.Object;
import android.util.SparseArray;
import android.view.View;
import h81.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import h81.d;

public class e	// class@002658
{
    public final SparseArray a;

    public void e(){
       super();
       this.a = new SparseArray();
    }
    public void a(View p0,b p1){
       e uoe = e.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, uoe, "2")) {
          return;
       }
       b a = p1.a;
       if (PatchProxy.isSupport(uoe)) {
          d uod = PatchProxy.applyOneRefs(Integer.valueOf(a), this, uoe, "5");
          if (uod != PatchProxyResult.class) {
          }else {
             try{
             label_0024 :
                uod = this.a.get(a);
             }catch(java.lang.ClassCastException e0){
                uod = null;
             }
          }
       }else {
          goto label_0024 ;
       }
    }
    public void b(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "3")) {
          return;
       }
       this.a(null, p0);
       return;
    }
    public void c(int p0,d p1){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoe, "1")) {
          return;
       }
       this.a.put(p0, p1);
       return;
    }
}
