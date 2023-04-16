package eh9.c;
import erd.g;
import com.yxcorp.gifshow.camera.record.tab.c;
import mm6.c;
import java.lang.Object;
import com.trello.rxlifecycle3.android.FragmentEvent;
import java.util.Objects;
import j8c.a;
import java.lang.String;
import q87.c;
import crd.b;

public final class c implements g	// class@00214a
{
    public final c b;
    public final c c;

    public void c(c p0,c p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       c tb = this.b;
       c tc = this.c;
       Objects.requireNonNull(tb);
       if (p0 == FragmentEvent.CREATE_VIEW) {
          Object[] objArray = new Object[0];
          a.D().s("CameraScrollTab", "fragment createView", objArray);
          p0 = tb.r;
          if (p0 != null && !p0.isDisposed()) {
             tb.r.dispose();
             tb.r = null;
          }
          tb.K(tc);
       }
       return;
    }
}
