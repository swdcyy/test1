package gb1.r1;
import eb1.a;
import gb1.v1;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lnc.a1;
import gb1.p1;
import eb1.e;

public final class r1 implements a	// class@002483
{
    public final v1 a;

    public void r1(v1 p0){
       this.a = p0;
    }
    public final void run(){
       r1 ta = this.a;
       Objects.requireNonNull(ta);
       if (PatchProxy.applyVoid(null, ta, v1.class, "3")) {
       }else {
          ta.h(a1.p(R.string.arg_RES_7f102073), new p1(ta));
       }
       return;
    }
}
