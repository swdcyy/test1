package b9d.c;
import erd.g;
import b9d.i;
import java.lang.Object;
import java.lang.Boolean;
import android.view.View;
import androidx.fragment.app.Fragment;
import java.lang.StringBuilder;
import java.lang.String;
import uy5.b;
import android.view.ViewTreeObserver;
import b9d.j;
import android.view.ViewTreeObserver$OnPreDrawListener;

public final class c implements g	// class@0003bd
{
    public final i b;

    public void c(i p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       c tb = this.b;
       p0 = tb.p.getView();
       StringBuilder str = "onBind, mPendingHomeGuideConfigList = ";
       boolean b = true;
       boolean b1 = (tb.s == null)? true: false;
       str = str+b1+" view = ";
       if (p0 != null) {
          b = false;
       }
       b.c("SearchHomeNewUserGuidePresenter", str+b);
       if (tb.s != null && p0 != null) {
          p0.getViewTreeObserver().addOnPreDrawListener(new j(tb, p0));
       }
       return;
    }
}
