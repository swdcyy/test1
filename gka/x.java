package gka.x;
import java.lang.Runnable;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import android.view.View;
import java.lang.Object;
import java.util.Objects;
import android.graphics.Rect;
import android.widget.ImageView;
import android.view.TouchDelegate;

public final class x implements Runnable	// class@002b1d
{
    public final ProgressFragment b;
    public final View c;

    public void x(ProgressFragment p0,View p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       x tb = this.b;
       Objects.requireNonNull(tb);
       Rect rect = new Rect();
       tb.t.getHitRect(rect);
       int v = ProgressFragment.V;
       rect.right = rect.right + v;
       int u = ProgressFragment.U;
       rect.left = rect.left - u;
       rect.top = rect.top - v;
       rect.bottom = rect.bottom + u;
       this.c.setTouchDelegate(new TouchDelegate(rect, tb.t));
    }
}
