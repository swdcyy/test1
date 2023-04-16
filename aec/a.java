package aec.a;
import erd.o;
import java.lang.Object;
import sx5.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.feature.api.social.reminder.push.OpenServiceBarResponse;
import kotlin.jvm.internal.a;

public final class a implements o	// class@0000f7
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public Object apply(Object p0){
       b uob = PatchProxy.applyOneRefs(p0, this, a.class, "1");
       if (uob != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          uob = p0.data;
       }
       return uob;
    }
}
