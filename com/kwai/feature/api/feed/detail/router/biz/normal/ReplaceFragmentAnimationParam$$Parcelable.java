package com.kwai.feature.api.feed.detail.router.biz.normal.ReplaceFragmentAnimationParam$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.feature.api.feed.detail.router.biz.normal.ReplaceFragmentAnimationParam$$Parcelable$a;
import com.kwai.feature.api.feed.detail.router.biz.normal.ReplaceFragmentAnimationParam;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class ReplaceFragmentAnimationParam$$Parcelable implements Parcelable, d	// class@000eb1
{
    public ReplaceFragmentAnimationParam replaceFragmentAnimationParam$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       ReplaceFragmentAnimationParam$$Parcelable.CREATOR = new ReplaceFragmentAnimationParam$$Parcelable$a();
    }
    public void ReplaceFragmentAnimationParam$$Parcelable(ReplaceFragmentAnimationParam p0){
       super();
       this.replaceFragmentAnimationParam$$0 = p0;
    }
    public static ReplaceFragmentAnimationParam read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          ReplaceFragmentAnimationParam replaceFragm = new ReplaceFragmentAnimationParam();
          p1.f(p1.g(), replaceFragm);
          boolean b = true;
          if (p0.readInt() != b) {
             b = false;
          }
          replaceFragm.mEnableShrinkUnchanged = b;
          replaceFragm.mPhotoBottomInScreen = p0.readInt();
          p1.f(i, replaceFragm);
          return replaceFragm;
       }
    }
    public static void write(ReplaceFragmentAnimationParam p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mEnableShrinkUnchanged);
          p1.writeInt(p0.mPhotoBottomInScreen);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public ReplaceFragmentAnimationParam getParcel(){
       return this.replaceFragmentAnimationParam$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       ReplaceFragmentAnimationParam$$Parcelable.write(this.replaceFragmentAnimationParam$$0, p0, p1, new a());
    }
}
