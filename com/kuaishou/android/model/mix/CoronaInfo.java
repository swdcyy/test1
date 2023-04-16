package com.kuaishou.android.model.mix.CoronaInfo;
import java.io.Serializable;
import java.lang.Object;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import tl8.d;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Boolean;

public class CoronaInfo implements Serializable	// class@000c12
{
    public String mBgColor;
    public int mCardPlayType;
    public int mCardStyleType;
    public String mCover;
    public String mDarkBgColor;
    public Map mExpParams;
    public QRecoTag mNegativeDetailReason;
    public FeedNegativeFeedback$NegativeReason mNegativeReason;
    public long mNegativeTimestamp;
    public String mSubTitle;
    public String mTitle;
    public static final long serialVersionUID = 0x708b53350ae4bd95;

    public void CoronaInfo(){
       super();
    }
    public void CoronaInfo(int p0,int p1){
       super();
       this.mCardStyleType = p0;
       this.mCardPlayType = p1;
    }
    public static int getViewType(BaseFeed p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, CoronaInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       CoronaInfo uCoronaInfo = p0.a(CoronaInfo.class);
       if (uCoronaInfo != null) {
          return uCoronaInfo.mCardStyleType;
       }
       return 0;
    }
    public static int getViewType(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, CoronaInfo.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (p0 == null || p0.getEntity() == null) {
          return 0;
       }
       return CoronaInfo.getViewType(p0.getEntity());
    }
    public static boolean isBigCard(int p0){
       boolean b = (p0 != 5 && (p0 != 7 && (p0 != 14 && (p0 != 8 && (p0 != 22 && (p0 != 23 && (p0 != 24 && (p0 != 30 && (p0 != 40 && (p0 != 44 && (p0 != 35 && (p0 != 42 && (p0 != 1023 && (p0 != 46 && (p0 != 47 && (p0 != 48 && (p0 != 49 && (p0 == 50 || p0 == 51))))))))))))))))))? true: false;
       return b;
    }
    public static boolean isBigCard(BaseFeed p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, CoronaInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       CoronaInfo uCoronaInfo = p0.a(CoronaInfo.class);
       if (uCoronaInfo != null) {
          return CoronaInfo.isBigCard(uCoronaInfo.mCardStyleType);
       }
       return false;
    }
    public static boolean isBigCardPlayer(int p0){
       boolean b = (p0 != 23 && (p0 != 24 && (p0 == 42 || p0 == 1023)))? true: false;
       return b;
    }
    public static boolean isDefaultSmallCardStyle(int p0){
       int i = 1;
       if (p0 == i) {
       }else {
          i = false;
       }
       return i;
    }
    public static boolean isZoneBigCard(int p0){
       boolean b = (p0 != 5 && (p0 == 30 || p0 == 40))? true: false;
       return b;
    }
    public static boolean isZoneBigCard(BaseFeed p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, CoronaInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       CoronaInfo uCoronaInfo = p0.a(CoronaInfo.class);
       if (uCoronaInfo != null) {
          return CoronaInfo.isZoneBigCard(uCoronaInfo.mCardStyleType);
       }
       return false;
    }
    public static boolean isZoneThreeeCard(int p0){
       boolean b = (p0 == 44)? true: false;
       return b;
    }
    public static boolean isZoneThreeeCard(BaseFeed p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, CoronaInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 == null) {
          return false;
       }
       CoronaInfo uCoronaInfo = p0.a(CoronaInfo.class);
       if (uCoronaInfo != null) {
          return CoronaInfo.isZoneThreeeCard(uCoronaInfo.mCardStyleType);
       }
       return false;
    }
}
