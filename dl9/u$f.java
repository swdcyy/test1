package dl9.u$f;
import android.view.View$OnLayoutChangeListener;
import dl9.u;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public final class u$f implements View$OnLayoutChangeListener	// class@001fb0
{
    public final u b;

    public void u$f(u p0){
       this.b = p0;
       super();
    }
    public void onLayoutChange(View p0,int p1,int p2,int p3,int p4,int p5,int p6,int p7,int p8){
       if (PatchProxy.isSupport(u$f.class)) {
          Object[] objArray = new Object[9];
          objArray[0] = p0;
          objArray[1] = Integer.valueOf(p1);
          objArray[2] = Integer.valueOf(p2);
          objArray[3] = Integer.valueOf(p3);
          objArray[4] = Integer.valueOf(p4);
          objArray[5] = Integer.valueOf(p5);
          objArray[6] = Integer.valueOf(p6);
          objArray[7] = Integer.valueOf(p7);
          objArray[8] = Integer.valueOf(p8);
          if (PatchProxy.applyVoid(objArray, this, u$f.class, "1")) {
             return;
          }
       }
       if ((p4 - p2) > 0) {
          u$f tb = this.b;
          u b = tb.B;
          a.m(b);
          tb.c9(b);
          this.b.m8().removeOnLayoutChangeListener(this);
       }
       return;
    }
}
