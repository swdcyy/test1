package com.kwai.feature.api.social.followSlide.model.FollowSlideRecoGuide$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.feature.api.social.followSlide.model.FollowSlideRecoGuide$$Parcelable$a;
import com.kwai.feature.api.social.followSlide.model.FollowSlideRecoGuide;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class FollowSlideRecoGuide$$Parcelable implements Parcelable, d	// class@0010cd
{
    public FollowSlideRecoGuide followSlideRecoGuide$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       FollowSlideRecoGuide$$Parcelable.CREATOR = new FollowSlideRecoGuide$$Parcelable$a();
    }
    public void FollowSlideRecoGuide$$Parcelable(FollowSlideRecoGuide p0){
       super();
       this.followSlideRecoGuide$$0 = p0;
    }
    public static FollowSlideRecoGuide read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          FollowSlideRecoGuide uFollowSlide = new FollowSlideRecoGuide();
          p1.f(p1.g(), uFollowSlide);
          boolean b = false;
          boolean b1 = (p0.readInt() == 1)? true: false;
          uFollowSlide.mEnableAutoNext = b1;
          uFollowSlide.mShowInterval = p0.readLong();
          if (p0.readInt() == 1) {
             b = true;
          }
          uFollowSlide.mShowFromStart = b;
          uFollowSlide.mToastReason = p0.readString();
          uFollowSlide.mShowDuration = p0.readLong();
          uFollowSlide.mTextType = p0.readString();
          uFollowSlide.mType = p0.readString();
          p1.f(i, uFollowSlide);
          return uFollowSlide;
       }
    }
    public static void write(FollowSlideRecoGuide p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mEnableAutoNext);
          p1.writeLong(p0.mShowInterval);
          p1.writeInt(p0.mShowFromStart);
          p1.writeString(p0.mToastReason);
          p1.writeLong(p0.mShowDuration);
          p1.writeString(p0.mTextType);
          p1.writeString(p0.mType);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public FollowSlideRecoGuide getParcel(){
       return this.followSlideRecoGuide$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       FollowSlideRecoGuide$$Parcelable.write(this.followSlideRecoGuide$$0, p0, p1, new a());
    }
}
