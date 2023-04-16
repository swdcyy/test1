package knd.m$d;
import knd.j$a;
import brd.v;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Throwable;
import brd.g;
import java.lang.Boolean;

public final class m$d implements j$a	// class@0017f3
{
    public final v a;

    public void m$d(v p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, m$d.class, "2")) {
          return;
       }
       this.a.onError(new Throwable("onTTSTimeout"));
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, m$d.class, "1")) {
          return;
       }
       this.a.onError(new Throwable("onTTSFailed"));
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, m$d.class, "3")) {
          return;
       }
       this.a.onNext(Boolean.TRUE);
       this.a.onComplete();
       return;
    }
}
