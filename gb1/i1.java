package gb1.i1;
import eb1.a;
import gb1.m1;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lnc.a1;
import gb1.g1;
import eb1.e;

public final class i1 implements a	// class@002467
{
    public final m1 a;

    public void i1(m1 p0){
       this.a = p0;
    }
    public final void run(){
       i1 ta = this.a;
       Objects.requireNonNull(ta);
       if (PatchProxy.applyVoid(null, ta, m1.class, "3")) {
       }else {
          ta.h(a1.p(R.string.arg_RES_7f102072), new g1(ta));
       }
       return;
    }
}
