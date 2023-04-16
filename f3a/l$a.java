package f3a.l$a;
import erd.g;
import f3a.l;
import java.lang.String;
import java.lang.Object;
import a36.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import uw9.o;
import q87.c;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import f3a.k;
import java.lang.Runnable;

public final class l$a implements g	// class@002289
{
    public final l b;
    public final String c;

    public void l$a(l p0,String p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l$a.class, "1")) {
       }else {
          Object[] objArray = new Object[0];
          o.C().w("OcrUiPresenter", "goToPost go to mood", objArray);
          p0.WX(this.b.getActivity(), this.c, new k(this));
       }
       return;
    }
}
