package com.kwai.components.feedmodel.KwaiCoinTaskInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kwai.components.feedmodel.KwaiCoinTaskInfo$$Parcelable;
import xwd.a;
import com.kwai.components.feedmodel.KwaiCoinTaskInfo;

public class KwaiCoinTaskInfo$$Parcelable$a implements Parcelable$Creator	// class@000c18
{

    public void KwaiCoinTaskInfo$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new KwaiCoinTaskInfo$$Parcelable(KwaiCoinTaskInfo$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       KwaiCoinTaskInfo$$Parcelable[] $ParcelableA = new KwaiCoinTaskInfo$$Parcelable[p0];
       return $ParcelableA;
    }
}
