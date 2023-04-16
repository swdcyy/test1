package ef0.b;
import erd.g;
import ef0.a;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import java.lang.Object;
import com.trello.rxlifecycle3.android.ActivityEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.app.Activity;

public final class b implements g	// class@00213f
{
    public final a b;
    public final RxFragmentActivity c;

    public void b(a p0,RxFragmentActivity p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
       }else {
          a.p(p0, "activityEvent");
          if (p0 == ActivityEvent.DESTROY) {
             this.b.h(this.c);
          }else if(p0 == ActivityEvent.PAUSE && this.c.isFinishing()){
             this.b.h(this.c);
          }
       }
       return;
    }
}
