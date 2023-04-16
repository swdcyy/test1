package com.yxcorp.gifshow.detail.model.meta.SharePhotoRecommendModel$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.detail.model.meta.SharePhotoRecommendModel$$Parcelable$a;
import com.yxcorp.gifshow.detail.model.meta.SharePhotoRecommendModel;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class SharePhotoRecommendModel$$Parcelable implements Parcelable, d	// class@0015ad
{
    public SharePhotoRecommendModel sharePhotoRecommendModel$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       SharePhotoRecommendModel$$Parcelable.CREATOR = new SharePhotoRecommendModel$$Parcelable$a();
    }
    public void SharePhotoRecommendModel$$Parcelable(SharePhotoRecommendModel p0){
       super();
       this.sharePhotoRecommendModel$$0 = p0;
    }
    public static SharePhotoRecommendModel read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          SharePhotoRecommendModel sharePhotoRe = new SharePhotoRecommendModel();
          p1.f(p1.g(), sharePhotoRe);
          sharePhotoRe.mReason = p0.readString();
          p1.f(i, sharePhotoRe);
          return sharePhotoRe;
       }
    }
    public static void write(SharePhotoRecommendModel p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mReason);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public SharePhotoRecommendModel getParcel(){
       return this.sharePhotoRecommendModel$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       SharePhotoRecommendModel$$Parcelable.write(this.sharePhotoRecommendModel$$0, p0, p1, new a());
    }
}
