package com.kwai.components.feedmodel.PhotoJudgementStatusInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kwai.components.feedmodel.PhotoJudgementStatusInfo$$Parcelable;
import xwd.a;
import com.kwai.components.feedmodel.PhotoJudgementStatusInfo;

public class PhotoJudgementStatusInfo$$Parcelable$a implements Parcelable$Creator	// class@000c2d
{

    public void PhotoJudgementStatusInfo$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new PhotoJudgementStatusInfo$$Parcelable(PhotoJudgementStatusInfo$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       PhotoJudgementStatusInfo$$Parcelable[] $ParcelableA = new PhotoJudgementStatusInfo$$Parcelable[p0];
       return $ParcelableA;
    }
}
