package bt7.i;
import android.view.View$OnAttachStateChangeListener;
import android.view.View;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewTreeObserver;

public class i implements View$OnAttachStateChangeListener	// class@000472
{
    public final View b;
    public final ViewTreeObserver$OnGlobalLayoutListener c;

    public void i(View p0,ViewTreeObserver$OnGlobalLayoutListener p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void onViewAttachedToWindow(View p0){
    }
    public void onViewDetachedFromWindow(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "1")) {
          return;
       }
       this.b.setVisibility(0);
       this.b.getViewTreeObserver().removeOnGlobalLayoutListener(this.c);
       return;
    }
}
