package androidx.recyclerview.widget.RecyclerView$s;
import java.lang.Object;
import android.util.SparseArray;
import androidx.recyclerview.widget.RecyclerView$s$a;
import java.util.ArrayList;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import androidx.recyclerview.widget.RecyclerView$Adapter;

public class RecyclerView$s	// class@00089e
{
    public SparseArray a;
    public int b;

    public void RecyclerView$s(){
       super();
       this.a = new SparseArray();
       this.b = 0;
    }
    public void a(){
       this.b = this.b + 1;
    }
    public void b(){
       for (int i = 0; i < this.a.size(); i = i + 1) {
          this.a.valueAt(i).a.clear();
       }
       return;
    }
    public void c(){
       this.b = this.b - 1;
    }
    public void d(int p0,long p1){
       RecyclerView$s$a os$a = this.g(p0);
       os$a.d = this.j(os$a.d, p1);
    }
    public void e(int p0,long p1){
       RecyclerView$s$a os$a = this.g(p0);
       os$a.c = this.j(os$a.c, p1);
    }
    public RecyclerView$ViewHolder f(int p0){
       RecyclerView$s$a os$a = this.a.get(p0);
       if (os$a != null && !os$a.a.isEmpty()) {
          os$a = os$a.a;
          int i = os$a.size() - 1;
          while (i >= 0) {
             if (!os$a.get(i).isAttachedToTransitionOverlay()) {
                return os$a.remove(i);
             }
             i = i - 1;
          }
       }
       return null;
    }
    public final RecyclerView$s$a g(int p0){
       RecyclerView$s$a os$a = this.a.get(p0);
       if (os$a == null) {
          os$a = new RecyclerView$s$a();
          this.a.put(p0, os$a);
       }
       return os$a;
    }
    public void h(RecyclerView$Adapter p0,RecyclerView$Adapter p1,boolean p2){
       if (p0 != null) {
          this.c();
       }
       if (!p2 && this.b == null) {
          this.b();
       }
       if (p1 != null) {
          this.a();
       }
       return;
    }
    public void i(RecyclerView$ViewHolder p0){
       int itemViewType = p0.getItemViewType();
       RecyclerView$s$a a = this.g(itemViewType).a;
       if (this.a.get(itemViewType).b <= a.size()) {
          return;
       }
       p0.resetInternal();
       a.add(p0);
       return;
    }
    public long j(long p0,long p1){
       if (!p0) {
          return p1;
       }
       return (((p0 / 4) * 3) + (p1 / 4));
    }
    public void k(int p0,int p1){
       RecyclerView$s$a os$a = this.g(p0);
       os$a.b = p1;
       os$a = os$a.a;
       while (os$a.size() > p1) {
          int i = os$a.size() - 1;
          os$a.remove(i);
       }
       return;
    }
    public boolean l(int p0,long p1,long p2){
       RecyclerView$s$a d = this.g(p0).d;
       boolean b = (!d || (p1 + d) - p2 < 0)? true: false;
       return b;
    }
    public boolean m(int p0,long p1,long p2){
       RecyclerView$s$a c = this.g(p0).c;
       boolean b = (!c || (p1 + c) - p2 < 0)? true: false;
       return b;
    }
}
