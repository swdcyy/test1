package com.kuaishou.android.live.model.LiveSimpleCoverReasonTag$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.live.model.LiveSimpleCoverReasonTag$$Parcelable$a;
import com.kuaishou.android.live.model.LiveSimpleCoverReasonTag;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.io.Serializable;
import com.kuaishou.android.live.model.LiveSimpleCoverReasonTag$IconInfo;
import com.kuaishou.android.live.model.LiveSimpleCoverReasonTag$TextInfo;

public class LiveSimpleCoverReasonTag$$Parcelable implements Parcelable, d	// class@0007fd
{
    public LiveSimpleCoverReasonTag liveSimpleCoverReasonTag$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       LiveSimpleCoverReasonTag$$Parcelable.CREATOR = new LiveSimpleCoverReasonTag$$Parcelable$a();
    }
    public void LiveSimpleCoverReasonTag$$Parcelable(LiveSimpleCoverReasonTag p0){
       super();
       this.liveSimpleCoverReasonTag$$0 = p0;
    }
    public static LiveSimpleCoverReasonTag read(Parcel p0,a p1){
       String[] stringArray;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          LiveSimpleCoverReasonTag liveSimpleCo = new LiveSimpleCoverReasonTag();
          p1.f(p1.g(), liveSimpleCo);
          liveSimpleCo.mTagType = p0.readInt();
          liveSimpleCo.mTagPattern = p0.readString();
          liveSimpleCo.mIconInfo = p0.readSerializable();
          liveSimpleCo.mExtraInfo = p0.readString();
          liveSimpleCo.mBackgroundGradientAngle = p0.readInt();
          liveSimpleCo.mTextInfo = p0.readSerializable();
          int i1 = p0.readInt();
          if (i1 < 0) {
             stringArray = null;
          }else {
             String[] stringArray1 = new String[i1];
             for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
                stringArray1[i2] = p0.readString();
             }
             stringArray = stringArray1;
          }
          liveSimpleCo.mBackgroundColor = stringArray;
          liveSimpleCo.mRightIconInfo = p0.readSerializable();
          p1.f(i, liveSimpleCo);
          return liveSimpleCo;
       }
    }
    public static void write(LiveSimpleCoverReasonTag p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       int i = -1;
       if (p2 != i) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mTagType);
          p1.writeString(p0.mTagPattern);
          p1.writeSerializable(p0.mIconInfo);
          p1.writeString(p0.mExtraInfo);
          p1.writeInt(p0.mBackgroundGradientAngle);
          p1.writeSerializable(p0.mTextInfo);
          LiveSimpleCoverReasonTag mBackgroundC = p0.mBackgroundColor;
          if (mBackgroundC == null) {
             p1.writeInt(i);
          }else {
             p1.writeInt(mBackgroundC.length);
             mBackgroundC = p0.mBackgroundColor;
             int len = mBackgroundC.length;
             for (i = 0; i < len; i = i + 1) {
                p1.writeString(mBackgroundC[i]);
             }
          }
          p1.writeSerializable(p0.mRightIconInfo);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public LiveSimpleCoverReasonTag getParcel(){
       return this.liveSimpleCoverReasonTag$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       LiveSimpleCoverReasonTag$$Parcelable.write(this.liveSimpleCoverReasonTag$$0, p0, p1, new a());
    }
}
