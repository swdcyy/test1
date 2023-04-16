package mx0.d;
import kb.b;
import brd.v;
import java.lang.String;
import kb.c;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Throwable;
import java.lang.StringBuilder;
import brd.g;

public class d extends b	// class@003239
{
    public final v a;
    public final String b;

    public void d(v p0,String p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void onFailureImpl(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "2")) {
          return;
       }
       this.a.onError(new Throwable("url:"+this.b+" not available!"));
       return;
    }
    public void onNewResultImpl(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
          return;
       }
       this.a.onNext(this.b);
       this.a.onComplete();
       return;
    }
}
