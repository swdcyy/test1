package ou1.k;
import java.lang.Runnable;
import ou1.l;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.multipk.render.viewcontroller.LiveMultiPkRenderChildViewController;
import ou1.o;
import androidx.lifecycle.MutableLiveData;
import hu1.c;
import kotlin.Pair;
import android.view.View;
import java.lang.Integer;

public final class k implements Runnable	// class@0035a0
{
    public final l b;

    public void k(l p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, k.class, "1")) {
          return;
       }
       this.b.b.b3();
       this.b.b.x.a().setValue(new Pair(this.b.b.b3(), Integer.valueOf(o.e3(this.b.b).getMeasuredWidth())));
       return;
    }
}
