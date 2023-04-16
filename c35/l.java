package c35.l;
import android.view.View$OnLongClickListener;
import com.kuaishou.viewbinder.IViewBinder;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import androidx.lifecycle.ViewModel;

public final class l implements View$OnLongClickListener	// class@000415
{
    public final IViewBinder b;
    public final View$OnLongClickListener c;

    public void l(IViewBinder p0,View$OnLongClickListener p1){
       a.p(p1, "listener");
       super();
       this.b = p0;
       this.c = p1;
    }
    public boolean onLongClick(View p0){
       l obj = PatchProxy.applyOneRefs(p0, this, l.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.b;
       if (obj != null && obj.onInterceptUserEvent(p0, null, true) == true) {
          return true;
       }
       return this.c.onLongClick(p0);
    }
}
