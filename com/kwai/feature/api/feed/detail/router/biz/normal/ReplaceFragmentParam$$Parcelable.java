package com.kwai.feature.api.feed.detail.router.biz.normal.ReplaceFragmentParam$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.feature.api.feed.detail.router.biz.normal.ReplaceFragmentParam$$Parcelable$a;
import com.kwai.feature.api.feed.detail.router.biz.normal.ReplaceFragmentParam;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.kwai.feature.api.feed.detail.router.biz.normal.ReplaceFragmentAnimationParam;
import com.kwai.feature.api.feed.detail.router.biz.normal.ReplaceFragmentAnimationParam$$Parcelable;
import com.kwai.feature.api.feed.detail.router.biz.normal.NonslideLandscapeParam;
import com.kwai.feature.api.feed.detail.router.biz.normal.NonslideLandscapeParam$$Parcelable;

public class ReplaceFragmentParam$$Parcelable implements Parcelable, d	// class@000eb4
{
    public ReplaceFragmentParam replaceFragmentParam$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       ReplaceFragmentParam$$Parcelable.CREATOR = new ReplaceFragmentParam$$Parcelable$a();
    }
    public void ReplaceFragmentParam$$Parcelable(ReplaceFragmentParam p0){
       super();
       this.replaceFragmentParam$$0 = p0;
    }
    public static ReplaceFragmentParam read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          ReplaceFragmentParam replaceFragm = new ReplaceFragmentParam();
          p1.f(p1.g(), replaceFragm);
          boolean b = false;
          boolean b1 = (p0.readInt() == 1)? true: false;
          replaceFragm.mIsAutoPlay = b1;
          if (p0.readInt() == 1) {
             b = true;
          }
          replaceFragm.mForceReplacePhoto = b;
          replaceFragm.mReplaceFragmentAnimationParam = ReplaceFragmentAnimationParam$$Parcelable.read(p0, p1);
          replaceFragm.mNonslideLandscapeParam = NonslideLandscapeParam$$Parcelable.read(p0, p1);
          p1.f(i, replaceFragm);
          return replaceFragm;
       }
    }
    public static void write(ReplaceFragmentParam p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mIsAutoPlay);
          p1.writeInt(p0.mForceReplacePhoto);
          ReplaceFragmentAnimationParam$$Parcelable.write(p0.mReplaceFragmentAnimationParam, p1, p2, p3);
          NonslideLandscapeParam$$Parcelable.write(p0.mNonslideLandscapeParam, p1, p2, p3);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public ReplaceFragmentParam getParcel(){
       return this.replaceFragmentParam$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       ReplaceFragmentParam$$Parcelable.write(this.replaceFragmentParam$$0, p0, p1, new a());
    }
}
