package com.yxcorp.gifshow.model.response.HotChannelColumn$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.model.response.HotChannelColumn$$Parcelable$a;
import com.yxcorp.gifshow.model.response.HotChannelColumn;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.util.ArrayList;
import com.yxcorp.gifshow.model.response.ChannelRecommendUser;
import com.yxcorp.gifshow.model.response.ChannelRecommendUser$$Parcelable;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.entity.QPhoto$$Parcelable;
import com.kuaishou.android.model.mix.ChannelContentListInfo;
import com.kuaishou.android.model.mix.ChannelContentListInfo$$Parcelable;
import java.util.List;
import java.util.Iterator;

public class HotChannelColumn$$Parcelable implements Parcelable, d	// class@001f39
{
    public HotChannelColumn hotChannelColumn$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       HotChannelColumn$$Parcelable.CREATOR = new HotChannelColumn$$Parcelable$a();
    }
    public void HotChannelColumn$$Parcelable(HotChannelColumn p0){
       super();
       this.hotChannelColumn$$0 = p0;
    }
    public static HotChannelColumn read(Parcel p0,a p1){
       List list1;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          HotChannelColumn hotChannelCo = new HotChannelColumn();
          p1.f(p1.g(), hotChannelCo);
          int i1 = p0.readInt();
          List list = null;
          boolean b = false;
          if (i1 < 0) {
             list1 = list;
          }else {
             list1 = new ArrayList(i1);
             for (int i3 = 0; i3 < i1; i3 = i3 + 1) {
                list1.add(ChannelRecommendUser$$Parcelable.read(p0, p1));
             }
          }
          hotChannelCo.mRecommendUsers = list1;
          hotChannelCo.mFullColumnId = p0.readLong();
          i1 = p0.readInt();
          if (i1 >= 0) {
             list = new ArrayList(i1);
             for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
                list.add(QPhoto$$Parcelable.read(p0, p1));
             }
          }
          hotChannelCo.mColumnItems = list;
          hotChannelCo.mTopListTitle = p0.readString();
          hotChannelCo.mContentListInfo = ChannelContentListInfo$$Parcelable.read(p0, p1);
          hotChannelCo.mSubTitle = p0.readString();
          hotChannelCo.mPcursor = p0.readString();
          hotChannelCo.mMainTitle = p0.readString();
          hotChannelCo.mBannerUrl = p0.readString();
          if (p0.readInt() == 1) {
             b = true;
          }
          hotChannelCo.mIsUseDarkButton = b;
          hotChannelCo.mTopListSubitle = p0.readString();
          hotChannelCo.mSubTitleUrl = p0.readString();
          hotChannelCo.mTotalNum = p0.readInt();
          hotChannelCo.mTopListTitleColor = p0.readString();
          hotChannelCo.mTopListSubtitleColor = p0.readString();
          hotChannelCo.mFullColumnType = p0.readString();
          p1.f(i, hotChannelCo);
          return hotChannelCo;
       }
    }
    public static void write(HotChannelColumn p0,Parcel p1,int p2,a p3){
       Iterator iterator;
       int i = p3.c(p0);
       int i1 = -1;
       if (i != i1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          HotChannelColumn mRecommendUs = p0.mRecommendUsers;
          if (mRecommendUs == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mRecommendUs.size());
             iterator = p0.mRecommendUsers.iterator();
             while (iterator.hasNext()) {
                ChannelRecommendUser$$Parcelable.write(iterator.next(), p1, p2, p3);
             }
          }
          p1.writeLong(p0.mFullColumnId);
          mRecommendUs = p0.mColumnItems;
          if (mRecommendUs == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mRecommendUs.size());
             iterator = p0.mColumnItems.iterator();
             while (iterator.hasNext()) {
                QPhoto$$Parcelable.write(iterator.next(), p1, p2, p3);
             }
          }
          p1.writeString(p0.mTopListTitle);
          ChannelContentListInfo$$Parcelable.write(p0.mContentListInfo, p1, p2, p3);
          p1.writeString(p0.mSubTitle);
          p1.writeString(p0.mPcursor);
          p1.writeString(p0.mMainTitle);
          p1.writeString(p0.mBannerUrl);
          p1.writeInt(p0.mIsUseDarkButton);
          p1.writeString(p0.mTopListSubitle);
          p1.writeString(p0.mSubTitleUrl);
          p1.writeInt(p0.mTotalNum);
          p1.writeString(p0.mTopListTitleColor);
          p1.writeString(p0.mTopListSubtitleColor);
          p1.writeString(p0.mFullColumnType);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public HotChannelColumn getParcel(){
       return this.hotChannelColumn$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       HotChannelColumn$$Parcelable.write(this.hotChannelColumn$$0, p0, p1, new a());
    }
}
