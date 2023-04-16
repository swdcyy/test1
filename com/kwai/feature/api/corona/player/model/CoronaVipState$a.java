package com.kwai.feature.api.corona.player.model.CoronaVipState$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kwai.feature.api.corona.player.model.CoronaVipState;

public final class CoronaVipState$a implements Parcelable$Creator	// class@000e1e
{

    public void CoronaVipState$a(){
       super();
    }
    public final Object createFromParcel(Parcel p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CoronaVipState$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "in");
       boolean b = true;
       boolean b1 = (p0.readInt())? true: false;
       if (!p0.readInt()) {
          b = false;
       }
       return new CoronaVipState(b1, b);
    }
    public final Object[] newArray(int p0){
       CoronaVipState[] uCoronaVipSt = new CoronaVipState[p0];
       return uCoronaVipSt;
    }
}
