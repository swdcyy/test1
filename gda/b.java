package gda.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import wkd.b;
import com.yxcorp.gifshow.log.h;
import k2b.k2;
import f3b.o;
import com.yxcorp.gifshow.action.c;
import java.lang.System;

public class b	// class@002ab6
{
    public String a;
    public String b;
    public long c;

    public void b(){
       super();
       k2 ok2 = PatchProxy.apply(null, this, b.class, "1");
       if (ok2 != PatchProxyResult.class) {
       }else {
          ok2 = b.a(0x4b316083).f();
          ok2 = (ok2 != null)? ok2.d: o.i(0);
       }
       this.a = ok2;
       this.b = c.i(2);
       this.c = System.currentTimeMillis();
       return;
    }
    public void b(String p0){
       super();
       this.a = p0;
       this.b = c.i(2);
       this.c = System.currentTimeMillis();
    }
}
