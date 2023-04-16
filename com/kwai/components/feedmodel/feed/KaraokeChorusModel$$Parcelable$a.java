package com.kwai.components.feedmodel.feed.KaraokeChorusModel$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kwai.components.feedmodel.feed.KaraokeChorusModel$$Parcelable;
import xwd.a;
import com.kwai.components.feedmodel.feed.KaraokeChorusModel;

public class KaraokeChorusModel$$Parcelable$a implements Parcelable$Creator	// class@000c46
{

    public void KaraokeChorusModel$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new KaraokeChorusModel$$Parcelable(KaraokeChorusModel$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       KaraokeChorusModel$$Parcelable[] $ParcelableA = new KaraokeChorusModel$$Parcelable[p0];
       return $ParcelableA;
    }
}
