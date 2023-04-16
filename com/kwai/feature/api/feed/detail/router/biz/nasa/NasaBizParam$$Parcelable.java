package com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam$$Parcelable$a;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.yxcorp.gifshow.model.response.HotChannelColumn;
import com.yxcorp.gifshow.model.response.HotChannelColumn$$Parcelable;
import com.yxcorp.gifshow.nasa.NasaSlideParam;
import com.yxcorp.gifshow.nasa.NasaSlideParam$$Parcelable;

public class NasaBizParam$$Parcelable implements Parcelable, d	// class@000ea5
{
    public NasaBizParam nasaBizParam$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       NasaBizParam$$Parcelable.CREATOR = new NasaBizParam$$Parcelable$a();
    }
    public void NasaBizParam$$Parcelable(NasaBizParam p0){
       super();
       this.nasaBizParam$$0 = p0;
    }
    public static NasaBizParam read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          NasaBizParam nasaBizParam = new NasaBizParam();
          p1.f(p1.g(), nasaBizParam);
          nasaBizParam.mSourceType = p0.readInt();
          nasaBizParam.mHotChannelColumn = HotChannelColumn$$Parcelable.read(p0, p1);
          nasaBizParam.mFansGuidePhotoId = p0.readString();
          nasaBizParam.mCouponAccountId = p0.readString();
          nasaBizParam.mAtlasPhotoIndex = p0.readInt();
          nasaBizParam.mPopSharePanelStyle = p0.readInt();
          boolean b = false;
          boolean b1 = (p0.readInt() == 1)? true: false;
          nasaBizParam.mShouldShowFloatWidget = b1;
          nasaBizParam.mAtlasPhotoOffset = p0.readInt();
          nasaBizParam.mNasaSlideParam = NasaSlideParam$$Parcelable.read(p0, p1);
          if (p0.readInt() == 1) {
             b = true;
          }
          nasaBizParam.mNeedReplaceFeed = b;
          nasaBizParam.mHotChannelId = p0.readString();
          p1.f(i, nasaBizParam);
          return nasaBizParam;
       }
    }
    public static void write(NasaBizParam p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mSourceType);
          HotChannelColumn$$Parcelable.write(p0.mHotChannelColumn, p1, p2, p3);
          p1.writeString(p0.mFansGuidePhotoId);
          p1.writeString(p0.mCouponAccountId);
          p1.writeInt(p0.mAtlasPhotoIndex);
          p1.writeInt(p0.mPopSharePanelStyle);
          p1.writeInt(p0.mShouldShowFloatWidget);
          p1.writeInt(p0.mAtlasPhotoOffset);
          NasaSlideParam$$Parcelable.write(p0.mNasaSlideParam, p1, p2, p3);
          p1.writeInt(p0.mNeedReplaceFeed);
          p1.writeString(p0.mHotChannelId);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public NasaBizParam getParcel(){
       return this.nasaBizParam$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       NasaBizParam$$Parcelable.write(this.nasaBizParam$$0, p0, p1, new a());
    }
}
