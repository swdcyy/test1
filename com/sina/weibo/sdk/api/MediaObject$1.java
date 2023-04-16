package com.sina.weibo.sdk.api.MediaObject$1;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.sina.weibo.sdk.api.MediaObject;

public final class MediaObject$1 implements Parcelable$Creator	// class@000b9d
{

    public void MediaObject$1(){
       super();
    }
    public final MediaObject createFromParcel(Parcel p0){
       return new MediaObject(p0);
    }
    public final Object createFromParcel(Parcel p0){
       return this.createFromParcel(p0);
    }
    public final MediaObject[] newArray(int p0){
       MediaObject[] mediaObjectA = new MediaObject[p0];
       return mediaObjectA;
    }
    public final Object[] newArray(int p0){
       return this.newArray(p0);
    }
}
