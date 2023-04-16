package m69.g$g;
import erd.o;
import java.lang.Object;
import com.kuaishou.android.model.response.MusicDetailResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.aicut.api.AICutMusicInfo;
import kotlin.jvm.internal.a;
import l69.t;
import com.kuaishou.android.model.music.Music;

public final class g$g implements o	// class@002e1d
{
    public static final g$g b;

    static {
       g$g.b = new g$g();
    }
    public void g$g(){
       super();
    }
    public Object apply(Object p0){
       AICutMusicInfo uAICutMusicI = PatchProxy.applyOneRefs(p0, this, g$g.class, "1");
       if (uAICutMusicI != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          p0 = p0.mMusic;
          a.o(p0, "music");
          uAICutMusicI = t.a.a(p0);
       }
       return uAICutMusicI;
    }
}
