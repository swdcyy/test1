package ci9.b;
import android.view.View$OnTouchListener;
import ci9.l;
import java.lang.Object;
import android.view.View;
import android.view.MotionEvent;
import android.view.ViewGroup;
import com.yxcorp.gifshow.camera.record.tab.CameraScrollTabViewGroup;

public final class b implements View$OnTouchListener	// class@0005f2
{
    public final l b;

    public void b(l p0){
       this.b = p0;
    }
    public final boolean onTouch(View p0,MotionEvent p1){
       b tb = this.b;
       boolean b = (tb.q.isShown() && (tb.q.isEnabled() && (tb.q.j() && (tb.q.i() || tb.q.k()))))? true: false;
       return b;
    }
}
