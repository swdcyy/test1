package aa1.d;
import wj3.a;
import k51.c;
import im8.a;
import java.lang.Object;
import ekd.j;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import wj3.a$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import wj3.c;
import java.util.List;
import java.util.Iterator;
import wj3.b;

public class d extends c implements a	// class@000052
{
    public static String sLivePresenterClassName = "LiveRootPresenter";

    public void d(a[] p0){
       super();
       if (j.h(p0)) {
          return;
       }
       int len = p0.length;
       for (int i = 0; i < len; i = i + 1) {
          this.W7(p0[i]);
       }
       return;
    }
    public void K7(a$a p0,Object[] p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, d.class, "4")) {
          return;
       }
       this.i(p1);
       if (p0 != null) {
          p0.a();
       }
       return;
    }
    public void L2(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "2")) {
          return;
       }
       List list = p0.build();
       if (list == null) {
          return;
       }
       Iterator iterator = list.iterator();
       while (iterator.hasNext()) {
          this.U7(iterator.next());
       }
       return;
    }
    public void g1(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
          return;
       }
       this.U7(p0.build());
       return;
    }
    public void p3(c p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, d.class, "3")) {
          return;
       }
       this.L2(p0);
       return;
    }
}
