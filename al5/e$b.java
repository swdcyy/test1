package al5.e$b;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import al5.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewTreeObserver;
import android.view.ViewGroup;
import com.kwai.emotionsdk.util.ActivityContext;
import android.app.Activity;
import android.content.Context;
import com.yxcorp.utility.n;
import lnc.a1;
import androidx.recyclerview.widget.RecyclerView;

public class e$b implements ViewTreeObserver$OnGlobalLayoutListener	// class@0000cf
{
    public final e b;

    public void e$b(e p0){
       this.b = p0;
       super();
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, e$b.class, "1")) {
          return;
       }
       this.b.u.getViewTreeObserver().removeOnGlobalLayoutListener(this);
       if (this.b.y != null) {
          e$b tb = this.b;
          e y = tb.y;
          if ((((n.z(ActivityContext.d().c()) - a1.d(0x7f0703bf)) / a1.d(0x7f0703c4)) - 1) < y) {
             tb.u.scrollToPosition(y);
          }
       }
       return;
    }
}
