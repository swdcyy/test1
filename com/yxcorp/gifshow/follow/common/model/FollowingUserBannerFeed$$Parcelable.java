package com.yxcorp.gifshow.follow.common.model.FollowingUserBannerFeed$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.follow.common.model.FollowingUserBannerFeed$$Parcelable$a;
import com.yxcorp.gifshow.follow.common.model.FollowingUserBannerFeed;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.kuaishou.android.model.mix.ExtMeta;
import com.kuaishou.android.model.mix.ExtMeta$$Parcelable;
import com.kuaishou.android.model.mix.CommonMeta;
import com.kuaishou.android.model.mix.CommonMeta$$Parcelable;
import lp.a;
import com.kwai.framework.model.user.User;
import java.io.Serializable;
import com.yxcorp.gifshow.follow.common.model.FollowingUserBannerFeed$UserBannerInfoList;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Class;
import org.parceler.a;
import com.kwai.framework.model.decompose.api.SyncableProviderContainer;
import ga6.c;
import java.util.Map;
import ywd.j;
import org.parceler.a$c;

public class FollowingUserBannerFeed$$Parcelable implements Parcelable, d	// class@001053
{
    public FollowingUserBannerFeed followingUserBannerFeed$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       FollowingUserBannerFeed$$Parcelable.CREATOR = new FollowingUserBannerFeed$$Parcelable$a();
    }
    public void FollowingUserBannerFeed$$Parcelable(FollowingUserBannerFeed p0){
       super();
       this.followingUserBannerFeed$$0 = p0;
    }
    public static FollowingUserBannerFeed read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          FollowingUserBannerFeed uFollowingUs = new FollowingUserBannerFeed();
          p1.f(p1.g(), uFollowingUs);
          uFollowingUs.mExtMeta = ExtMeta$$Parcelable.read(p0, p1);
          uFollowingUs.mCommonMeta = CommonMeta$$Parcelable.read(p0, p1);
          uFollowingUs.mLogUser = new a().c(p0);
          uFollowingUs.mUserBannerInfoList = p0.readSerializable();
          a.d(BaseFeed.class, uFollowingUs, "mGrootId", p0.readString());
          a.d(SyncableProviderContainer.class, uFollowingUs, "dataMap", new c().d(p0));
          p1.f(i, uFollowingUs);
          return uFollowingUs;
       }
    }
    public static void write(FollowingUserBannerFeed p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          ExtMeta$$Parcelable.write(p0.mExtMeta, p1, p2, p3);
          CommonMeta$$Parcelable.write(p0.mCommonMeta, p1, p2, p3);
          new a().d(p0.mLogUser, p1);
          p1.writeSerializable(p0.mUserBannerInfoList);
          p1.writeString(a.b(String.class, BaseFeed.class, p0, "mGrootId"));
          new c().i(a.c(new a$c(), SyncableProviderContainer.class, p0, "dataMap"), p1);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public FollowingUserBannerFeed getParcel(){
       return this.followingUserBannerFeed$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       FollowingUserBannerFeed$$Parcelable.write(this.followingUserBannerFeed$$0, p0, p1, new a());
    }
}
