package br8.d$b;
import android.view.GestureDetector$SimpleOnGestureListener;
import br8.d;
import android.view.MotionEvent;
import br8.c;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import br8.b;
import br8.d$a;
import android.view.ViewGroup;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.Class;

public class d$b extends GestureDetector$SimpleOnGestureListener	// class@000449
{
    public final d b;

    public void d$b(d p0){
       this.b = p0;
       super();
    }
    public boolean onDoubleTap(MotionEvent p0){
       return true;
    }
    public boolean onSingleTapUp(MotionEvent p0){
       int i = this.b.d.f((int)p0.getX(), (int)p0.getY());
       int i1 = 0;
       if (i == -1) {
          return i1;
       }
       d$b tb = this.b;
       View view = tb.d.g(tb.c, i);
       d$b tb1 = this.b;
       if (!tb1.c.getAdapter() instanceof b) {
          throw new IllegalStateException("A RecyclerView with "+d.class.getSimpleName()+" requires a "+b.class.getSimpleName());
       }
       this.b.e.a(view, i, tb1.c.getAdapter().E(i));
       this.b.c.playSoundEffect(i1);
       view.onTouchEvent(p0);
       return true;
    }
}
