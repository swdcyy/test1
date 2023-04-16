package com.kuaishou.android.model.ads.PhotoAdvertisement$CaptionAdvertisementInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CaptionAdvertisementInfo$$Parcelable$a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CaptionAdvertisementInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class PhotoAdvertisement$CaptionAdvertisementInfo$$Parcelable implements Parcelable, d	// class@0008d1
{
    public PhotoAdvertisement$CaptionAdvertisementInfo captionAdvertisementInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PhotoAdvertisement$CaptionAdvertisementInfo$$Parcelable.CREATOR = new PhotoAdvertisement$CaptionAdvertisementInfo$$Parcelable$a();
    }
    public void PhotoAdvertisement$CaptionAdvertisementInfo$$Parcelable(PhotoAdvertisement$CaptionAdvertisementInfo p0){
       super();
       this.captionAdvertisementInfo$$0 = p0;
    }
    public static PhotoAdvertisement$CaptionAdvertisementInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          PhotoAdvertisement$CaptionAdvertisementInfo uCaptionAdve = new PhotoAdvertisement$CaptionAdvertisementInfo();
          p1.f(p1.g(), uCaptionAdve);
          uCaptionAdve.mProductIconUrl = p0.readString();
          boolean b = false;
          boolean b1 = (p0.readInt() == 1)? true: false;
          uCaptionAdve.mEnableClickCaptionToProfile = b1;
          uCaptionAdve.mTextLinkNewColor = p0.readString();
          uCaptionAdve.mDescriptionInLandingPage = p0.readString();
          uCaptionAdve.mAvatarIconAnimationUrlB = p0.readString();
          uCaptionAdve.mAvatarIconAnimationUrlA = p0.readString();
          b1 = (p0.readInt() == 1)? true: false;
          uCaptionAdve.mShowAvatarInfoInLandingPage = b1;
          uCaptionAdve.mProductName = p0.readString();
          uCaptionAdve.mRiskTips = p0.readString();
          if (p0.readInt() == 1) {
             b = true;
          }
          uCaptionAdve.mAvatarIconAnimation = b;
          p1.f(i, uCaptionAdve);
          return uCaptionAdve;
       }
    }
    public static void write(PhotoAdvertisement$CaptionAdvertisementInfo p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mProductIconUrl);
          p1.writeInt(p0.mEnableClickCaptionToProfile);
          p1.writeString(p0.mTextLinkNewColor);
          p1.writeString(p0.mDescriptionInLandingPage);
          p1.writeString(p0.mAvatarIconAnimationUrlB);
          p1.writeString(p0.mAvatarIconAnimationUrlA);
          p1.writeInt(p0.mShowAvatarInfoInLandingPage);
          p1.writeString(p0.mProductName);
          p1.writeString(p0.mRiskTips);
          p1.writeInt(p0.mAvatarIconAnimation);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public PhotoAdvertisement$CaptionAdvertisementInfo getParcel(){
       return this.captionAdvertisementInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PhotoAdvertisement$CaptionAdvertisementInfo$$Parcelable.write(this.captionAdvertisementInfo$$0, p0, p1, new a());
    }
}
