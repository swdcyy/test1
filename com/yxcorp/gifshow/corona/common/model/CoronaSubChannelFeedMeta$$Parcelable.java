package com.yxcorp.gifshow.corona.common.model.CoronaSubChannelFeedMeta$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.corona.common.model.CoronaSubChannelFeedMeta$$Parcelable$a;
import com.yxcorp.gifshow.corona.common.model.CoronaSubChannelFeedMeta;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.model.CDNUrl$$Parcelable;

public class CoronaSubChannelFeedMeta$$Parcelable implements Parcelable, d	// class@00121b
{
    public CoronaSubChannelFeedMeta coronaSubChannelFeedMeta$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       CoronaSubChannelFeedMeta$$Parcelable.CREATOR = new CoronaSubChannelFeedMeta$$Parcelable$a();
    }
    public void CoronaSubChannelFeedMeta$$Parcelable(CoronaSubChannelFeedMeta p0){
       super();
       this.coronaSubChannelFeedMeta$$0 = p0;
    }
    public static CoronaSubChannelFeedMeta read(Parcel p0,a p1){
       CDNUrl[] uCDNUrlArray1;
       int i2;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          CoronaSubChannelFeedMeta uCoronaSubCh = new CoronaSubChannelFeedMeta();
          p1.f(p1.g(), uCoronaSubCh);
          uCoronaSubCh.mTopRightTagText = p0.readString();
          uCoronaSubCh.mKwaiSchemeUrl = p0.readString();
          uCoronaSubCh.mId = p0.readInt();
          boolean b = false;
          int b1 = (p0.readInt() == 1)? true: false;
          uCoronaSubCh.mLoginRequired = b1;
          b1 = p0.readInt();
          CDNUrl[] uCDNUrlArray = null;
          if (b1 < 0) {
             uCDNUrlArray1 = uCDNUrlArray;
          }else {
             uCDNUrlArray1 = new CDNUrl[b1];
             for (i2 = 0; i2 < b1; i2 = i2 + 1) {
                uCDNUrlArray1[i2] = CDNUrl$$Parcelable.read(p0, p1);
             }
          }
          uCoronaSubCh.mDarkImageUrls = uCDNUrlArray1;
          uCoronaSubCh.mCountDesc = p0.readString();
          b1 = p0.readInt();
          if (b1 < 0) {
             uCDNUrlArray1 = uCDNUrlArray;
          }else {
             uCDNUrlArray1 = new CDNUrl[b1];
             for (i2 = 0; i2 < b1; i2 = i2 + 1) {
                uCDNUrlArray1[i2] = CDNUrl$$Parcelable.read(p0, p1);
             }
          }
          uCoronaSubCh.mImageUrls = uCDNUrlArray1;
          uCoronaSubCh.mTopRightTagType = p0.readInt();
          b1 = p0.readInt();
          if (b1 >= 0) {
             uCDNUrlArray = new CDNUrl[b1];
             for (int i1 = 0; i1 < b1; i1 = i1 + 1) {
                uCDNUrlArray[i1] = CDNUrl$$Parcelable.read(p0, p1);
             }
          }
          uCoronaSubCh.mCoverUrls = uCDNUrlArray;
          uCoronaSubCh.mMiniAppServerParams = p0.readString();
          uCoronaSubCh.mName = p0.readString();
          if (p0.readInt() == 1) {
             b = true;
          }
          uCoronaSubCh.mIsTvSubTab = b;
          uCoronaSubCh.mExtLogParams = p0.readString();
          uCoronaSubCh.mDesc = p0.readString();
          p1.f(i, uCoronaSubCh);
          return uCoronaSubCh;
       }
    }
    public static void write(CoronaSubChannelFeedMeta p0,Parcel p1,int p2,a p3){
       int len;
       int i3;
       int i = p3.c(p0);
       int i1 = -1;
       if (i != i1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mTopRightTagText);
          p1.writeString(p0.mKwaiSchemeUrl);
          p1.writeInt(p0.mId);
          p1.writeInt(p0.mLoginRequired);
          CoronaSubChannelFeedMeta mDarkImageUr = p0.mDarkImageUrls;
          int i2 = 0;
          if (mDarkImageUr == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mDarkImageUr.length);
             mDarkImageUr = p0.mDarkImageUrls;
             len = mDarkImageUr.length;
             for (i3 = 0; i3 < len; i3 = i3 + 1) {
                CDNUrl$$Parcelable.write(mDarkImageUr[i3], p1, p2, p3);
             }
          }
          p1.writeString(p0.mCountDesc);
          mDarkImageUr = p0.mImageUrls;
          if (mDarkImageUr == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mDarkImageUr.length);
             mDarkImageUr = p0.mImageUrls;
             len = mDarkImageUr.length;
             for (i3 = 0; i3 < len; i3 = i3 + 1) {
                CDNUrl$$Parcelable.write(mDarkImageUr[i3], p1, p2, p3);
             }
          }
          p1.writeInt(p0.mTopRightTagType);
          mDarkImageUr = p0.mCoverUrls;
          if (mDarkImageUr == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mDarkImageUr.length);
             mDarkImageUr = p0.mCoverUrls;
             i1 = mDarkImageUr.length;
             for (; i2 < i1; i2 = i2 + 1) {
                CDNUrl$$Parcelable.write(mDarkImageUr[i2], p1, p2, p3);
             }
          }
          p1.writeString(p0.mMiniAppServerParams);
          p1.writeString(p0.mName);
          p1.writeInt(p0.mIsTvSubTab);
          p1.writeString(p0.mExtLogParams);
          p1.writeString(p0.mDesc);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public CoronaSubChannelFeedMeta getParcel(){
       return this.coronaSubChannelFeedMeta$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       CoronaSubChannelFeedMeta$$Parcelable.write(this.coronaSubChannelFeedMeta$$0, p0, p1, new a());
    }
}
