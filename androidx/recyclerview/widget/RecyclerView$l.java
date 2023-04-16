package androidx.recyclerview.widget.RecyclerView$l;
import java.lang.Object;
import java.util.ArrayList;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import androidx.recyclerview.widget.RecyclerView$l$c;
import java.util.List;
import androidx.recyclerview.widget.RecyclerView$l$b;
import androidx.recyclerview.widget.RecyclerView$l$a;
import androidx.recyclerview.widget.RecyclerView$y;

public abstract class RecyclerView$l	// class@000896
{
    public RecyclerView$l$b a;
    public ArrayList b;
    public long c;
    public long d;
    public long e;
    public long f;

    public void RecyclerView$l(){
       super();
       this.a = null;
       this.b = new ArrayList();
       this.c = 120;
       this.d = 120;
       this.e = 250;
       this.f = 250;
    }
    public static int e(RecyclerView$ViewHolder p0){
       int i = p0.mFlags & 0x0e;
       if (p0.isInvalid()) {
          return 4;
       }
       if (!(i & 0x04)) {
          int oldPosition = p0.getOldPosition();
          int absoluteAdap = p0.getAbsoluteAdapterPosition();
          if (oldPosition != -1 && (absoluteAdap != -1 && oldPosition != absoluteAdap)) {
             i = i | 0x0800;
          }
       }
       return i;
    }
    public void A(long p0){
       this.d = p0;
    }
    public abstract boolean a(RecyclerView$ViewHolder p0,RecyclerView$l$c p1,RecyclerView$l$c p2);
    public abstract boolean b(RecyclerView$ViewHolder p0,RecyclerView$ViewHolder p1,RecyclerView$l$c p2,RecyclerView$l$c p3);
    public abstract boolean c(RecyclerView$ViewHolder p0,RecyclerView$l$c p1,RecyclerView$l$c p2);
    public abstract boolean d(RecyclerView$ViewHolder p0,RecyclerView$l$c p1,RecyclerView$l$c p2);
    public boolean f(RecyclerView$ViewHolder p0){
       return true;
    }
    public boolean g(RecyclerView$ViewHolder p0,List p1){
       return this.f(p0);
    }
    public final void h(RecyclerView$ViewHolder p0){
       this.s(p0);
       RecyclerView$l ta = this.a;
       if (ta != null) {
          ta.a(p0);
       }
       return;
    }
    public final void i(){
       int i = this.b.size();
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          this.b.get(i1).a();
       }
       this.b.clear();
       return;
    }
    public abstract void j(RecyclerView$ViewHolder p0);
    public abstract void k();
    public long l(){
       return this.c;
    }
    public long m(){
       return this.f;
    }
    public long n(){
       return this.e;
    }
    public long o(){
       return this.d;
    }
    public abstract boolean p();
    public final boolean q(RecyclerView$l$a p0){
       boolean b = this.p();
       if (p0 != null) {
          if (!b) {
             p0.a();
          }else {
             this.b.add(p0);
          }
       }
       return b;
    }
    public RecyclerView$l$c r(){
       return new RecyclerView$l$c();
    }
    public void s(RecyclerView$ViewHolder p0){
    }
    public RecyclerView$l$c t(RecyclerView$y p0,RecyclerView$ViewHolder p1){
       RecyclerView$l$c ol$c = this.r();
       ol$c.a(p1);
       return ol$c;
    }
    public RecyclerView$l$c u(RecyclerView$y p0,RecyclerView$ViewHolder p1,int p2,List p3){
       RecyclerView$l$c ol$c = this.r();
       ol$c.a(p1);
       return ol$c;
    }
    public abstract void v();
    public void w(long p0){
       this.c = p0;
    }
    public void x(long p0){
       this.f = p0;
    }
    public void y(RecyclerView$l$b p0){
       this.a = p0;
    }
    public void z(long p0){
       this.e = p0;
    }
}
