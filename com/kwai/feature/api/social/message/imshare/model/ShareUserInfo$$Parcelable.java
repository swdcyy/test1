package com.kwai.feature.api.social.message.imshare.model.ShareUserInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.feature.api.social.message.imshare.model.ShareUserInfo$$Parcelable$a;
import com.kwai.feature.api.social.message.imshare.model.ShareUserInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.model.CDNUrl$$Parcelable;

public class ShareUserInfo$$Parcelable implements Parcelable, d	// class@00116c
{
    public ShareUserInfo shareUserInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       ShareUserInfo$$Parcelable.CREATOR = new ShareUserInfo$$Parcelable$a();
    }
    public void ShareUserInfo$$Parcelable(ShareUserInfo p0){
       super();
       this.shareUserInfo$$0 = p0;
    }
    public static ShareUserInfo read(Parcel p0,a p1){
       CDNUrl[] uCDNUrlArray;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          ShareUserInfo shareUserInf = new ShareUserInfo();
          p1.f(p1.g(), shareUserInf);
          shareUserInf.mEid = p0.readString();
          shareUserInf.mUserId = p0.readString();
          int i1 = 0;
          boolean b = true;
          if (p0.readInt() != b) {
             b = false;
          }
          shareUserInf.mIsFriend = b;
          shareUserInf.mRelationType = p0.readInt();
          shareUserInf.mAliasPinYinName = p0.readString();
          int i2 = p0.readInt();
          if (i2 < 0) {
             uCDNUrlArray = null;
          }else {
             CDNUrl[] uCDNUrlArray1 = new CDNUrl[i2];
             for (; i1 < i2; i1 = i1 + 1) {
                uCDNUrlArray1[i1] = CDNUrl$$Parcelable.read(p0, p1);
             }
             uCDNUrlArray = uCDNUrlArray1;
          }
          shareUserInf.mHeadUrls = uCDNUrlArray;
          shareUserInf.mSecondLetter = p0.readString();
          shareUserInf.mPinYinName = p0.readString();
          shareUserInf.mUserName = p0.readString();
          shareUserInf.mFirstLetter = p0.readString();
          shareUserInf.mAliasName = p0.readString();
          shareUserInf.mUserSex = p0.readString();
          shareUserInf.mHeadUrl = p0.readString();
          p1.f(i, shareUserInf);
          return shareUserInf;
       }
    }
    public static void write(ShareUserInfo p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       int i1 = -1;
       if (i != i1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mEid);
          p1.writeString(p0.mUserId);
          p1.writeInt(p0.mIsFriend);
          p1.writeInt(p0.mRelationType);
          p1.writeString(p0.mAliasPinYinName);
          ShareUserInfo mHeadUrls = p0.mHeadUrls;
          if (mHeadUrls == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mHeadUrls.length);
             mHeadUrls = p0.mHeadUrls;
             i1 = mHeadUrls.length;
             for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
                CDNUrl$$Parcelable.write(mHeadUrls[i2], p1, p2, p3);
             }
          }
          p1.writeString(p0.mSecondLetter);
          p1.writeString(p0.mPinYinName);
          p1.writeString(p0.mUserName);
          p1.writeString(p0.mFirstLetter);
          p1.writeString(p0.mAliasName);
          p1.writeString(p0.mUserSex);
          p1.writeString(p0.mHeadUrl);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public ShareUserInfo getParcel(){
       return this.shareUserInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       ShareUserInfo$$Parcelable.write(this.shareUserInfo$$0, p0, p1, new a());
    }
}
