package com.kuaishou.android.model.ads.AnimationVideoInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.ads.AnimationVideoInfo$$Parcelable$a;
import com.kuaishou.android.model.ads.AnimationVideoInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.kuaishou.android.model.ads.MagicVideoInfo;
import com.kuaishou.android.model.ads.MagicVideoInfo$$Parcelable;

public class AnimationVideoInfo$$Parcelable implements Parcelable, d	// class@000852
{
    public AnimationVideoInfo animationVideoInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       AnimationVideoInfo$$Parcelable.CREATOR = new AnimationVideoInfo$$Parcelable$a();
    }
    public void AnimationVideoInfo$$Parcelable(AnimationVideoInfo p0){
       super();
       this.animationVideoInfo$$0 = p0;
    }
    public static AnimationVideoInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          AnimationVideoInfo uAnimationVi = new AnimationVideoInfo();
          p1.f(p1.g(), uAnimationVi);
          boolean b = false;
          boolean b1 = (p0.readInt() == 1)? true: false;
          uAnimationVi.mShouldPlayAfterConverted = b1;
          if (p0.readInt() == 1) {
             b = true;
          }
          uAnimationVi.mShouldShowMessageContainer = b;
          uAnimationVi.mShowDelayTimeMs = p0.readLong();
          uAnimationVi.mMagicVideoInfo = MagicVideoInfo$$Parcelable.read(p0, p1);
          p1.f(i, uAnimationVi);
          return uAnimationVi;
       }
    }
    public static void write(AnimationVideoInfo p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mShouldPlayAfterConverted);
          p1.writeInt(p0.mShouldShowMessageContainer);
          p1.writeLong(p0.mShowDelayTimeMs);
          MagicVideoInfo$$Parcelable.write(p0.mMagicVideoInfo, p1, p2, p3);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public AnimationVideoInfo getParcel(){
       return this.animationVideoInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       AnimationVideoInfo$$Parcelable.write(this.animationVideoInfo$$0, p0, p1, new a());
    }
}
