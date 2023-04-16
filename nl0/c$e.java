package nl0.c$e;
import nl0.c$c;
import nl0.c;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.HashMap;

public final class c$e implements c$c	// class@00335b
{
    public final c a;
    public final BaseFeed b;

    public void c$e(c p0,BaseFeed p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, c$e.class, "1")) {
          return;
       }
       this.a.a.remove(this.b);
       return;
    }
}
