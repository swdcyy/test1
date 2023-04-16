package com.yxcorp.gifshow.dialog.flowdialog.FreeTrafficDialogParam$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.dialog.flowdialog.FreeTrafficDialogParam$$Parcelable$a;
import com.yxcorp.gifshow.dialog.flowdialog.FreeTrafficDialogParam;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.io.Serializable;
import com.yxcorp.gifshow.model.FreeTrafficDialogModel;

public class FreeTrafficDialogParam$$Parcelable implements Parcelable, d	// class@001a9e
{
    public FreeTrafficDialogParam freeTrafficDialogParam$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       FreeTrafficDialogParam$$Parcelable.CREATOR = new FreeTrafficDialogParam$$Parcelable$a();
    }
    public void FreeTrafficDialogParam$$Parcelable(FreeTrafficDialogParam p0){
       super();
       this.freeTrafficDialogParam$$0 = p0;
    }
    public static FreeTrafficDialogParam read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          FreeTrafficDialogParam uFreeTraffic = new FreeTrafficDialogParam();
          p1.f(p1.g(), uFreeTraffic);
          uFreeTraffic.mCardName = p0.readString();
          uFreeTraffic.mFreeTrafficDialogModel = p0.readSerializable();
          uFreeTraffic.mFreeTrafficMode = p0.readInt();
          p1.f(i, uFreeTraffic);
          return uFreeTraffic;
       }
    }
    public static void write(FreeTrafficDialogParam p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mCardName);
          p1.writeSerializable(p0.mFreeTrafficDialogModel);
          p1.writeInt(p0.mFreeTrafficMode);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public FreeTrafficDialogParam getParcel(){
       return this.freeTrafficDialogParam$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       FreeTrafficDialogParam$$Parcelable.write(this.freeTrafficDialogParam$$0, p0, p1, new a());
    }
}
