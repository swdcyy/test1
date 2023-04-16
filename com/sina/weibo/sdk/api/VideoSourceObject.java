package com.sina.weibo.sdk.api.VideoSourceObject;
import com.sina.weibo.sdk.api.MediaObject;
import com.sina.weibo.sdk.api.VideoSourceObject$1;
import android.os.Parcel;
import android.net.Uri;
import java.lang.ClassLoader;
import java.lang.Class;
import android.os.Parcelable;

public class VideoSourceObject extends MediaObject	// class@000ba6
{
    public Uri coverPath;
    public long during;
    public Uri videoPath;
    public static final Parcelable$Creator CREATOR;
    public static final long serialVersionUID;

    static {
       VideoSourceObject.CREATOR = new VideoSourceObject$1();
    }
    public void VideoSourceObject(){
       super();
    }
    public void VideoSourceObject(Parcel p0){
       super(p0);
       this.coverPath = p0.readParcelable(Uri.class.getClassLoader());
       this.videoPath = p0.readParcelable(Uri.class.getClassLoader());
       this.during = p0.readLong();
    }
    public int describeContents(){
       return 0;
    }
    public void writeToParcel(Parcel p0,int p1){
       super.writeToParcel(p0, p1);
       p0.writeParcelable(this.coverPath, p1);
       p0.writeParcelable(this.videoPath, p1);
       p0.writeLong(this.during);
    }
}
