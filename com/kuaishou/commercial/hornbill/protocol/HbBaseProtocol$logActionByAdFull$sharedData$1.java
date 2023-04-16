package com.kuaishou.commercial.hornbill.protocol.HbBaseProtocol$logActionByAdFull$sharedData$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.commercial.hornbill.protocol.HbBaseProtocol;
import mxb.j;
import java.lang.String;
import java.lang.Object;
import com.google.gson.JsonObject;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.Integer;
import java.lang.Number;
import com.kwai.framework.model.feed.BaseFeed;

public final class HbBaseProtocol$logActionByAdFull$sharedData$1 extends Lambda implements l	// class@0014ea
{
    public final int $actionType;
    public final String $realScene;
    public final j $wrapper;
    public final HbBaseProtocol this$0;

    public void HbBaseProtocol$logActionByAdFull$sharedData$1(HbBaseProtocol p0,int p1,j p2,String p3){
       this.this$0 = p0;
       this.$actionType = p1;
       this.$wrapper = p2;
       this.$realScene = p3;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(JsonObject p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HbBaseProtocol$logActionByAdFull$sharedData$1.class, "1")) {
          return;
       }
       a.p(p0, "special");
       p0.a0("action_type", Integer.valueOf(this.$actionType));
       this.this$0.a(this.$wrapper.b(), this.$realScene, this.$actionType, p0);
       return;
    }
}
