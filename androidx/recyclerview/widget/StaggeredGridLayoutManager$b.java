package androidx.recyclerview.widget.StaggeredGridLayoutManager$b;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.lang.Object;
import androidx.recyclerview.widget.s;
import java.util.Arrays;
import androidx.recyclerview.widget.StaggeredGridLayoutManager$c;

public class StaggeredGridLayoutManager$b	// class@0008d7
{
    public int a;
    public int b;
    public boolean c;
    public boolean d;
    public boolean e;
    public int[] f;
    public final StaggeredGridLayoutManager g;

    public void StaggeredGridLayoutManager$b(StaggeredGridLayoutManager p0){
       this.g = p0;
       super();
       this.c();
    }
    public void a(){
       int i = (this.c != null)? this.g.mPrimaryOrientation.i(): this.g.mPrimaryOrientation.n();
       this.b = i;
       return;
    }
    public void b(int p0){
       this.b = (this.c != null)? this.g.mPrimaryOrientation.i() - p0: this.g.mPrimaryOrientation.n() + p0;
       return;
    }
    public void c(){
       this.a = -1;
       this.b = Integer.MIN_VALUE;
       this.c = false;
       this.d = false;
       this.e = false;
       StaggeredGridLayoutManager$b tf = this.f;
       if (tf != null) {
          Arrays.fill(tf, -1);
       }
       return;
    }
    public void d(StaggeredGridLayoutManager$c[] p0){
       int len = p0.length;
       StaggeredGridLayoutManager$b tf = this.f;
       if (tf == null || tf.length < len) {
          int[] ointArray = new int[this.g.mSpans.length];
          this.f = ointArray;
       }
       for (int i = 0; i < len; i = i + 1) {
          this.f[i] = p0[i].u(Integer.MIN_VALUE);
       }
       return;
    }
}
