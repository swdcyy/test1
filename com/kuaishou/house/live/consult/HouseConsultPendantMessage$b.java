package com.kuaishou.house.live.consult.HouseConsultPendantMessage$b;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kuaishou.house.live.consult.HouseConsultPendantMessage;

public final class HouseConsultPendantMessage$b implements Parcelable$Creator	// class@000768
{

    public void HouseConsultPendantMessage$b(){
       super();
    }
    public final Object createFromParcel(Parcel p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, HouseConsultPendantMessage$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "in");
       HouseConsultPendantMessage houseConsult = (p0.readInt())? new HouseConsultPendantMessage(): null;
       return houseConsult;
    }
    public final Object[] newArray(int p0){
       HouseConsultPendantMessage[] houseConsult = new HouseConsultPendantMessage[p0];
       return houseConsult;
    }
}
