package com.oplus.ocs.base.common.CapabilityInfo$1;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.oplus.ocs.base.common.CapabilityInfo;

public final class CapabilityInfo$1 implements Parcelable$Creator	// class@000ab4
{

    public void CapabilityInfo$1(){
       super();
    }
    public final Object createFromParcel(Parcel p0){
       return new CapabilityInfo(p0);
    }
    public final Object[] newArray(int p0){
       CapabilityInfo[] uCapabilityI = new CapabilityInfo[p0];
       return uCapabilityI;
    }
}
