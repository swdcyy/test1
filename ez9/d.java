package ez9.d;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import v6a.m0;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import f6a.c;
import xx9.a;
import io.reactivex.subjects.PublishSubject;

public final class d	// class@002262
{
    public static final d a;

    static {
       d.a = new d();
    }
    public void d(){
       super();
    }
    public final boolean a(QPhoto p0,m0 p1){
       boolean b;
       Object obj = PatchProxy.applyTwoRefsWithListener(p0, p1, this, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "photo");
       a.p(p1, "callerContext");
       if (c.g(p0)) {
          m0 r = p1.r;
          if (r == null || (!r.c() && p1.X.d())) {
             b = true;
          label_0038 :
             PatchProxy.onMethodExit(d.class, "1");
             return b;
          }
       }
       b = false;
       goto label_0038 ;
    }
}
