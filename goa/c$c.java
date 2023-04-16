package goa.c$c;
import zn.a;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import goa.c;

public final class c$c implements a	// class@002b39
{

    public void c$c(){
       super();
    }
    public void a(int p0,Throwable p1){
       if (PatchProxy.isSupport(c$c.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, c$c.class, "1")) {
          return;
       }
       c.d(c.f, false);
       return;
    }
    public void onSuccess(){
       PatchProxy.applyVoid(null, this, c$c.class, "2");
    }
}
