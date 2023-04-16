package com.kwai.feature.api.social.message.imshare.model.ShareIMInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.feature.api.social.message.imshare.model.ShareIMInfo$$Parcelable$a;
import com.kwai.feature.api.social.message.imshare.model.ShareIMInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.kwai.feature.api.social.message.imshare.model.SharePosInfo;
import com.kwai.feature.api.social.message.imshare.model.SharePosInfo$$Parcelable;
import com.kwai.feature.api.social.message.imshare.model.GroupInfo;
import com.kwai.feature.api.social.message.imshare.model.GroupInfo$$Parcelable;
import com.kwai.feature.api.social.message.imshare.model.ShareUserInfo;
import com.kwai.feature.api.social.message.imshare.model.ShareUserInfo$$Parcelable;
import com.kwai.feature.api.social.message.imshare.model.ShareOrderInfo;
import com.kwai.feature.api.social.message.imshare.model.ShareOrderInfo$$Parcelable;

public class ShareIMInfo$$Parcelable implements Parcelable, d	// class@001162
{
    public ShareIMInfo shareIMInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       ShareIMInfo$$Parcelable.CREATOR = new ShareIMInfo$$Parcelable$a();
    }
    public void ShareIMInfo$$Parcelable(ShareIMInfo p0){
       super();
       this.shareIMInfo$$0 = p0;
    }
    public static ShareIMInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          ShareIMInfo shareIMInfo = new ShareIMInfo();
          p1.f(p1.g(), shareIMInfo);
          shareIMInfo.mIconId = p0.readInt();
          shareIMInfo.mLlsId = p0.readString();
          shareIMInfo.mPosInfo = SharePosInfo$$Parcelable.read(p0, p1);
          shareIMInfo.mLlsIdCacheFrom = p0.readString();
          shareIMInfo.mRelationType = p0.readInt();
          shareIMInfo.mTransactionId = p0.readString();
          boolean b = false;
          boolean b1 = (p0.readInt() == 1)? true: false;
          shareIMInfo.mShowLetter = b1;
          b1 = (p0.readInt() == 1)? true: false;
          shareIMInfo.mShowTitle = b1;
          shareIMInfo.mGroupInfo = GroupInfo$$Parcelable.read(p0, p1);
          b1 = (p0.readInt() == 1)? true: false;
          shareIMInfo.mLastItem = b1;
          shareIMInfo.mType = p0.readInt();
          shareIMInfo.mUserInfo = ShareUserInfo$$Parcelable.read(p0, p1);
          shareIMInfo.mOrderInfo = ShareOrderInfo$$Parcelable.read(p0, p1);
          shareIMInfo.mShareAction = p0.readInt();
          if (p0.readInt() == 1) {
             b = true;
          }
          shareIMInfo.mIsFromReco = b;
          shareIMInfo.mText = p0.readString();
          p1.f(i, shareIMInfo);
          return shareIMInfo;
       }
    }
    public static void write(ShareIMInfo p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mIconId);
          p1.writeString(p0.mLlsId);
          SharePosInfo$$Parcelable.write(p0.mPosInfo, p1, p2, p3);
          p1.writeString(p0.mLlsIdCacheFrom);
          p1.writeInt(p0.mRelationType);
          p1.writeString(p0.mTransactionId);
          p1.writeInt(p0.mShowLetter);
          p1.writeInt(p0.mShowTitle);
          GroupInfo$$Parcelable.write(p0.mGroupInfo, p1, p2, p3);
          p1.writeInt(p0.mLastItem);
          p1.writeInt(p0.mType);
          ShareUserInfo$$Parcelable.write(p0.mUserInfo, p1, p2, p3);
          ShareOrderInfo$$Parcelable.write(p0.mOrderInfo, p1, p2, p3);
          p1.writeInt(p0.mShareAction);
          p1.writeInt(p0.mIsFromReco);
          p1.writeString(p0.mText);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public ShareIMInfo getParcel(){
       return this.shareIMInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       ShareIMInfo$$Parcelable.write(this.shareIMInfo$$0, p0, p1, new a());
    }
}
