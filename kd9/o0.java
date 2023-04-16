package kd9.o0;
import java.lang.Runnable;
import android.widget.ImageView;
import android.view.View;
import java.lang.Object;
import android.view.ViewGroup$LayoutParams;
import com.yxcorp.utility.n;

public final class o0 implements Runnable	// class@002c61
{
    public final ImageView b;
    public final View c;
    public final View d;

    public void o0(ImageView p0,View p1,View p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void run(){
       o0 tb = this.b;
       o0 tc = this.c;
       ViewGroup$LayoutParams layoutParams = tb.getLayoutParams();
       layoutParams.height = tc.getHeight();
       layoutParams.width = tc.getWidth();
       tb.setLayoutParams(layoutParams);
       int[] ointArray = n.p(tc);
       tb.setTranslationX((float)ointArray[0]);
       tb.setTranslationY((float)(ointArray[1] - n.p(this.d)[1]));
    }
}
