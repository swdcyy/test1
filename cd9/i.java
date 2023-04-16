package cd9.i;
import android.view.View$OnTouchListener;
import com.yxcorp.gifshow.camera.record.duet.controller.DuetLayoutManager;
import java.lang.Object;
import android.view.View;
import android.view.MotionEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public class i implements View$OnTouchListener	// class@0005a8
{
    public final DuetLayoutManager b;

    public void i(DuetLayoutManager p0){
       this.b = p0;
       super();
    }
    public boolean onTouch(View p0,MotionEvent p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, i.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       if (this.b.u == null) {
          return false;
       }
       if (p1.getActionMasked() == 1) {
          this.b.m2(true, true);
       }
       return true;
    }
}
