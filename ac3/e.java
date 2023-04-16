package ac3.e;
import ac3.j;
import java.lang.Object;
import ac3.i;
import hf3.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import ba1.d;
import hf3.b;
import ac3.e$a;
import wg3.a;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import d61.f;
import o56.a;
import android.os.Build$VERSION;
import k51.a;
import java.lang.Boolean;
import com.kwai.sdk.switchconfig.a;
import io7.c;

public class e implements j	// class@000068
{

    public void e(){
       super();
    }
    public a a(i p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "connectionConfig");
       return new d(this.b(p0));
    }
    public b b(i p0){
       e$a obj = PatchProxy.applyOneRefs(p0, this, e.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "connectionConfig");
       obj = new e$a(p0);
       if (!a.e()) {
          QCurrentUser qCurrentUser = QCurrentUser.me();
          a.o(qCurrentUser, "QCurrentUser.me\(\)");
          if (!TextUtils.x(qCurrentUser.getToken())) {
             qCurrentUser = QCurrentUser.me();
             a.o(qCurrentUser, "QCurrentUser.me\(\)");
             obj.j = qCurrentUser.getToken();
          }
       }
       obj.w = f.c();
       obj.u = 21;
       obj.b = p0.e();
       obj.d = false;
       obj.e = false;
       obj.h = p0.d();
       obj.m = a.a;
       obj.n = a.m;
       obj.o = a.p;
       obj.p = String.valueOf(Build$VERSION.SDK_INT);
       obj.q = a.j;
       obj.r = a.k;
       obj.s = a.x;
       obj.t = a.A;
       obj.v = 2;
       obj.a = a.B;
       obj.x = this.c();
       obj.y = f.a();
       obj.z = a.e();
       obj.A = a.a();
       obj.i = p0.g();
       return obj;
    }
    public final boolean c(){
       Object obj = PatchProxy.apply(null, this, e.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().u("SOURCE_LIVE").d("isLongConnectionStickyMessageEnabledForLite", false);
    }
}
