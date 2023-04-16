package com.kuaishou.live.lite.highfrequency.biz.LiveLiteHighFrequencyGuideTriggerManager$tryShowHighFrequencyGuide$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import nb3.e;
import java.lang.Object;
import com.kuaishou.live.basic.model.LiveMessageFrequencyConfig$FrequencyConfig;
import v91.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.lite.highfrequency.biz.LiveLiteHighFrequencyGuideTriggerManager$tryShowHighFrequencyGuide$1$a;
import x51.b;
import ok.x;
import v91.n;
import v91.e;

public final class LiveLiteHighFrequencyGuideTriggerManager$tryShowHighFrequencyGuide$1 extends Lambda implements l	// class@0009b1
{
    public final e this$0;

    public void LiveLiteHighFrequencyGuideTriggerManager$tryShowHighFrequencyGuide$1(e p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final b invoke(LiveMessageFrequencyConfig$FrequencyConfig p0){
       b uob;
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveLiteHighFrequencyGuideTriggerManager$tryShowHighFrequencyGuide$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null) {
          uob = n.a(p0, new LiveLiteHighFrequencyGuideTriggerManager$tryShowHighFrequencyGuide$1$a(this), b.b());
          if (uob != null) {
          label_0026 :
             return uob;
          }
       }
       uob = new e();
       goto label_0026 ;
    }
}
