package com.yxcorp.gifshow.tube.TubeBannerInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.tube.TubeBannerInfo$$Parcelable$a;
import com.yxcorp.gifshow.tube.TubeBannerInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.util.ArrayList;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.model.CDNUrl$$Parcelable;
import java.util.Iterator;

public class TubeBannerInfo$$Parcelable implements Parcelable, d	// class@001dfe
{
    public TubeBannerInfo tubeBannerInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       TubeBannerInfo$$Parcelable.CREATOR = new TubeBannerInfo$$Parcelable$a();
    }
    public void TubeBannerInfo$$Parcelable(TubeBannerInfo p0){
       super();
       this.tubeBannerInfo$$0 = p0;
    }
    public static TubeBannerInfo read(Parcel p0,a p1){
       ArrayList uArrayList;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          TubeBannerInfo tubeBannerIn = new TubeBannerInfo();
          p1.f(p1.g(), tubeBannerIn);
          tubeBannerIn.bannerId = p0.readInt();
          int i1 = p0.readInt();
          boolean b = false;
          if (i1 < 0) {
             uArrayList = null;
          }else {
             ArrayList uArrayList1 = new ArrayList(i1);
             for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
                uArrayList1.add(CDNUrl$$Parcelable.read(p0, p1));
             }
             uArrayList = uArrayList1;
          }
          tubeBannerIn.imageUrls = uArrayList;
          tubeBannerIn.actionUrl = p0.readString();
          if (p0.readInt() == 1) {
             b = true;
          }
          tubeBannerIn.hadShowed = b;
          p1.f(i, tubeBannerIn);
          return tubeBannerIn;
       }
    }
    public static void write(TubeBannerInfo p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       int i1 = -1;
       if (i != i1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.bannerId);
          TubeBannerInfo imageUrls = p0.imageUrls;
          if (imageUrls == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(imageUrls.size());
             Iterator iterator = p0.imageUrls.iterator();
             while (iterator.hasNext()) {
                CDNUrl$$Parcelable.write(iterator.next(), p1, p2, p3);
             }
          }
          p1.writeString(p0.actionUrl);
          p1.writeInt(p0.hadShowed);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public TubeBannerInfo getParcel(){
       return this.tubeBannerInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       TubeBannerInfo$$Parcelable.write(this.tubeBannerInfo$$0, p0, p1, new a());
    }
}
