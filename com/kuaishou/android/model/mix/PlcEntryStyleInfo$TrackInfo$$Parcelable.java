package com.kuaishou.android.model.mix.PlcEntryStyleInfo$TrackInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$TrackInfo$$Parcelable$a;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$TrackInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class PlcEntryStyleInfo$TrackInfo$$Parcelable implements Parcelable, d	// class@000da9
{
    public PlcEntryStyleInfo$TrackInfo trackInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PlcEntryStyleInfo$TrackInfo$$Parcelable.CREATOR = new PlcEntryStyleInfo$TrackInfo$$Parcelable$a();
    }
    public void PlcEntryStyleInfo$TrackInfo$$Parcelable(PlcEntryStyleInfo$TrackInfo p0){
       super();
       this.trackInfo$$0 = p0;
    }
    public static PlcEntryStyleInfo$TrackInfo read(Parcel p0,a p1){
       String[] stringArray;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          PlcEntryStyleInfo$TrackInfo trackInfo = new PlcEntryStyleInfo$TrackInfo();
          p1.f(p1.g(), trackInfo);
          int i1 = p0.readInt();
          if (i1 < 0) {
             stringArray = null;
          }else {
             String[] stringArray1 = new String[i1];
             for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
                stringArray1[i2] = p0.readString();
             }
             stringArray = stringArray1;
          }
          trackInfo.mUrls = stringArray;
          trackInfo.mType = p0.readInt();
          p1.f(i, trackInfo);
          return trackInfo;
       }
    }
    public static void write(PlcEntryStyleInfo$TrackInfo p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       int i = -1;
       if (p2 != i) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          PlcEntryStyleInfo$TrackInfo mUrls = p0.mUrls;
          if (mUrls == null) {
             p1.writeInt(i);
          }else {
             p1.writeInt(mUrls.length);
             mUrls = p0.mUrls;
             int len = mUrls.length;
             for (i = 0; i < len; i = i + 1) {
                p1.writeString(mUrls[i]);
             }
          }
          p1.writeInt(p0.mType);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public PlcEntryStyleInfo$TrackInfo getParcel(){
       return this.trackInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PlcEntryStyleInfo$TrackInfo$$Parcelable.write(this.trackInfo$$0, p0, p1, new a());
    }
}
