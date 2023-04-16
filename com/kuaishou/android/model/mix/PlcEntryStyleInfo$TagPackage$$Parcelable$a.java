package com.kuaishou.android.model.mix.PlcEntryStyleInfo$TagPackage$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$TagPackage$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$TagPackage;

public class PlcEntryStyleInfo$TagPackage$$Parcelable$a implements Parcelable$Creator	// class@000da0
{

    public void PlcEntryStyleInfo$TagPackage$$Parcelable$a(){
       super();
    }
    public PlcEntryStyleInfo$TagPackage$$Parcelable a(Parcel p0){
       return new PlcEntryStyleInfo$TagPackage$$Parcelable(PlcEntryStyleInfo$TagPackage$$Parcelable.read(p0, new a()));
    }
    public PlcEntryStyleInfo$TagPackage$$Parcelable[] b(int p0){
       PlcEntryStyleInfo$TagPackage$$Parcelable[] tagPackage$$ = new PlcEntryStyleInfo$TagPackage$$Parcelable[p0];
       return tagPackage$$;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
