package g12.n;
import c51.b;
import g12.m;
import java.lang.Object;
import c51.a;
import java.lang.Throwable;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;

public class n implements b	// class@002a33
{
    public final m b;

    public void n(m p0){
       this.b = p0;
       super();
    }
    public void S(boolean p0){
       a.e(this, p0);
    }
    public void U(boolean p0){
       a.d(this, p0);
    }
    public void X(boolean p0,Throwable p1){
       a.c(this, p0, p1);
    }
    public void c0(){
       a.a(this);
    }
    public void w(boolean p0,List p1){
       if (PatchProxy.isSupport(n.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, n.class, "1")) {
          return;
       }
       this.b.P8();
       return;
    }
}
