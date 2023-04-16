package com.kwai.middleware.azeroth.model.AzerothHosts$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.middleware.azeroth.model.AzerothHosts;

public final class AzerothHosts$a implements Parcelable$Creator	// class@000efd
{

    public void AzerothHosts$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       a.q(p0, "source");
       return new AzerothHosts(p0);
    }
    public Object[] newArray(int p0){
       AzerothHosts[] uAzerothHost = new AzerothHosts[p0];
       return uAzerothHost;
    }
}
