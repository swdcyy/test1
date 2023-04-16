package djc.z0;
import djc.y0;
import java.lang.Object;
import java.lang.ref.WeakReference;
import java.util.List;
import uo7.i0;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import gic.i;
import n80.b;
import q87.c;
import java.util.ArrayList;

public class z0 implements y0	// class@00222f
{
    public final WeakReference b;

    public void z0(y0 p0){
       super();
       this.b = new WeakReference(p0);
    }
    public void Bc(List p0,i0 p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, z0.class, "4")) {
          return;
       }
       if (this.b.get() != null) {
          this.b.get().Bc(p0, p1);
       }
       return;
    }
    public boolean Hb(){
       Object obj = PatchProxy.apply(null, this, z0.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.b.get() != null) {
          return this.b.get().Hb();
       }
       return false;
    }
    public void M4(List p0,i p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, z0.class, "2")) {
          return;
       }
       if (this.b.get() != null) {
          this.b.get().M4(p0, p1);
       }
       return;
    }
    public boolean Ob(){
       Object obj = PatchProxy.apply(null, this, z0.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.b.get() != null) {
          return this.b.get().Ob();
       }
       return false;
    }
    public List Rd(){
       Object obj = PatchProxy.apply(null, this, z0.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.b.get() != null) {
          return this.b.get().Rd();
       }
       Object[] objArray = new Object[0];
       b.C().w("ImPanelcontrollerProxy", "面板被回收后执行getSelectedTargets, will never happen", objArray);
       return new ArrayList();
    }
    public String ff(){
       Object obj = PatchProxy.apply(null, this, z0.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.b.get() != null) {
          return this.b.get().ff();
       }
       return "";
    }
}
