package com.kuaishou.live.locallife.model.ExplainBundleInfo$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kuaishou.live.locallife.model.ExplainBundleInfo;

public final class ExplainBundleInfo$a implements Parcelable$Creator	// class@000c28
{

    public void ExplainBundleInfo$a(){
       super();
    }
    public final Object createFromParcel(Parcel p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ExplainBundleInfo$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "in");
       ExplainBundleInfo uExplainBund = (p0.readInt())? new ExplainBundleInfo(): null;
       return uExplainBund;
    }
    public final Object[] newArray(int p0){
       ExplainBundleInfo[] uExplainBund = new ExplainBundleInfo[p0];
       return uExplainBund;
    }
}
