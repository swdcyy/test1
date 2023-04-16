package k79.q;
import java.lang.Runnable;
import com.yxcorp.gifshow.album.repo.VideoLoaderImpl;
import java.util.LinkedList;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
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
import com.yxcorp.gifshow.album.repo.AlbumAssetCache$AssetModule;
import o79.n$a;
import o79.n;
import k79.r;

public final class q implements Runnable	// class@002b5f
{
    public final VideoLoaderImpl b;
    public final LinkedList c;

    public void q(VideoLoaderImpl p0,LinkedList p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       i$a e;
       if (PatchProxy.applyVoid(null, this, q.class, "1")) {
          return;
       }
       q tb = this.b;
       q tc = this.c;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoidOneRefs(tc, tb, VideoLoaderImpl.class, "20")) {
          Iterator iterator = tc.iterator();
          while (iterator.hasNext()) {
             Pair pair = iterator.next();
             int i = pair.getFirst().intValue();
             QMedia second = pair.getSecond();
             Log.g(tb.a, "empty media = "+second);
             if (TextUtils.x(second.path)) {
                continue ;
             }else {
                e = i.e;
                if (!e.k(second)) {
                   continue ;
                }
             }
             QMedia qMedia = e.o(second);
             AlbumAssetCache.d.a().g(AlbumAssetCache$AssetModule.VIDEO, i, qMedia);
             Log.g(tb.a, "inflate finish, update. path="+second.path);
             n.a().a(new r(qMedia, tb));
          }
       }
       return;
    }
}
