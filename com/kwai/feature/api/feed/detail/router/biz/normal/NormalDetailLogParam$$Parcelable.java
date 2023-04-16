package com.kwai.feature.api.feed.detail.router.biz.normal.NormalDetailLogParam$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.feature.api.feed.detail.router.biz.normal.NormalDetailLogParam$$Parcelable$a;
import com.kwai.feature.api.feed.detail.router.biz.normal.NormalDetailLogParam;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class NormalDetailLogParam$$Parcelable implements Parcelable, d	// class@000eae
{
    public NormalDetailLogParam normalDetailLogParam$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       NormalDetailLogParam$$Parcelable.CREATOR = new NormalDetailLogParam$$Parcelable$a();
    }
    public void NormalDetailLogParam$$Parcelable(NormalDetailLogParam p0){
       super();
       this.normalDetailLogParam$$0 = p0;
    }
    public static NormalDetailLogParam read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          NormalDetailLogParam normalDetail = new NormalDetailLogParam();
          p1.f(p1.g(), normalDetail);
          normalDetail.slideSessionId = p0.readString();
          normalDetail.similarPhotoClickDepth = p0.readString();
          normalDetail.upperRecommendPhotoId = p0.readString();
          normalDetail.doubleRowSlideSessionId = p0.readString();
          normalDetail.slideFirstPhotoId = p0.readString();
          normalDetail.entranceOperateTitle = p0.readString();
          p1.f(i, normalDetail);
          return normalDetail;
       }
    }
    public static void write(NormalDetailLogParam p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.slideSessionId);
          p1.writeString(p0.similarPhotoClickDepth);
          p1.writeString(p0.upperRecommendPhotoId);
          p1.writeString(p0.doubleRowSlideSessionId);
          p1.writeString(p0.slideFirstPhotoId);
          p1.writeString(p0.entranceOperateTitle);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public NormalDetailLogParam getParcel(){
       return this.normalDetailLogParam$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       NormalDetailLogParam$$Parcelable.write(this.normalDetailLogParam$$0, p0, p1, new a());
    }
}
