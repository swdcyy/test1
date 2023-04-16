package ac.a;
import android.graphics.drawable.Animatable;
import java.lang.String;
import ac.b;
import android.view.MotionEvent;

public interface abstract a	// class@000119
{

    boolean a(a p0);
    Animatable getAnimatable();
    String getContentDescription();
    b getHierarchy();
    void onAttach();
    void onDetach();
    boolean onTouchEvent(MotionEvent p0);
    void onViewportVisibilityHint(boolean p0);
    void setContentDescription(String p0);
    void setHierarchy(b p0);
}
