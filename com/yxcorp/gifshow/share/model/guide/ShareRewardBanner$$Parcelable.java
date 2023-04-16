package com.yxcorp.gifshow.share.model.guide.ShareRewardBanner$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.share.model.guide.ShareRewardBanner$$Parcelable$a;
import com.yxcorp.gifshow.share.model.guide.ShareRewardBanner;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class ShareRewardBanner$$Parcelable implements Parcelable, d	// class@001bea
{
    public ShareRewardBanner shareRewardBanner$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       ShareRewardBanner$$Parcelable.CREATOR = new ShareRewardBanner$$Parcelable$a();
    }
    public void ShareRewardBanner$$Parcelable(ShareRewardBanner p0){
       super();
       this.shareRewardBanner$$0 = p0;
    }
    public static ShareRewardBanner read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          ShareRewardBanner shareRewardB = new ShareRewardBanner();
          p1.f(p1.g(), shareRewardB);
          boolean b = true;
          if (p0.readInt() != b) {
             b = false;
          }
          shareRewardB.mNeedGuide = b;
          p1.f(i, shareRewardB);
          return shareRewardB;
       }
    }
    public static void write(ShareRewardBanner p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mNeedGuide);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public ShareRewardBanner getParcel(){
       return this.shareRewardBanner$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       ShareRewardBanner$$Parcelable.write(this.shareRewardBanner$$0, p0, p1, new a());
    }
}
