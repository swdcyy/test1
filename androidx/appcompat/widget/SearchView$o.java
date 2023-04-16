package androidx.appcompat.widget.SearchView$o;
import android.view.TouchDelegate;
import android.graphics.Rect;
import android.view.View;
import android.content.Context;
import android.view.ViewConfiguration;
import android.view.MotionEvent;

public class SearchView$o extends TouchDelegate	// class@000627
{
    public final View a;
    public final Rect b;
    public final Rect c;
    public final Rect d;
    public final int e;
    public boolean f;

    public void SearchView$o(Rect p0,Rect p1,View p2){
       super(p0, p2);
       this.e = ViewConfiguration.get(p2.getContext()).getScaledTouchSlop();
       this.b = new Rect();
       this.d = new Rect();
       this.c = new Rect();
       this.a(p0, p1);
       this.a = p2;
    }
    public void a(Rect p0,Rect p1){
       this.b.set(p0);
       this.d.set(p0);
       SearchView$o te = this.e;
       int i = - te;
       this.d.inset(i, (- te));
       this.c.set(p1);
    }
    public boolean onTouchEvent(MotionEvent p0){
       SearchView$o oo;
       int i = (int)p0.getX();
       int i1 = (int)p0.getY();
       int action = p0.getAction();
       int i2 = 2;
       boolean b = true;
       boolean b1 = false;
       if (action) {
          if (action != b && action != i2) {
             if (action != 3) {
             label_003d :
                oo = 1;
                b = null;
             }else {
                oo = this.f;
                this.f = b1;
             }
          }else {
             oo = this.f;
             if (oo != null && !this.d.contains(i, i1)) {
                b = oo;
                oo = null;
             }
          }
          b = oo;
       label_0030 :
          oo = 1;
       }else if(this.b.contains(i, i1)){
          this.f = b;
          goto label_0030 ;
       }else {
          goto label_003d ;
       }
       if (b != null) {
          if (oo && !this.c.contains(i, i1)) {
             p0.setLocation((float)(this.a.getWidth() / i2), (float)(this.a.getHeight() / i2));
          }else {
             oo = this.c;
             p0.setLocation((float)(i - oo.left), (float)(i1 - oo.top));
          }
          b1 = this.a.dispatchTouchEvent(p0);
       }
       return b1;
    }
}
