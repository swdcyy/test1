package com.kuaishou.android.model.mix.PlcEntryStyleInfo$StrongStyleItem$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$StrongStyleItem$$Parcelable$a;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$StrongStyleItem;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$TagPackage;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$TagPackage$$Parcelable;

public class PlcEntryStyleInfo$StrongStyleItem$$Parcelable implements Parcelable, d	// class@000d95
{
    public PlcEntryStyleInfo$StrongStyleItem strongStyleItem$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PlcEntryStyleInfo$StrongStyleItem$$Parcelable.CREATOR = new PlcEntryStyleInfo$StrongStyleItem$$Parcelable$a();
    }
    public void PlcEntryStyleInfo$StrongStyleItem$$Parcelable(PlcEntryStyleInfo$StrongStyleItem p0){
       super();
       this.strongStyleItem$$0 = p0;
    }
    public static PlcEntryStyleInfo$StrongStyleItem read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          PlcEntryStyleInfo$StrongStyleItem strongStyleI = new PlcEntryStyleInfo$StrongStyleItem();
          p1.f(p1.g(), strongStyleI);
          strongStyleI.mTagPackage = PlcEntryStyleInfo$TagPackage$$Parcelable.read(p0, p1);
          strongStyleI.mTopLeftCornerText = p0.readString();
          strongStyleI.mTitle = p0.readString();
          strongStyleI.mSubTitle = p0.readString();
          strongStyleI.mIconUrl = p0.readString();
          p1.f(i, strongStyleI);
          return strongStyleI;
       }
    }
    public static void write(PlcEntryStyleInfo$StrongStyleItem p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          PlcEntryStyleInfo$TagPackage$$Parcelable.write(p0.mTagPackage, p1, p2, p3);
          p1.writeString(p0.mTopLeftCornerText);
          p1.writeString(p0.mTitle);
          p1.writeString(p0.mSubTitle);
          p1.writeString(p0.mIconUrl);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public PlcEntryStyleInfo$StrongStyleItem getParcel(){
       return this.strongStyleItem$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PlcEntryStyleInfo$StrongStyleItem$$Parcelable.write(this.strongStyleItem$$0, p0, p1, new a());
    }
}
