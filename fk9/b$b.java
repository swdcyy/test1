package fk9.b$b;
import qvb.q;
import fk9.b;
import java.lang.Object;
import java.lang.Throwable;
import qvb.p;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import y8c.g;
import qvb.i;
import y8c.q;
import java.util.List;

public class b$b implements q	// class@002324
{
    public final b b;

    public void b$b(b p0){
       this.b = p0;
       super();
    }
    public void M1(boolean p0,Throwable p1){
       p.a(this, p0, p1);
    }
    public void Z1(boolean p0,boolean p1){
       p.d(this, p0, p1);
    }
    public boolean rg(){
       return p.e(this);
    }
    public void t5(boolean p0){
       b$b uob = b$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "1")) {
          return;
       }
       if (p0) {
          p0.I = true;
       }
       b$b tb = this.b;
       tb.W0(tb.k.q().getItems());
       return;
    }
    public void v2(boolean p0,boolean p1){
       if (PatchProxy.isSupport(b$b.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, b$b.class, "2")) {
          return;
       }
       b$b tb = this.b;
       tb.W0(tb.k.q().getItems());
       return;
    }
}
