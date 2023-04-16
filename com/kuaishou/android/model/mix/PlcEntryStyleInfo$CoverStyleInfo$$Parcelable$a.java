package com.kuaishou.android.model.mix.PlcEntryStyleInfo$CoverStyleInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$CoverStyleInfo$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$CoverStyleInfo;

public class PlcEntryStyleInfo$CoverStyleInfo$$Parcelable$a implements Parcelable$Creator	// class@000d81
{

    public void PlcEntryStyleInfo$CoverStyleInfo$$Parcelable$a(){
       super();
    }
    public PlcEntryStyleInfo$CoverStyleInfo$$Parcelable a(Parcel p0){
       return new PlcEntryStyleInfo$CoverStyleInfo$$Parcelable(PlcEntryStyleInfo$CoverStyleInfo$$Parcelable.read(p0, new a()));
    }
    public PlcEntryStyleInfo$CoverStyleInfo$$Parcelable[] b(int p0){
       PlcEntryStyleInfo$CoverStyleInfo$$Parcelable[] uCoverStyleI = new PlcEntryStyleInfo$CoverStyleInfo$$Parcelable[p0];
       return uCoverStyleI;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
