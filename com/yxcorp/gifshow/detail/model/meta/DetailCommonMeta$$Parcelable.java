package com.yxcorp.gifshow.detail.model.meta.DetailCommonMeta$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.detail.model.meta.DetailCommonMeta$$Parcelable$a;
import com.yxcorp.gifshow.detail.model.meta.DetailCommonMeta;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.yxcorp.gifshow.detail.model.meta.SharePhotoRecommendModel;
import com.yxcorp.gifshow.detail.model.meta.SharePhotoRecommendModel$$Parcelable;
import com.yxcorp.gifshow.detail.model.meta.OnlineStateTag;
import com.yxcorp.gifshow.detail.model.meta.OnlineStateTag$$Parcelable;

public class DetailCommonMeta$$Parcelable implements Parcelable, d	// class@001592
{
    public DetailCommonMeta detailCommonMeta$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       DetailCommonMeta$$Parcelable.CREATOR = new DetailCommonMeta$$Parcelable$a();
    }
    public void DetailCommonMeta$$Parcelable(DetailCommonMeta p0){
       super();
       this.detailCommonMeta$$0 = p0;
    }
    public static DetailCommonMeta read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          DetailCommonMeta uDetailCommo = new DetailCommonMeta();
          p1.f(p1.g(), uDetailCommo);
          uDetailCommo.mSharePhotoRecommend = SharePhotoRecommendModel$$Parcelable.read(p0, p1);
          uDetailCommo.mOnlineStateTag = OnlineStateTag$$Parcelable.read(p0, p1);
          p1.f(i, uDetailCommo);
          return uDetailCommo;
       }
    }
    public static void write(DetailCommonMeta p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          SharePhotoRecommendModel$$Parcelable.write(p0.mSharePhotoRecommend, p1, p2, p3);
          OnlineStateTag$$Parcelable.write(p0.mOnlineStateTag, p1, p2, p3);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public DetailCommonMeta getParcel(){
       return this.detailCommonMeta$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       DetailCommonMeta$$Parcelable.write(this.detailCommonMeta$$0, p0, p1, new a());
    }
}
