package gh9.b$a;
import android.view.View$OnTouchListener;
import com.yxcorp.gifshow.camera.record.tab.CameraScrollTabViewGroupV2;
import java.lang.Object;
import android.view.View;
import android.view.MotionEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.widget.FrameLayout;

public final class b$a implements View$OnTouchListener	// class@00248e
{
    public final CameraScrollTabViewGroupV2 b;

    public void b$a(CameraScrollTabViewGroupV2 p0){
       this.b = p0;
       super();
    }
    public final boolean onTouch(View p0,MotionEvent p1){
       p0 = PatchProxy.applyTwoRefsWithListener(p0, p1, this, b$a.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       boolean b = true;
       if (!this.b.isShown() || (!this.b.isEnabled() || (!this.b.z() || (this.b.y() != b && this.b.A() != b)))) {
          b = false;
       }
    label_003e :
       PatchProxy.onMethodExit(b$a.class, "1");
       return b;
    }
}
