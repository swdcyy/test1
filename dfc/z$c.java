package dfc.z$c;
import qvb.q;
import dfc.z;
import java.lang.Object;
import java.lang.Throwable;
import qvb.p;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.yxcorp.gifshow.entity.QPhoto;
import sy6.a;

public class z$c implements q	// class@0021c0
{
    public final z b;

    public void z$c(z p0){
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
       if (PatchProxy.isSupport(z$c.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, z$c.class, "1")) {
          return;
       }
       if (p0) {
          z$c tb = this.b;
          tb.u = tb.r.getCurrentPhoto();
       }
       return;
    }
}
