package h53.h;
import j77.c;
import h53.c;
import java.lang.String;
import java.lang.ref.WeakReference;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import o63.d;

public class h extends c	// class@002c63
{
    public final WeakReference b;
    public final c c;

    public void h(c p0,String p1,WeakReference p2){
       this.c = p0;
       this.b = p2;
       super(p1);
    }
    public boolean a(long p0){
       h oh = h.class;
       if (PatchProxy.isSupport(oh)) {
          Object obj = PatchProxy.applyOneRefs(Long.valueOf(p0), this, oh, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (p0 > 0) {
          return false;
       }else {
          this.c.S8(this.b.get());
          return true;
       }
    }
}
