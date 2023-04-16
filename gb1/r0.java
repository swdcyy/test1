package gb1.r0;
import eb1.a;
import gb1.u0;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import eb1.e;
import db1.b;
import bb1.b;
import lnc.a1;
import gb1.o0;

public final class r0 implements a	// class@002482
{
    public final u0 a;

    public void r0(u0 p0){
       this.a = p0;
    }
    public final void run(){
       r0 ta = this.a;
       Objects.requireNonNull(ta);
       if (PatchProxy.applyVoid(null, ta, u0.class, "3")) {
       }else {
          ta.h(a1.r(R.string.arg_RES_7f101ff6, ta.b.b().h()), new o0(ta));
       }
       return;
    }
}
