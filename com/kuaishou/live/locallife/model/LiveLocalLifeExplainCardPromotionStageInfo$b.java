package com.kuaishou.live.locallife.model.LiveLocalLifeExplainCardPromotionStageInfo$b;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kuaishou.live.locallife.model.LiveLocalLifeExplainCardPromotionStageInfo;

public final class LiveLocalLifeExplainCardPromotionStageInfo$b implements Parcelable$Creator	// class@000c2e
{

    public void LiveLocalLifeExplainCardPromotionStageInfo$b(){
       super();
    }
    public final Object createFromParcel(Parcel p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveLocalLifeExplainCardPromotionStageInfo$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "in");
       LiveLocalLifeExplainCardPromotionStageInfo liveLocalLif = (p0.readInt())? new LiveLocalLifeExplainCardPromotionStageInfo(): null;
       return liveLocalLif;
    }
    public final Object[] newArray(int p0){
       LiveLocalLifeExplainCardPromotionStageInfo[] liveLocalLif = new LiveLocalLifeExplainCardPromotionStageInfo[p0];
       return liveLocalLif;
    }
}
