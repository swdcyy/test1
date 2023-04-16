package com.kuaishou.live.core.show.fansgroupv2.FansGroupV2LiveTaskPresenter$sendGift$3;
import msd.a;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public final class FansGroupV2LiveTaskPresenter$sendGift$3 extends Lambda implements a	// class@000b4f
{
    public final Ref$ObjectRef $giftId;

    public void FansGroupV2LiveTaskPresenter$sendGift$3(Ref$ObjectRef p0){
       this.$giftId = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final String invoke(){
       Object obj = PatchProxy.apply(null, this, FansGroupV2LiveTaskPresenter$sendGift$3.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "send gift error, gift is null, giftId="+this.$giftId.element;
    }
}
