package com.hpplay.sdk.source.api.LelinkPlayerInfo$1;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.hpplay.sdk.source.api.LelinkPlayerInfo;

public final class LelinkPlayerInfo$1 implements Parcelable$Creator	// class@00063b
{

    public void LelinkPlayerInfo$1(){
       super();
    }
    public LelinkPlayerInfo createFromParcel(Parcel p0){
       return new LelinkPlayerInfo(p0);
    }
    public Object createFromParcel(Parcel p0){
       return this.createFromParcel(p0);
    }
    public LelinkPlayerInfo[] newArray(int p0){
       LelinkPlayerInfo[] lelinkPlayer = new LelinkPlayerInfo[p0];
       return lelinkPlayer;
    }
    public Object[] newArray(int p0){
       return this.newArray(p0);
    }
}
