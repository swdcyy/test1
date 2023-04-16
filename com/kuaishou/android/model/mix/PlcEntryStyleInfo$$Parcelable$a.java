package com.kuaishou.android.model.mix.PlcEntryStyleInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo;

public class PlcEntryStyleInfo$$Parcelable$a implements Parcelable$Creator	// class@000d6d
{

    public void PlcEntryStyleInfo$$Parcelable$a(){
       super();
    }
    public PlcEntryStyleInfo$$Parcelable a(Parcel p0){
       return new PlcEntryStyleInfo$$Parcelable(PlcEntryStyleInfo$$Parcelable.read(p0, new a()));
    }
    public PlcEntryStyleInfo$$Parcelable[] b(int p0){
       PlcEntryStyleInfo$$Parcelable[] $ParcelableA = new PlcEntryStyleInfo$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
