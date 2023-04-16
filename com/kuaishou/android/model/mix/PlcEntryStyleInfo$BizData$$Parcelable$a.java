package com.kuaishou.android.model.mix.PlcEntryStyleInfo$BizData$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$BizData$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$BizData;

public class PlcEntryStyleInfo$BizData$$Parcelable$a implements Parcelable$Creator	// class@000d79
{

    public void PlcEntryStyleInfo$BizData$$Parcelable$a(){
       super();
    }
    public PlcEntryStyleInfo$BizData$$Parcelable a(Parcel p0){
       return new PlcEntryStyleInfo$BizData$$Parcelable(PlcEntryStyleInfo$BizData$$Parcelable.read(p0, new a()));
    }
    public PlcEntryStyleInfo$BizData$$Parcelable[] b(int p0){
       PlcEntryStyleInfo$BizData$$Parcelable[] uBizData$$Pa = new PlcEntryStyleInfo$BizData$$Parcelable[p0];
       return uBizData$$Pa;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
