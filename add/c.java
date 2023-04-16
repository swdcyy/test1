package add.c;
import java.lang.Object;
import ml8.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import i8d.l0;
import kcd.p;
import java.util.Objects;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import kcd.q;

public class c	// class@0000de
{

    public void c(){
       super();
    }
    public static void a(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, c.class, "1")) {
          return;
       }
       if (p0 instanceof l0) {
          p op = new p();
          Objects.requireNonNull(p0);
          if (!PatchProxy.applyVoidOneRefsWithListener(op, p0, l0.class, "3")) {
             p0.s.U7(op);
             PatchProxy.onMethodExit(l0.class, "3");
          }
          p0.U7(new q());
       }
       return;
    }
}
