package gb1.j1;
import eb1.a;
import gb1.m1;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lnc.a1;
import gb1.h1;
import eb1.e;

public final class j1 implements a	// class@00246b
{
    public final m1 a;

    public void j1(m1 p0){
       this.a = p0;
    }
    public final void run(){
       j1 ta = this.a;
       Objects.requireNonNull(ta);
       if (PatchProxy.applyVoid(null, ta, m1.class, "4")) {
       }else {
          ta.h(a1.p(R.string.arg_RES_7f10209b), new h1(ta));
       }
       return;
    }
}
