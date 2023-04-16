package bed.t;
import erd.g;
import bed.y;
import java.lang.Object;
import android.content.Intent;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import a46.b;
import com.yxcorp.gifshow.util.LoadPolicy;
import brd.a0;
import lnc.y6;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import com.trello.rxlifecycle3.android.ActivityEvent;
import gr8.b;
import gr8.c;
import brd.f0;
import bed.q;
import bed.o;
import crd.b;

public final class t implements g	// class@000422
{
    public final y b;

    public void t(y p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       t tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, y.class, "26")) {
       }else {
          y6.s(b.class, LoadPolicy.DIALOG).g(c.c(tb.a.m(), ActivityEvent.DESTROY)).R(new q(p0), o.b);
       }
       return;
    }
}
