package hd9.o;
import java.lang.Object;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.music.Music;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.model.mix.PhotoMeta;
import tl8.d;

public final class o	// class@00261f
{

    public void o(){
       super();
    }
    public static Music a(BaseFeed p0){
       PhotoMeta obj = PatchProxy.applyOneRefs(p0, null, o.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.a(PhotoMeta.class).mSoundTrack;
       if (obj != null) {
          return obj;
       }
       return p0.a(PhotoMeta.class).mMusic;
    }
}
