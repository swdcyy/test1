package dn1.a;
import androidx.lifecycle.Observer;
import com.kuaishou.live.common.core.component.hotlist.fixedEntrance.FixedEntranceViewController;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ks5.b;
import ks5.c;
import java.util.Objects;
import kotlin.jvm.internal.a;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.view.ViewGroup$MarginLayoutParams;
import qrd.l1;

public final class a implements Observer	// class@001fcb
{
    public final FixedEntranceViewController b;

    public void a(FixedEntranceViewController p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
       }else if(!p0.booleanValue()){
          p0 = this.b;
          p0.v.c(p0.u);
          p0 = this.b;
          Objects.requireNonNull(p0);
          if (!PatchProxy.applyVoid(null, p0, FixedEntranceViewController.class, "5")) {
             FixedEntranceViewController q = p0.q;
             String str = "animationContainer";
             if (q == null) {
                a.S(str);
             }
             p0 = p0.q;
             if (p0 == null) {
                a.S(str);
             }
             p0 = p0.getLayoutParams();
             Objects.requireNonNull(p0, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
             p0.width = -2;
             q.setLayoutParams(p0);
          }
       }else {
          p0 = this.b;
          if (p0.r == null) {
             p0.v.b(p0.u);
          }
       }
       return;
    }
}
