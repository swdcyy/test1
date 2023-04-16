package p80.g;
import java.lang.Runnable;
import com.kuaishou.gifshow.kswebview.KsWebViewInitModule;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public final class g implements Runnable	// class@0028cf
{
    public final KsWebViewInitModule b;
    public final String c;

    public void g(KsWebViewInitModule p0,String p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, g.class, "1")) {
          return;
       }
       this.b.n0(this.c);
       return;
    }
}
