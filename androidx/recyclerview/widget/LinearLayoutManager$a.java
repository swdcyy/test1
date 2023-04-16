package androidx.recyclerview.widget.LinearLayoutManager$a;
import java.lang.Object;
import androidx.recyclerview.widget.s;
import android.view.View;
import java.lang.Math;
import androidx.recyclerview.widget.RecyclerView$y;
import android.view.ViewGroup$LayoutParams;
import androidx.recyclerview.widget.RecyclerView$LayoutParams;
import java.lang.String;
import java.lang.StringBuilder;

public class LinearLayoutManager$a	// class@000876
{
    public s a;
    public int b;
    public int c;
    public boolean d;
    public boolean e;

    public void LinearLayoutManager$a(){
       super();
       this.e();
    }
    public void a(){
       int i = (this.d != null)? this.a.i(): this.a.n();
       this.c = i;
       return;
    }
    public void b(View p0,int p1){
       this.c = (this.d != null)? this.a.d(p0) + this.a.p(): this.a.g(p0);
       this.b = p1;
       return;
    }
    public void c(View p0,int p1){
       int i1;
       int i = this.a.p();
       if (i >= 0) {
          this.b(p0, p1);
          return;
       }else {
          this.b = p1;
          if (this.d != null) {
             p1 = (this.a.i() - i) - this.a.d(p0);
             this.c = this.a.i() - p1;
             if (p1 > 0) {
                i = this.a.n();
                i1 = (this.c - this.a.e(p0)) - (i + Math.min((this.a.g(p0) - i), 0));
                if (i1 < 0) {
                   this.c = this.c + Math.min(p1, (- i1));
                }
             }
          }else {
             p1 = this.a.g(p0);
             i1 = p1 - this.a.n();
             this.c = p1;
             if (i1 > 0) {
                int i2 = (this.a.i() - Math.min(0, ((this.a.i() - i) - this.a.d(p0)))) - (p1 + this.a.e(p0));
                if (i2 < 0) {
                   this.c = this.c - Math.min(i1, (- i2));
                }
             }
          }
          return;
       }
    }
    public boolean d(View p0,RecyclerView$y p1){
       RecyclerView$LayoutParams layoutParams = p0.getLayoutParams();
       boolean b = (!layoutParams.isItemRemoved() && (layoutParams.getViewLayoutPosition() >= 0 && layoutParams.getViewLayoutPosition() < p1.c()))? true: false;
       return b;
    }
    public void e(){
       this.b = -1;
       this.c = Integer.MIN_VALUE;
       this.d = false;
       this.e = false;
    }
    public String toString(){
       return "AnchorInfo{mPosition="+this.b+", mCoordinate="+this.c+", mLayoutFromEnd="+this.d+", mValid="+this.e+'}';
    }
}
