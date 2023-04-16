package com.kwai.video.waynelive.quality.LiveQualityItem$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.video.waynelive.quality.LiveQualityItem$$Parcelable$1;
import com.kwai.video.waynelive.quality.LiveQualityItem;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class LiveQualityItem$$Parcelable implements Parcelable, d	// class@000e15
{
    public LiveQualityItem liveQualityItem$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       LiveQualityItem$$Parcelable.CREATOR = new LiveQualityItem$$Parcelable$1();
    }
    public void LiveQualityItem$$Parcelable(LiveQualityItem p0){
       super();
       this.liveQualityItem$$0 = p0;
    }
    public static LiveQualityItem read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          LiveQualityItem liveQualityI = new LiveQualityItem();
          p1.f(p1.g(), liveQualityI);
          liveQualityI.mQualityType = p0.readString();
          boolean b = true;
          if (p0.readInt() != b) {
             b = false;
          }
          liveQualityI.mIsDefault = b;
          liveQualityI.mLevel = p0.readInt();
          liveQualityI.mShortName = p0.readString();
          liveQualityI.mRealResolutionName = p0.readString();
          liveQualityI.mName = p0.readString();
          p1.f(i, liveQualityI);
          return liveQualityI;
       }
    }
    public static void write(LiveQualityItem p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mQualityType);
          p1.writeInt(p0.mIsDefault);
          p1.writeInt(p0.mLevel);
          p1.writeString(p0.mShortName);
          p1.writeString(p0.mRealResolutionName);
          p1.writeString(p0.mName);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public LiveQualityItem getParcel(){
       return this.liveQualityItem$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       LiveQualityItem$$Parcelable.write(this.liveQualityItem$$0, p0, p1, new a());
    }
}
