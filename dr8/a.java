package dr8.a;
import java.lang.Object;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;

public class a	// class@0020e1
{

    public void a(){
       super();
    }
    public void a(Rect p0,View p1){
       ViewGroup$LayoutParams layoutParams = p1.getLayoutParams();
       if (layoutParams instanceof ViewGroup$MarginLayoutParams) {
          p0.set(layoutParams.leftMargin, layoutParams.topMargin, layoutParams.rightMargin, layoutParams.bottomMargin);
       }else {
          p0.set(0, 0, 0, 0);
       }
       return;
    }
}
