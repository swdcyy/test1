package jp1.d;
import re3.e;
import com.kuaishou.live.common.core.component.multichat.audience.core.LiveAudienceMultiChatCoreModel;
import java.lang.Object;
import com.kuaishou.live.livestage.basic.LayoutConfig;
import re3.c;
import fe3.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import ip1.a;

public final class d implements e	// class@002bed
{
    public final LiveAudienceMultiChatCoreModel a;

    public void d(LiveAudienceMultiChatCoreModel p0){
       this.a = p0;
       super();
    }
    public final a a(LayoutConfig p0,c p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "l");
       a.p(p1, "r");
       return this.a.s.d(p0.d(), p0.c());
    }
}
