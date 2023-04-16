package androidx.recyclerview.widget.d$a$a;
import androidx.recyclerview.widget.h$b;
import androidx.recyclerview.widget.d$a;
import java.lang.Object;
import java.util.List;
import androidx.recyclerview.widget.d;
import androidx.recyclerview.widget.h$f;
import androidx.recyclerview.widget.c;
import java.lang.AssertionError;
import java.util.Objects;

public class d$a$a extends h$b	// class@0008f4
{
    public final d$a a;

    public void d$a$a(d$a p0){
       this.a = p0;
       super();
    }
    public boolean a(int p0,int p1){
       Object obj = this.a.b.get(p0);
       Object obj1 = this.a.c.get(p1);
       if (obj != null && obj1 != null) {
          return this.a.f.b.b().a(obj, obj1);
       }
       if (obj == null && obj1 == null) {
          return true;
       }
       throw new AssertionError();
    }
    public boolean b(int p0,int p1){
       Object obj = this.a.b.get(p0);
       Object obj1 = this.a.c.get(p1);
       if (obj != null && obj1 != null) {
          return this.a.f.b.b().b(obj, obj1);
       }
       boolean b = (obj == null && obj1 == null)? true: false;
       return b;
    }
    public Object c(int p0,int p1){
       Object obj = this.a.c.get(p1);
       if (this.a.b.get(p0) == null || obj == null) {
          throw new AssertionError();
       }
       Objects.requireNonNull(this.a.f.b.b());
       return null;
    }
    public int d(){
       return this.a.c.size();
    }
    public int e(){
       return this.a.b.size();
    }
}
