package com.kuaishou.android.model.music.Music$BeatInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.music.Music$BeatInfo$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.music.Music$BeatInfo;

public class Music$BeatInfo$$Parcelable$a implements Parcelable$Creator	// class@000e51
{

    public void Music$BeatInfo$$Parcelable$a(){
       super();
    }
    public Music$BeatInfo$$Parcelable a(Parcel p0){
       return new Music$BeatInfo$$Parcelable(Music$BeatInfo$$Parcelable.read(p0, new a()));
    }
    public Music$BeatInfo$$Parcelable[] b(int p0){
       Music$BeatInfo$$Parcelable[] uBeatInfo$$P = new Music$BeatInfo$$Parcelable[p0];
       return uBeatInfo$$P;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
