package com.kuaishou.live.house.model.HouseLiveExplainMessage$b;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kuaishou.live.house.model.HouseLiveExplainMessage;

public final class HouseLiveExplainMessage$b implements Parcelable$Creator	// class@001d0d
{

    public void HouseLiveExplainMessage$b(){
       super();
    }
    public final Object createFromParcel(Parcel p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, HouseLiveExplainMessage$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "in");
       HouseLiveExplainMessage houseLiveExp = (p0.readInt())? new HouseLiveExplainMessage(): null;
       return houseLiveExp;
    }
    public final Object[] newArray(int p0){
       HouseLiveExplainMessage[] houseLiveExp = new HouseLiveExplainMessage[p0];
       return houseLiveExp;
    }
}
