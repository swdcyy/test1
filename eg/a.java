package eg.a;
import android.widget.FrameLayout$LayoutParams;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;
import android.util.TypedValue;

public abstract class a	// class@001f4b
{

    public static final FrameLayout$LayoutParams a(int p0,int p1){
       return new FrameLayout$LayoutParams(p0, p1);
    }
    public static final FrameLayout$LayoutParams b(){
       return a.a(-1, -2);
    }
    public static final int c(float p0,Resources p1){
       return (int)TypedValue.applyDimension(1, p0, c.c(p1));
    }
}
