package k59.c0;
import erd.g;
import com.yxcorp.gifshow.ad.webview.f;
import java.lang.Object;
import com.trello.rxlifecycle3.android.ActivityEvent;
import java.util.Objects;
import p59.t;

public final class c0 implements g	// class@002acc
{
    public final f b;

    public void c0(f p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       c0 tb = this.b;
       Objects.requireNonNull(tb);
       if (p0 == ActivityEvent.RESUME) {
          p0 = tb.z;
          if (p0 != null) {
             p0.c();
          }
       }
       return;
    }
}
