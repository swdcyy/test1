package com.kwai.feature.api.live.base.model.LiveStyleParams$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.feature.api.live.base.model.LiveStyleParams$$Parcelable$a;
import com.kwai.feature.api.live.base.model.LiveStyleParams;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class LiveStyleParams$$Parcelable implements Parcelable, d	// class@000f91
{
    public LiveStyleParams liveStyleParams$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       LiveStyleParams$$Parcelable.CREATOR = new LiveStyleParams$$Parcelable$a();
    }
    public void LiveStyleParams$$Parcelable(LiveStyleParams p0){
       super();
       this.liveStyleParams$$0 = p0;
    }
    public static LiveStyleParams read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          LiveStyleParams liveStylePar = new LiveStyleParams();
          p1.f(p1.g(), liveStylePar);
          boolean b = false;
          boolean b1 = (p0.readInt() == 1)? true: false;
          liveStylePar.mHasShownEnterAnimation = b1;
          b1 = (p0.readInt() == 1)? true: false;
          liveStylePar.mEnableShrinkAnimation = b1;
          b1 = (p0.readInt() == 1)? true: false;
          liveStylePar.mIsSeamlessEnter = b1;
          b1 = (p0.readInt() == 1)? true: false;
          liveStylePar.mIsEnableExitShrink = b1;
          b1 = (p0.readInt() == 1)? true: false;
          liveStylePar.mEnableBizLayoutFadeInAnimation = b1;
          b1 = (p0.readInt() == 1)? true: false;
          liveStylePar.mIsWindowTranslucent = b1;
          b1 = (p0.readInt() == 1)? true: false;
          liveStylePar.mShouldAdaptFullscreen = b1;
          b1 = (p0.readInt() == 1)? true: false;
          liveStylePar.mHasShownBizLayoutAnimation = b1;
          if (p0.readInt() == 1) {
             b = true;
          }
          liveStylePar.mHasAdaptFullscreen = b;
          p1.f(i, liveStylePar);
          return liveStylePar;
       }
    }
    public static void write(LiveStyleParams p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mHasShownEnterAnimation);
          p1.writeInt(p0.mEnableShrinkAnimation);
          p1.writeInt(p0.mIsSeamlessEnter);
          p1.writeInt(p0.mIsEnableExitShrink);
          p1.writeInt(p0.mEnableBizLayoutFadeInAnimation);
          p1.writeInt(p0.mIsWindowTranslucent);
          p1.writeInt(p0.mShouldAdaptFullscreen);
          p1.writeInt(p0.mHasShownBizLayoutAnimation);
          p1.writeInt(p0.mHasAdaptFullscreen);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public LiveStyleParams getParcel(){
       return this.liveStyleParams$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       LiveStyleParams$$Parcelable.write(this.liveStyleParams$$0, p0, p1, new a());
    }
}
