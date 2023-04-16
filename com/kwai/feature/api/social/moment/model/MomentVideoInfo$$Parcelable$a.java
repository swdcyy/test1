package com.kwai.feature.api.social.moment.model.MomentVideoInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kwai.feature.api.social.moment.model.MomentVideoInfo$$Parcelable;
import xwd.a;
import com.kwai.feature.api.social.moment.model.MomentVideoInfo;

public class MomentVideoInfo$$Parcelable$a implements Parcelable$Creator	// class@001191
{

    public void MomentVideoInfo$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new MomentVideoInfo$$Parcelable(MomentVideoInfo$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       MomentVideoInfo$$Parcelable[] $ParcelableA = new MomentVideoInfo$$Parcelable[p0];
       return $ParcelableA;
    }
}
