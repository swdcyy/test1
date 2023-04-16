package bta.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.View;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import xq6.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import zq6.b;
import wq6.f;
import java.util.ArrayList;
import bo5.a;
import bta.b;
import wq6.h;
import java.util.List;
import zq6.i;
import zq6.s;
import xq6.b;

public final class c extends PresenterV2	// class@000466
{
    public f p;
    public final a q;
    public h r;
    public final View s;

    public void c(View p0){
       a.p(p0, "view");
       super();
       this.s = p0;
       this.q = new a();
    }
    public void E8(){
       c uoc = c.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoc, "3")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, uoc, "4")) {
          uoc = this.p;
          if (uoc == null) {
             a.S("containerController");
          }
          b uob = uoc.y();
          ArrayList uArrayList = new ArrayList();
          p b = a.B;
          a.o(b, "HomeTopStateId.TAB_TRIANGLE_NOTIFY");
          uArrayList.add(b);
          b = a.D;
          a.o(b, "HomeTopStateId.TAB_ROTATE_DEGREES");
          uArrayList.add(b);
          b = a.E;
          a.o(b, "HomeTopStateId.TAB_TRIANGLE_ALPHA");
          uArrayList.add(b);
          b = a.F;
          a.o(b, "HomeTopStateId.TAB_TRIANGLE_ALPHA_WITH_DIRECTION");
          uArrayList.add(b);
          b = a.C;
          a.o(b, "HomeTopStateId.TAB_TRIANGLE_COLOR");
          uArrayList.add(b);
          c tq = this.q;
          c tr = this.r;
          if (tr == null) {
             a.S("kcubeTab");
          }
          tq.a(uob.c(tr, uArrayList, new b(this)));
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, c.class, "5")) {
          return;
       }
       this.q.c();
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       Object obj = this.r8("KCUBE_TAB");
       a.o(obj, "inject\(ActionBarAccessIds.KCUBE_TAB\)");
       this.r = obj;
       obj = this.r8("KCUBE_CONTAINER_CONTROLLER");
       a.o(obj, "inject\(ActionBarAccessId¡­UBE_CONTAINER_CONTROLLER\)");
       this.p = obj;
       return;
    }
}
