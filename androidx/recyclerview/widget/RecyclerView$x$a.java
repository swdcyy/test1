package androidx.recyclerview.widget.RecyclerView$x$a;
import android.view.animation.Interpolator;
import java.lang.Object;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$ViewFlinger;
import java.lang.IllegalStateException;
import java.lang.String;

public class RecyclerView$x$a	// class@0008a3
{
    public int a;
    public int b;
    public int c;
    public int d;
    public Interpolator e;
    public boolean f;
    public int g;

    public void RecyclerView$x$a(int p0,int p1){
       super(p0, p1, Integer.MIN_VALUE, null);
    }
    public void RecyclerView$x$a(int p0,int p1,int p2,Interpolator p3){
       super();
       this.d = -1;
       this.f = false;
       this.g = 0;
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.e = null;
    }
    public int a(){
       return this.c;
    }
    public boolean b(){
       boolean b = (this.d >= null)? true: false;
       return b;
    }
    public void c(int p0){
       this.d = p0;
    }
    public void d(RecyclerView p0){
       RecyclerView$x$a td = this.d;
       if (td >= null) {
          this.d = -1;
          p0.jumpToPositionForSmoothScroller(td);
          this.f = false;
          return;
       }else if(this.f != null){
          this.g();
          p0.mViewFlinger.smoothScrollBy(this.a, this.b, this.c, this.e);
          this.g = this.g + 1;
          this.f = false;
       }else {
          this.g = 0;
       }
       return;
    }
    public void e(int p0){
       this.f = true;
       this.c = p0;
    }
    public void f(int p0,int p1,int p2,Interpolator p3){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.e = p3;
       this.f = true;
    }
    public final void g(){
       String str = 1;
       if (this.e != null && this.c < str) {
          throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
       }
       if (this.c >= str) {
          return;
       }
       throw new IllegalStateException("Scroll duration must be a positive number");
    }
}
