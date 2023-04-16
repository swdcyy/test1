package androidx.recyclerview.widget.GridLayoutManager$b;
import java.lang.Object;
import android.util.SparseIntArray;

public abstract class GridLayoutManager$b	// class@000871
{
    public final SparseIntArray a;
    public final SparseIntArray b;
    public boolean c;
    public boolean d;

    public void GridLayoutManager$b(){
       super();
       this.a = new SparseIntArray();
       this.b = new SparseIntArray();
       this.c = false;
       this.d = false;
    }
    public static int a(SparseIntArray p0,int p1){
       int i = p0.size() - 1;
       int i1 = 0;
       while (i1 <= i) {
          int i2 = i1 + i;
          i2 = i2 >> 1;
          if (p0.keyAt(i2) < p1) {
             i2 = i2 + 1;
             i1 = i2;
          }else {
             i2 = i2 - 1;
             i = i2;
          }
       }
       i1 = i1 - 1;
       if (i1 >= 0 && i1 < p0.size()) {
          return p0.keyAt(i1);
       }
       return -1;
    }
    public int b(int p0,int p1){
       if (this.d == null) {
          return this.d(p0, p1);
       }
       int i = this.b.get(p0, -1);
       if (i != -1) {
          return i;
       }
       p1 = this.d(p0, p1);
       this.b.put(p0, p1);
       return p1;
    }
    public int c(int p0,int p1){
       if (this.c == null) {
          return this.e(p0, p1);
       }
       int i = this.a.get(p0, -1);
       if (i != -1) {
          return i;
       }
       p1 = this.e(p0, p1);
       this.a.put(p0, p1);
       return p1;
    }
    public int d(int p0,int p1){
       int i1;
       int i2;
       if (this.d != null) {
          int i = GridLayoutManager$b.a(this.b, p0);
          if (i != -1) {
             i1 = this.b.get(i);
             i2 = i + 1;
             int i3 = this.c(i, p1) + this.f(i);
             if (i3 == p1) {
                i1 = i1 + 1;
             label_0026 :
                i3 = 0;
             label_0027 :
                i = this.f(p0);
                while (i2 < p0) {
                   int i4 = this.f(i2);
                   i3 = i3 + i4;
                   if (i3 == p1) {
                      i1 = i1 + 1;
                      i3 = 0;
                   }else if(i3 > p1){
                      i1 = i1 + 1;
                      i3 = i4;
                   }
                   i2 = i2 + 1;
                }
                if ((i3 + i) > p1) {
                   i1 = i1 + 1;
                }
                return i1;
             }else {
                goto label_0027 ;
             }
          }
       }
       i1 = 0;
       i2 = 0;
       goto label_0026 ;
    }
    public int e(int p0,int p1){
       int i1;
       int i2;
       int i = this.f(p0);
       if (i == p1) {
          return 0;
       }
       if (this.c != null) {
          i1 = GridLayoutManager$b.a(this.a, p0);
          if (i1 >= 0) {
             i2 = this.a.get(i1) + this.f(i1);
          label_0030 :
             i1 = i1 + 1;
          label_0022 :
             if (i1 < p0) {
                int i3 = this.f(i1);
                i2 = i2 + i3;
                if (i2 == p1) {
                   i2 = 0;
                   goto label_0030 ;
                }else if(i2 > p1){
                   i2 = i3;
                   goto label_0030 ;
                }else {
                   goto label_0030 ;
                }
             }else if((i + i2) <= p1){
                return i2;
             }else {
                return 0;
             }
          }
       }
       i1 = 0;
       i2 = 0;
       goto label_0022 ;
    }
    public abstract int f(int p0);
    public void g(){
       this.b.clear();
    }
    public void h(){
       this.a.clear();
    }
}
