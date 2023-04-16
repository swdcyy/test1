package bed.l0;
import erd.g;
import bed.q0;
import com.kuaishou.android.model.music.Music;
import java.lang.Object;
import java.lang.Throwable;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.activity.GifshowActivity;
import a46.b;
import lnc.x6;
import lnc.y6;
import pm6.m;
import brd.t;
import com.yxcorp.gifshow.music.utils.c;
import com.yxcorp.gifshow.fragment.ObservableBox$b;
import androidx.fragment.app.FragmentActivity;
import com.yxcorp.gifshow.fragment.ObservableBox;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import com.trello.rxlifecycle3.android.ActivityEvent;
import gr8.b;
import gr8.c;
import brd.x;
import t45.d;
import brd.z;
import bed.j0;
import com.kuaishou.live.common.core.basic.tools.h;
import crd.b;

public final class l0 implements g	// class@000413
{
    public final q0 b;
    public final Music c;

    public void l0(q0 p0,Music p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       l0 tb = this.b;
       l0 tc = this.c;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(tc, tb, q0.class, "2")) {
       }else {
          p0 = tb.a;
          b uob = y6.r(b.class);
          int i = (uob != null)? uob.xa(): m.b(0);
          ObservableBox$b uob1 = new ObservableBox$b(p0);
          uob1.a(true);
          t ot = ObservableBox.b(c.b(tc, (long)i), uob1);
          p0 = ot.compose(c.c(p0.m(), ActivityEvent.DESTROY));
          p0.subscribeOn(d.c).observeOn(d.a).subscribe(new j0(tb), h.b);
       }
       return;
    }
}
