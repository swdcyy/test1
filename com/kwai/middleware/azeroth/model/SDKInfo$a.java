package com.kwai.middleware.azeroth.model.SDKInfo$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.middleware.azeroth.model.SDKInfo;

public final class SDKInfo$a implements Parcelable$Creator	// class@000f03
{

    public void SDKInfo$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       a.q(p0, "source");
       return new SDKInfo(p0);
    }
    public Object[] newArray(int p0){
       SDKInfo[] sDKInfoArray = new SDKInfo[p0];
       return sDKInfoArray;
    }
}
