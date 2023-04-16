package com.kwai.middleware.azeroth.model.AzerothSDKConfigs$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.middleware.azeroth.model.AzerothSDKConfigs;

public final class AzerothSDKConfigs$a implements Parcelable$Creator	// class@000f00
{

    public void AzerothSDKConfigs$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       a.q(p0, "source");
       return new AzerothSDKConfigs(p0);
    }
    public Object[] newArray(int p0){
       AzerothSDKConfigs[] uAzerothSDKC = new AzerothSDKConfigs[p0];
       return uAzerothSDKC;
    }
}
