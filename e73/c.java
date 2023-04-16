package e73.c;
import erd.g;
import com.kuaishou.live.lite.adapter.component.fansgroup.LiveLiteFansGroupDataModel;
import java.lang.Object;
import i95.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.live.core.show.fansgroup.http.LiveFansGroupIntimacyInfo;
import java.lang.Boolean;
import com.kuaishou.android.live.log.b;
import tkd.b;
import tkd.d;
import kotlin.jvm.internal.a;
import ad5.b;
import ad5.a;

public final class c implements g	// class@002694
{
    public final LiveLiteFansGroupDataModel b;

    public void c(LiveLiteFansGroupDataModel p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       int i;
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
       }else {
          LiveLiteLogTag lITE_FANS_GR = LiveLiteLogTag.LITE_FANS_GROUP;
          lITE_FANS_GR.appendTag(this.b.a);
          b.T(lITE_FANS_GR, "FansGroupJoinedStatusChangeEvent", "info", p0.b(), "isJoinSuperFansGroup", p0.c());
          c tb = this.b;
          LiveFansGroupIntimacyInfo liveFansGrou = p0.b();
          liveFansGrou = (liveFansGrou != null)? liveFansGrou.mLevel: 0;
          LiveLiteFansGroupDataModel.o(tb, liveFansGrou, false, 2, null);
          tb = this.b;
          liveFansGrou = p0.b();
          liveFansGrou = (liveFansGrou != null)? liveFansGrou.mStatus: 0;
          LiveLiteFansGroupDataModel.r(tb, liveFansGrou, false, 2, null);
          b uob = d.a(0x630bc993);
          a.o(uob, "PluginManager.get\(PaymentPlugin::class.java\)");
          uob.d1().f();
          if (a.g(p0.c(), Boolean.TRUE)) {
             LiveLiteFansGroupDataModel.u(this.b, true, false, 2, null);
          }
       }
       return;
    }
}
