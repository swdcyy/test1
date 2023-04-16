package com.sina.weibo.sdk.auth.AuthInfo$1;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.sina.weibo.sdk.auth.AuthInfo;

public final class AuthInfo$1 implements Parcelable$Creator	// class@000bac
{

    public void AuthInfo$1(){
       super();
    }
    public final Object createFromParcel(Parcel p0){
       return new AuthInfo(p0);
    }
    public final Object[] newArray(int p0){
       AuthInfo[] uAuthInfoArr = new AuthInfo[p0];
       return uAuthInfoArr;
    }
}
