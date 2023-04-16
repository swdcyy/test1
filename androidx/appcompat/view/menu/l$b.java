package androidx.appcompat.view.menu.l$b;
import android.view.View$OnAttachStateChangeListener;
import androidx.appcompat.view.menu.l;
import java.lang.Object;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;

public class l$b implements View$OnAttachStateChangeListener	// class@0005b8
{
    public final l b;

    public void l$b(l p0){
       this.b = p0;
       super();
    }
    public void onViewAttachedToWindow(View p0){
    }
    public void onViewDetachedFromWindow(View p0){
       l q = this.b.q;
       if (q != null) {
          if (!q.isAlive()) {
             this.b.q = p0.getViewTreeObserver();
          }
          l$b tb = this.b;
          tb.q.removeGlobalOnLayoutListener(tb.k);
       }
       p0.removeOnAttachStateChangeListener(this);
       return;
    }
}
