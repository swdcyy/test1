package ao.b$a;
import erd.r;
import ao.b;
import java.lang.Object;
import com.trello.rxlifecycle3.android.ActivityEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import android.app.Activity;

public final class b$a implements r	// class@0001fe
{
    public final b b;

    public void b$a(b p0){
       this.b = p0;
       super();
    }
    public boolean test(Object p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, b$a.class, "1");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          a.p(p0, "activityEvent");
          if (p0 == ActivityEvent.PAUSE) {
             p0 = this.b.getActivity();
             if (p0 != null && p0.isFinishing() == true) {
                b = true;
             }
          }
          b = false;
       }
       return b;
    }
}
