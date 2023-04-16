package com.kwai.components.feedmodel.feed.KaraokeScoreInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kwai.components.feedmodel.feed.KaraokeScoreInfo$$Parcelable;
import xwd.a;
import com.kwai.components.feedmodel.feed.KaraokeScoreInfo;

public class KaraokeScoreInfo$$Parcelable$a implements Parcelable$Creator	// class@000c4f
{

    public void KaraokeScoreInfo$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new KaraokeScoreInfo$$Parcelable(KaraokeScoreInfo$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       KaraokeScoreInfo$$Parcelable[] $ParcelableA = new KaraokeScoreInfo$$Parcelable[p0];
       return $ParcelableA;
    }
}
