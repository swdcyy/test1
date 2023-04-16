package ekd.z;
import android.graphics.drawable.Drawable$Callback;
import java.lang.Object;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;
import android.view.View;
import android.widget.TextView;
import java.lang.CharSequence;
import java.lang.Runnable;

public class z implements Drawable$Callback	// class@000d89
{
    public WeakReference b;

    public void z(){
       super();
    }
    public void invalidateDrawable(Drawable p0){
       z tb = this.b;
       View view = (tb != null)? tb.get(): null;
       if (view != null) {
          if (view instanceof TextView) {
             View view1 = view;
             view1.setText("");
             view1.setText(view1.getText());
          }
          view.postInvalidate();
       }
       return;
    }
    public void scheduleDrawable(Drawable p0,Runnable p1,long p2){
    }
    public void unscheduleDrawable(Drawable p0,Runnable p1){
    }
}
