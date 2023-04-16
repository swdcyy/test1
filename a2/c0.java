package a2.c0;
import android.view.ViewTreeObserver$OnPreDrawListener;
import android.view.View$OnAttachStateChangeListener;
import android.view.View;
import java.lang.Runnable;
import java.lang.Object;
import android.view.ViewTreeObserver;
import java.lang.String;
import java.util.Objects;

public final class c0 implements ViewTreeObserver$OnPreDrawListener, View$OnAttachStateChangeListener	// class@000050
{
    public final View b;
    public ViewTreeObserver c;
    public final Runnable d;

    public void c0(View p0,Runnable p1){
       super();
       this.b = p0;
       this.c = p0.getViewTreeObserver();
       this.d = p1;
    }
    public static c0 a(View p0,Runnable p1){
       Objects.requireNonNull(p0, "view == null");
       c0 uoc0 = new c0(p0, p1);
       p0.getViewTreeObserver().addOnPreDrawListener(uoc0);
       p0.addOnAttachStateChangeListener(uoc0);
       return uoc0;
    }
    public void b(){
       if (this.c.isAlive()) {
          this.c.removeOnPreDrawListener(this);
       }else {
          this.b.getViewTreeObserver().removeOnPreDrawListener(this);
       }
       this.b.removeOnAttachStateChangeListener(this);
       return;
    }
    public boolean onPreDraw(){
       this.b();
       this.d.run();
       return true;
    }
    public void onViewAttachedToWindow(View p0){
       this.c = p0.getViewTreeObserver();
    }
    public void onViewDetachedFromWindow(View p0){
       this.b();
    }
}
