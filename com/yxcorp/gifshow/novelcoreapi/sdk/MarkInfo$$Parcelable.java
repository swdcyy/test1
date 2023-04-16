package com.yxcorp.gifshow.novelcoreapi.sdk.MarkInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.novelcoreapi.sdk.MarkInfo$$Parcelable$a;
import com.yxcorp.gifshow.novelcoreapi.sdk.MarkInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class MarkInfo$$Parcelable implements Parcelable, d	// class@0021c0
{
    public MarkInfo markInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       MarkInfo$$Parcelable.CREATOR = new MarkInfo$$Parcelable$a();
    }
    public void MarkInfo$$Parcelable(MarkInfo p0){
       super();
       this.markInfo$$0 = p0;
    }
    public static MarkInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          MarkInfo markInfo = new MarkInfo();
          p1.f(p1.g(), markInfo);
          boolean b = true;
          if (p0.readInt() != b) {
             b = false;
          }
          markInfo.dot = b;
          markInfo.text = p0.readString();
          p1.f(i, markInfo);
          return markInfo;
       }
    }
    public static void write(MarkInfo p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.dot);
          p1.writeString(p0.text);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public MarkInfo getParcel(){
       return this.markInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       MarkInfo$$Parcelable.write(this.markInfo$$0, p0, p1, new a());
    }
}
