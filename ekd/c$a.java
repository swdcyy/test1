package ekd.c$a;
import android.view.View$OnAttachStateChangeListener;
import android.view.View;
import java.lang.Object;
import ekd.c;

public class c$a implements View$OnAttachStateChangeListener	// class@000d2b
{
    public final View b;

    public void c$a(View p0){
       this.b = p0;
       super();
    }
    public void onViewAttachedToWindow(View p0){
       c.d(this.b);
    }
    public void onViewDetachedFromWindow(View p0){
       this.b.removeOnAttachStateChangeListener(this);
    }
}
