package nl0.c$d;
import nl0.c$c;
import nl0.c;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.HashMap;

public final class c$d implements c$c	// class@00335a
{
    public final c a;
    public final BaseFeed b;

    public void c$d(c p0,BaseFeed p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, c$d.class, "1")) {
          return;
       }
       this.a.a.remove(this.b);
       return;
    }
}
