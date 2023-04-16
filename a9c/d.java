package a9c.d;
import u2.f;
import a9c.b;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import java.lang.Object;
import java.util.List;
import java.util.Collections;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import a9c.d$a;
import java.lang.Runnable;
import java.util.concurrent.Executor;

public class d	// class@0000b4
{
    public final f a;
    public final b b;
    public final RecyclerView$Adapter c;
    public boolean d;
    public List e;
    public boolean f;
    public List g;
    public int h;

    public void d(f p0,b p1,RecyclerView$Adapter p2){
       super();
       this.g = Collections.emptyList();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public List a(){
       return this.g;
    }
    public void b(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "2")) {
          return;
       }
       this.e = p0;
       this.g = Collections.unmodifiableList(p0);
       this.c.k0();
       this.h = this.h + 1;
       return;
    }
    public void c(List p0){
       List list;
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
          return;
       }
       d te = this.e;
       if (p0 == te) {
          return;
       }
       int i = 1;
       int i1 = this.h + i;
       this.h = i1;
       int i2 = 0;
       if (p0 == null && this.f == null) {
          this.a.a(i2, te.size());
          this.e = null;
          this.g = Collections.emptyList();
          return;
       }else if(te == null && this.f == null){
          this.a.c(i2, p0.size());
          this.e = p0;
          this.g = Collections.unmodifiableList(p0);
          return;
       }else {
          this.d = i;
          te = this.e;
          if (te == null) {
             list = Collections.emptyList();
          }
          if (p0 == null) {
             p0 = Collections.emptyList();
          }
          this.b.b.execute(new d$a(this, list, p0, i1));
          return;
       }
    }
}
