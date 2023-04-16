package com.yxcorp.gifshow.model.response.feed.HeaderFooterInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.model.response.feed.HeaderFooterInfo$$Parcelable$a;
import com.yxcorp.gifshow.model.response.feed.HeaderFooterInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.yxcorp.gifshow.model.response.feed.HeaderFooterData;
import com.yxcorp.gifshow.model.response.feed.HeaderFooterData$$Parcelable;
import java.lang.Class;
import org.parceler.a;

public class HeaderFooterInfo$$Parcelable implements Parcelable, d	// class@001f8d
{
    public HeaderFooterInfo headerFooterInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       HeaderFooterInfo$$Parcelable.CREATOR = new HeaderFooterInfo$$Parcelable$a();
    }
    public void HeaderFooterInfo$$Parcelable(HeaderFooterInfo p0){
       super();
       this.headerFooterInfo$$0 = p0;
    }
    public static HeaderFooterInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          HeaderFooterInfo headerFooter = new HeaderFooterInfo();
          p1.f(p1.g(), headerFooter);
          a.d(HeaderFooterInfo.class, headerFooter, "mFooterData", HeaderFooterData$$Parcelable.read(p0, p1));
          a.d(HeaderFooterInfo.class, headerFooter, "mHeaderData", HeaderFooterData$$Parcelable.read(p0, p1));
          p1.f(i, headerFooter);
          return headerFooter;
       }
    }
    public static void write(HeaderFooterInfo p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          HeaderFooterData$$Parcelable.write(a.b(HeaderFooterData.class, HeaderFooterInfo.class, p0, "mFooterData"), p1, p2, p3);
          HeaderFooterData$$Parcelable.write(a.b(HeaderFooterData.class, HeaderFooterInfo.class, p0, "mHeaderData"), p1, p2, p3);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public HeaderFooterInfo getParcel(){
       return this.headerFooterInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       HeaderFooterInfo$$Parcelable.write(this.headerFooterInfo$$0, p0, p1, new a());
    }
}
