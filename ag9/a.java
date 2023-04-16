package ag9.a;
import erd.o;
import com.yxcorp.gifshow.camera.record.music.reco.BaseRecoCollectMusicController;
import java.lang.Object;
import kotlin.Pair;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Float;
import kotlin.jvm.internal.a;
import j8c.a;
import java.lang.StringBuilder;
import java.lang.Number;
import q87.c;
import android.content.Intent;
import com.kwai.feature.post.api.music.data.MusicSource;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;

public final class a implements o	// class@0000b5
{
    public final BaseRecoCollectMusicController b;

    public void a(BaseRecoCollectMusicController p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       BaseRecoCollectMusicController obj = PatchProxy.applyOneRefs(p0, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
       }else {
          a.p(p0, "pair");
          Object[] objArray = new Object[0];
          a.D().w("RecoCollectMusicController", "progress : "+p0.getFirst().floatValue(), objArray);
          this.b.q = p0.getSecond();
          obj = this.b.q;
          if (obj != null) {
             SerializableHook.putExtra(obj, "music_source", MusicSource.RECORD_ENTER_MUSIC_ICON);
          }
          obj = p0.getFirst();
       }
       return obj;
    }
}
