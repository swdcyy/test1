package d61.n$a;
import java.lang.Object;
import java.lang.String;
import d61.n;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import d61.n$a$c;
import d61.n$a$d;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import com.kwai.framework.model.user.QCurrentUser;

public final class n$a	// class@001f38
{
    public static final n$a a;

    static {
       n$a.a = new n$a();
    }
    public void n$a(){
       super();
    }
    public final n a(String p0,int p1,int p2){
       if (PatchProxy.isSupport(n$a.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, n$a.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "key");
       return new n$a$c(p1, p2, p0, p0);
    }
    public final n b(String p0,int p1){
       n$a$d obj;
       n$a uoa = n$a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoa, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "key");
       obj = (p1 > 0)? 1: null;
       if (obj) {
          return new n$a$d(p1, p0, p0);
       }else {
          throw new IllegalStateException("limitCount must be positive".toString());
       }
    }
    public final String c(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, n$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "key");
       QCurrentUser mE = QCurrentUser.ME;
       a.o(mE, "QCurrentUser.ME");
       return p0+'_'+mE.getId();
    }
}
