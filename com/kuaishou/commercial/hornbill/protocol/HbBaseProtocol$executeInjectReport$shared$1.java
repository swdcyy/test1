package com.kuaishou.commercial.hornbill.protocol.HbBaseProtocol$executeInjectReport$shared$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.commercial.hornbill.protocol.HbBaseProtocol;
import java.lang.Object;
import com.google.gson.JsonObject;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.google.gson.JsonElement;

public final class HbBaseProtocol$executeInjectReport$shared$1 extends Lambda implements l	// class@0014e7
{
    public final int $verifyStatus;
    public final HbBaseProtocol this$0;

    public void HbBaseProtocol$executeInjectReport$shared$1(HbBaseProtocol p0,int p1){
       this.this$0 = p0;
       this.$verifyStatus = p1;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(JsonObject p0){
       JsonObject jsonObject;
       if (PatchProxy.applyVoidOneRefs(p0, this, HbBaseProtocol$executeInjectReport$shared$1.class, "1")) {
          return;
       }
       a.p(p0, "extraData");
       HbBaseProtocol$executeInjectReport$shared$1 tthis$0 = this.this$0;
       HbBaseProtocol$executeInjectReport$shared$1 t$verifyStat = this.$verifyStatus;
       Objects.requireNonNull(tthis$0);
       HbBaseProtocol hbBaseProtoc = HbBaseProtocol.class;
       if (PatchProxy.isSupport(hbBaseProtoc)) {
          jsonObject = PatchProxy.applyOneRefs(Integer.valueOf(t$verifyStat), tthis$0, hbBaseProtoc, "8");
          if (jsonObject != PatchProxyResult.class) {
          label_003e :
             p0.G("verify", jsonObject);
             return;
          }
       }
       jsonObject = new JsonObject();
       jsonObject.a0("status", Integer.valueOf(t$verifyStat));
       goto label_003e ;
    }
}
