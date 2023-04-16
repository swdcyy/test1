package com.sina.weibo.sdk.api.VideoSourceObject$1;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.sina.weibo.sdk.api.VideoSourceObject;

public final class VideoSourceObject$1 implements Parcelable$Creator	// class@000ba5
{

    public void VideoSourceObject$1(){
       super();
    }
    public final VideoSourceObject createFromParcel(Parcel p0){
       return new VideoSourceObject(p0);
    }
    public final Object createFromParcel(Parcel p0){
       return this.createFromParcel(p0);
    }
    public final VideoSourceObject[] newArray(int p0){
       VideoSourceObject[] videoSourceO = new VideoSourceObject[p0];
       return videoSourceO;
    }
    public final Object[] newArray(int p0){
       return this.newArray(p0);
    }
}
