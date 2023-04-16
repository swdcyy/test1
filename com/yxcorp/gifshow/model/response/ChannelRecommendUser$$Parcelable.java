package com.yxcorp.gifshow.model.response.ChannelRecommendUser$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.model.response.ChannelRecommendUser$$Parcelable$a;
import com.yxcorp.gifshow.model.response.ChannelRecommendUser;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.util.ArrayList;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.model.CDNUrl$$Parcelable;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.entity.QPhoto$$Parcelable;
import com.yxcorp.gifshow.model.response.ChannelRecommendUser$ChannelLivingInfo;
import com.yxcorp.gifshow.model.response.ChannelRecommendUser$ChannelLivingInfo$$Parcelable;
import java.util.List;
import java.util.Iterator;

public class ChannelRecommendUser$$Parcelable implements Parcelable, d	// class@001f1d
{
    public ChannelRecommendUser channelRecommendUser$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       ChannelRecommendUser$$Parcelable.CREATOR = new ChannelRecommendUser$$Parcelable$a();
    }
    public void ChannelRecommendUser$$Parcelable(ChannelRecommendUser p0){
       super();
       this.channelRecommendUser$$0 = p0;
    }
    public static ChannelRecommendUser read(Parcel p0,a p1){
       List list;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          ChannelRecommendUser uChannelReco = new ChannelRecommendUser();
          p1.f(p1.g(), uChannelReco);
          int i1 = 0;
          boolean b = true;
          boolean b1 = (p0.readInt() == b)? true: false;
          uChannelReco.mShowCoverOrder = b1;
          b1 = (p0.readInt() == b)? true: false;
          uChannelReco.mHasLogUserShow = b1;
          uChannelReco.mUserId = p0.readString();
          uChannelReco.mRecommendReason = p0.readString();
          uChannelReco.mUserName = p0.readString();
          if (p0.readInt() != b) {
             b = false;
          }
          uChannelReco.mIsFollowing = b;
          b1 = p0.readInt();
          if (b1 < 0) {
             list = null;
          }else {
             ArrayList uArrayList = new ArrayList(b1);
             for (; i1 < b1; i1 = i1 + 1) {
                uArrayList.add(CDNUrl$$Parcelable.read(p0, p1));
             }
             list = uArrayList;
          }
          uChannelReco.mHeadUrls = list;
          uChannelReco.mPhoto = QPhoto$$Parcelable.read(p0, p1);
          uChannelReco.mLivingInfo = ChannelRecommendUser$ChannelLivingInfo$$Parcelable.read(p0, p1);
          p1.f(i, uChannelReco);
          return uChannelReco;
       }
    }
    public static void write(ChannelRecommendUser p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       int i1 = -1;
       if (i != i1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mShowCoverOrder);
          p1.writeInt(p0.mHasLogUserShow);
          p1.writeString(p0.mUserId);
          p1.writeString(p0.mRecommendReason);
          p1.writeString(p0.mUserName);
          p1.writeInt(p0.mIsFollowing);
          ChannelRecommendUser mHeadUrls = p0.mHeadUrls;
          if (mHeadUrls == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mHeadUrls.size());
             Iterator iterator = p0.mHeadUrls.iterator();
             while (iterator.hasNext()) {
                CDNUrl$$Parcelable.write(iterator.next(), p1, p2, p3);
             }
          }
          QPhoto$$Parcelable.write(p0.mPhoto, p1, p2, p3);
          ChannelRecommendUser$ChannelLivingInfo$$Parcelable.write(p0.mLivingInfo, p1, p2, p3);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public ChannelRecommendUser getParcel(){
       return this.channelRecommendUser$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       ChannelRecommendUser$$Parcelable.write(this.channelRecommendUser$$0, p0, p1, new a());
    }
}
