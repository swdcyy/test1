package f37.b0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.library.widget.popup.common.c;
import java.util.ArrayList;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Iterator;

public class b0 extends PresenterV2	// class@0023a6
{
    public List p;

    public void b0(){
       super();
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, b0.class, "3")) {
          return;
       }
       this.R8();
       return;
    }
    public void P8(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b0.class, "1")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       if (this.p == null) {
          this.p = new ArrayList();
       }
       this.p.add(new WeakReference(p0));
       return;
    }
    public void R8(){
       if (PatchProxy.applyVoid(null, this, b0.class, "2")) {
          return;
       }
       b0 tp = this.p;
       if (tp != null) {
          Iterator iterator = tp.iterator();
          while (iterator.hasNext()) {
             c uoc = iterator.next().get();
             if (uoc != null && uoc.K()) {
                uoc.o();
             }
          }
          this.p.clear();
          this.p = null;
       }
       return;
    }
}
