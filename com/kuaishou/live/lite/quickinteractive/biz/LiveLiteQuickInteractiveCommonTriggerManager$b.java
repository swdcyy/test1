package com.kuaishou.live.lite.quickinteractive.biz.LiveLiteQuickInteractiveCommonTriggerManager$b;
import lf3.g;
import com.kuaishou.live.lite.quickinteractive.biz.LiveLiteQuickInteractiveCommonTriggerManager;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.LiveQuickInteractiveArea$SCLiveQuickInteractiveArea;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import lf3.f;

public final class LiveLiteQuickInteractiveCommonTriggerManager$b implements g	// class@000aac
{
    public final LiveLiteQuickInteractiveCommonTriggerManager b;

    public void LiveLiteQuickInteractiveCommonTriggerManager$b(LiveLiteQuickInteractiveCommonTriggerManager p0){
       this.b = p0;
       super();
    }
    public void H4(MessageNano p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteQuickInteractiveCommonTriggerManager$b.class, "1")) {
       }else {
          a.o(p0, "it");
          this.b.a(p0, false);
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
