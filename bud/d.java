package bud.d;
import bud.e;
import android.app.Activity;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import java.lang.Object;
import java.lang.ref.WeakReference;
import android.view.View;
import bud.b;
import android.view.ViewTreeObserver;

public class d implements e	// class@0002fb
{
    public WeakReference a;
    public WeakReference b;

    public void d(Activity p0,ViewTreeObserver$OnGlobalLayoutListener p1){
       super();
       this.a = new WeakReference(p0);
       this.b = new WeakReference(p1);
    }
    public void a(){
       Activity uActivity = this.a.get();
       ViewTreeObserver$OnGlobalLayoutListener onGlobalLayo = this.b.get();
       if (uActivity != null && onGlobalLayo != null) {
          b.a(uActivity).getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayo);
       }
       this.a.clear();
       this.b.clear();
       return;
    }
}
