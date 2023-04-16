package com.kuaishou.android.model.music.MusicWheelInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.music.MusicWheelInfo$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.music.MusicWheelInfo;

public class MusicWheelInfo$$Parcelable$a implements Parcelable$Creator	// class@000e83
{

    public void MusicWheelInfo$$Parcelable$a(){
       super();
    }
    public MusicWheelInfo$$Parcelable a(Parcel p0){
       return new MusicWheelInfo$$Parcelable(MusicWheelInfo$$Parcelable.read(p0, new a()));
    }
    public MusicWheelInfo$$Parcelable[] b(int p0){
       MusicWheelInfo$$Parcelable[] $ParcelableA = new MusicWheelInfo$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
