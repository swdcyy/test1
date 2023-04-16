package com.yxcorp.gifshow.detail.slideplay.SlidePlayConfig$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.detail.slideplay.SlidePlayConfig$$Parcelable$a;
import com.yxcorp.gifshow.detail.slideplay.SlidePlayConfig;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.lang.Boolean;
import java.lang.Class;
import org.parceler.a;

public class SlidePlayConfig$$Parcelable implements Parcelable, d	// class@001712
{
    public SlidePlayConfig slidePlayConfig$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       SlidePlayConfig$$Parcelable.CREATOR = new SlidePlayConfig$$Parcelable$a();
    }
    public void SlidePlayConfig$$Parcelable(SlidePlayConfig p0){
       super();
       this.slidePlayConfig$$0 = p0;
    }
    public static SlidePlayConfig read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          SlidePlayConfig slidePlayCon = new SlidePlayConfig();
          p1.f(p1.g(), slidePlayCon);
          boolean b = false;
          boolean b1 = (p0.readInt() == 1)? true: false;
          slidePlayCon.mEnableLazyLoad = b1;
          SlidePlayConfig slidePlayCon1 = SlidePlayConfig.class;
          boolean b2 = (p0.readInt() == 1)? true: false;
          a.d(slidePlayCon1, slidePlayCon, "mEnableSlidePositionChangeEvent", Boolean.valueOf(b2));
          b1 = (p0.readInt() == 1)? true: false;
          slidePlayCon.mEnableShowMarque = b1;
          b1 = (p0.readInt() == 1)? true: false;
          slidePlayCon.mIsCanLoop = b1;
          slidePlayCon1 = SlidePlayConfig.class;
          b2 = (p0.readInt() == 1)? true: false;
          a.d(slidePlayCon1, slidePlayCon, "mEnablePositionReferFragment", Boolean.valueOf(b2));
          b2 = (p0.readInt() == 1)? true: false;
          a.d(SlidePlayConfig.class, slidePlayCon, "mEnablePullRefresh", Boolean.valueOf(b2));
          if (p0.readInt() == 1) {
             b = true;
          }
          slidePlayCon.mIsDisableSwipeToProfile = b;
          p1.f(i, slidePlayCon);
          return slidePlayCon;
       }
    }
    public static void write(SlidePlayConfig p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mEnableLazyLoad);
          Class tYPE = Boolean.TYPE;
          p1.writeInt(a.b(tYPE, SlidePlayConfig.class, p0, "mEnableSlidePositionChangeEvent").booleanValue());
          p1.writeInt(p0.mEnableShowMarque);
          p1.writeInt(p0.mIsCanLoop);
          p1.writeInt(a.b(tYPE, SlidePlayConfig.class, p0, "mEnablePositionReferFragment").booleanValue());
          p1.writeInt(a.b(tYPE, SlidePlayConfig.class, p0, "mEnablePullRefresh").booleanValue());
          p1.writeInt(p0.mIsDisableSwipeToProfile);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public SlidePlayConfig getParcel(){
       return this.slidePlayConfig$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       SlidePlayConfig$$Parcelable.write(this.slidePlayConfig$$0, p0, p1, new a());
    }
}
