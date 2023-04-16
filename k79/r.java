package k79.r;
import java.lang.Runnable;
import com.yxcorp.gifshow.models.QMedia;
import com.yxcorp.gifshow.album.repo.VideoLoaderImpl;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import java.lang.Iterable;
import k79.f$a;
import r79.c;

public final class r implements Runnable	// class@002b60
{
    public final QMedia b;
    public final VideoLoaderImpl c;

    public void r(QMedia p0,VideoLoaderImpl p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoidWithListener(null, this, r.class, "1")) {
          return;
       }
       Iterator iterator = this.c.c.iterator();
       while (iterator.hasNext()) {
          iterator.next().c(this.b);
       }
       PatchProxy.onMethodExit(r.class, "1");
       return;
    }
}
