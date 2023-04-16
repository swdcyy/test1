package com.kuaishou.android.model.mix.PlcEntryStyleInfo$StrongStyleInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$StrongStyleInfo$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$StrongStyleInfo;

public class PlcEntryStyleInfo$StrongStyleInfo$$Parcelable$a implements Parcelable$Creator	// class@000d90
{

    public void PlcEntryStyleInfo$StrongStyleInfo$$Parcelable$a(){
       super();
    }
    public PlcEntryStyleInfo$StrongStyleInfo$$Parcelable a(Parcel p0){
       return new PlcEntryStyleInfo$StrongStyleInfo$$Parcelable(PlcEntryStyleInfo$StrongStyleInfo$$Parcelable.read(p0, new a()));
    }
    public PlcEntryStyleInfo$StrongStyleInfo$$Parcelable[] b(int p0){
       PlcEntryStyleInfo$StrongStyleInfo$$Parcelable[] strongStyleI = new PlcEntryStyleInfo$StrongStyleInfo$$Parcelable[p0];
       return strongStyleI;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
