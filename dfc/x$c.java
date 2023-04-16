package dfc.x$c;
import qvb.q;
import dfc.x;
import java.lang.Object;
import java.lang.Throwable;
import qvb.p;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import sy6.a;
import java.lang.Runnable;
import ekd.k1;

public class x$c implements q	// class@0021bb
{
    public final x b;

    public void x$c(x p0){
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
       x$c uoc = x$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uoc, "1")) {
          return;
       }
       if (p0) {
          x$c tb = this.b;
          tb.p.b(tb.r);
          k1.r(this.b.s, 1500);
       }
       return;
    }
}
