package com.kuaishou.android.model.mix.PlcEntryStyleInfo$BizData$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$BizData$$Parcelable$a;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$BizData;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class PlcEntryStyleInfo$BizData$$Parcelable implements Parcelable, d	// class@000d7a
{
    public PlcEntryStyleInfo$BizData bizData$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PlcEntryStyleInfo$BizData$$Parcelable.CREATOR = new PlcEntryStyleInfo$BizData$$Parcelable$a();
    }
    public void PlcEntryStyleInfo$BizData$$Parcelable(PlcEntryStyleInfo$BizData p0){
       super();
       this.bizData$$0 = p0;
    }
    public static PlcEntryStyleInfo$BizData read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          PlcEntryStyleInfo$BizData uBizData = new PlcEntryStyleInfo$BizData();
          p1.f(p1.g(), uBizData);
          uBizData.mLiveSubscribeInfo = p0.readString();
          p1.f(i, uBizData);
          return uBizData;
       }
    }
    public static void write(PlcEntryStyleInfo$BizData p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mLiveSubscribeInfo);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public PlcEntryStyleInfo$BizData getParcel(){
       return this.bizData$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PlcEntryStyleInfo$BizData$$Parcelable.write(this.bizData$$0, p0, p1, new a());
    }
}
