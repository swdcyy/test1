package com.kuaishou.android.model.mix.VideoMeta$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.mix.VideoMeta$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.mix.VideoMeta;

public class VideoMeta$$Parcelable$a implements Parcelable$Creator	// class@000e23
{

    public void VideoMeta$$Parcelable$a(){
       super();
    }
    public VideoMeta$$Parcelable a(Parcel p0){
       return new VideoMeta$$Parcelable(VideoMeta$$Parcelable.read(p0, new a()));
    }
    public VideoMeta$$Parcelable[] b(int p0){
       VideoMeta$$Parcelable[] $ParcelableA = new VideoMeta$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
