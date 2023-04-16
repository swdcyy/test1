package nz9.z0$a;
import uf5.i0$a;
import nz9.z0;
import java.lang.Object;
import java.lang.Throwable;
import uf5.h0;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import e17.i;
import lnc.a1;
import java.lang.CharSequence;

public class z0$a implements i0$a	// class@003258
{
    public final z0 a;

    public void z0$a(z0 p0){
       this.a = p0;
       super();
    }
    public void a(Throwable p0){
       h0.a(this, p0);
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, z0$a.class, "1")) {
          return;
       }
       i oi = i.l();
       if (oi == null || !oi.s()) {
          i.d(R.style.arg_RES_7f11066a, a1.p(R.string.arg_RES_7f100e5f));
       }
       return;
    }
    public void c(){
       h0.b(this);
    }
}
