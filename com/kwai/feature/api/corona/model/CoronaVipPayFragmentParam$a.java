package com.kwai.feature.api.corona.model.CoronaVipPayFragmentParam$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kwai.feature.api.corona.model.CoronaVipPayFragmentParam;

public final class CoronaVipPayFragmentParam$a implements Parcelable$Creator	// class@000e13
{

    public void CoronaVipPayFragmentParam$a(){
       super();
    }
    public final Object createFromParcel(Parcel p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CoronaVipPayFragmentParam$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "in");
       return new CoronaVipPayFragmentParam(p0.readString());
    }
    public final Object[] newArray(int p0){
       CoronaVipPayFragmentParam[] uCoronaVipPa = new CoronaVipPayFragmentParam[p0];
       return uCoronaVipPa;
    }
}
