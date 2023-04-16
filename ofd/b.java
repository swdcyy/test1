package ofd.b;
import joc.z;
import com.yxcorp.gifshow.widget.SwipeLayout;
import android.view.View;
import android.view.MotionEvent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.widget.FrameLayout;

public class b extends z	// class@001f16
{
    public SwipeLayout e;

    public void b(SwipeLayout p0){
       super();
       this.e = p0;
    }
    public boolean d(View p0,MotionEvent p1){
       boolean b;
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, b.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       b te = this.e;
       b = (te != null && !te.isEnabled())? true: false;
       return b;
    }
    public boolean f(View p0,MotionEvent p1){
       return false;
    }
}
