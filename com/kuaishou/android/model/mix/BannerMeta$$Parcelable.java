package com.kuaishou.android.model.mix.BannerMeta$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.mix.BannerMeta$$Parcelable$a;
import com.kuaishou.android.model.mix.BannerMeta;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class BannerMeta$$Parcelable implements Parcelable, d	// class@000bcc
{
    public BannerMeta bannerMeta$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       BannerMeta$$Parcelable.CREATOR = new BannerMeta$$Parcelable$a();
    }
    public void BannerMeta$$Parcelable(BannerMeta p0){
       super();
       this.bannerMeta$$0 = p0;
    }
    public static BannerMeta read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          BannerMeta uBannerMeta = new BannerMeta();
          p1.f(p1.g(), uBannerMeta);
          uBannerMeta.mContent = p0.readString();
          uBannerMeta.mBannerType = p0.readInt();
          p1.f(i, uBannerMeta);
          return uBannerMeta;
       }
    }
    public static void write(BannerMeta p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mContent);
          p1.writeInt(p0.mBannerType);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public BannerMeta getParcel(){
       return this.bannerMeta$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       BannerMeta$$Parcelable.write(this.bannerMeta$$0, p0, p1, new a());
    }
}
