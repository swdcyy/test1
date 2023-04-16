package dx9.c$a;
import java.lang.Runnable;
import dx9.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams;
import androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior;
import com.google.android.material.appbar.CustomAppBarLayoutBehavior;
import android.view.ViewGroup;
import java.util.Objects;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.view.View;
import java.lang.Math;

public class c$a implements Runnable	// class@001fe7
{
    public final c b;

    public void c$a(c p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, c$a.class, "1")) {
          return;
       }
       CustomAppBarLayoutBehavior uCustomAppBa = this.b.p.getLayoutParams().f();
       if (uCustomAppBa == null) {
          return;
       }
       int i = (this.b.p.getHeight() + this.b.r.getHeight()) - this.b.q.getHeight();
       c$a tb = this.b;
       Objects.requireNonNull(tb);
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          View obj = PatchProxy.applyOneRefs(Integer.valueOf(i), tb, uoc, "5");
          if (obj != PatchProxyResult.class) {
             i = obj.intValue();
          }else {
          label_005b :
             int childCount = tb.r.getChildCount();
             if (childCount > 0) {
                obj = tb.r.getChildAt((childCount - 1));
                if (obj != null) {
                   childCount = tb.P8(obj);
                   int i1 = tb.P8(tb.q);
                   if (childCount < tb.P8(tb.r)) {
                      i = Math.max((childCount - i1), 0);
                   }
                }
             }
          }
       }else {
          goto label_005b ;
       }
       uCustomAppBa.L(i);
       return;
    }
}
