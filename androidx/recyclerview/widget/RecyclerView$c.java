package androidx.recyclerview.widget.RecyclerView$c;
import android.view.animation.Interpolator;
import java.lang.Object;

public class RecyclerView$c implements Interpolator	// class@00088a
{

    public void RecyclerView$c(){
       super();
    }
    public float getInterpolation(float p0){
       p0 = p0 - 0x3f800000;
       return (((((p0 * p0) * p0) * p0) * p0) + 0x3f800000);
    }
}
