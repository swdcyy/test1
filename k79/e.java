package k79.e;
import java.lang.Runnable;
import com.yxcorp.gifshow.models.QMedia;
import com.yxcorp.gifshow.album.repo.BaseLoaderImpl;
import com.yxcorp.gifshow.album.repo.AlbumAssetCache$AssetModule;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import java.lang.Iterable;
import k79.f$a;
import r79.c;

public final class e implements Runnable	// class@002b4b
{
    public final QMedia b;
    public final BaseLoaderImpl c;
    public final AlbumAssetCache$AssetModule d;

    public void e(QMedia p0,BaseLoaderImpl p1,AlbumAssetCache$AssetModule p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoidWithListener(null, this, e.class, "1")) {
          return;
       }
       Iterator iterator = this.c.b.iterator();
       while (iterator.hasNext()) {
          iterator.next().c(this.b);
       }
       PatchProxy.onMethodExit(e.class, "1");
       return;
    }
}
