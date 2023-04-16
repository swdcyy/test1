package com.kuaishou.live.locallife.model.LocalLifeLiveExplainMessage$b;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kuaishou.live.locallife.model.LocalLifeLiveExplainMessage;

public final class LocalLifeLiveExplainMessage$b implements Parcelable$Creator	// class@000c32
{

    public void LocalLifeLiveExplainMessage$b(){
       super();
    }
    public final Object createFromParcel(Parcel p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LocalLifeLiveExplainMessage$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "in");
       LocalLifeLiveExplainMessage localLifeLiv = (p0.readInt())? new LocalLifeLiveExplainMessage(): null;
       return localLifeLiv;
    }
    public final Object[] newArray(int p0){
       LocalLifeLiveExplainMessage[] localLifeLiv = new LocalLifeLiveExplainMessage[p0];
       return localLifeLiv;
    }
}
