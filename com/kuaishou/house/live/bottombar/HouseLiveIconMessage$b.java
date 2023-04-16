package com.kuaishou.house.live.bottombar.HouseLiveIconMessage$b;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kuaishou.house.live.bottombar.HouseLiveIconMessage;

public final class HouseLiveIconMessage$b implements Parcelable$Creator	// class@000763
{

    public void HouseLiveIconMessage$b(){
       super();
    }
    public final Object createFromParcel(Parcel p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, HouseLiveIconMessage$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "in");
       HouseLiveIconMessage houseLiveIco = (p0.readInt())? new HouseLiveIconMessage(): null;
       return houseLiveIco;
    }
    public final Object[] newArray(int p0){
       HouseLiveIconMessage[] houseLiveIco = new HouseLiveIconMessage[p0];
       return houseLiveIco;
    }
}
