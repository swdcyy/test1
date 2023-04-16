package l09.d$c;
import java.lang.Runnable;
import l09.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.yxcorp.gifshow.ad.detail.presenter.ad.pop.popvideo.PopShowFragment;

public final class d$c implements Runnable	// class@002c65
{
    public final d b;

    public void d$c(d p0){
       this.b = p0;
       super();
    }
    public final void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, d$c.class, "1")) {
          return;
       }
       d$c tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, d.class, "5")) {
          d q = tb.q;
          if (q != null) {
             q.dh("mAutoFinishRunnable");
          }
       }
       return;
    }
}
