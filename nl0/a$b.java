package nl0.a$b;
import erd.g;
import nl0.a;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Object;
import java.lang.Long;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class a$b implements g	// class@003350
{
    public final a b;
    public final BaseFeed c;

    public void a$b(a p0,BaseFeed p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$b.class, "1")) {
       }else {
          this.b.f(this.c);
       }
       return;
    }
}
