package com.yxcorp.gifshow.plugin.impl.search.BannerEntity$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.plugin.impl.search.BannerEntity$$Parcelable$a;
import com.yxcorp.gifshow.plugin.impl.search.BannerEntity;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.util.ArrayList;
import com.yxcorp.gifshow.plugin.impl.search.BannerItemEntity;
import com.yxcorp.gifshow.plugin.impl.search.BannerItemEntity$$Parcelable;
import java.util.List;
import java.util.Iterator;

public class BannerEntity$$Parcelable implements Parcelable, d	// class@000fc9
{
    public BannerEntity bannerEntity$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       BannerEntity$$Parcelable.CREATOR = new BannerEntity$$Parcelable$a();
    }
    public void BannerEntity$$Parcelable(BannerEntity p0){
       super();
       this.bannerEntity$$0 = p0;
    }
    public static BannerEntity read(Parcel p0,a p1){
       List list;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          BannerEntity uBannerEntit = new BannerEntity();
          p1.f(p1.g(), uBannerEntit);
          uBannerEntit.duration = p0.readInt();
          int i1 = p0.readInt();
          if (i1 < 0) {
             list = null;
          }else {
             ArrayList uArrayList = new ArrayList(i1);
             for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
                uArrayList.add(BannerItemEntity$$Parcelable.read(p0, p1));
             }
             list = uArrayList;
          }
          uBannerEntit.mBannerList = list;
          p1.f(i, uBannerEntit);
          return uBannerEntit;
       }
    }
    public static void write(BannerEntity p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.duration);
          BannerEntity mBannerList = p0.mBannerList;
          if (mBannerList == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mBannerList.size());
             Iterator iterator = p0.mBannerList.iterator();
             while (iterator.hasNext()) {
                BannerItemEntity$$Parcelable.write(iterator.next(), p1, p2, p3);
             }
          }
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public BannerEntity getParcel(){
       return this.bannerEntity$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       BannerEntity$$Parcelable.write(this.bannerEntity$$0, p0, p1, new a());
    }
}
