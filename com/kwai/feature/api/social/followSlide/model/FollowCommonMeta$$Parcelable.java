package com.kwai.feature.api.social.followSlide.model.FollowCommonMeta$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.feature.api.social.followSlide.model.FollowCommonMeta$$Parcelable$a;
import com.kwai.feature.api.social.followSlide.model.FollowCommonMeta;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.kwai.feature.api.social.followSlide.model.FollowSlideRecoGuide;
import com.kwai.feature.api.social.followSlide.model.FollowSlideRecoGuide$$Parcelable;

public class FollowCommonMeta$$Parcelable implements Parcelable, d	// class@0010ca
{
    public FollowCommonMeta followCommonMeta$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       FollowCommonMeta$$Parcelable.CREATOR = new FollowCommonMeta$$Parcelable$a();
    }
    public void FollowCommonMeta$$Parcelable(FollowCommonMeta p0){
       super();
       this.followCommonMeta$$0 = p0;
    }
    public static FollowCommonMeta read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          FollowCommonMeta uFollowCommo = new FollowCommonMeta();
          p1.f(p1.g(), uFollowCommo);
          uFollowCommo.mFollowSlideRecoGuide = FollowSlideRecoGuide$$Parcelable.read(p0, p1);
          p1.f(i, uFollowCommo);
          return uFollowCommo;
       }
    }
    public static void write(FollowCommonMeta p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          FollowSlideRecoGuide$$Parcelable.write(p0.mFollowSlideRecoGuide, p1, p2, p3);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public FollowCommonMeta getParcel(){
       return this.followCommonMeta$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       FollowCommonMeta$$Parcelable.write(this.followCommonMeta$$0, p0, p1, new a());
    }
}
