package com.kwai.emotionsdk.bean.EmotionInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kwai.emotionsdk.bean.EmotionInfo$$Parcelable;
import xwd.a;
import com.kwai.emotionsdk.bean.EmotionInfo;

public class EmotionInfo$$Parcelable$a implements Parcelable$Creator	// class@000d78
{

    public void EmotionInfo$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new EmotionInfo$$Parcelable(EmotionInfo$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       EmotionInfo$$Parcelable[] $ParcelableA = new EmotionInfo$$Parcelable[p0];
       return $ParcelableA;
    }
}
