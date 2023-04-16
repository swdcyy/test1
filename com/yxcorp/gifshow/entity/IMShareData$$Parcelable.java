package com.yxcorp.gifshow.entity.IMShareData$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.entity.IMShareData$$Parcelable$a;
import com.yxcorp.gifshow.entity.IMShareData;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.kwai.framework.model.user.User;
import com.kwai.framework.model.user.User$$Parcelable;
import java.io.Serializable;
import com.yxcorp.gifshow.entity.MultiImageLinkInfo;
import com.yxcorp.gifshow.entity.LinkInfo;
import com.yxcorp.gifshow.entity.LinkInfo$$Parcelable;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.framework.model.feed.BaseFeed$$Parcelable;
import java.lang.Boolean;

public class IMShareData$$Parcelable implements Parcelable, d	// class@000d64
{
    public IMShareData iMShareData$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       IMShareData$$Parcelable.CREATOR = new IMShareData$$Parcelable$a();
    }
    public void IMShareData$$Parcelable(IMShareData p0){
       super();
       this.iMShareData$$0 = p0;
    }
    public static IMShareData read(Parcel p0,a p1){
       Boolean uBoolean;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          IMShareData iMShareData = new IMShareData();
          p1.f(p1.g(), iMShareData);
          iMShareData.mUser = User$$Parcelable.read(p0, p1);
          iMShareData.mActionUri = p0.readString();
          iMShareData.mCommentText = p0.readString();
          iMShareData.mMultiImageLinkInfo = p0.readSerializable();
          iMShareData.mLinkInfo = LinkInfo$$Parcelable.read(p0, p1);
          iMShareData.mPlatformData2InfoType = p0.readInt();
          iMShareData.mShareId = p0.readString();
          iMShareData.mShowFriendList = p0.readInt();
          iMShareData.mFeed = BaseFeed$$Parcelable.read(p0, p1);
          if (p0.readInt() < 0) {
             uBoolean = null;
          }else {
             boolean b = true;
             if (p0.readInt() != b) {
                b = false;
             }
             uBoolean = Boolean.valueOf(b);
          }
          iMShareData.mUseParamAction = uBoolean;
          p1.f(i, iMShareData);
          return iMShareData;
       }
    }
    public static void write(IMShareData p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          User$$Parcelable.write(p0.mUser, p1, p2, p3);
          p1.writeString(p0.mActionUri);
          p1.writeString(p0.mCommentText);
          p1.writeSerializable(p0.mMultiImageLinkInfo);
          LinkInfo$$Parcelable.write(p0.mLinkInfo, p1, p2, p3);
          p1.writeInt(p0.mPlatformData2InfoType);
          p1.writeString(p0.mShareId);
          p1.writeInt(p0.mShowFriendList);
          BaseFeed$$Parcelable.write(p0.mFeed, p1, p2, p3);
          if (p0.mUseParamAction == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(1);
             p1.writeInt(p0.mUseParamAction.booleanValue());
          }
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public IMShareData getParcel(){
       return this.iMShareData$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       IMShareData$$Parcelable.write(this.iMShareData$$0, p0, p1, new a());
    }
}
