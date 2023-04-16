package com.kuaishou.android.model.mix.PlcEntryStyleInfo$TKBundleInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$TKBundleInfo$$Parcelable$a;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$TKBundleInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class PlcEntryStyleInfo$TKBundleInfo$$Parcelable implements Parcelable, d	// class@000d9d
{
    public PlcEntryStyleInfo$TKBundleInfo tKBundleInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PlcEntryStyleInfo$TKBundleInfo$$Parcelable.CREATOR = new PlcEntryStyleInfo$TKBundleInfo$$Parcelable$a();
    }
    public void PlcEntryStyleInfo$TKBundleInfo$$Parcelable(PlcEntryStyleInfo$TKBundleInfo p0){
       super();
       this.tKBundleInfo$$0 = p0;
    }
    public static PlcEntryStyleInfo$TKBundleInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          PlcEntryStyleInfo$TKBundleInfo tKBundleInfo = new PlcEntryStyleInfo$TKBundleInfo();
          p1.f(p1.g(), tKBundleInfo);
          tKBundleInfo.mTKBundleId = p0.readString();
          p1.f(i, tKBundleInfo);
          return tKBundleInfo;
       }
    }
    public static void write(PlcEntryStyleInfo$TKBundleInfo p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mTKBundleId);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public PlcEntryStyleInfo$TKBundleInfo getParcel(){
       return this.tKBundleInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PlcEntryStyleInfo$TKBundleInfo$$Parcelable.write(this.tKBundleInfo$$0, p0, p1, new a());
    }
}
