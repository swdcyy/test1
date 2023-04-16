package com.kuaishou.live.common.core.component.gift.giftNaming.springNaming.LiveGiftSpringNamingModel$b;
import lf3.g;
import com.kuaishou.live.common.core.component.gift.giftNaming.springNaming.LiveGiftSpringNamingModel;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.SCLiveGiftTitleChangeInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import lf3.f;

public final class LiveGiftSpringNamingModel$b implements g	// class@0012c4
{
    public final LiveGiftSpringNamingModel b;

    public void LiveGiftSpringNamingModel$b(LiveGiftSpringNamingModel p0){
       this.b = p0;
       super();
    }
    public void H4(MessageNano p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGiftSpringNamingModel$b.class, "1")) {
       }else {
          a.o(p0, "info");
          this.b.e(p0);
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
