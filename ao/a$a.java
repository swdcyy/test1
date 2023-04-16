package ao.a$a;
import erd.g;
import ao.a;
import java.lang.Object;
import com.trello.rxlifecycle3.android.ActivityEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebView;

public final class a$a implements g	// class@0001fc
{
    public final a b;

    public void a$a(a p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "1")) {
       }else {
          a.p(p0, "activityEvent");
          if (p0 == ActivityEvent.RESUME) {
             a p = this.b.p;
             if (p != null) {
                p.onResume();
             }
          }
          if (p0 == ActivityEvent.PAUSE) {
             p0 = this.b.p;
             if (p0 != null) {
                p0.onPause();
             }
          }
       }
       return;
    }
}
