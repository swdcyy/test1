package com.kwai.components.feedmodel.BottomEntryInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.components.feedmodel.BottomEntryInfo$$Parcelable$a;
import com.kwai.components.feedmodel.BottomEntryInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.model.CDNUrl$$Parcelable;

public class BottomEntryInfo$$Parcelable implements Parcelable, d	// class@000c11
{
    public BottomEntryInfo bottomEntryInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       BottomEntryInfo$$Parcelable.CREATOR = new BottomEntryInfo$$Parcelable$a();
    }
    public void BottomEntryInfo$$Parcelable(BottomEntryInfo p0){
       super();
       this.bottomEntryInfo$$0 = p0;
    }
    public static BottomEntryInfo read(Parcel p0,a p1){
       CDNUrl[] uCDNUrlArray;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          BottomEntryInfo uBottomEntry = new BottomEntryInfo();
          p1.f(p1.g(), uBottomEntry);
          uBottomEntry.mIconWidth = p0.readInt();
          uBottomEntry.mLink = p0.readString();
          uBottomEntry.mTraceParams = p0.readString();
          uBottomEntry.mIconHeight = p0.readInt();
          uBottomEntry.mDescTextColor = p0.readString();
          uBottomEntry.mDesc = p0.readString();
          int i1 = p0.readInt();
          if (i1 < 0) {
             uCDNUrlArray = null;
          }else {
             CDNUrl[] uCDNUrlArray1 = new CDNUrl[i1];
             for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
                uCDNUrlArray1[i2] = CDNUrl$$Parcelable.read(p0, p1);
             }
             uCDNUrlArray = uCDNUrlArray1;
          }
          uBottomEntry.mIconUrl = uCDNUrlArray;
          p1.f(i, uBottomEntry);
          return uBottomEntry;
       }
    }
    public static void write(BottomEntryInfo p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       int i1 = -1;
       if (i != i1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mIconWidth);
          p1.writeString(p0.mLink);
          p1.writeString(p0.mTraceParams);
          p1.writeInt(p0.mIconHeight);
          p1.writeString(p0.mDescTextColor);
          p1.writeString(p0.mDesc);
          BottomEntryInfo mIconUrl = p0.mIconUrl;
          if (mIconUrl == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mIconUrl.length);
             p0 = p0.mIconUrl;
             i = p0.length;
             for (i1 = 0; i1 < i; i1 = i1 + 1) {
                CDNUrl$$Parcelable.write(p0[i1], p1, p2, p3);
             }
          }
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public BottomEntryInfo getParcel(){
       return this.bottomEntryInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       BottomEntryInfo$$Parcelable.write(this.bottomEntryInfo$$0, p0, p1, new a());
    }
}
