package f3a.l$c;
import erd.g;
import f3a.l;
import java.lang.String;
import java.lang.Object;
import om6.k;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import uw9.o;
import q87.c;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import f3a.m;
import java.lang.Runnable;

public final class l$c implements g	// class@00228b
{
    public final l b;
    public final String c;

    public void l$c(l p0,String p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l$c.class, "1")) {
       }else {
          Object[] objArray = new Object[0];
          o.C().w("OcrUiPresenter", "goToPost go to import", objArray);
          p0.GT(this.b.getActivity(), this.c, new m(this));
       }
       return;
    }
}
