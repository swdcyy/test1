package com.kwai.feature.api.feed.detail.router.biz.normal.NonslideLandscapeParam$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.feature.api.feed.detail.router.biz.normal.NonslideLandscapeParam$$Parcelable$a;
import com.kwai.feature.api.feed.detail.router.biz.normal.NonslideLandscapeParam;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.lang.ClassLoader;
import java.lang.Class;
import android.graphics.Bitmap;

public class NonslideLandscapeParam$$Parcelable implements Parcelable, d	// class@000ea8
{
    public NonslideLandscapeParam nonslideLandscapeParam$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       NonslideLandscapeParam$$Parcelable.CREATOR = new NonslideLandscapeParam$$Parcelable$a();
    }
    public void NonslideLandscapeParam$$Parcelable(NonslideLandscapeParam p0){
       super();
       this.nonslideLandscapeParam$$0 = p0;
    }
    public static NonslideLandscapeParam read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          NonslideLandscapeParam nonslideLand = new NonslideLandscapeParam();
          p1.f(p1.g(), nonslideLand);
          nonslideLand.mReplacePhotoTimeMills = p0.readLong();
          nonslideLand.mPlaySpeed = p0.readFloat();
          nonslideLand.mCoverBitmap = p0.readParcelable(NonslideLandscapeParam$$Parcelable.class.getClassLoader());
          nonslideLand.mLogExtraName = p0.readString();
          boolean b = false;
          boolean b1 = (p0.readInt() == 1)? true: false;
          nonslideLand.mEnableNonSlideLandUnited = b1;
          nonslideLand.mRecommendSource = p0.readInt();
          if (p0.readInt() == 1) {
             b = true;
          }
          nonslideLand.mPlayStartPause = b;
          p1.f(i, nonslideLand);
          return nonslideLand;
       }
    }
    public static void write(NonslideLandscapeParam p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeLong(p0.mReplacePhotoTimeMills);
          p1.writeFloat(p0.mPlaySpeed);
          p1.writeParcelable(p0.mCoverBitmap, p2);
          p1.writeString(p0.mLogExtraName);
          p1.writeInt(p0.mEnableNonSlideLandUnited);
          p1.writeInt(p0.mRecommendSource);
          p1.writeInt(p0.mPlayStartPause);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public NonslideLandscapeParam getParcel(){
       return this.nonslideLandscapeParam$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       NonslideLandscapeParam$$Parcelable.write(this.nonslideLandscapeParam$$0, p0, p1, new a());
    }
}
