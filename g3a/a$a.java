package g3a.a$a;
import qvb.q;
import g3a.a;
import java.lang.Object;
import java.lang.Throwable;
import qvb.p;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import qvb.i;
import wvb.e;
import java.util.Collection;

public class a$a implements q	// class@0023a2
{
    public final a b;

    public void a$a(a p0){
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
       p.c(this, p0);
    }
    public void v2(boolean p0,boolean p1){
       if (PatchProxy.isSupport(a$a.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, a$a.class, "1")) {
          return;
       }
       this.b.f.clear();
       a$a tb = this.b;
       tb.f.addAll(tb.m().getItems());
       this.b.n();
       this.b.p();
       return;
    }
}
