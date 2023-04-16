package com.kuaishou.live.lite.highfrequency.biz.LiveLiteHighFrequencyGuideTriggerManager$tryShowHighFrequencyGuide$1$a;
import ok.x;
import com.kuaishou.live.lite.highfrequency.biz.LiveLiteHighFrequencyGuideTriggerManager$tryShowHighFrequencyGuide$1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import nb3.e;
import xp5.g;
import kotlin.jvm.internal.a;

public final class LiveLiteHighFrequencyGuideTriggerManager$tryShowHighFrequencyGuide$1$a implements x	// class@0009b0
{
    public final LiveLiteHighFrequencyGuideTriggerManager$tryShowHighFrequencyGuide$1 b;

    public void LiveLiteHighFrequencyGuideTriggerManager$tryShowHighFrequencyGuide$1$a(LiveLiteHighFrequencyGuideTriggerManager$tryShowHighFrequencyGuide$1 p0){
       this.b = p0;
       super();
    }
    public Object get(){
       String str = PatchProxy.applyWithListener(null, this, LiveLiteHighFrequencyGuideTriggerManager$tryShowHighFrequencyGuide$1$a.class, "1");
       if (str != PatchProxyResult.class) {
       }else {
          str = this.b.this$0.c.getLiveStreamId();
          a.m(str);
          PatchProxy.onMethodExit(LiveLiteHighFrequencyGuideTriggerManager$tryShowHighFrequencyGuide$1$a.class, "1");
       }
       return str;
    }
}
