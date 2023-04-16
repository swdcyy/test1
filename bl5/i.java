package bl5.i;
import al5.a;
import java.util.ArrayList;
import bl5.g;
import bl5.k;
import bl5.h;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import java.util.Iterator;

public class i extends a	// class@0004d9
{
    public List p;

    public void i(){
       super();
       this.p = new ArrayList();
       g og = new g();
       k ok = new k();
       h oh = new h();
       this.U7(og);
       this.U7(ok);
       this.U7(oh);
       this.p.add(og);
       this.p.add(ok);
       this.p.add(oh);
    }
    public void P8(boolean p0){
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oi, "1")) {
          return;
       }
       Iterator iterator = this.p.iterator();
       while (iterator.hasNext()) {
          iterator.next().P8(p0);
       }
       return;
    }
    public void R8(){
       if (PatchProxy.applyVoid(null, this, i.class, "2")) {
          return;
       }
       Iterator iterator = this.p.iterator();
       while (iterator.hasNext()) {
          iterator.next().R8();
       }
       return;
    }
}
