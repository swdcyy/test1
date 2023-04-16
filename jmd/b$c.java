package jmd.b$c;
import erd.o;
import java.lang.Object;
import com.kwai.gifshow.post.api.feature.vote.model.VoteResultResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.gifshow.post.api.feature.stick.InteractStickerInfo;
import kotlin.jvm.internal.a;
import jn6.c;

public final class b$c implements o	// class@00170a
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
          interactStic = c.d(p0);
       }
       return interactStic;
    }
}
