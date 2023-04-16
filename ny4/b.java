package ny4.b;
import android.view.MotionEvent;
import com.kuaishou.tuna.plc.dynamic_container.view.PlcDynamicContainerLayout;
import hy4.a;

public interface abstract b	// class@002c0b
{

    boolean a(MotionEvent p0);
    void b(PlcDynamicContainerLayout p0,a p1);
    void c(boolean p0);
    void d();
    void dispatchTouchEvent(MotionEvent p0);
    boolean onTouchEvent(MotionEvent p0);
}
