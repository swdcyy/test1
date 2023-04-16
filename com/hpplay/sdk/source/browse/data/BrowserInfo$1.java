package com.hpplay.sdk.source.browse.data.BrowserInfo$1;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.hpplay.sdk.source.browse.data.BrowserInfo;

public final class BrowserInfo$1 implements Parcelable$Creator	// class@00065f
{

    public void BrowserInfo$1(){
       super();
    }
    public BrowserInfo createFromParcel(Parcel p0){
       return new BrowserInfo(p0);
    }
    public Object createFromParcel(Parcel p0){
       return this.createFromParcel(p0);
    }
    public BrowserInfo[] newArray(int p0){
       BrowserInfo[] uBrowserInfo = new BrowserInfo[p0];
       return uBrowserInfo;
    }
    public Object[] newArray(int p0){
       return this.newArray(p0);
    }
}
