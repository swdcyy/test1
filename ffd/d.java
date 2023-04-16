package ffd.d;
import com.kwai.framework.player.core.f;
import java.util.HashSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import java.util.Set;
import com.kwai.framework.player.multisource.e;
import com.kwai.framework.player.multisource.d;
import com.kwai.framework.player.core.b;
import ai7.e;

public class d extends f	// class@000e1a
{
    public d H;
    public Set I;

    public void d(){
       super();
       this.I = new HashSet();
    }
    public void f0(){
       if (PatchProxy.applyVoid(null, this, d.class, "4")) {
          return;
       }
       super.f0();
       if (this.H != null) {
          Iterator iterator = this.I.iterator();
          while (iterator.hasNext()) {
             this.H.d(iterator.next());
          }
       }
       return;
    }
    public void g0(){
       if (PatchProxy.applyVoid(null, this, d.class, "5")) {
          return;
       }
       super.g0();
       if (this.H != null) {
          Iterator iterator = this.I.iterator();
          while (iterator.hasNext()) {
             this.H.e(iterator.next());
          }
       }
       return;
    }
    public void h0(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
          return;
       }
       this.Y(p0);
       this.H = p0;
       return;
    }
    public void release(){
       if (PatchProxy.applyVoid(null, this, d.class, "2")) {
          return;
       }
       d tH = this.H;
       if (tH == null) {
          return;
       }
       tH.release();
       return;
    }
    public void releaseAsync(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "3")) {
          return;
       }
       d tH = this.H;
       if (tH == null) {
          return;
       }
       tH.releaseAsync(p0);
       return;
    }
}
