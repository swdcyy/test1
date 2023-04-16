package akd.d0$a;
import android.os.AsyncTask;
import bkd.a;
import zjd.a;
import java.lang.Object;
import java.lang.Void;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ckd.a$a$a;
import ckd.b;
import akd.p;
import ckd.a;
import ckd.a$a;
import akd.c0;
import com.yxcorp.upgrade.network.CheckUpgradeRequestListener;

public class d0$a extends AsyncTask	// class@00004d
{
    public a a;
    public a b;

    public void d0$a(a p0,a p1){
       super();
       this.b = p0;
       this.a = p1;
    }
    public Object doInBackground(Object[] p0){
       String str = "1";
       p0 = PatchProxy.applyOneRefs(p0, this, d0$a.class, str);
       if (p0 != PatchProxyResult.class) {
       }else {
          a$a$a uoa$a = new a$a$a();
          d0$a tb = this.b;
          uoa$a.b = tb.c;
          uoa$a.a = tb.b;
          uoa$a.f = tb.a;
          uoa$a.c = tb.d;
          uoa$a.i = tb.j;
          uoa$a.e = tb.f;
          uoa$a.d = tb.e;
          uoa$a.g = tb.h;
          uoa$a.h = tb.i;
          a instance = p.a().getInstance();
          a$a uoa = PatchProxy.apply(null, uoa$a, a$a$a.class, str);
          if (uoa != PatchProxyResult.class) {
          }else {
             uoa = new a$a(uoa$a);
          }
          instance.a(uoa, new c0(this));
          uoa$a = null;
       }
       return p0;
    }
}
