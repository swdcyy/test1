package com.kwai.feature.api.social.message.model.IMShareTargetInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kwai.feature.api.social.message.model.IMShareTargetInfo$$Parcelable;
import xwd.a;
import com.kwai.feature.api.social.message.model.IMShareTargetInfo;

public class IMShareTargetInfo$$Parcelable$a implements Parcelable$Creator	// class@001170
{

    public void IMShareTargetInfo$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new IMShareTargetInfo$$Parcelable(IMShareTargetInfo$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       IMShareTargetInfo$$Parcelable[] $ParcelableA = new IMShareTargetInfo$$Parcelable[p0];
       return $ParcelableA;
    }
}
