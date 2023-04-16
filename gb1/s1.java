package gb1.s1;
import eb1.a;
import gb1.v1;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lnc.a1;
import gb1.q1;
import eb1.e;

public final class s1 implements a	// class@002486
{
    public final v1 a;

    public void s1(v1 p0){
       this.a = p0;
    }
    public final void run(){
       s1 ta = this.a;
       Objects.requireNonNull(ta);
       if (PatchProxy.applyVoid(null, ta, v1.class, "4")) {
       }else {
          ta.h(a1.p(R.string.arg_RES_7f10209c), new q1(ta));
       }
       return;
    }
}
