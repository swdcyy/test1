package com.sina.weibo.sdk.web.WebData$1;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.sina.weibo.sdk.web.WebData;

public final class WebData$1 implements Parcelable$Creator	// class@000bdd
{

    public void WebData$1(){
       super();
    }
    public final Object createFromParcel(Parcel p0){
       return new WebData(p0);
    }
    public final Object[] newArray(int p0){
       WebData[] webDataArray = new WebData[p0];
       return webDataArray;
    }
}
