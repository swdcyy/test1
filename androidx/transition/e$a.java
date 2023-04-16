package androidx.transition.e$a;
import android.view.ViewTreeObserver$OnPreDrawListener;
import android.view.View$OnAttachStateChangeListener;
import androidx.transition.Transition;
import android.view.ViewGroup;
import java.lang.Object;
import android.view.ViewTreeObserver;
import androidx.transition.e;
import java.util.ArrayList;
import androidx.collection.ArrayMap;
import androidx.collection.SimpleArrayMap;
import java.util.Collection;
import androidx.transition.e$a$a;
import androidx.transition.Transition$f;
import java.util.Iterator;
import android.view.View;

public class e$a implements ViewTreeObserver$OnPreDrawListener, View$OnAttachStateChangeListener	// class@0009f5
{
    public Transition b;
    public ViewGroup c;

    public void e$a(Transition p0,ViewGroup p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void a(){
       this.c.getViewTreeObserver().removeOnPreDrawListener(this);
       this.c.removeOnAttachStateChangeListener(this);
    }
    public boolean onPreDraw(){
       this.a();
       if (!e.e.remove(this.c)) {
          return true;
       }
       ArrayMap uArrayMap = e.e();
       ArrayList uArrayList = uArrayMap.get(this.c);
       ArrayList uArrayList1 = null;
       if (uArrayList == null) {
          uArrayList = new ArrayList();
          uArrayMap.put(this.c, uArrayList);
       }else if(uArrayList.size() > 0){
          uArrayList1 = new ArrayList(uArrayList);
       }
       uArrayList.add(this.b);
       this.b.a(new e$a$a(this, uArrayMap));
       this.b.k(this.c, false);
       if (uArrayList1 != null) {
          Iterator iterator = uArrayList1.iterator();
          while (iterator.hasNext()) {
             iterator.next().V(this.c);
          }
       }
       this.b.S(this.c);
       return true;
    }
    public void onViewAttachedToWindow(View p0){
    }
    public void onViewDetachedFromWindow(View p0){
       this.a();
       e.e.remove(this.c);
       ArrayList uArrayList = e.e().get(this.c);
       if (uArrayList != null && uArrayList.size() > 0) {
          Iterator iterator = uArrayList.iterator();
          while (iterator.hasNext()) {
             iterator.next().V(this.c);
          }
       }
       this.b.l(true);
       return;
    }
}
