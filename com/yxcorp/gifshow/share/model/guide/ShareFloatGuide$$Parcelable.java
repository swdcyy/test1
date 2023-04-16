package com.yxcorp.gifshow.share.model.guide.ShareFloatGuide$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.share.model.guide.ShareFloatGuide$$Parcelable$a;
import com.yxcorp.gifshow.share.model.guide.ShareFloatGuide;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.yxcorp.gifshow.share.model.guide.ShareRewardBanner;
import com.yxcorp.gifshow.share.model.guide.ShareRewardBanner$$Parcelable;
import com.yxcorp.gifshow.share.model.guide.ShareFansMotivate;
import com.yxcorp.gifshow.share.model.guide.ShareFansMotivate$$Parcelable;
import com.yxcorp.gifshow.share.model.guide.ShareFinishGuide;
import com.yxcorp.gifshow.share.model.guide.ShareFinishGuide$$Parcelable;

public class ShareFloatGuide$$Parcelable implements Parcelable, d	// class@001be4
{
    public ShareFloatGuide shareFloatGuide$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       ShareFloatGuide$$Parcelable.CREATOR = new ShareFloatGuide$$Parcelable$a();
    }
    public void ShareFloatGuide$$Parcelable(ShareFloatGuide p0){
       super();
       this.shareFloatGuide$$0 = p0;
    }
    public static ShareFloatGuide read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          ShareFloatGuide shareFloatGu = new ShareFloatGuide();
          p1.f(p1.g(), shareFloatGu);
          shareFloatGu.mShareRewardBanner = ShareRewardBanner$$Parcelable.read(p0, p1);
          shareFloatGu.mShareFansMotivate = ShareFansMotivate$$Parcelable.read(p0, p1);
          shareFloatGu.mShareFinishGuide = ShareFinishGuide$$Parcelable.read(p0, p1);
          p1.f(i, shareFloatGu);
          return shareFloatGu;
       }
    }
    public static void write(ShareFloatGuide p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          ShareRewardBanner$$Parcelable.write(p0.mShareRewardBanner, p1, p2, p3);
          ShareFansMotivate$$Parcelable.write(p0.mShareFansMotivate, p1, p2, p3);
          ShareFinishGuide$$Parcelable.write(p0.mShareFinishGuide, p1, p2, p3);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public ShareFloatGuide getParcel(){
       return this.shareFloatGuide$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       ShareFloatGuide$$Parcelable.write(this.shareFloatGuide$$0, p0, p1, new a());
    }
}
