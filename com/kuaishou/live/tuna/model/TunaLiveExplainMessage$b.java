package com.kuaishou.live.tuna.model.TunaLiveExplainMessage$b;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kuaishou.live.tuna.model.TunaLiveExplainMessage;

public final class TunaLiveExplainMessage$b implements Parcelable$Creator	// class@000fbc
{

    public void TunaLiveExplainMessage$b(){
       super();
    }
    public final Object createFromParcel(Parcel p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TunaLiveExplainMessage$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "in");
       TunaLiveExplainMessage tunaLiveExpl = (p0.readInt())? new TunaLiveExplainMessage(): null;
       return tunaLiveExpl;
    }
    public final Object[] newArray(int p0){
       TunaLiveExplainMessage[] tunaLiveExpl = new TunaLiveExplainMessage[p0];
       return tunaLiveExpl;
    }
}
