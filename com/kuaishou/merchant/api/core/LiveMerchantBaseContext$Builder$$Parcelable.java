package com.kuaishou.merchant.api.core.LiveMerchantBaseContext$Builder$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.merchant.api.core.LiveMerchantBaseContext$Builder$$Parcelable$a;
import com.kuaishou.merchant.api.core.LiveMerchantBaseContext$Builder;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.framework.model.feed.BaseFeed$$Parcelable;
import java.io.Serializable;
import com.kuaishou.merchant.api.core.model.MerchantAudienceParams;
import com.kuaishou.merchant.api.core.LiveMerchantSkin;
import com.kuaishou.merchant.api.core.LiveMerchantBaseContext$c;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kwai.framework.model.user.User;
import com.kwai.framework.model.user.User$$Parcelable;
import com.kuaishou.merchant.api.core.model.MerchantLivePlayConfig;

public class LiveMerchantBaseContext$Builder$$Parcelable implements Parcelable, d	// class@0014ff
{
    public LiveMerchantBaseContext$Builder builder$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       LiveMerchantBaseContext$Builder$$Parcelable.CREATOR = new LiveMerchantBaseContext$Builder$$Parcelable$a();
    }
    public void LiveMerchantBaseContext$Builder$$Parcelable(LiveMerchantBaseContext$Builder p0){
       super();
       this.builder$$0 = p0;
    }
    public static LiveMerchantBaseContext$Builder read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          LiveMerchantBaseContext$Builder uBuilder = new LiveMerchantBaseContext$Builder();
          p1.f(p1.g(), uBuilder);
          uBuilder.mLiveFeed = BaseFeed$$Parcelable.read(p0, p1);
          uBuilder.mCarrierId = p0.readString();
          uBuilder.mMerchantAudienceParams = p0.readSerializable();
          uBuilder.mMerchantSessionId = p0.readString();
          uBuilder.mLiveMerchantSkin = p0.readSerializable();
          uBuilder.mJumpParams = p0.readString();
          uBuilder.mServerExpTag = p0.readString();
          uBuilder.mFansGroupLevel = p0.readInt();
          uBuilder.mLivePayload = p0.readString();
          uBuilder.mLiveAuthorId = p0.readString();
          uBuilder.mLiveType = p0.readInt();
          boolean b = false;
          boolean b1 = (p0.readInt() == 1)? true: false;
          uBuilder.mIsAnonymousLive = b1;
          uBuilder.mPlayerControllerHashCode = p0.readInt();
          uBuilder.mLiveStreamId = p0.readString();
          uBuilder.mLiveStreamPackage = new LiveMerchantBaseContext$c().c(p0);
          if (p0.readInt() == 1) {
             b = true;
          }
          uBuilder.mNeedDowngrade = b;
          uBuilder.mLiveAuthorUser = User$$Parcelable.read(p0, p1);
          uBuilder.mMerchantLivePlayConfig = p0.readSerializable();
          p1.f(i, uBuilder);
          return uBuilder;
       }
    }
    public static void write(LiveMerchantBaseContext$Builder p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          BaseFeed$$Parcelable.write(p0.mLiveFeed, p1, p2, p3);
          p1.writeString(p0.mCarrierId);
          p1.writeSerializable(p0.mMerchantAudienceParams);
          p1.writeString(p0.mMerchantSessionId);
          p1.writeSerializable(p0.mLiveMerchantSkin);
          p1.writeString(p0.mJumpParams);
          p1.writeString(p0.mServerExpTag);
          p1.writeInt(p0.mFansGroupLevel);
          p1.writeString(p0.mLivePayload);
          p1.writeString(p0.mLiveAuthorId);
          p1.writeInt(p0.mLiveType);
          p1.writeInt(p0.mIsAnonymousLive);
          p1.writeInt(p0.mPlayerControllerHashCode);
          p1.writeString(p0.mLiveStreamId);
          new LiveMerchantBaseContext$c().d(p0.mLiveStreamPackage, p1);
          p1.writeInt(p0.mNeedDowngrade);
          User$$Parcelable.write(p0.mLiveAuthorUser, p1, p2, p3);
          p1.writeSerializable(p0.mMerchantLivePlayConfig);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public LiveMerchantBaseContext$Builder getParcel(){
       return this.builder$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       LiveMerchantBaseContext$Builder$$Parcelable.write(this.builder$$0, p0, p1, new a());
    }
}
