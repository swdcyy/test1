package aec.n;
import im8.g;
import com.smile.gifmaker.mvps.presenter.a;
import aec.j;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import aec.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.helper.h;
import com.kwai.robust.PatchProxyResult;
import brd.t;
import sx5.j;
import t45.d;
import brd.z;
import aec.m;
import erd.g;
import aec.n$a;
import erd.r;
import aec.n$b;
import crd.b;
import aec.q;
import java.util.Map;
import java.util.HashMap;

public final class n extends a implements g	// class@00010d
{
    public i r;

    public void n(){
       super();
       this.U7(new j());
       this.U7(new d());
    }
    public void E8(){
       n on = n.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, on, "1")) {
          return;
       }
       if (h.a()) {
          return;
       }
       t ot = PatchProxy.apply(objArray, this, on, "2");
       if (ot != PatchProxyResult.class) {
       }else {
          on = this.r;
          if (on != null) {
             ot = t.just(on);
             if (ot == null) {
             }
          }else {
          }
       }
       this.X7(ot.observeOn(d.a).filter(n$a.b).subscribe(new n$b(this)));
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, n.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new q();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, n.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(n.class, new q());
       }else {
          obj.put(n.class, null);
       }
       return obj;
    }
}
