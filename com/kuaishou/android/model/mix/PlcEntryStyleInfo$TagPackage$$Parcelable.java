package com.kuaishou.android.model.mix.PlcEntryStyleInfo$TagPackage$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$TagPackage$$Parcelable$a;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$TagPackage;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class PlcEntryStyleInfo$TagPackage$$Parcelable implements Parcelable, d	// class@000da1
{
    public PlcEntryStyleInfo$TagPackage tagPackage$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PlcEntryStyleInfo$TagPackage$$Parcelable.CREATOR = new PlcEntryStyleInfo$TagPackage$$Parcelable$a();
    }
    public void PlcEntryStyleInfo$TagPackage$$Parcelable(PlcEntryStyleInfo$TagPackage p0){
       super();
       this.tagPackage$$0 = p0;
    }
    public static PlcEntryStyleInfo$TagPackage read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          PlcEntryStyleInfo$TagPackage tagPackage = new PlcEntryStyleInfo$TagPackage();
          p1.f(p1.g(), tagPackage);
          tagPackage.mParams = p0.readString();
          tagPackage.mBizEntryTag = p0.readString();
          tagPackage.mName = p0.readString();
          tagPackage.mIdentity = p0.readString();
          tagPackage.mSecondaryType = p0.readString();
          tagPackage.mType = p0.readInt();
          p1.f(i, tagPackage);
          return tagPackage;
       }
    }
    public static void write(PlcEntryStyleInfo$TagPackage p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mParams);
          p1.writeString(p0.mBizEntryTag);
          p1.writeString(p0.mName);
          p1.writeString(p0.mIdentity);
          p1.writeString(p0.mSecondaryType);
          p1.writeInt(p0.mType);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public PlcEntryStyleInfo$TagPackage getParcel(){
       return this.tagPackage$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PlcEntryStyleInfo$TagPackage$$Parcelable.write(this.tagPackage$$0, p0, p1, new a());
    }
}
