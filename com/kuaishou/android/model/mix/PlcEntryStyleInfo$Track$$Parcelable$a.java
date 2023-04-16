package com.kuaishou.android.model.mix.PlcEntryStyleInfo$Track$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$Track$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$Track;

public class PlcEntryStyleInfo$Track$$Parcelable$a implements Parcelable$Creator	// class@000da4
{

    public void PlcEntryStyleInfo$Track$$Parcelable$a(){
       super();
    }
    public PlcEntryStyleInfo$Track$$Parcelable a(Parcel p0){
       return new PlcEntryStyleInfo$Track$$Parcelable(PlcEntryStyleInfo$Track$$Parcelable.read(p0, new a()));
    }
    public PlcEntryStyleInfo$Track$$Parcelable[] b(int p0){
       PlcEntryStyleInfo$Track$$Parcelable[] track$$Parce = new PlcEntryStyleInfo$Track$$Parcelable[p0];
       return track$$Parce;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
