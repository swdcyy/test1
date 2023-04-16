package androidx.recyclerview.widget.s;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import java.lang.Object;
import android.graphics.Rect;
import androidx.recyclerview.widget.s$a;
import java.lang.IllegalArgumentException;
import java.lang.String;
import androidx.recyclerview.widget.s$b;
import android.view.View;

public abstract class s	// class@000934
{
    public final RecyclerView$LayoutManager a;
    public int b;
    public final Rect c;

    public void s(RecyclerView$LayoutManager p0){
       super();
       this.b = Integer.MIN_VALUE;
       this.c = new Rect();
       this.a = p0;
    }
    public void s(RecyclerView$LayoutManager p0,s$a p1){
       super(p0);
    }
    public static s a(RecyclerView$LayoutManager p0){
       return new s$a(p0);
    }
    public static s b(RecyclerView$LayoutManager p0,int p1){
       if (!p1) {
          return s.a(p0);
       }
       if (p1 == 1) {
          return s.c(p0);
       }
       throw new IllegalArgumentException("invalid orientation");
    }
    public static s c(RecyclerView$LayoutManager p0){
       return new s$b(p0);
    }
    public abstract int d(View p0);
    public abstract int e(View p0);
    public abstract int f(View p0);
    public abstract int g(View p0);
    public abstract int h();
    public abstract int i();
    public abstract int j();
    public RecyclerView$LayoutManager k(){
       return this.a;
    }
    public abstract int l();
    public abstract int m();
    public abstract int n();
    public abstract int o();
    public int p(){
       int i = (Integer.MIN_VALUE == this.b)? 0: this.o() - this.b;
       return i;
    }
    public abstract int q(View p0);
    public abstract int r(View p0);
    public abstract void s(View p0,int p1);
    public abstract void t(int p0);
    public void u(){
       this.b = this.o();
    }
}
