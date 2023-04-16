package com.kuaishou.android.model.mix.PlcEntryStyleInfo$EventTrackData$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$EventTrackData$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$EventTrackData;

public class PlcEntryStyleInfo$EventTrackData$$Parcelable$a implements Parcelable$Creator	// class@000d87
{

    public void PlcEntryStyleInfo$EventTrackData$$Parcelable$a(){
       super();
    }
    public PlcEntryStyleInfo$EventTrackData$$Parcelable a(Parcel p0){
       return new PlcEntryStyleInfo$EventTrackData$$Parcelable(PlcEntryStyleInfo$EventTrackData$$Parcelable.read(p0, new a()));
    }
    public PlcEntryStyleInfo$EventTrackData$$Parcelable[] b(int p0){
       PlcEntryStyleInfo$EventTrackData$$Parcelable[] uEventTrackD = new PlcEntryStyleInfo$EventTrackData$$Parcelable[p0];
       return uEventTrackD;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
