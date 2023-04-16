package com.kuaishou.live.locallife.model.LocalLifeLiveIconMessage$b;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kuaishou.live.locallife.model.LocalLifeLiveIconMessage;

public final class LocalLifeLiveIconMessage$b implements Parcelable$Creator	// class@000c36
{

    public void LocalLifeLiveIconMessage$b(){
       super();
    }
    public final Object createFromParcel(Parcel p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LocalLifeLiveIconMessage$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "in");
       LocalLifeLiveIconMessage localLifeLiv = (p0.readInt())? new LocalLifeLiveIconMessage(): null;
       return localLifeLiv;
    }
    public final Object[] newArray(int p0){
       LocalLifeLiveIconMessage[] localLifeLiv = new LocalLifeLiveIconMessage[p0];
       return localLifeLiv;
    }
}
