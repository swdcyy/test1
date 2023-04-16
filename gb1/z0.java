package gb1.z0;
import eb1.a;
import gb1.d1;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lnc.a1;
import gb1.x0;
import eb1.e;

public final class z0 implements a	// class@00249a
{
    public final d1 a;

    public void z0(d1 p0){
       this.a = p0;
    }
    public final void run(){
       z0 ta = this.a;
       Objects.requireNonNull(ta);
       if (PatchProxy.applyVoid(null, ta, d1.class, "3")) {
       }else {
          ta.h(a1.p(R.string.arg_RES_7f10206f), new x0(ta));
       }
       return;
    }
}
