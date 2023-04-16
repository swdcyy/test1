package c35.j;
import android.view.View$OnClickListener;
import com.kuaishou.viewbinder.IViewBinder;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import androidx.lifecycle.ViewModel;

public final class j implements View$OnClickListener	// class@000413
{
    public final IViewBinder b;
    public final View$OnClickListener c;

    public void j(IViewBinder p0,View$OnClickListener p1){
       a.p(p1, "listener");
       super();
       this.b = p0;
       this.c = p1;
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "1")) {
          return;
       }
       j tb = this.b;
       if (tb != null && tb.onInterceptUserEvent(p0, null, false) == true) {
          return;
       }
       this.c.onClick(p0);
       return;
    }
}
