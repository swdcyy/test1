package com.kwai.feature.api.social.moment.model.MomentRecommend$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.feature.api.social.moment.model.MomentRecommend$$Parcelable$a;
import com.kwai.feature.api.social.moment.model.MomentRecommend;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.kwai.framework.model.user.User;
import com.kwai.framework.model.user.User$$Parcelable;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.model.CDNUrl$$Parcelable;

public class MomentRecommend$$Parcelable implements Parcelable, d	// class@00118e
{
    public MomentRecommend momentRecommend$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       MomentRecommend$$Parcelable.CREATOR = new MomentRecommend$$Parcelable$a();
    }
    public void MomentRecommend$$Parcelable(MomentRecommend p0){
       super();
       this.momentRecommend$$0 = p0;
    }
    public static MomentRecommend read(Parcel p0,a p1){
       CDNUrl[] uCDNUrlArray;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          MomentRecommend momentRecomm = new MomentRecommend();
          p1.f(p1.g(), momentRecomm);
          momentRecomm.mUser = User$$Parcelable.read(p0, p1);
          momentRecomm.mActionUri = p0.readString();
          momentRecomm.mCaption = p0.readString();
          momentRecomm.mPhotoId = p0.readString();
          int i1 = p0.readInt();
          if (i1 < 0) {
             uCDNUrlArray = null;
          }else {
             CDNUrl[] uCDNUrlArray1 = new CDNUrl[i1];
             for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
                uCDNUrlArray1[i2] = CDNUrl$$Parcelable.read(p0, p1);
             }
             uCDNUrlArray = uCDNUrlArray1;
          }
          momentRecomm.mCover = uCDNUrlArray;
          p1.f(i, momentRecomm);
          return momentRecomm;
       }
    }
    public static void write(MomentRecommend p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       int i1 = -1;
       if (i != i1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          User$$Parcelable.write(p0.mUser, p1, p2, p3);
          p1.writeString(p0.mActionUri);
          p1.writeString(p0.mCaption);
          p1.writeString(p0.mPhotoId);
          MomentRecommend mCover = p0.mCover;
          if (mCover == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mCover.length);
             p0 = p0.mCover;
             i = p0.length;
             for (i1 = 0; i1 < i; i1 = i1 + 1) {
                CDNUrl$$Parcelable.write(p0[i1], p1, p2, p3);
             }
          }
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public MomentRecommend getParcel(){
       return this.momentRecommend$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       MomentRecommend$$Parcelable.write(this.momentRecommend$$0, p0, p1, new a());
    }
}
