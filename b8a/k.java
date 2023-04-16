package b8a.k;
import erd.g;
import com.yxcorp.gifshow.detail.slidev2.presenter.e;
import java.lang.Object;
import c9a.a;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;
import android.graphics.Rect;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.utility.n;

public final class k implements g	// class@0003bc
{
    public final e b;

    public void k(e p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       k tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, e.class, "3")) {
       }else if(!p0.a.equals(tb.v)){
          p0 = p0.b;
          Rect top = p0.top;
          if (p0.height() > 0 && top > null) {
             tb.P8(n.j(tb.getActivity()), p0.height(), p0.top, 0, false);
          }
       }
       return;
    }
}
