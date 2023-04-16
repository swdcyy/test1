package c24.n0;
import erd.g;
import com.kuaishou.merchant.router.base.RouterRequest;
import java.lang.Object;
import java.lang.Throwable;
import com.yxcorp.retrofit.model.KwaiException;
import java.lang.CharSequence;
import e17.i;
import us3.f;
import us3.h;

public final class n0 implements g	// class@00048c
{
    public final boolean b;
    public final RouterRequest c;

    public void n0(boolean p0,RouterRequest p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       n0 tc = this.c;
       if (this.b == null) {
          if (p0 instanceof KwaiException) {
             i.d(R.style.arg_RES_7f11066a, p0.mErrorMessage);
          }else {
             i.d(R.style.arg_RES_7f11066a, "ÍøÂç´íÎó");
          }
       }
       if (tc.b() != null) {
          p0 = new h();
          p0.a = 2;
          tc.b().a(p0);
       }
       return;
    }
}
