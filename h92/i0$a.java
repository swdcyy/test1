package h92.i0$a;
import h92.i0$d;
import h92.i0;
import java.lang.Object;
import h92.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import java.lang.Boolean;
import java.lang.Integer;
import crd.b;
import lnc.b9;
import java.util.concurrent.TimeUnit;
import t45.d;
import brd.z;
import brd.t;
import h92.h0;
import erd.g;
import java.lang.Long;
import androidx.fragment.app.KwaiDialogFragment;
import z12.x;

public class i0$a implements i0$d	// class@002d0d
{
    public final i0 a;

    public void i0$a(i0 p0){
       this.a = p0;
       super();
    }
    public void a(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i0$a.class, "6")) {
          return;
       }
       this.a.M.add(p0);
       return;
    }
    public void b(boolean p0){
       i0$a uoa = i0$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "1")) {
          return;
       }
       int i = 2;
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Integer.valueOf(i), this, uoa, "2")) {
          this.a.W8(p0, i);
          b9.a(this.a.I);
          p0.I = t.timer(3000, TimeUnit.MILLISECONDS, d.a).subscribe(new h0(this));
       }
       return;
    }
    public void c(boolean p0,int p1){
       i0$a uoa = i0$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Integer.valueOf(p1), this, uoa, "2")) {
          return;
       }
       this.a.W8(p0, p1);
       b9.a(this.a.I);
       p0.I = t.timer(3000, TimeUnit.MILLISECONDS, d.a).subscribe(new h0(this));
       return;
    }
    public void d(long p0){
       i0$a uoa = i0$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uoa, "5")) {
          return;
       }
       this.a.d9(p0);
       return;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, i0$a.class, "3")) {
          return;
       }
       this.a.R8();
       this.a.P8();
       return;
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, i0$a.class, "4")) {
          return;
       }
       x.E(this.a.L);
       return;
    }
}
