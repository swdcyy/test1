package eib.h;
import erd.r;
import java.lang.Object;
import com.trello.rxlifecycle3.android.ActivityEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;

public final class h implements r	// class@0026aa
{
    public static final h b;

    static {
       h.b = new h();
    }
    public void h(){
       super();
    }
    public boolean test(Object p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, h.class, "1");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          a.p(p0, "it");
          b = (p0 == ActivityEvent.DESTROY)? true: false;
       }
       return b;
    }
}
