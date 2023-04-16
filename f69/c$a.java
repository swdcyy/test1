package f69.c$a;
import qvb.q;
import f69.c;
import java.lang.Object;
import java.lang.Throwable;
import qvb.p;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;

public class c$a implements q	// class@0022b1
{
    public final c b;

    public void c$a(c p0){
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
       if (PatchProxy.isSupport(c$a.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, c$a.class, "1")) {
          return;
       }
       if (!p0) {
          return;
       }
       this.b.P8();
       return;
    }
}
