package dlc.k;
import java.lang.Runnable;
import dlc.l;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.component.photo.detail.slide.widget.TrendingTextSwitcher;
import im8.f;
import com.yxcorp.gifshow.entity.TrendingInfo;
import java.util.List;
import android.os.Handler;

public final class k implements Runnable	// class@002255
{
    public final l b;

    public void k(l p0){
       this.b = p0;
    }
    public final void run(){
       k tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, l.class, "7")) {
       }else {
          l q = tb.q;
          if (q != null) {
             q.a();
             tb.V8();
             q = tb.x;
             if (q != null) {
                tb.S8(q.get());
             }
             int i = 1;
             if (tb.A.size() > i) {
                int i1 = tb.B + i;
                tb.B = i1;
                if (i1 >= tb.A.size()) {
                   tb.B = 0;
                }
                tb.C.postDelayed(tb.D, 5000);
             }
          }
       }
       return;
    }
}
