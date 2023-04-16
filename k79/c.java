package k79.c;
import java.lang.Runnable;
import com.yxcorp.gifshow.models.QMedia;
import com.yxcorp.gifshow.album.repo.AssetsLoaderImpl;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Set;
import java.util.Iterator;
import java.lang.Iterable;
import k79.f$a;
import r79.c;

public final class c implements Runnable	// class@002b49
{
    public final QMedia b;
    public final AssetsLoaderImpl c;

    public void c(QMedia p0,AssetsLoaderImpl p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoidWithListener(null, this, c.class, "1")) {
          return;
       }
       Iterator iterator = this.c.n().iterator();
       while (iterator.hasNext()) {
          iterator.next().c(this.b);
       }
       PatchProxy.onMethodExit(c.class, "1");
       return;
    }
}
