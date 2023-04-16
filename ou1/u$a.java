package ou1.u$a;
import java.lang.Runnable;
import ou1.u;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.multipk.render.viewcontroller.LiveMultiPkRenderChildViewController;
import androidx.lifecycle.MutableLiveData;
import hu1.c;
import kotlin.Pair;
import android.view.View;
import java.lang.Integer;

public final class u$a implements Runnable	// class@0035aa
{
    public final u b;

    public void u$a(u p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, u$a.class, "1")) {
          return;
       }
       this.b.b3();
       this.b.u.a().setValue(new Pair(this.b.b3(), Integer.valueOf(u.e3(this.b).getMeasuredWidth())));
       return;
    }
}
