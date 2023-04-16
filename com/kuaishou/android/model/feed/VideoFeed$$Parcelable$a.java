package com.kuaishou.android.model.feed.VideoFeed$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.feed.VideoFeed$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.feed.VideoFeed;

public class VideoFeed$$Parcelable$a implements Parcelable$Creator	// class@000b78
{

    public void VideoFeed$$Parcelable$a(){
       super();
    }
    public VideoFeed$$Parcelable a(Parcel p0){
       return new VideoFeed$$Parcelable(VideoFeed$$Parcelable.read(p0, new a()));
    }
    public VideoFeed$$Parcelable[] b(int p0){
       VideoFeed$$Parcelable[] $ParcelableA = new VideoFeed$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
