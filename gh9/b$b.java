package gh9.b$b;
import android.view.View$OnTouchListener;
import com.yxcorp.gifshow.camera.record.tab.CameraScrollTabViewGroup;
import java.lang.Object;
import android.view.View;
import android.view.MotionEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.ViewGroup;

public final class b$b implements View$OnTouchListener	// class@00248f
{
    public final CameraScrollTabViewGroup b;

    public void b$b(CameraScrollTabViewGroup p0){
       this.b = p0;
       super();
    }
    public final boolean onTouch(View p0,MotionEvent p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, b$b.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       boolean b = true;
       if (!this.b.isShown() || (!this.b.isEnabled() || (!this.b.j() || (this.b.i() != b && this.b.k() != b)))) {
          b = false;
       }
    label_003e :
       return b;
    }
}
