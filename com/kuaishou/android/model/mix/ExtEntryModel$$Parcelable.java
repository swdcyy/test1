package com.kuaishou.android.model.mix.ExtEntryModel$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.mix.ExtEntryModel$$Parcelable$a;
import com.kuaishou.android.model.mix.ExtEntryModel;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class ExtEntryModel$$Parcelable implements Parcelable, d	// class@000c61
{
    public ExtEntryModel extEntryModel$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       ExtEntryModel$$Parcelable.CREATOR = new ExtEntryModel$$Parcelable$a();
    }
    public void ExtEntryModel$$Parcelable(ExtEntryModel p0){
       super();
       this.extEntryModel$$0 = p0;
    }
    public static ExtEntryModel read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          ExtEntryModel uExtEntryMod = new ExtEntryModel();
          p1.f(p1.g(), uExtEntryMod);
          uExtEntryMod.mEntryUrl = p0.readString();
          uExtEntryMod.mId = p0.readString();
          uExtEntryMod.mKsOrderId = p0.readString();
          uExtEntryMod.mEntryType = p0.readInt();
          uExtEntryMod.mName = p0.readString();
          boolean b = true;
          if (p0.readInt() != b) {
             b = false;
          }
          uExtEntryMod.mRich = b;
          p1.f(i, uExtEntryMod);
          return uExtEntryMod;
       }
    }
    public static void write(ExtEntryModel p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mEntryUrl);
          p1.writeString(p0.mId);
          p1.writeString(p0.mKsOrderId);
          p1.writeInt(p0.mEntryType);
          p1.writeString(p0.mName);
          p1.writeInt(p0.mRich);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public ExtEntryModel getParcel(){
       return this.extEntryModel$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       ExtEntryModel$$Parcelable.write(this.extEntryModel$$0, p0, p1, new a());
    }
}
