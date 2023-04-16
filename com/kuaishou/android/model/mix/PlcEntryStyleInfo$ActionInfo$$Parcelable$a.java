package com.kuaishou.android.model.mix.PlcEntryStyleInfo$ActionInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$ActionInfo$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$ActionInfo;

public class PlcEntryStyleInfo$ActionInfo$$Parcelable$a implements Parcelable$Creator	// class@000d6f
{

    public void PlcEntryStyleInfo$ActionInfo$$Parcelable$a(){
       super();
    }
    public PlcEntryStyleInfo$ActionInfo$$Parcelable a(Parcel p0){
       return new PlcEntryStyleInfo$ActionInfo$$Parcelable(PlcEntryStyleInfo$ActionInfo$$Parcelable.read(p0, new a()));
    }
    public PlcEntryStyleInfo$ActionInfo$$Parcelable[] b(int p0){
       PlcEntryStyleInfo$ActionInfo$$Parcelable[] uActionInfo$ = new PlcEntryStyleInfo$ActionInfo$$Parcelable[p0];
       return uActionInfo$;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
