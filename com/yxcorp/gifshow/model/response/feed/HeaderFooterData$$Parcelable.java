package com.yxcorp.gifshow.model.response.feed.HeaderFooterData$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.model.response.feed.HeaderFooterData$$Parcelable$a;
import com.yxcorp.gifshow.model.response.feed.HeaderFooterData;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.lang.Class;
import org.parceler.a;

public class HeaderFooterData$$Parcelable implements Parcelable, d	// class@001f89
{
    public HeaderFooterData headerFooterData$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       HeaderFooterData$$Parcelable.CREATOR = new HeaderFooterData$$Parcelable$a();
    }
    public void HeaderFooterData$$Parcelable(HeaderFooterData p0){
       super();
       this.headerFooterData$$0 = p0;
    }
    public static HeaderFooterData read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          HeaderFooterData headerFooter = new HeaderFooterData();
          p1.f(p1.g(), headerFooter);
          a.d(HeaderFooterData.class, headerFooter, "mJsonContent", p0.readString());
          p1.f(i, headerFooter);
          return headerFooter;
       }
    }
    public static void write(HeaderFooterData p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(a.b(String.class, HeaderFooterData.class, p0, "mJsonContent"));
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public HeaderFooterData getParcel(){
       return this.headerFooterData$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       HeaderFooterData$$Parcelable.write(this.headerFooterData$$0, p0, p1, new a());
    }
}
