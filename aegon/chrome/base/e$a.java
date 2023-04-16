package aegon.chrome.base.e$a;
import aegon.chrome.base.e$b;
import aegon.chrome.base.e;
import java.lang.Object;
import java.util.List;
import java.util.Objects;
import java.util.NoSuchElementException;
import java.lang.UnsupportedOperationException;

public class e$a implements e$b	// class@000063
{
    public int b;
    public int c;
    public boolean d;
    public final e e;

    public void e$a(e p0){
       this.e = p0;
       super();
       p0.n();
       this.b = p0.d();
    }
    public final void a(){
       if (this.d == null) {
          this.d = true;
          e$a te = this.e;
          int i = te.d - 1;
          te.d = i;
          if (i <= 0 && te.f != null) {
             te.f = false;
             i = te.b.size();
             i = i - 1;
             while (i >= 0) {
                if (te.b.get(i) == null) {
                   te.b.remove(i);
                }
             }
          }
       }
       return;
    }
    public boolean hasNext(){
       e$a te = this.e;
       if (te.g != null) {
          Objects.requireNonNull(te.c);
       }
       te = this.c;
       while (te < this.b && this.e.m(te) == null) {
          int i = te + 1;
       }
       if (te < this.b) {
          return true;
       }else {
          this.a();
          return false;
       }
    }
    public void l(){
       e$a te = this.e;
       if (te.g != null) {
          Objects.requireNonNull(te.c);
       }
       this.a();
       this.e.n();
       this.b = this.e.d();
       this.d = false;
       this.c = 0;
       return;
    }
    public Object next(){
       e$a te = this.e;
       if (te.g != null) {
          Objects.requireNonNull(te.c);
       }
       te = this.c;
       while (te < this.b && this.e.m(te) == null) {
          int i = this.c + 1;
          this.c = i;
       }
       te = this.c;
       if (te < this.b) {
          this.c = te + 1;
          return this.e.m(te);
       }else {
          this.a();
          throw new NoSuchElementException();
       }
    }
    public void remove(){
       throw new UnsupportedOperationException();
    }
}
