package com.kuaishou.android.model.mix.PlcEntryStyleInfo$StrongStyleItem$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$StrongStyleItem$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$StrongStyleItem;

public class PlcEntryStyleInfo$StrongStyleItem$$Parcelable$a implements Parcelable$Creator	// class@000d94
{

    public void PlcEntryStyleInfo$StrongStyleItem$$Parcelable$a(){
       super();
    }
    public PlcEntryStyleInfo$StrongStyleItem$$Parcelable a(Parcel p0){
       return new PlcEntryStyleInfo$StrongStyleItem$$Parcelable(PlcEntryStyleInfo$StrongStyleItem$$Parcelable.read(p0, new a()));
    }
    public PlcEntryStyleInfo$StrongStyleItem$$Parcelable[] b(int p0){
       PlcEntryStyleInfo$StrongStyleItem$$Parcelable[] strongStyleI = new PlcEntryStyleInfo$StrongStyleItem$$Parcelable[p0];
       return strongStyleI;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
