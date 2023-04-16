package dx1.a;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import s81.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.os.Looper;
import dx1.a$a;
import java.lang.Runnable;
import ekd.k1;
import e17.i;
import e17.s;

public final class a	// class@00205b
{
    public static final a a;

    static {
       a.a = new a();
    }
    public void a(){
       super();
    }
    public static final void a(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, a.class, "6")) {
          return;
       }
       a.p(p0, "message");
       if (a.v() && !TextUtils.x(p0)) {
          if (a.g(Looper.getMainLooper(), Looper.myLooper()) ^ 0x01) {
             k1.o(new a$a(p0));
          }else {
             a.o(s.q(p0), "ToastUtil.showOfficial\(message\)");
          }
       }
       return;
    }
}
