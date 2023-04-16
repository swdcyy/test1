package b1c.d;
import java.lang.Runnable;
import com.yxcorp.gifshow.prettify.filter.data.FilterStateManager;
import com.kwai.feature.post.api.componet.prettify.filter.model.FilterConfig;
import com.yxcorp.gifshow.prettify.v4.magic.filter.a0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import b1c.c;

public final class d implements Runnable	// class@00038e
{
    public final FilterStateManager b;
    public final FilterConfig c;
    public final a0 d;
    public final boolean e;

    public void d(FilterStateManager p0,FilterConfig p1,a0 p2,boolean p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       Iterator iterator = this.b.e().iterator();
       while (iterator.hasNext()) {
          iterator.next().a(this.c, this.d, this.e);
       }
       return;
    }
}
