package com.kuaishou.android.model.mix.RankInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.mix.RankInfo$$Parcelable$a;
import com.kuaishou.android.model.mix.RankInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.kwai.framework.model.common.Distance;
import com.kwai.framework.model.common.Distance$$Parcelable;

public class RankInfo$$Parcelable implements Parcelable, d	// class@000ddb
{
    public RankInfo rankInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       RankInfo$$Parcelable.CREATOR = new RankInfo$$Parcelable$a();
    }
    public void RankInfo$$Parcelable(RankInfo p0){
       super();
       this.rankInfo$$0 = p0;
    }
    public static RankInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          RankInfo rankInfo = new RankInfo();
          p1.f(p1.g(), rankInfo);
          rankInfo.mLikeCount = p0.readString();
          rankInfo.mDetail = p0.readString();
          rankInfo.mRuleText = p0.readString();
          rankInfo.mRankId = p0.readString();
          rankInfo.mUpdateTime = p0.readString();
          rankInfo.mDistance = Distance$$Parcelable.read(p0, p1);
          rankInfo.mLinkUrl = p0.readString();
          rankInfo.mType = p0.readInt();
          rankInfo.mOrder = p0.readInt();
          rankInfo.mViewCount = p0.readString();
          rankInfo.mCity = p0.readString();
          rankInfo.mTypeName = p0.readString();
          rankInfo.mTitle = p0.readString();
          rankInfo.mRuleLinkUrl = p0.readString();
          p1.f(i, rankInfo);
          return rankInfo;
       }
    }
    public static void write(RankInfo p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mLikeCount);
          p1.writeString(p0.mDetail);
          p1.writeString(p0.mRuleText);
          p1.writeString(p0.mRankId);
          p1.writeString(p0.mUpdateTime);
          Distance$$Parcelable.write(p0.mDistance, p1, p2, p3);
          p1.writeString(p0.mLinkUrl);
          p1.writeInt(p0.mType);
          p1.writeInt(p0.mOrder);
          p1.writeString(p0.mViewCount);
          p1.writeString(p0.mCity);
          p1.writeString(p0.mTypeName);
          p1.writeString(p0.mTitle);
          p1.writeString(p0.mRuleLinkUrl);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public RankInfo getParcel(){
       return this.rankInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       RankInfo$$Parcelable.write(this.rankInfo$$0, p0, p1, new a());
    }
}
