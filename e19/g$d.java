package e19.g$d;
import com.yxcorp.gifshow.widget.m;
import e19.g;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ekd.p0;
import e17.i;

public class g$d extends m	// class@002128
{
    public final g c;

    public void g$d(g p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g$d.class, "1")) {
          return;
       }
       if (this.c.getContext() != null && !p0.C(this.c.getContext())) {
          i.a(R.style.arg_RES_7f11066a, 0x7f1038e5);
       }
       this.c.R8();
       return;
    }
}
