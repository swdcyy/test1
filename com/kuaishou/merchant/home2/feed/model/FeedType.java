package com.kuaishou.merchant.home2.feed.model.FeedType;
import kx3.d;
import java.lang.Enum;
import com.kuaishou.merchant.home2.feed.model.FeedType$1;
import java.lang.String;
import com.kuaishou.merchant.home2.feed.model.FeedType$2;
import com.kuaishou.merchant.home2.feed.model.FeedType$3;
import com.kuaishou.merchant.home2.feed.model.FeedType$4;
import com.kuaishou.merchant.home2.feed.model.FeedType$5;
import com.kuaishou.merchant.home2.feed.model.FeedType$6;
import com.kuaishou.merchant.home2.feed.model.FeedType$7;
import com.kuaishou.merchant.home2.feed.model.FeedType$8;
import com.kuaishou.merchant.home2.feed.model.FeedType$9;
import com.kuaishou.merchant.home2.feed.model.FeedType$10;
import com.kuaishou.merchant.home2.feed.model.FeedType$11;
import com.kuaishou.merchant.home2.feed.model.FeedType$12;
import com.kuaishou.merchant.home2.feed.model.FeedType$13;
import com.kuaishou.merchant.home2.feed.model.FeedType$14;
import com.kuaishou.merchant.home2.feed.model.FeedType$15;
import com.kuaishou.merchant.home2.feed.model.FeedType$16;
import java.util.HashMap;
import com.kuaishou.merchant.home2.feed.model.BaseFeed;
import java.lang.Class;
import java.lang.Object;
import java.util.Map;
import ny3.a;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ok.h;
import java.lang.Integer;
import tw3.b;
import com.kuaishou.merchant.home2.feed.model.UnknownFeed;
import kx3.b;
import kx3.c;

public abstract class FeedType extends Enum implements d	// class@0017af
{
    public final int mType;
    public static final FeedType[] $VALUES;
    public static final FeedType ACTIVITY_BANNER;
    public static final FeedType ACTIVITY_CARD;
    public static final FeedType ACTIVITY_COMMODITY;
    public static final FeedType ACTIVITY_LIVE;
    public static final FeedType ACTIVITY_RESERVATION;
    public static final FeedType ACTIVITY_VIDEO;
    public static final FeedType BRAND_LIVE_CARD;
    public static final FeedType BRAND_REPLAY_CARD;
    public static final FeedType BRAND_RESERVATION_CARD;
    public static final FeedType COMMODITY;
    public static final FeedType COMMODITY_CARD;
    public static final FeedType LIVE;
    public static final FeedType NO_MORE;
    public static final FeedType PHOTO;
    public static final FeedType RESERVATION;
    public static final FeedType UNKNOWN;
    public static final Map sFeed2TypeMap;
    public static final Map sType2FeedMap;

    static {
       FeedType$1 u1 = new FeedType$1("UNKNOWN", 0, 0);
       FeedType.UNKNOWN = u1;
       FeedType$2 u2 = new FeedType$2("LIVE", 1, 1);
       FeedType.LIVE = u2;
       FeedType$3 u3 = new FeedType$3("PHOTO", 2, 2);
       FeedType.PHOTO = u3;
       FeedType$4 u4 = new FeedType$4("COMMODITY", 3, 6);
       FeedType.COMMODITY = u4;
       FeedType$5 u5 = new FeedType$5("RESERVATION", 4, 7);
       FeedType.RESERVATION = u5;
       FeedType$6 u6 = new FeedType$6("ACTIVITY_CARD", 5, 34);
       FeedType.ACTIVITY_CARD = u6;
       FeedType$7 u7 = new FeedType$7("BRAND_REPLAY_CARD", 6, 32);
       FeedType.BRAND_REPLAY_CARD = u7;
       FeedType$8 u8 = new FeedType$8("BRAND_RESERVATION_CARD", 7, 33);
       FeedType.BRAND_RESERVATION_CARD = u8;
       FeedType$9 u9 = new FeedType$9("BRAND_LIVE_CARD", 8, 31);
       FeedType.BRAND_LIVE_CARD = u9;
       FeedType$10 u10 = new FeedType$10("COMMODITY_CARD", 9, 12);
       FeedType.COMMODITY_CARD = u10;
       FeedType$11 u11 = new FeedType$11("ACTIVITY_RESERVATION", 10, 37);
       FeedType.ACTIVITY_RESERVATION = u11;
       FeedType$12 u12 = new FeedType$12("ACTIVITY_BANNER", 11, 39);
       FeedType.ACTIVITY_BANNER = u12;
       FeedType$13 u13 = new FeedType$13("ACTIVITY_LIVE", 12, 38);
       FeedType.ACTIVITY_LIVE = u13;
       FeedType$13 u131 = u13;
       FeedType$14 u14 = new FeedType$14("ACTIVITY_VIDEO", 13, 41);
       FeedType.ACTIVITY_VIDEO = u14;
       FeedType$14 u141 = u14;
       FeedType$15 u15 = new FeedType$15("ACTIVITY_COMMODITY", 14, 40);
       FeedType.ACTIVITY_COMMODITY = u15;
       FeedType$15 u151 = u15;
       FeedType$16 u16 = new FeedType$16("NO_MORE", 15, 1024);
       FeedType.NO_MORE = u16;
       FeedType[] uFeedTypeArr = new FeedType[16];
       uFeedTypeArr[0] = u1;
       uFeedTypeArr[1] = u2;
       uFeedTypeArr[2] = u3;
       uFeedTypeArr[3] = u4;
       uFeedTypeArr[4] = u5;
       uFeedTypeArr[5] = u6;
       uFeedTypeArr[6] = u7;
       uFeedTypeArr[7] = u8;
       uFeedTypeArr[8] = u9;
       uFeedTypeArr[9] = u10;
       uFeedTypeArr[10] = u11;
       uFeedTypeArr[11] = u12;
       uFeedTypeArr[12] = u131;
       uFeedTypeArr[13] = u141;
       uFeedTypeArr[14] = u151;
       uFeedTypeArr[15] = u16;
       FeedType.$VALUES = uFeedTypeArr;
       FeedType.sType2FeedMap = new HashMap();
       FeedType.sFeed2TypeMap = new HashMap();
       FeedType[] uFeedTypeArr1 = FeedType.values();
       int len = uFeedTypeArr1.length;
       int i = 0;
       while (i < len) {
          object oobject = uFeedTypeArr1[i];
          BaseFeed uBaseFeed = oobject.createFeed();
          if (uBaseFeed != null) {
             Class class = uBaseFeed.getClass();
             FeedType.sType2FeedMap.put(oobject, class);
             FeedType.sFeed2TypeMap.put(class, new a(oobject));
          }
          i = i + 1;
       }
    }
    public void FeedType(String p0,int p1,int p2){
       super(p0, p1);
       this.mType = p2;
    }
    public void FeedType(String p0,int p1,int p2,FeedType$1 p3){
       super(p0, p1, p2);
    }
    public static FeedType fromFeed(BaseFeed p0){
       Class obj = PatchProxy.applyOneRefs(p0, null, FeedType.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.getClass();
       Map sFeed2TypeMa = FeedType.sFeed2TypeMap;
       FeedType uFeedType = (sFeed2TypeMa.containsKey(obj))? sFeed2TypeMa.get(obj).apply(p0): FeedType.UNKNOWN;
       return uFeedType;
    }
    public static FeedType fromInt(int p0){
       FeedType[] obj;
       object oobject;
       FeedType uFeedType = FeedType.class;
       if (PatchProxy.isSupport(uFeedType)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, uFeedType, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = FeedType.values();
       int len = obj.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return FeedType.UNKNOWN;
          }
          oobject = obj[i];
          if (oobject.mType == p0) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return oobject;
    }
    public static FeedType lambda$static$0(FeedType p0,BaseFeed p1){
       return p0;
    }
    public static FeedType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, FeedType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(FeedType.class, p0);
    }
    public static FeedType[] values(){
       Object obj = PatchProxy.apply(null, null, FeedType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return FeedType.$VALUES.clone();
    }
    public abstract BaseFeed createFeed();
    public abstract b createPresenterHolderCreator();
    public Class getClazz(){
       Class obj = PatchProxy.apply(null, this, FeedType.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = FeedType.sType2FeedMap.get(this);
       if (obj != null) {
          return obj;
       }
       return UnknownFeed.class;
    }
    public b getDynamicRegisterModel(){
       return c.a(this);
    }
    public boolean isFullSpan(){
       return false;
    }
    public int toInt(){
       return this.mType;
    }
}
