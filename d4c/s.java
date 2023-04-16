package d4c.s;
import erd.g;
import d4c.v;
import java.lang.Object;
import kob.x;
import java.util.Objects;
import npb.c;
import kob.r;
import com.kuaishou.android.model.music.Music;
import g9c.a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import crd.b;
import lnc.b9;
import java.util.concurrent.TimeUnit;
import brd.t;
import brd.z;
import io.reactivex.android.schedulers.a;
import d4c.l;
import erd.r;
import d4c.r;

public final class s implements g	// class@0020dc
{
    public final v b;

    public void s(v p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       s tb = this.b;
       Objects.requireNonNull(tb);
       int i = p0.a();
       c current = tb.D.getCurrent();
       if (current != null) {
          int i1 = tb.E.P0(current.c());
          if (i1 >= 0) {
             tb.E.l0(i1);
          }
          if (i == 12 && !PatchProxy.applyVoid(null, tb, v.class, "13")) {
             b9.a(tb.J);
             tb.J = t.interval(500, TimeUnit.MILLISECONDS).observeOn(a.c()).filter(new l(tb)).subscribe(new r(tb));
          }
       }
    label_005d :
       return;
    }
}
