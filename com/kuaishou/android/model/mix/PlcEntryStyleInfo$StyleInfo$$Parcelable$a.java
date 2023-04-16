package com.kuaishou.android.model.mix.PlcEntryStyleInfo$StyleInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$StyleInfo$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$StyleInfo;

public class PlcEntryStyleInfo$StyleInfo$$Parcelable$a implements Parcelable$Creator	// class@000d98
{

    public void PlcEntryStyleInfo$StyleInfo$$Parcelable$a(){
       super();
    }
    public PlcEntryStyleInfo$StyleInfo$$Parcelable a(Parcel p0){
       return new PlcEntryStyleInfo$StyleInfo$$Parcelable(PlcEntryStyleInfo$StyleInfo$$Parcelable.read(p0, new a()));
    }
    public PlcEntryStyleInfo$StyleInfo$$Parcelable[] b(int p0){
       PlcEntryStyleInfo$StyleInfo$$Parcelable[] styleInfo$$P = new PlcEntryStyleInfo$StyleInfo$$Parcelable[p0];
       return styleInfo$$P;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
