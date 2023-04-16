package com.kwai.components.feedmodel.OperationBarInfo$GeneralInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.components.feedmodel.OperationBarInfo$GeneralInfo$$Parcelable$a;
import com.kwai.components.feedmodel.OperationBarInfo$GeneralInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class OperationBarInfo$GeneralInfo$$Parcelable implements Parcelable, d	// class@000c1f
{
    public OperationBarInfo$GeneralInfo generalInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       OperationBarInfo$GeneralInfo$$Parcelable.CREATOR = new OperationBarInfo$GeneralInfo$$Parcelable$a();
    }
    public void OperationBarInfo$GeneralInfo$$Parcelable(OperationBarInfo$GeneralInfo p0){
       super();
       this.generalInfo$$0 = p0;
    }
    public static OperationBarInfo$GeneralInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          OperationBarInfo$GeneralInfo generalInfo = new OperationBarInfo$GeneralInfo();
          p1.f(p1.g(), generalInfo);
          generalInfo.mTrendingCount = p0.readInt();
          generalInfo.mIndex = p0.readInt();
          generalInfo.mWord = p0.readString();
          p1.f(i, generalInfo);
          return generalInfo;
       }
    }
    public static void write(OperationBarInfo$GeneralInfo p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mTrendingCount);
          p1.writeInt(p0.mIndex);
          p1.writeString(p0.mWord);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public OperationBarInfo$GeneralInfo getParcel(){
       return this.generalInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       OperationBarInfo$GeneralInfo$$Parcelable.write(this.generalInfo$$0, p0, p1, new a());
    }
}
