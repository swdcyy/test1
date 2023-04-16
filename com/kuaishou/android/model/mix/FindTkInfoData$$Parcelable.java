package com.kuaishou.android.model.mix.FindTkInfoData$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.mix.FindTkInfoData$$Parcelable$a;
import com.kuaishou.android.model.mix.FindTkInfoData;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class FindTkInfoData$$Parcelable implements Parcelable, d	// class@000c84
{
    public FindTkInfoData findTkInfoData$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       FindTkInfoData$$Parcelable.CREATOR = new FindTkInfoData$$Parcelable$a();
    }
    public void FindTkInfoData$$Parcelable(FindTkInfoData p0){
       super();
       this.findTkInfoData$$0 = p0;
    }
    public static FindTkInfoData read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          FindTkInfoData uFindTkInfoD = new FindTkInfoData();
          p1.f(p1.g(), uFindTkInfoD);
          uFindTkInfoD.mLoggerAction = p0.readString();
          uFindTkInfoD.mViewKey = p0.readString();
          uFindTkInfoD.mCardType = p0.readString();
          uFindTkInfoD.mBundleId = p0.readString();
          uFindTkInfoD.mJsonContent = p0.readString();
          p1.f(i, uFindTkInfoD);
          return uFindTkInfoD;
       }
    }
    public static void write(FindTkInfoData p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mLoggerAction);
          p1.writeString(p0.mViewKey);
          p1.writeString(p0.mCardType);
          p1.writeString(p0.mBundleId);
          p1.writeString(p0.mJsonContent);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public FindTkInfoData getParcel(){
       return this.findTkInfoData$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       FindTkInfoData$$Parcelable.write(this.findTkInfoData$$0, p0, p1, new a());
    }
}
