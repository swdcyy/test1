package ev2.j;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import com.yxcorp.retrofit.model.KwaiException;
import java.lang.CharSequence;
import e17.i;
import e17.s;

public final class j	// class@002800
{
    public static final j a;

    static {
       j.a = new j();
    }
    public void j(){
       super();
    }
    public final boolean a(Throwable p0){
       KwaiException obj = PatchProxy.applyOneRefs(p0, this, j.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "throwable");
       if (p0 instanceof KwaiException) {
          obj = p0.mErrorMessage;
          a.o(obj, "serverMessage");
          int i = (obj.length() > 0)? 1: 0;
          if (i) {
             int errorCode = p0.getErrorCode();
             if (errorCode != 0x13883) {
                switch (errorCode){
                    case 0x1393e:
                    case 0x13940:
                    case 0x13941:
                    case 0x13942:
                    case 0x1393f:
                    default:
                }
             }
             s.h(obj);
             return true;
          }
       }
       return false;
    }
}
