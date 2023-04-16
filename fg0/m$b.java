package fg0.m$b;
import erd.r;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import java.lang.Object;
import com.trello.rxlifecycle3.android.ActivityEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import android.app.Activity;

public final class m$b implements r	// class@002330
{
    public final RxFragmentActivity b;

    public void m$b(RxFragmentActivity p0){
       this.b = p0;
       super();
    }
    public boolean test(Object p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, m$b.class, "1");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          a.p(p0, "activityEvent");
          b = (p0 == ActivityEvent.PAUSE && this.b.isFinishing())? true: false;
       }
       return b;
    }
}
