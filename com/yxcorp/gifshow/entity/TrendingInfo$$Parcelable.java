package com.yxcorp.gifshow.entity.TrendingInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.entity.TrendingInfo$$Parcelable$a;
import com.yxcorp.gifshow.entity.TrendingInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.io.Serializable;
import com.yxcorp.gifshow.entity.TrendingInfo$SubTrendingInfo;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.model.CDNUrl$$Parcelable;
import java.util.List;
import java.util.Iterator;

public class TrendingInfo$$Parcelable implements Parcelable, d	// class@000d82
{
    public TrendingInfo trendingInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       TrendingInfo$$Parcelable.CREATOR = new TrendingInfo$$Parcelable$a();
    }
    public void TrendingInfo$$Parcelable(TrendingInfo p0){
       super();
       this.trendingInfo$$0 = p0;
    }
    public static TrendingInfo read(Parcel p0,a p1){
       List list;
       CDNUrl[] uCDNUrlArray1;
       int i3;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          TrendingInfo trendingInfo = new TrendingInfo();
          p1.f(p1.g(), trendingInfo);
          trendingInfo.mIconWidth = p0.readInt();
          trendingInfo.mHeating = p0.readString();
          int i1 = p0.readInt();
          CDNUrl[] uCDNUrlArray = null;
          int i2 = 0;
          if (i1 < 0) {
             list = uCDNUrlArray;
          }else {
             list = new ArrayList(i1);
             for (i3 = 0; i3 < i1; i3 = i3 + 1) {
                list.add(p0.readSerializable());
             }
          }
          trendingInfo.mSubTrendingInfos = list;
          boolean b = true;
          if (p0.readInt() != b) {
             b = false;
          }
          trendingInfo.mEnableRelatedHotspot = b;
          trendingInfo.mId = p0.readString();
          trendingInfo.mChallengeBoardPostScheme = p0.readString();
          trendingInfo.mLinkUrl = p0.readString();
          i1 = p0.readInt();
          if (i1 < 0) {
             uCDNUrlArray1 = uCDNUrlArray;
          }else {
             uCDNUrlArray1 = new CDNUrl[i1];
             for (i3 = 0; i3 < i1; i3 = i3 + 1) {
                uCDNUrlArray1[i3] = CDNUrl$$Parcelable.read(p0, p1);
             }
          }
          trendingInfo.mIconUrl = uCDNUrlArray1;
          trendingInfo.mFeedCount = p0.readInt();
          trendingInfo.mViewCount = p0.readLong();
          trendingInfo.mTrendingType = p0.readString();
          i1 = p0.readInt();
          if (i1 >= 0) {
             uCDNUrlArray = new CDNUrl[i1];
             for (; i2 < i1; i2 = i2 + 1) {
                uCDNUrlArray[i2] = CDNUrl$$Parcelable.read(p0, p1);
             }
          }
          trendingInfo.mCoverUrls = uCDNUrlArray;
          trendingInfo.mTrendingLocationString = p0.readString();
          trendingInfo.mIconHeight = p0.readInt();
          trendingInfo.mTypeName = p0.readString();
          trendingInfo.mTop = p0.readInt();
          trendingInfo.mWordId = p0.readString();
          trendingInfo.mDesc = p0.readString();
          p1.f(i, trendingInfo);
          return trendingInfo;
       }
    }
    public static void write(TrendingInfo p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       int i1 = -1;
       if (i != i1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mIconWidth);
          p1.writeString(p0.mHeating);
          TrendingInfo mSubTrending = p0.mSubTrendingInfos;
          if (mSubTrending == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mSubTrending.size());
             Iterator iterator = p0.mSubTrendingInfos.iterator();
             while (iterator.hasNext()) {
                p1.writeSerializable(iterator.next());
             }
          }
          p1.writeInt(p0.mEnableRelatedHotspot);
          p1.writeString(p0.mId);
          p1.writeString(p0.mChallengeBoardPostScheme);
          p1.writeString(p0.mLinkUrl);
          mSubTrending = p0.mIconUrl;
          int i2 = 0;
          if (mSubTrending == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mSubTrending.length);
             mSubTrending = p0.mIconUrl;
             int len = mSubTrending.length;
             for (int i3 = 0; i3 < len; i3 = i3 + 1) {
                CDNUrl$$Parcelable.write(mSubTrending[i3], p1, p2, p3);
             }
          }
          p1.writeInt(p0.mFeedCount);
          p1.writeLong(p0.mViewCount);
          p1.writeString(p0.mTrendingType);
          mSubTrending = p0.mCoverUrls;
          if (mSubTrending == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mSubTrending.length);
             mSubTrending = p0.mCoverUrls;
             i1 = mSubTrending.length;
             for (; i2 < i1; i2 = i2 + 1) {
                CDNUrl$$Parcelable.write(mSubTrending[i2], p1, p2, p3);
             }
          }
          p1.writeString(p0.mTrendingLocationString);
          p1.writeInt(p0.mIconHeight);
          p1.writeString(p0.mTypeName);
          p1.writeInt(p0.mTop);
          p1.writeString(p0.mWordId);
          p1.writeString(p0.mDesc);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public TrendingInfo getParcel(){
       return this.trendingInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       TrendingInfo$$Parcelable.write(this.trendingInfo$$0, p0, p1, new a());
    }
}
