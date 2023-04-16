package dca.j$b;
import androidx.lifecycle.Observer;
import dca.j;
import java.lang.Object;
import cca.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import tvc.e;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import java.util.List;
import kotlin.jvm.internal.a;
import lnc.a1;
import com.yxcorp.gifshow.widget.RecyclerTabWithIndicatorView;
import cca.a;

public final class j$b implements Observer	// class@001ef7
{
    public final j b;

    public void j$b(j p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j$b.class, "1")) {
       }else {
          b uob = this.b.e.u0();
          if (a.g(p0.g(), uob.g()) ^ 1) {
             RecyclerTabWithIndicatorView.s(this.b.c, p0.g(), a1.d(R.dimen.arg_RES_7f070334), false, 4, null);
             this.b.c.l();
             RecyclerTabWithIndicatorView.r(this.b.c, 0, 0, 2, null);
          }
          if (p0.c() != uob.c()) {
             a uoa = p0.e();
             if (uoa == null || uoa.e() != true) {
                a.o(p0, "newState");
                this.b.D(p0);
             }
          }
       }
       return;
    }
}
