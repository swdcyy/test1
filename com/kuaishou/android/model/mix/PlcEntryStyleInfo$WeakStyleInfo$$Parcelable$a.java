package com.kuaishou.android.model.mix.PlcEntryStyleInfo$WeakStyleInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$WeakStyleInfo$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$WeakStyleInfo;

public class PlcEntryStyleInfo$WeakStyleInfo$$Parcelable$a implements Parcelable$Creator	// class@000daf
{

    public void PlcEntryStyleInfo$WeakStyleInfo$$Parcelable$a(){
       super();
    }
    public PlcEntryStyleInfo$WeakStyleInfo$$Parcelable a(Parcel p0){
       return new PlcEntryStyleInfo$WeakStyleInfo$$Parcelable(PlcEntryStyleInfo$WeakStyleInfo$$Parcelable.read(p0, new a()));
    }
    public PlcEntryStyleInfo$WeakStyleInfo$$Parcelable[] b(int p0){
       PlcEntryStyleInfo$WeakStyleInfo$$Parcelable[] weakStyleInf = new PlcEntryStyleInfo$WeakStyleInfo$$Parcelable[p0];
       return weakStyleInf;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
