package com.kuaishou.live.lite.quickinteractive.biz.LiveLiteQuickInteractiveCommonTriggerManager$tryShowQuickInteractive$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.lite.quickinteractive.biz.LiveLiteQuickInteractiveCommonTriggerManager;
import java.lang.Object;
import com.kuaishou.live.basic.model.LiveMessageFrequencyConfig$FrequencyConfig;
import v91.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import com.kwai.framework.model.user.QCurrentUser;
import kotlin.jvm.internal.a;
import com.kuaishou.live.lite.quickinteractive.biz.LiveLiteQuickInteractiveCommonTriggerManager$tryShowQuickInteractive$1$a;
import x51.b;
import ok.x;
import v91.n;
import v91.e;

public final class LiveLiteQuickInteractiveCommonTriggerManager$tryShowQuickInteractive$1 extends Lambda implements l	// class@000ab2
{
    public final LiveLiteQuickInteractiveCommonTriggerManager this$0;

    public void LiveLiteQuickInteractiveCommonTriggerManager$tryShowQuickInteractive$1(LiveLiteQuickInteractiveCommonTriggerManager p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final b invoke(LiveMessageFrequencyConfig$FrequencyConfig p0){
       b uob;
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveLiteQuickInteractiveCommonTriggerManager$tryShowQuickInteractive$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null) {
          QCurrentUser qCurrentUser = QCurrentUser.me();
          a.o(qCurrentUser, "QCurrentUser.me\(\)");
          uob = n.b(p0.mConfigBizId+'_'+qCurrentUser.getId(), p0, new LiveLiteQuickInteractiveCommonTriggerManager$tryShowQuickInteractive$1$a(this), b.b());
          if (uob != null) {
          label_0049 :
             return uob;
          }
       }
       uob = new e();
       goto label_0049 ;
    }
}
