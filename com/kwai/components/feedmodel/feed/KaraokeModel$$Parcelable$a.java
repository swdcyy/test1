package com.kwai.components.feedmodel.feed.KaraokeModel$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kwai.components.feedmodel.feed.KaraokeModel$$Parcelable;
import xwd.a;
import com.kwai.components.feedmodel.feed.KaraokeModel;

public class KaraokeModel$$Parcelable$a implements Parcelable$Creator	// class@000c49
{

    public void KaraokeModel$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new KaraokeModel$$Parcelable(KaraokeModel$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       KaraokeModel$$Parcelable[] $ParcelableA = new KaraokeModel$$Parcelable[p0];
       return $ParcelableA;
    }
}
