package com.kuaishou.android.live.model.LiveCoverWidgetModel$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.live.model.LiveCoverWidgetModel$$Parcelable$a;
import com.kuaishou.android.live.model.LiveCoverWidgetModel;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.model.CDNUrl$$Parcelable;
import java.io.Serializable;
import com.kuaishou.android.live.model.LiveCoverWidgetModel$ReasonTextInfo;
import com.kuaishou.android.live.model.LiveCoverWidgetModel$TextInfo;

public class LiveCoverWidgetModel$$Parcelable implements Parcelable, d	// class@0007eb
{
    public LiveCoverWidgetModel liveCoverWidgetModel$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       LiveCoverWidgetModel$$Parcelable.CREATOR = new LiveCoverWidgetModel$$Parcelable$a();
    }
    public void LiveCoverWidgetModel$$Parcelable(LiveCoverWidgetModel p0){
       super();
       this.liveCoverWidgetModel$$0 = p0;
    }
    public static LiveCoverWidgetModel read(Parcel p0,a p1){
       String[] stringArray;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          LiveCoverWidgetModel liveCoverWid = new LiveCoverWidgetModel();
          p1.f(p1.g(), liveCoverWid);
          liveCoverWid.mLiveIconType = p0.readInt();
          int i1 = p0.readInt();
          CDNUrl[] uCDNUrlArray = null;
          int i2 = 0;
          if (i1 < 0) {
             stringArray = uCDNUrlArray;
          }else {
             stringArray = new String[i1];
             for (int i3 = 0; i3 < i1; i3 = i3 + 1) {
                stringArray[i3] = p0.readString();
             }
          }
          liveCoverWid.mBackgroundColorList = stringArray;
          i1 = p0.readInt();
          if (i1 >= 0) {
             uCDNUrlArray = new CDNUrl[i1];
             for (; i2 < i1; i2 = i2 + 1) {
                uCDNUrlArray[i2] = CDNUrl$$Parcelable.read(p0, p1);
             }
          }
          liveCoverWid.mImageUrls = uCDNUrlArray;
          liveCoverWid.mImageWidthPx = p0.readInt();
          liveCoverWid.mImageHeightPx = p0.readInt();
          liveCoverWid.mReasonTextInfo = p0.readSerializable();
          liveCoverWid.mStyle = p0.readInt();
          liveCoverWid.mBackgroundGradientAngle = p0.readInt();
          liveCoverWid.mPageType = p0.readInt();
          liveCoverWid.mTextInfo = p0.readSerializable();
          liveCoverWid.mType = p0.readInt();
          p1.f(i, liveCoverWid);
          return liveCoverWid;
       }
    }
    public static void write(LiveCoverWidgetModel p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       int i1 = -1;
       if (i != i1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mLiveIconType);
          LiveCoverWidgetModel mBackgroundC = p0.mBackgroundColorList;
          int i2 = 0;
          if (mBackgroundC == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mBackgroundC.length);
             mBackgroundC = p0.mBackgroundColorList;
             int len = mBackgroundC.length;
             for (int i3 = 0; i3 < len; i3 = i3 + 1) {
                p1.writeString(mBackgroundC[i3]);
             }
          }
          mBackgroundC = p0.mImageUrls;
          if (mBackgroundC == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mBackgroundC.length);
             mBackgroundC = p0.mImageUrls;
             i1 = mBackgroundC.length;
             for (; i2 < i1; i2 = i2 + 1) {
                CDNUrl$$Parcelable.write(mBackgroundC[i2], p1, p2, p3);
             }
          }
          p1.writeInt(p0.mImageWidthPx);
          p1.writeInt(p0.mImageHeightPx);
          p1.writeSerializable(p0.mReasonTextInfo);
          p1.writeInt(p0.mStyle);
          p1.writeInt(p0.mBackgroundGradientAngle);
          p1.writeInt(p0.mPageType);
          p1.writeSerializable(p0.mTextInfo);
          p1.writeInt(p0.mType);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public LiveCoverWidgetModel getParcel(){
       return this.liveCoverWidgetModel$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       LiveCoverWidgetModel$$Parcelable.write(this.liveCoverWidgetModel$$0, p0, p1, new a());
    }
}
