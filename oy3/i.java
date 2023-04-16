package oy3.i;
import oy3.b;
import kx3.a;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import oy3.a;
import java.util.Iterator;
import java.util.List;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public class i extends a implements b	// class@003905
{
    public final List r;

    public void i(){
       super();
       this.r = new ArrayList();
    }
    public void G4(){
       if (PatchProxy.applyVoid(null, this, i.class, "2")) {
          return;
       }
       a.a(this);
       Iterator iterator = this.r.iterator();
       while (iterator.hasNext()) {
          PresenterV2 presenterV2 = iterator.next();
          if (presenterV2 instanceof b) {
             presenterV2.G4();
          }
       }
       return;
    }
    public int P8(){
       return -1;
    }
    public void S8(PresenterV2 p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, i.class, "1")) {
          return;
       }
       this.U7(p0);
       this.r.add(p0);
       PatchProxy.onMethodExit(i.class, "1");
       return;
    }
    public void p7(){
       if (PatchProxy.applyVoid(null, this, i.class, "3")) {
          return;
       }
       a.b(this);
       Iterator iterator = this.r.iterator();
       while (iterator.hasNext()) {
          PresenterV2 presenterV2 = iterator.next();
          if (presenterV2 instanceof b) {
             presenterV2.p7();
          }
       }
       return;
    }
}
