package com.kwai.feature.component.photofeatures.reward.model.response.RewardPanelInfoResponse$PanelInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.feature.component.photofeatures.reward.model.response.RewardPanelInfoResponse$PanelInfo$$Parcelable$a;
import com.kwai.feature.component.photofeatures.reward.model.response.RewardPanelInfoResponse$PanelInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.util.ArrayList;
import com.kwai.feature.component.photofeatures.reward.model.response.RewardPanelInfoResponse$KsCoinLevel;
import com.kwai.feature.component.photofeatures.reward.model.response.RewardPanelInfoResponse$KsCoinLevel$$Parcelable;
import com.kwai.feature.component.photofeatures.reward.model.response.RewardPanelInfoResponse$CustomLevelInfo;
import com.kwai.feature.component.photofeatures.reward.model.response.RewardPanelInfoResponse$CustomLevelInfo$$Parcelable;
import com.kwai.framework.model.user.UserInfo;
import com.kwai.framework.model.user.UserInfo$$Parcelable;
import java.util.List;
import java.util.Iterator;

public class RewardPanelInfoResponse$PanelInfo$$Parcelable implements Parcelable, d	// class@00124f
{
    public RewardPanelInfoResponse$PanelInfo panelInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       RewardPanelInfoResponse$PanelInfo$$Parcelable.CREATOR = new RewardPanelInfoResponse$PanelInfo$$Parcelable$a();
    }
    public void RewardPanelInfoResponse$PanelInfo$$Parcelable(RewardPanelInfoResponse$PanelInfo p0){
       super();
       this.panelInfo$$0 = p0;
    }
    public static RewardPanelInfoResponse$PanelInfo read(Parcel p0,a p1){
       List list1;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          RewardPanelInfoResponse$PanelInfo panelInfo = new RewardPanelInfoResponse$PanelInfo();
          p1.f(p1.g(), panelInfo);
          int i1 = p0.readInt();
          List list = null;
          int i2 = 0;
          if (i1 < 0) {
             list1 = list;
          }else {
             list1 = new ArrayList(i1);
             for (int i3 = 0; i3 < i1; i3 = i3 + 1) {
                list1.add(RewardPanelInfoResponse$KsCoinLevel$$Parcelable.read(p0, p1));
             }
          }
          panelInfo.mKsCoinLevels = list1;
          panelInfo.mCustomLevelInfo = RewardPanelInfoResponse$CustomLevelInfo$$Parcelable.read(p0, p1);
          i1 = p0.readInt();
          if (i1 >= 0) {
             list = new ArrayList(i1);
             for (; i2 < i1; i2 = i2 + 1) {
                list.add(UserInfo$$Parcelable.read(p0, p1));
             }
          }
          panelInfo.mRewarders = list;
          panelInfo.mKsCoinBalance = p0.readLong();
          panelInfo.mButtonRewardAgainText = p0.readString();
          panelInfo.mRewardText = p0.readString();
          panelInfo.mMaxAmount = p0.readLong();
          panelInfo.mButtonChargeText = p0.readString();
          panelInfo.mButtonText = p0.readString();
          panelInfo.mMinAmount = p0.readLong();
          panelInfo.mMessageConfirm = p0.readString();
          p1.f(i, panelInfo);
          return panelInfo;
       }
    }
    public static void write(RewardPanelInfoResponse$PanelInfo p0,Parcel p1,int p2,a p3){
       Iterator iterator;
       int i = p3.c(p0);
       int i1 = -1;
       if (i != i1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          RewardPanelInfoResponse$PanelInfo mKsCoinLevel = p0.mKsCoinLevels;
          if (mKsCoinLevel == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mKsCoinLevel.size());
             iterator = p0.mKsCoinLevels.iterator();
             while (iterator.hasNext()) {
                RewardPanelInfoResponse$KsCoinLevel$$Parcelable.write(iterator.next(), p1, p2, p3);
             }
          }
          RewardPanelInfoResponse$CustomLevelInfo$$Parcelable.write(p0.mCustomLevelInfo, p1, p2, p3);
          mKsCoinLevel = p0.mRewarders;
          if (mKsCoinLevel == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mKsCoinLevel.size());
             iterator = p0.mRewarders.iterator();
             while (iterator.hasNext()) {
                UserInfo$$Parcelable.write(iterator.next(), p1, p2, p3);
             }
          }
          p1.writeLong(p0.mKsCoinBalance);
          p1.writeString(p0.mButtonRewardAgainText);
          p1.writeString(p0.mRewardText);
          p1.writeLong(p0.mMaxAmount);
          p1.writeString(p0.mButtonChargeText);
          p1.writeString(p0.mButtonText);
          p1.writeLong(p0.mMinAmount);
          p1.writeString(p0.mMessageConfirm);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public RewardPanelInfoResponse$PanelInfo getParcel(){
       return this.panelInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       RewardPanelInfoResponse$PanelInfo$$Parcelable.write(this.panelInfo$$0, p0, p1, new a());
    }
}
