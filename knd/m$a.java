package knd.m$a;
import knd.j$a;
import knd.m;
import brd.v;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Throwable;
import brd.g;

public final class m$a implements j$a	// class@0017f0
{
    public final m a;
    public final v b;

    public void m$a(m p0,v p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, m$a.class, "2")) {
          return;
       }
       this.b.onError(new Throwable("onTTSTimeout"));
       this.a.c();
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, m$a.class, "1")) {
          return;
       }
       this.b.onError(new Throwable("onTTSFailed"));
       this.a.c();
       return;
    }
    public void c(){
       PatchProxy.applyVoid(null, this, m$a.class, "3");
    }
}
