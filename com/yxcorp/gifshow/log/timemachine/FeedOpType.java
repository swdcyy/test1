package com.yxcorp.gifshow.log.timemachine.FeedOpType;
import java.lang.Enum;
import java.lang.String;
import com.yxcorp.gifshow.log.timemachine.EventTriggerType;
import nsd.u;
import com.yxcorp.gifshow.log.timemachine.FeedOpType$a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class FeedOpType extends Enum	// class@001b45
{
    public final EventTriggerType eventTriggerType;
    public final String filterType;
    public final String reason;
    public final String reportType;
    public static final FeedOpType[] $VALUES;
    public static final FeedOpType$a Companion;
    public static final FeedOpType FILTER_DUPLICATE_FEED;
    public static final FeedOpType FILTER_ERROR_FEED;
    public static final FeedOpType FILTER_EXPIRED_AD;
    public static final FeedOpType FILTER_FIRSTPAGE_AD;
    public static final FeedOpType FILTER_GLOBAL_REAL_SHOW_FEED;
    public static final FeedOpType FILTER_REDUCE_FEED;
    public static final FeedOpType FILTER_TOPPAGE_AD;
    public static final FeedOpType FILTER_UNSUPPORT_TYPE_FEED;
    public static final FeedOpType REFRESH_REMOVE_UNSHOWN_FEED;
    public static final FeedOpType REMOVE_EXPIRED_FEED;
    public static final FeedOpType REMOVE_INVALID_FEED;
    public static final FeedOpType REMOVE_OWN_FEED;
    public static final FeedOpType REMOVE_REDUCE_FEED;
    public static final FeedOpType RERANK_CANDIDATE_FEED_CLEAR;
    public static final FeedOpType UNKNOWN_REASON;

    static {
       FeedOpType[] uFeedOpTypeA = new FeedOpType[15];
       FeedOpType uFeedOpType = new FeedOpType("FILTER_EXPIRED_AD", 0, "expired_ad", "FILTER_EXPIRED_AD", "过滤过期作品", null, 8, null);
       FeedOpType.FILTER_EXPIRED_AD = v10;
       uFeedOpTypeA[0] = v10;
       FeedOpType uFeedOpType1 = new FeedOpType("FILTER_TOPPAGE_AD", 1, "top_page_ad", "FILTER_TOPPAGE_AD", "过滤前n个作品中的广告", null, 8, null);
       FeedOpType.FILTER_TOPPAGE_AD = uFeedOpType;
       uFeedOpTypeA[1] = uFeedOpType;
       FeedOpType uFeedOpType2 = new FeedOpType("FILTER_FIRSTPAGE_AD", 2, "first_page_ad", "FILTER_FIRSTPAGE_AD", "过滤首屏广告", null, 8, null);
       FeedOpType.FILTER_FIRSTPAGE_AD = uFeedOpType;
       uFeedOpTypeA[2] = uFeedOpType;
       uFeedOpType2 = new FeedOpType("FILTER_REDUCE_FEED", 3, "reduce feed", "FILTER_REDUCE_FEED", "过滤负反馈作品", null, 8, null);
       FeedOpType.FILTER_REDUCE_FEED = uFeedOpType;
       uFeedOpTypeA[3] = uFeedOpType;
       uFeedOpType2 = new FeedOpType("FILTER_DUPLICATE_FEED", 4, "duplicate_feed", "FILTER_DUPLICATE_FEED", "过滤重复作品", null, 8, null);
       FeedOpType.FILTER_DUPLICATE_FEED = uFeedOpType;
       uFeedOpTypeA[4] = uFeedOpType;
       uFeedOpType2 = new FeedOpType("FILTER_GLOBAL_REAL_SHOW_FEED", 5, "FILTER_GLOBAL_REAL_SHOW_FEED", "FILTER_GLOBAL_REAL_SHOW_FEED", "过滤热门/发现、精选、朋友已经realshow的feed", null, 8, null);
       FeedOpType.FILTER_GLOBAL_REAL_SHOW_FEED = uFeedOpType;
       uFeedOpTypeA[5] = uFeedOpType;
       uFeedOpType2 = new FeedOpType("FILTER_UNSUPPORT_TYPE_FEED", 6, "unsupport_type_feed", "FILTER_UNSUPPORT_TYPE_FEED", "过滤类型错误作品", null, 8, null);
       FeedOpType.FILTER_UNSUPPORT_TYPE_FEED = uFeedOpType;
       uFeedOpTypeA[6] = uFeedOpType;
       uFeedOpType2 = new FeedOpType("REMOVE_EXPIRED_FEED", 7, "REMOVE_EXPIRED_FEED", "REMOVE_EXPIRED_FEED", "删除过期作品", null, 8, null);
       FeedOpType.REMOVE_EXPIRED_FEED = uFeedOpType;
       uFeedOpTypeA[7] = uFeedOpType;
       uFeedOpType2 = new FeedOpType("REMOVE_OWN_FEED", 8, "REMOVE_OWN_FEED", "REMOVE_OWN_FEED", "删除自己的作品", null, 8, null);
       FeedOpType.REMOVE_OWN_FEED = uFeedOpType;
       uFeedOpTypeA[8] = uFeedOpType;
       uFeedOpType2 = new FeedOpType("REFRESH_REMOVE_UNSHOWN_FEED", 9, "REFRESH_REMOVE_UNSHOWN_FEED", "REFRESH_REMOVE_UNSHOWN_FEED", "下拉刷新时未realshow的作品", null, 8, null);
       FeedOpType.REFRESH_REMOVE_UNSHOWN_FEED = uFeedOpType;
       uFeedOpTypeA[9] = uFeedOpType;
       uFeedOpType2 = new FeedOpType("REMOVE_INVALID_FEED", 10, "REMOVE_INVALID_FEED", "REMOVE_INVALID_FEED", "删除无效作品", null, 8, null);
       FeedOpType.REMOVE_INVALID_FEED = uFeedOpType;
       uFeedOpTypeA[10] = uFeedOpType;
       uFeedOpType2 = new FeedOpType("UNKNOWN_REASON", 11, "UNKNOWN_REASON", "UNKNOWN_REASON", "未知原因", null, 8, null);
       FeedOpType.UNKNOWN_REASON = uFeedOpType;
       uFeedOpTypeA[11] = uFeedOpType;
       uFeedOpType2 = new FeedOpType("FILTER_ERROR_FEED", 12, "unknown_feed", "FILTER_ERROR_FEED", "过滤未知类型作品", null, 8, null);
       FeedOpType.FILTER_ERROR_FEED = uFeedOpType;
       uFeedOpTypeA[12] = uFeedOpType;
       uFeedOpType2 = new FeedOpType("RERANK_CANDIDATE_FEED_CLEAR", 13, "RERANK_CANDIDATE_FEED_CLEAR", "RERANK_CANDIDATE_FEED_CLEAR", "rerank 侯选池清空", null, 8, null);
       FeedOpType.RERANK_CANDIDATE_FEED_CLEAR = uFeedOpType;
       uFeedOpTypeA[13] = uFeedOpType;
       uFeedOpType2 = new FeedOpType("REMOVE_REDUCE_FEED", 14, "REMOVE_REDUCE_FEED", "REMOVE_REDUCE_FEED", "删除负反馈作品", null, 8, null);
       FeedOpType.REMOVE_REDUCE_FEED = uFeedOpType;
       uFeedOpTypeA[14] = uFeedOpType;
       FeedOpType.$VALUES = uFeedOpTypeA;
       FeedOpType.Companion = new FeedOpType$a(null);
    }
    public void FeedOpType(String p0,int p1,String p2,String p3,String p4,EventTriggerType p5){
       super(p0, p1);
       this.filterType = p2;
       this.reportType = p3;
       this.reason = p4;
       this.eventTriggerType = p5;
    }
    public void FeedOpType(String p0,int p1,String p2,String p3,String p4,EventTriggerType p5,int p6,u p7){
       if (p6 & 0x08) {
          p5 = EventTriggerType.SlideDataSource;
       }
       super(p0, p1, p2, p3, p4, p5);
       return;
    }
    public static final FeedOpType fromFilterType(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, FeedOpType.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return FeedOpType.Companion.a(p0);
    }
    public static FeedOpType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, FeedOpType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(FeedOpType.class, p0);
    }
    public static FeedOpType[] values(){
       Object obj = PatchProxy.apply(null, null, FeedOpType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return FeedOpType.$VALUES.clone();
    }
    public final EventTriggerType getEventTriggerType(){
       return this.eventTriggerType;
    }
    public final String getFilterType(){
       return this.filterType;
    }
    public final String getReason(){
       return this.reason;
    }
    public final String getReportType(){
       return this.reportType;
    }
}
