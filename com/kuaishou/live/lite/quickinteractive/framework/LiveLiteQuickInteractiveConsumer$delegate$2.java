package com.kuaishou.live.lite.quickinteractive.framework.LiveLiteQuickInteractiveConsumer$delegate$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.lite.quickinteractive.framework.LiveLiteQuickInteractiveConsumer;
import com.kuaishou.live.lite.quickinteractive.framework.LiveLiteQuickInteractiveConsumer$delegate$2$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveLiteQuickInteractiveConsumer$delegate$2 extends Lambda implements a	// class@000aca
{
    public final LiveLiteQuickInteractiveConsumer this$0;

    public void LiveLiteQuickInteractiveConsumer$delegate$2(LiveLiteQuickInteractiveConsumer p0){
       this.this$0 = p0;
       super(0);
    }
    public final LiveLiteQuickInteractiveConsumer$delegate$2$a invoke(){
       Object obj = PatchProxy.apply(null, this, LiveLiteQuickInteractiveConsumer$delegate$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveLiteQuickInteractiveConsumer$delegate$2$a(this);
    }
    public Object invoke(){
       return this.invoke();
    }
}
