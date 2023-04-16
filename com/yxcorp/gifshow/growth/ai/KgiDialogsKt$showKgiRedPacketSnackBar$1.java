package com.yxcorp.gifshow.growth.ai.KgiDialogsKt$showKgiRedPacketSnackBar$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.growth.ai.KgiRedPacketServerResponse$Companion$KgiRedPacketResponse;
import xma.a;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import xma.h;

public final class KgiDialogsKt$showKgiRedPacketSnackBar$1 extends Lambda implements a	// class@0012ea
{
    public final a $listener;
    public final KgiRedPacketServerResponse$Companion$KgiRedPacketResponse $redPacketResponse;

    public void KgiDialogsKt$showKgiRedPacketSnackBar$1(KgiRedPacketServerResponse$Companion$KgiRedPacketResponse p0,a p1){
       this.$redPacketResponse = p0;
       this.$listener = p1;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoid(null, this, KgiDialogsKt$showKgiRedPacketSnackBar$1.class, "1")) {
          return;
       }
       h.d(this.$redPacketResponse, this.$listener);
       return;
    }
}
