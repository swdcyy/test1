package o6c.a;
import com.kwai.android.dispatcher.KwaiPush;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import com.yxcorp.utility.RomUtils;
import tb7.h;

public final class a	// class@001faf
{

    public static final boolean a(KwaiPush p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "$this$isFrameSmallIcon");
       boolean b = (!RomUtils.s() && (!RomUtils.w() && (!RomUtils.n() && !h.c())))? true: false;
       return b;
    }
}
