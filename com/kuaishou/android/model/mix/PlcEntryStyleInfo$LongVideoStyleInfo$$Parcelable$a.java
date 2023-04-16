package com.kuaishou.android.model.mix.PlcEntryStyleInfo$LongVideoStyleInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$LongVideoStyleInfo$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$LongVideoStyleInfo;

public class PlcEntryStyleInfo$LongVideoStyleInfo$$Parcelable$a implements Parcelable$Creator	// class@000d8b
{

    public void PlcEntryStyleInfo$LongVideoStyleInfo$$Parcelable$a(){
       super();
    }
    public PlcEntryStyleInfo$LongVideoStyleInfo$$Parcelable a(Parcel p0){
       return new PlcEntryStyleInfo$LongVideoStyleInfo$$Parcelable(PlcEntryStyleInfo$LongVideoStyleInfo$$Parcelable.read(p0, new a()));
    }
    public PlcEntryStyleInfo$LongVideoStyleInfo$$Parcelable[] b(int p0){
       PlcEntryStyleInfo$LongVideoStyleInfo$$Parcelable[] longVideoSty = new PlcEntryStyleInfo$LongVideoStyleInfo$$Parcelable[p0];
       return longVideoSty;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
