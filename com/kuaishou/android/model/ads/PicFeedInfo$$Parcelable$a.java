package com.kuaishou.android.model.ads.PicFeedInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.PicFeedInfo$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.PicFeedInfo;

public class PicFeedInfo$$Parcelable$a implements Parcelable$Creator	// class@000a6c
{

    public void PicFeedInfo$$Parcelable$a(){
       super();
    }
    public PicFeedInfo$$Parcelable a(Parcel p0){
       return new PicFeedInfo$$Parcelable(PicFeedInfo$$Parcelable.read(p0, new a()));
    }
    public PicFeedInfo$$Parcelable[] b(int p0){
       PicFeedInfo$$Parcelable[] $ParcelableA = new PicFeedInfo$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
