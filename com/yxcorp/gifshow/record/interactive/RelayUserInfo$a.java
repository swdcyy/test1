package com.yxcorp.gifshow.record.interactive.RelayUserInfo$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.record.interactive.RelayUserInfo;

public final class RelayUserInfo$a implements Parcelable$Creator	// class@001791
{

    public void RelayUserInfo$a(){
       super();
    }
    public final Object createFromParcel(Parcel p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, RelayUserInfo$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "in");
       return new RelayUserInfo(p0.readString(), p0.readString(), p0.readString());
    }
    public final Object[] newArray(int p0){
       RelayUserInfo[] relayUserInf = new RelayUserInfo[p0];
       return relayUserInf;
    }
}
