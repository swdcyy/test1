package com.kuaishou.live.core.show.fansgroupv2.FansGroupV2LiveTaskPresenter$sendGift$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.show.fansgroupv2.FansGroupV2LiveTaskPresenter;
import kotlin.jvm.internal.Ref$ObjectRef;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import t02.a0;
import p91.m;

public final class FansGroupV2LiveTaskPresenter$sendGift$2 extends Lambda implements a	// class@000b4e
{
    public final Ref$ObjectRef $giftId;
    public final Ref$ObjectRef $streamId;
    public final FansGroupV2LiveTaskPresenter this$0;

    public void FansGroupV2LiveTaskPresenter$sendGift$2(FansGroupV2LiveTaskPresenter p0,Ref$ObjectRef p1,Ref$ObjectRef p2){
       this.this$0 = p0;
       this.$giftId = p1;
       this.$streamId = p2;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final String invoke(){
       Object[] objArray = null;
       StringBuilder obj = PatchProxy.apply(objArray, this, FansGroupV2LiveTaskPresenter$sendGift$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "ÀÕ¿Ò≤ª…˙–ß£¨gifId is "+this.$giftId.element+", "+"liveStreamId is ";
       a0 z2 = FansGroupV2LiveTaskPresenter.a9(this.this$0).Z2;
       if (z2 != null) {
          objArray = z2.getLiveStreamId();
       }
       return obj+objArray+" , "+"streamId is "+this.$streamId.element;
    }
}
