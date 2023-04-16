package jz0.j;
import erd.g;
import jz0.l;
import java.lang.Object;
import java.lang.Throwable;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import mk1.b;
import mkc.b;
import android.view.View;
import mkc.c;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView$a;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView;
import jz0.k;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import java.util.Iterator;
import java.util.HashSet;
import uk1.b;

public final class j implements g	// class@002c4b
{
    public final l b;

    public void j(l p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       j tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, l.class, "3")) {
       }else if(tb.c.l()){
          View view = c.h(tb.d, b.g);
          KwaiEmptyStateView$a uoa = KwaiEmptyStateView.e();
          uoa.b();
          uoa.p(new k(tb));
          uoa.a(view);
          ExceptionHandler.handleUserNotLoginFirstTimeAlert(p0, view);
          Iterator iterator = tb.e.iterator();
          while (iterator.hasNext()) {
             b uob = iterator.next();
             if (uob != null) {
                uob.b(p0);
             }
          }
       }
       return;
    }
}
