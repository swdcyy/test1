package com.kuaishou.android.model.mix.PlcEntryStyleInfo$AdEventTrackData$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$AdEventTrackData$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$AdEventTrackData;

public class PlcEntryStyleInfo$AdEventTrackData$$Parcelable$a implements Parcelable$Creator	// class@000d75
{

    public void PlcEntryStyleInfo$AdEventTrackData$$Parcelable$a(){
       super();
    }
    public PlcEntryStyleInfo$AdEventTrackData$$Parcelable a(Parcel p0){
       return new PlcEntryStyleInfo$AdEventTrackData$$Parcelable(PlcEntryStyleInfo$AdEventTrackData$$Parcelable.read(p0, new a()));
    }
    public PlcEntryStyleInfo$AdEventTrackData$$Parcelable[] b(int p0){
       PlcEntryStyleInfo$AdEventTrackData$$Parcelable[] uAdEventTrac = new PlcEntryStyleInfo$AdEventTrackData$$Parcelable[p0];
       return uAdEventTrac;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
