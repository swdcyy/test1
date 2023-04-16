package cl5.g;
import al5.a;
import java.util.ArrayList;
import cl5.e;
import cl5.f;
import cl5.h;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import java.util.Iterator;

public class g extends a	// class@0006f4
{
    public List p;

    public void g(){
       super();
       this.p = new ArrayList();
       e uoe = new e();
       f uof = new f();
       this.U7(uoe);
       this.U7(uof);
       this.U7(new h());
       this.p.add(uoe);
       this.p.add(uof);
       this.p.add(uof);
    }
    public void P8(boolean p0){
       g og = g.class;
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, og, "1")) {
          return;
       }
       Iterator iterator = this.p.iterator();
       while (iterator.hasNext()) {
          iterator.next().P8(p0);
       }
       return;
    }
    public void R8(){
       if (PatchProxy.applyVoid(null, this, g.class, "2")) {
          return;
       }
       Iterator iterator = this.p.iterator();
       while (iterator.hasNext()) {
          iterator.next().R8();
       }
       return;
    }
}
