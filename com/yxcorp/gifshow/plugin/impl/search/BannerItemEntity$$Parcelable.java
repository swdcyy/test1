package com.yxcorp.gifshow.plugin.impl.search.BannerItemEntity$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.plugin.impl.search.BannerItemEntity$$Parcelable$a;
import com.yxcorp.gifshow.plugin.impl.search.BannerItemEntity;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.yxcorp.gifshow.plugin.impl.search.BannerItemEntity$IconEntity;
import com.yxcorp.gifshow.plugin.impl.search.BannerItemEntity$IconEntity$$Parcelable;

public class BannerItemEntity$$Parcelable implements Parcelable, d	// class@000fcc
{
    public BannerItemEntity bannerItemEntity$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       BannerItemEntity$$Parcelable.CREATOR = new BannerItemEntity$$Parcelable$a();
    }
    public void BannerItemEntity$$Parcelable(BannerItemEntity p0){
       super();
       this.bannerItemEntity$$0 = p0;
    }
    public static BannerItemEntity read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          BannerItemEntity uBannerItemE = new BannerItemEntity();
          p1.f(p1.g(), uBannerItemE);
          boolean b = false;
          boolean b1 = (p0.readInt() == 1)? true: false;
          uBannerItemE.mSearchShowReported = b1;
          uBannerItemE.mPromotion = p0.readString();
          uBannerItemE.mBannerId = p0.readInt();
          if (p0.readInt() == 1) {
             b = true;
          }
          uBannerItemE.mShowReported = b;
          uBannerItemE.mItemImg = BannerItemEntity$IconEntity$$Parcelable.read(p0, p1);
          p1.f(i, uBannerItemE);
          return uBannerItemE;
       }
    }
    public static void write(BannerItemEntity p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mSearchShowReported);
          p1.writeString(p0.mPromotion);
          p1.writeInt(p0.mBannerId);
          p1.writeInt(p0.mShowReported);
          BannerItemEntity$IconEntity$$Parcelable.write(p0.mItemImg, p1, p2, p3);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public BannerItemEntity getParcel(){
       return this.bannerItemEntity$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       BannerItemEntity$$Parcelable.write(this.bannerItemEntity$$0, p0, p1, new a());
    }
}