package a2.i0$f;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.view.View$OnAttachStateChangeListener;
import java.lang.Object;
import java.util.WeakHashMap;
import android.view.View;
import a2.i0;
import java.lang.Boolean;
import android.view.ViewTreeObserver;
import android.os.Build$VERSION;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;

public class i0$f implements ViewTreeObserver$OnGlobalLayoutListener, View$OnAttachStateChangeListener	// class@000065
{
    public WeakHashMap b;

    public void i0$f(){
       super();
       this.b = new WeakHashMap();
    }
    public final void a(View p0,boolean p1){
       boolean b = (!p0.getVisibility())? true: false;
       if (p1 != b) {
          int i = (b)? 16: 32;
          i0.c0(p0, i);
          this.b.put(p0, Boolean.valueOf(b));
       }
       return;
    }
    public final void b(View p0){
       p0.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }
    public void onGlobalLayout(){
       if (Build$VERSION.SDK_INT < 28) {
          Iterator iterator = this.b.entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             View key = uEntry.getKey();
             this.a(key, uEntry.getValue().booleanValue());
          }
       }
       return;
    }
    public void onViewAttachedToWindow(View p0){
       this.b(p0);
    }
    public void onViewDetachedFromWindow(View p0){
    }
}
