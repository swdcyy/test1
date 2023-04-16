package com.kwai.middleware.azeroth.model.SDKInfoRequest$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.middleware.azeroth.model.SDKInfoRequest;

public final class SDKInfoRequest$a implements Parcelable$Creator	// class@000f06
{

    public void SDKInfoRequest$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       a.q(p0, "source");
       return new SDKInfoRequest(p0);
    }
    public Object[] newArray(int p0){
       SDKInfoRequest[] sDKInfoReque = new SDKInfoRequest[p0];
       return sDKInfoReque;
    }
}
