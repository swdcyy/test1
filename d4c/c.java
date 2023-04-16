package d4c.c;
import android.view.View$OnClickListener;
import d4c.v;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import a46.d;
import com.yxcorp.gifshow.util.LoadPolicy;
import brd.a0;
import lnc.y6;
import d4c.d;
import d4c.k;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public final class c implements View$OnClickListener	// class@0020c6
{
    public final v b;

    public void c(v p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       c tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, v.class, "16")) {
       }else if(tb.F == null){
          tb.X7(y6.s(d.class, LoadPolicy.DIALOG).R(new d(tb), k.b));
       }
       return;
    }
}
