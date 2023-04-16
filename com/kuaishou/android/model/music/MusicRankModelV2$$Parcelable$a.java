package com.kuaishou.android.model.music.MusicRankModelV2$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.music.MusicRankModelV2$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.music.MusicRankModelV2;

public class MusicRankModelV2$$Parcelable$a implements Parcelable$Creator	// class@000e7b
{

    public void MusicRankModelV2$$Parcelable$a(){
       super();
    }
    public MusicRankModelV2$$Parcelable a(Parcel p0){
       return new MusicRankModelV2$$Parcelable(MusicRankModelV2$$Parcelable.read(p0, new a()));
    }
    public MusicRankModelV2$$Parcelable[] b(int p0){
       MusicRankModelV2$$Parcelable[] $ParcelableA = new MusicRankModelV2$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
