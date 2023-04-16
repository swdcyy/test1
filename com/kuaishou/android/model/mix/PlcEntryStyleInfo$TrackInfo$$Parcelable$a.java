package com.kuaishou.android.model.mix.PlcEntryStyleInfo$TrackInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$TrackInfo$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$TrackInfo;

public class PlcEntryStyleInfo$TrackInfo$$Parcelable$a implements Parcelable$Creator	// class@000da8
{

    public void PlcEntryStyleInfo$TrackInfo$$Parcelable$a(){
       super();
    }
    public PlcEntryStyleInfo$TrackInfo$$Parcelable a(Parcel p0){
       return new PlcEntryStyleInfo$TrackInfo$$Parcelable(PlcEntryStyleInfo$TrackInfo$$Parcelable.read(p0, new a()));
    }
    public PlcEntryStyleInfo$TrackInfo$$Parcelable[] b(int p0){
       PlcEntryStyleInfo$TrackInfo$$Parcelable[] trackInfo$$P = new PlcEntryStyleInfo$TrackInfo$$Parcelable[p0];
       return trackInfo$$P;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
