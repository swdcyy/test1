package d61.n$a$d;
import d61.n$a$b;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.System;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.text.format.DateUtils;

public final class n$a$d extends n$a$b	// class@001f37
{
    public final int e;
    public final String f;

    public void n$a$d(int p0,String p1,String p2){
       this.e = p0;
       this.f = p1;
       super(p2);
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, n$a$d.class, "2")) {
          return;
       }
       this.i();
       this.f((this.d() + 1));
       this.g(System.currentTimeMillis());
       this.h();
       return;
    }
    public boolean c(){
       Object obj = PatchProxy.apply(null, this, n$a$d.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.i();
       boolean b = (this.d() < this.e)? true: false;
       return b;
    }
    public final void i(){
       if (PatchProxy.applyVoid(null, this, n$a$d.class, "1")) {
          return;
       }
       if (this.e() && !DateUtils.isToday(this.e())) {
          this.f(0);
          this.g(0);
          this.h();
       }
       return;
    }
}
