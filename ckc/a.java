package ckc.a;
import so7.b;
import java.lang.String;
import java.lang.Object;
import android.app.Activity;
import so7.a;
import to7.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import rx4.b;
import android.view.ViewGroup;
import ckc.a$b;
import tx4.l;
import rx4.a;
import android.os.SystemClock;
import ckc.a$a;
import sx4.e$a;
import tx4.o;

public class a implements b	// class@0005c2
{
    public a a;
    public final String b;

    public void a(String p0){
       super();
       this.b = p0;
    }
    public void a(Activity p0,String p1,a p2,String p3,b p4){
       a uoa = this;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p2;
       object oobject3 = p4;
       a uoa1 = a.class;
       if (PatchProxy.isSupport(uoa1)) {
          Object[] objArray = new Object[]{oobject,oobject1,oobject2,p3,oobject3};
          if (PatchProxy.applyVoid(objArray, uoa, uoa1, "3")) {
             return;
          }
       }
       if (!TextUtils.x(uoa.b) && oobject != null) {
          b uob = new b(oobject, null, uoa.b, "social_share").c(new a$b(oobject2));
          uob.g(1);
          uob.f(oobject1);
          uoa.a = uob.b();
          Object[] objArray1 = new Object[0];
          uoa.a.n(0x3a98, null, new a$a(uoa, SystemClock.uptimeMillis(), oobject3), p3, objArray1);
       }
       return;
    }
    public void destroy(){
       if (PatchProxy.applyVoid(null, this, a.class, "4")) {
          return;
       }
       a ta = this.a;
       if (ta != null) {
          ta.onDestroy();
          this.a = null;
       }
       return;
    }
}
