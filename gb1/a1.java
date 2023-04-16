package gb1.a1;
import eb1.a;
import gb1.d1;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lnc.a1;
import gb1.y0;
import eb1.e;

public final class a1 implements a	// class@002447
{
    public final d1 a;

    public void a1(d1 p0){
       this.a = p0;
    }
    public final void run(){
       a1 ta = this.a;
       Objects.requireNonNull(ta);
       if (PatchProxy.applyVoid(null, ta, d1.class, "4")) {
       }else {
          ta.h(a1.p(R.string.arg_RES_7f102098), new y0(ta));
       }
       return;
    }
}
