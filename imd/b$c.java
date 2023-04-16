package imd.b$c;
import erd.o;
import java.lang.Object;
import com.yxcorp.gifshow.network.model.InteractStickerResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.gifshow.post.api.feature.stick.InteractStickerInfo;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.network.model.InteractStickerResponse$DataResponse;
import com.kwai.gifshow.post.api.feature.stick.model.ChallengeStickerInfo;
import jn6.c;

public final class b$c implements o	// class@001022
{
    public static final b$c b;

    static {
       b$c.b = new b$c();
    }
    public void b$c(){
       super();
    }
    public Object apply(Object p0){
       InteractStickerInfo interactStic = PatchProxy.applyOneRefs(p0, this, b$c.class, "1");
       if (interactStic != PatchProxyResult.class) {
       }else {
          a.p(p0, "response");
          interactStic = c.b(p0.data.challengeStickerInfo);
       }
       return interactStic;
    }
}
