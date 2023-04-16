package androidx.recyclerview.widget.m$f;
import android.view.GestureDetector$SimpleOnGestureListener;
import androidx.recyclerview.widget.m;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m$e;

public class m$f extends GestureDetector$SimpleOnGestureListener	// class@000925
{
    public boolean b;
    public final m c;

    public void m$f(m p0){
       this.c = p0;
       super();
       this.b = true;
    }
    public void a(){
       this.b = false;
    }
    public boolean onDown(MotionEvent p0){
       return true;
    }
    public void onLongPress(MotionEvent p0){
       if (this.b == null) {
          return;
       }
       View view = this.c.m(p0);
       if (view != null) {
          RecyclerView$ViewHolder childViewHol = this.c.s.getChildViewHolder(view);
          if (childViewHol != null) {
             m$f tc = this.c;
             if (!tc.n.n(tc.s, childViewHol)) {
                return;
             }else {
                m m = this.c.m;
                if (p0.getPointerId(0) == m) {
                   int i = p0.findPointerIndex(m);
                   float x = p0.getX(i);
                   float y = p0.getY(i);
                   tc = this.c;
                   tc.e = x;
                   tc.f = y;
                   tc.j = 0;
                   tc.i = 0;
                   if (tc.n.q()) {
                      this.c.y(childViewHol, 2);
                   }
                }
             }
          }
       }
       return;
    }
}
