package k79.d;
import java.lang.Runnable;
import com.yxcorp.gifshow.album.repo.BaseLoaderImpl;
import java.util.LinkedList;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.yxcorp.gifshow.album.repo.AlbumAssetCache$AssetModule;
import java.util.Iterator;
import java.lang.Iterable;
import kotlin.Pair;
import java.lang.Number;
import com.yxcorp.gifshow.models.QMedia;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import k79.i;
import k79.i$a;
import com.yxcorp.gifshow.album.repo.AlbumAssetCache;
import com.yxcorp.gifshow.album.repo.AlbumAssetCache$a;
import o79.n$a;
import o79.n;
import k79.e;

public final class d implements Runnable	// class@002b4a
{
    public final BaseLoaderImpl b;
    public final LinkedList c;

    public void d(BaseLoaderImpl p0,LinkedList p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       i$a e;
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       d tb = this.b;
       d tc = this.c;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoidOneRefs(tc, tb, BaseLoaderImpl.class, "29")) {
          AlbumAssetCache$AssetModule uAssetModule = tb.p(tb.j);
          Iterator iterator = tc.iterator();
          while (iterator.hasNext()) {
             Pair pair = iterator.next();
             int i = pair.getFirst().intValue();
             QMedia second = pair.getSecond();
             Log.g("BaseLoaderImpl", "empty media = "+second);
             if (TextUtils.x(second.path)) {
                continue ;
             }else {
                e = i.e;
                if (!e.k(second)) {
                   continue ;
                }
             }
             QMedia qMedia = e.o(second);
             AlbumAssetCache.d.a().g(uAssetModule, i, qMedia);
             Log.g("BaseLoaderImpl", "inflate finish, update. path="+second.path);
             n.a().a(new e(qMedia, tb, uAssetModule));
          }
       }
       return;
    }
}
