package e1b.b$a;
import androidx.recyclerview.widget.RecyclerView$r;
import e1b.b;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import y0b.s;
import y0b.n;
import java.util.Objects;
import z0b.b;
import nl8.a;
import z0b.c;
import java.lang.Math;
import g1b.a;

public class b$a extends RecyclerView$r	// class@0025e7
{
    public final b a;

    public void b$a(b p0){
       this.a = p0;
       super();
    }
    public void a(RecyclerView p0,int p1){
       b$a uoa = b$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "1")) {
          return;
       }
       if (p1 == 1) {
          this.c(p0);
       }
       return;
    }
    public void b(RecyclerView p0,int p1,int p2){
       if (PatchProxy.isSupport(b$a.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, b$a.class, "2")) {
          return;
       }
       if (p1 > 0 || p2 > 0) {
          this.c(p0);
       }
       return;
    }
    public void c(RecyclerView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "3")) {
          return;
       }
       s os = this.a.u.G();
       Objects.requireNonNull(this.a.u);
       b$a ta = this.a;
       b w = ta.w;
       if (w != null) {
          w.a(os, ta.P8().C0(), Math.max(1, this.a.Y8()));
       }
       return;
    }
}
