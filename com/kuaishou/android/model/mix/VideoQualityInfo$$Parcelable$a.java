package com.kuaishou.android.model.mix.VideoQualityInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.mix.VideoQualityInfo$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.mix.VideoQualityInfo;

public class VideoQualityInfo$$Parcelable$a implements Parcelable$Creator	// class@000e2f
{

    public void VideoQualityInfo$$Parcelable$a(){
       super();
    }
    public VideoQualityInfo$$Parcelable a(Parcel p0){
       return new VideoQualityInfo$$Parcelable(VideoQualityInfo$$Parcelable.read(p0, new a()));
    }
    public VideoQualityInfo$$Parcelable[] b(int p0){
       VideoQualityInfo$$Parcelable[] $ParcelableA = new VideoQualityInfo$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
