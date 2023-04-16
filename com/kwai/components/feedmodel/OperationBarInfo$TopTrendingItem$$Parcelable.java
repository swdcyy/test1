package com.kwai.components.feedmodel.OperationBarInfo$TopTrendingItem$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.components.feedmodel.OperationBarInfo$TopTrendingItem$$Parcelable$a;
import com.kwai.components.feedmodel.OperationBarInfo$TopTrendingItem;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.model.CDNUrl$$Parcelable;

public class OperationBarInfo$TopTrendingItem$$Parcelable implements Parcelable, d	// class@000c26
{
    public OperationBarInfo$TopTrendingItem topTrendingItem$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       OperationBarInfo$TopTrendingItem$$Parcelable.CREATOR = new OperationBarInfo$TopTrendingItem$$Parcelable$a();
    }
    public void OperationBarInfo$TopTrendingItem$$Parcelable(OperationBarInfo$TopTrendingItem p0){
       super();
       this.topTrendingItem$$0 = p0;
    }
    public static OperationBarInfo$TopTrendingItem read(Parcel p0,a p1){
       CDNUrl[] uCDNUrlArray;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          OperationBarInfo$TopTrendingItem topTrendingI = new OperationBarInfo$TopTrendingItem();
          p1.f(p1.g(), topTrendingI);
          topTrendingI.mLink = p0.readString();
          int i1 = 0;
          boolean b = true;
          if (p0.readInt() != b) {
             b = false;
          }
          topTrendingI.isSelected = b;
          topTrendingI.mId = p0.readString();
          int i2 = p0.readInt();
          if (i2 < 0) {
             uCDNUrlArray = null;
          }else {
             CDNUrl[] uCDNUrlArray1 = new CDNUrl[i2];
             for (; i1 < i2; i1 = i1 + 1) {
                uCDNUrlArray1[i1] = CDNUrl$$Parcelable.read(p0, p1);
             }
             uCDNUrlArray = uCDNUrlArray1;
          }
          topTrendingI.mCover = uCDNUrlArray;
          topTrendingI.mRank = p0.readString();
          p1.f(i, topTrendingI);
          return topTrendingI;
       }
    }
    public static void write(OperationBarInfo$TopTrendingItem p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       int i1 = -1;
       if (i != i1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mLink);
          p1.writeInt(p0.isSelected);
          p1.writeString(p0.mId);
          OperationBarInfo$TopTrendingItem mCover = p0.mCover;
          if (mCover == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mCover.length);
             mCover = p0.mCover;
             i1 = mCover.length;
             for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
                CDNUrl$$Parcelable.write(mCover[i2], p1, p2, p3);
             }
          }
          p1.writeString(p0.mRank);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public OperationBarInfo$TopTrendingItem getParcel(){
       return this.topTrendingItem$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       OperationBarInfo$TopTrendingItem$$Parcelable.write(this.topTrendingItem$$0, p0, p1, new a());
    }
}
