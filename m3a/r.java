package m3a.r;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import com.kwai.framework.model.feed.BaseFeed;

public final class r	// class@002f1e
{

    public static final String a(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, r.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "$this$logInfo");
       BaseFeed entity = p0.getEntity();
       a.o(entity, "entity");
       return p0.getUserName()+' '+entity.getId();
    }
}
