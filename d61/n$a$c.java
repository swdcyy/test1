package d61.n$a$c;
import d61.n$a$b;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.System;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public final class n$a$c extends n$a$b	// class@001f36
{
    public final int e;
    public final int f;
    public final String g;

    public void n$a$c(int p0,int p1,String p2,String p3){
       this.e = p0;
       this.f = p1;
       this.g = p2;
       super(p3);
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, n$a$c.class, "3")) {
          return;
       }
       this.f((this.d() + 1));
       if (this.d() == 1) {
          this.g(System.currentTimeMillis());
       }
       this.i();
       this.h();
       return;
    }
    public boolean c(){
       Object obj = PatchProxy.apply(null, this, n$a$c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.i();
       boolean b = (this.d() < this.f && (!this.e() || (System.currentTimeMillis() - this.e()) - (long)((((this.e * 24) * 60) * 60) * 1000) < 0))? true: false;
       return b;
    }
    public final void i(){
       if (PatchProxy.applyVoid(null, this, n$a$c.class, "1")) {
          return;
       }
       if (this.e() && (System.currentTimeMillis() - this.e()) - (long)((((this.e * 24) * 60) * 60) * 1000) >= 0) {
          this.f(0);
          this.g(0);
          this.h();
       }
       return;
    }
}
