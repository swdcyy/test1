package androidx.customview.widget.ViewDragHelper$a;
import android.view.animation.Interpolator;
import java.lang.Object;

public final class ViewDragHelper$a implements Interpolator	// class@000735
{

    public void ViewDragHelper$a(){
       super();
    }
    public float getInterpolation(float p0){
       p0 = p0 - 0x3f800000;
       return (((((p0 * p0) * p0) * p0) * p0) + 0x3f800000);
    }
}
