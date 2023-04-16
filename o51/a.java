package o51.a;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.retrofit.model.KwaiException;

public final class a	// class@003475
{
    public static final a a;

    static {
       a.a = new a();
    }
    public void a(){
       super();
    }
    public static final boolean a(Throwable p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (p0 instanceof KwaiException) {
          int errorCode = p0.getErrorCode();
          if (errorCode != 601 && (errorCode != 612 && (errorCode != 623 && (errorCode != 0x13c83 && (errorCode != 0x13c7d && (errorCode != 0x15f78 && errorCode != 604)))))) {
             b = true;
          }
       }
    label_003f :
       return b;
    }
}
