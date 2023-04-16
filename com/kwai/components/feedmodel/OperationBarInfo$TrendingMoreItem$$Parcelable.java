package com.kwai.components.feedmodel.OperationBarInfo$TrendingMoreItem$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.components.feedmodel.OperationBarInfo$TrendingMoreItem$$Parcelable$a;
import com.kwai.components.feedmodel.OperationBarInfo$TrendingMoreItem;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class OperationBarInfo$TrendingMoreItem$$Parcelable implements Parcelable, d	// class@000c29
{
    public OperationBarInfo$TrendingMoreItem trendingMoreItem$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       OperationBarInfo$TrendingMoreItem$$Parcelable.CREATOR = new OperationBarInfo$TrendingMoreItem$$Parcelable$a();
    }
    public void OperationBarInfo$TrendingMoreItem$$Parcelable(OperationBarInfo$TrendingMoreItem p0){
       super();
       this.trendingMoreItem$$0 = p0;
    }
    public static OperationBarInfo$TrendingMoreItem read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          OperationBarInfo$TrendingMoreItem trendingMore = new OperationBarInfo$TrendingMoreItem();
          p1.f(p1.g(), trendingMore);
          trendingMore.mLink = p0.readString();
          p1.f(i, trendingMore);
          return trendingMore;
       }
    }
    public static void write(OperationBarInfo$TrendingMoreItem p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mLink);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public OperationBarInfo$TrendingMoreItem getParcel(){
       return this.trendingMoreItem$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       OperationBarInfo$TrendingMoreItem$$Parcelable.write(this.trendingMoreItem$$0, p0, p1, new a());
    }
}
