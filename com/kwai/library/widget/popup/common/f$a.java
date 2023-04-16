package com.kwai.library.widget.popup.common.f$a;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.view.View;
import java.lang.Runnable;
import java.lang.Object;
import java.lang.ref.WeakReference;
import android.view.ViewTreeObserver;

public class f$a implements ViewTreeObserver$OnGlobalLayoutListener	// class@000998
{
    public final WeakReference b;
    public final Runnable c;
    public final boolean d;

    public void f$a(View p0,Runnable p1,boolean p2){
       super();
       this.b = new WeakReference(p0);
       this.c = p1;
       this.d = p2;
    }
    public void onGlobalLayout(){
       View view = this.b.get();
       if (view == null) {
          return;
       }
       if (this.d != null && (view.getWidth() <= 0 || view.getHeight() <= 0)) {
          return;
       }
       f$a tc = this.c;
       if (tc != null) {
          tc.run();
       }
       ViewTreeObserver viewTreeObse = view.getViewTreeObserver();
       if (viewTreeObse != null) {
          viewTreeObse.removeOnGlobalLayoutListener(this);
       }
       return;
    }
}
