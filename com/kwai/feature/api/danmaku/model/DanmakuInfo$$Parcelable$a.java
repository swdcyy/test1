package com.kwai.feature.api.danmaku.model.DanmakuInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kwai.feature.api.danmaku.model.DanmakuInfo$$Parcelable;
import xwd.a;
import com.kwai.feature.api.danmaku.model.DanmakuInfo;

public class DanmakuInfo$$Parcelable$a implements Parcelable$Creator	// class@000e77
{

    public void DanmakuInfo$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new DanmakuInfo$$Parcelable(DanmakuInfo$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       DanmakuInfo$$Parcelable[] $ParcelableA = new DanmakuInfo$$Parcelable[p0];
       return $ParcelableA;
    }
}
