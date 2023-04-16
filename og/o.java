package og.o;
import erd.o;
import com.kwai.feature.post.api.feature.bridge.JsPostAtlasParams;
import java.lang.Object;
import java.lang.Boolean;
import com.kuaishou.android.model.music.MusicType;
import wkd.b;
import rfc.a;
import java.lang.String;
import brd.t;
import com.feature.post.bridge.util.a;
import t45.d;
import brd.z;
import com.feature.post.bridge.util.b;

public final class o implements o	// class@0027b9
{
    public final JsPostAtlasParams b;

    public void o(JsPostAtlasParams p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       o tb = this.b;
       return b.a(0x4a533fa).h(tb.mMusicId, MusicType.valueOf(tb.mMusicType).getValue()).map(a.b).observeOn(d.c).concatMap(b.b);
    }
}
