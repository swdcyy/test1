package androidx.appcompat.view.menu.b$b;
import android.view.View$OnAttachStateChangeListener;
import androidx.appcompat.view.menu.b;
import java.lang.Object;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;

public class b$b implements View$OnAttachStateChangeListener	// class@0005a2
{
    public final b b;

    public void b$b(b p0){
       this.b = p0;
       super();
    }
    public void onViewAttachedToWindow(View p0){
    }
    public void onViewDetachedFromWindow(View p0){
       b z = this.b.z;
       if (z != null) {
          if (!z.isAlive()) {
             this.b.z = p0.getViewTreeObserver();
          }
          b$b tb = this.b;
          tb.z.removeGlobalOnLayoutListener(tb.k);
       }
       p0.removeOnAttachStateChangeListener(this);
       return;
    }
}
