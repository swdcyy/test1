package com.kuaishou.android.model.music.MusicRankModel$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.music.MusicRankModel$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.music.MusicRankModel;

public class MusicRankModel$$Parcelable$a implements Parcelable$Creator	// class@000e78
{

    public void MusicRankModel$$Parcelable$a(){
       super();
    }
    public MusicRankModel$$Parcelable a(Parcel p0){
       return new MusicRankModel$$Parcelable(MusicRankModel$$Parcelable.read(p0, new a()));
    }
    public MusicRankModel$$Parcelable[] b(int p0){
       MusicRankModel$$Parcelable[] $ParcelableA = new MusicRankModel$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
