package com.kwai.components.feedmodel.RewardPhotoInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.components.feedmodel.RewardPhotoInfo$$Parcelable$a;
import com.kwai.components.feedmodel.RewardPhotoInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.io.Serializable;
import com.kwai.components.feedmodel.RewardPhotoInfo$RewardBubbleInfo;
import java.util.ArrayList;
import com.kwai.framework.model.user.UserInfo;
import com.kwai.framework.model.user.UserInfo$$Parcelable;
import java.util.List;
import java.util.Iterator;

public class RewardPhotoInfo$$Parcelable implements Parcelable, d	// class@000c36
{
    public RewardPhotoInfo rewardPhotoInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       RewardPhotoInfo$$Parcelable.CREATOR = new RewardPhotoInfo$$Parcelable$a();
    }
    public void RewardPhotoInfo$$Parcelable(RewardPhotoInfo p0){
       super();
       this.rewardPhotoInfo$$0 = p0;
    }
    public static RewardPhotoInfo read(Parcel p0,a p1){
       List list;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          RewardPhotoInfo rewardPhotoI = new RewardPhotoInfo();
          p1.f(p1.g(), rewardPhotoI);
          boolean b = false;
          boolean b1 = (p0.readInt() == 1)? true: false;
          rewardPhotoI.mHeadButton = b1;
          rewardPhotoI.mRewardBubbleInfo = p0.readSerializable();
          rewardPhotoI.mDescClickableText = p0.readString();
          b1 = p0.readInt();
          if (b1 < 0) {
             list = null;
          }else {
             ArrayList uArrayList = new ArrayList(b1);
             for (int i1 = 0; i1 < b1; i1 = i1 + 1) {
                uArrayList.add(UserInfo$$Parcelable.read(p0, p1));
             }
             list = uArrayList;
          }
          rewardPhotoI.mRewaders = list;
          b1 = (p0.readInt() == 1)? true: false;
          rewardPhotoI.mCanReward = b1;
          rewardPhotoI.mDescNotClickText = p0.readString();
          rewardPhotoI.mActionUrl = p0.readString();
          rewardPhotoI.mRewardOptionType = p0.readInt();
          b1 = (p0.readInt() == 1)? true: false;
          rewardPhotoI.mHasReward = b1;
          rewardPhotoI.mRewardCount = p0.readInt();
          b1 = (p0.readInt() == 1)? true: false;
          rewardPhotoI.mHeadButtonNow = b1;
          if (p0.readInt() == 1) {
             b = true;
          }
          rewardPhotoI.mEnableHoverEntrance = b;
          p1.f(i, rewardPhotoI);
          return rewardPhotoI;
       }
    }
    public static void write(RewardPhotoInfo p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       int i1 = -1;
       if (i != i1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mHeadButton);
          p1.writeSerializable(p0.mRewardBubbleInfo);
          p1.writeString(p0.mDescClickableText);
          RewardPhotoInfo mRewaders = p0.mRewaders;
          if (mRewaders == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mRewaders.size());
             Iterator iterator = p0.mRewaders.iterator();
             while (iterator.hasNext()) {
                UserInfo$$Parcelable.write(iterator.next(), p1, p2, p3);
             }
          }
          p1.writeInt(p0.mCanReward);
          p1.writeString(p0.mDescNotClickText);
          p1.writeString(p0.mActionUrl);
          p1.writeInt(p0.mRewardOptionType);
          p1.writeInt(p0.mHasReward);
          p1.writeInt(p0.mRewardCount);
          p1.writeInt(p0.mHeadButtonNow);
          p1.writeInt(p0.mEnableHoverEntrance);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public RewardPhotoInfo getParcel(){
       return this.rewardPhotoInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       RewardPhotoInfo$$Parcelable.write(this.rewardPhotoInfo$$0, p0, p1, new a());
    }
}
