package k59.k0;
import erd.g;
import com.yxcorp.gifshow.ad.webview.j;
import java.lang.Object;
import com.trello.rxlifecycle3.android.ActivityEvent;
import java.util.Objects;
import com.yxcorp.gifshow.ad.webview.o;

public final class k0 implements g	// class@002aed
{
    public final j b;

    public void k0(j p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       k0 tb = this.b;
       Objects.requireNonNull(tb);
       if (p0 == ActivityEvent.RESUME) {
          p0 = tb.E;
          if (p0 != null) {
             p0.c();
          }
       }
       return;
    }
}
