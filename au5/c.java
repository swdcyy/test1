package au5.c;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import com.kuaishou.android.model.mix.CommonMeta;
import tl8.d;
import com.kuaishou.android.live.model.QLivePlayConfig;
import com.kuaishou.android.model.feed.LiveStreamFeed;

public final class c	// class@0003ad
{

    public static final boolean a(BaseFeed p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "$this$isGrVideo");
       CommonMeta uCommonMeta = p0.a(CommonMeta.class);
       boolean b = (uCommonMeta != null && uCommonMeta.mShowGrDetailPage != null)? true: false;
       return b;
    }
    public static final boolean b(BaseFeed p0){
       QLivePlayConfig obj = PatchProxy.applyOneRefs(p0, null, c.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "$this$isSimpleLiveFeed");
       obj = p0.a(QLivePlayConfig.class);
       obj = (obj != null)? obj.mStreamType: -1;
       boolean b = true;
       if (!p0 instanceof LiveStreamFeed || (obj != b && obj != 3)) {
          b = false;
       }
       return b;
    }
}
