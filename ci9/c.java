package ci9.c;
import android.view.View$OnTouchListener;
import ci9.l;
import java.lang.Object;
import android.view.View;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.yxcorp.gifshow.camera.record.tab.CameraScrollTabViewGroupV2;

public final class c implements View$OnTouchListener	// class@0005f3
{
    public final l b;

    public void c(l p0){
       this.b = p0;
    }
    public final boolean onTouch(View p0,MotionEvent p1){
       c tb = this.b;
       boolean b = (tb.p.isShown() && (tb.p.isEnabled() && (tb.p.z() && (tb.p.y() || tb.p.A()))))? true: false;
       return b;
    }
}
