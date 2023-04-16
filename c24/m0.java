package c24.m0;
import erd.g;
import com.kuaishou.merchant.router.base.RouterRequest;
import java.lang.Object;
import com.kuaishou.merchant.live.basic.model.LiveWantInterpretationResponse;
import java.lang.CharSequence;
import e17.i;
import us3.f;
import us3.h;

public final class m0 implements g	// class@00048a
{
    public final boolean b;
    public final RouterRequest c;

    public void m0(boolean p0,RouterRequest p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       m0 tc = this.c;
       if (this.b == null) {
          i.d(R.style.arg_RES_7f11066a, p0.mToast);
       }
       if (tc.b() != null) {
          p0 = new h();
          p0.a = 1;
          tc.b().a(p0);
       }
       return;
    }
}
