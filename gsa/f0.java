package gsa.f0;
import com.kwai.kcube.TabIdentifier;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import on5.b;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;

public final class f0	// class@002be9
{

    public static final boolean a(TabIdentifier p0){
       TabIdentifier[] obj = PatchProxy.applyOneRefs(p0, null, f0.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "$this$isValidLastMemoryBottomTabId");
       obj = new TabIdentifier[]{b.f,b.b,b.c,b.d};
       return CollectionsKt__CollectionsKt.L(obj).contains(p0);
    }
}
