package a5c.i;
import erd.g;
import com.yxcorp.gifshow.profile.presenter.profile.hover.e;
import java.lang.Object;
import j5c.b;
import java.util.Objects;
import qvb.q;
import qvb.j;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public final class i implements g	// class@000081
{
    public final e b;

    public void i(e p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       i tb = this.b;
       Objects.requireNonNull(tb);
       boolean b = true;
       if (p0.a == b) {
          p0 = p0.b;
          if (p0 != null) {
             tb.B = p0;
             p0.h(tb.Q);
             tb.G = b;
             if (!PatchProxy.applyVoid(null, tb, e.class, "9")) {
                if (tb.m8().findViewById(0x7f0a3277) == null) {
                   b = false;
                }
                tb.O = b;
             }
             tb.a9();
          }
       }
       return;
    }
}
