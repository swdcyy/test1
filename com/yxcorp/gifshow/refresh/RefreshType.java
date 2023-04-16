package com.yxcorp.gifshow.refresh.RefreshType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class RefreshType extends Enum	// class@0017d6
{
    public String mRefreshSource;
    public static final RefreshType[] $VALUES;
    public static final RefreshType AGREE_PRIVACY_REFRESH;
    public static final RefreshType BACK_CLICK;
    public static final RefreshType BOTTOM_REFRESH;
    public static final RefreshType BOTTOM_TAB_CLICK;
    public static final RefreshType FOLLOW_CLICK_FILTER;
    public static final RefreshType FOLLOW_DELETE_TO_NULL;
    public static final RefreshType FOLLOW_NO_PHOTO;
    public static final RefreshType FOLLOW_REDPOINT;
    public static final RefreshType FOLLOW_RED_BUBBLE;
    public static final RefreshType FOLLOW_RETRY;
    public static final RefreshType FOLLOW_RETURN_REFRESH;
    public static final RefreshType FOREGROUND;
    public static final RefreshType FOREGROUND2;
    public static final RefreshType HOT_START_REFRESH;
    public static final RefreshType INIT;
    public static final RefreshType LINK_OR_PUSH;
    public static final RefreshType LOGIN_REFRESH;
    public static final RefreshType NEW_MSG;
    public static final RefreshType PM_PUSH;
    public static final RefreshType PRELOAD_FRAGMENT;
    public static final RefreshType PROGRAM;
    public static final RefreshType PULL_DOWN;
    public static final RefreshType RESUME;
    public static final RefreshType RETAIN_FIRST_PAGE;
    public static final RefreshType RETURN_HOT_REFRESH;
    public static final RefreshType SCHOOL_INFO_CHANGE;
    public static final RefreshType SEARCH_BACK;
    public static final RefreshType SWITCH_TAB_REFRESH;
    public static final RefreshType TAB_CLICK;
    public static final RefreshType UNKNOWN;

    static {
       RefreshType refreshType = new RefreshType("PM_PUSH", 0, "pmPush");
       RefreshType.PM_PUSH = refreshType;
       RefreshType refreshType1 = new RefreshType("INIT", 1, "init");
       RefreshType.INIT = refreshType1;
       RefreshType refreshType2 = new RefreshType("FOREGROUND", 2, "foreground");
       RefreshType.FOREGROUND = refreshType2;
       RefreshType refreshType3 = new RefreshType("RESUME", 3, "resume");
       RefreshType.RESUME = refreshType3;
       RefreshType refreshType4 = new RefreshType("FOREGROUND2", 4, "foreground2");
       RefreshType.FOREGROUND2 = refreshType4;
       RefreshType refreshType5 = new RefreshType("NEW_MSG", 5, "newMsg");
       RefreshType.NEW_MSG = refreshType5;
       RefreshType refreshType6 = new RefreshType("BOTTOM_TAB_CLICK", 6, "bottomTabClick");
       RefreshType.BOTTOM_TAB_CLICK = refreshType6;
       RefreshType refreshType7 = new RefreshType("TAB_CLICK", 7, "tabClick");
       RefreshType.TAB_CLICK = refreshType7;
       RefreshType refreshType8 = new RefreshType("PULL_DOWN", 8, "pullDown");
       RefreshType.PULL_DOWN = refreshType8;
       RefreshType refreshType9 = new RefreshType("BACK_CLICK", 9, "backClick");
       RefreshType.BACK_CLICK = refreshType9;
       RefreshType refreshType10 = new RefreshType("BOTTOM_REFRESH", 10, "bottomRefresh");
       RefreshType.BOTTOM_REFRESH = refreshType10;
       RefreshType refreshType11 = new RefreshType("PROGRAM", 11, "program");
       RefreshType.PROGRAM = refreshType11;
       RefreshType refreshType12 = new RefreshType("RETAIN_FIRST_PAGE", 12, "retainFirstPage");
       RefreshType.RETAIN_FIRST_PAGE = refreshType12;
       RefreshType refreshType13 = refreshType12;
       RefreshType refreshType14 = new RefreshType("RETURN_HOT_REFRESH", 13, "returnFresh");
       RefreshType.RETURN_HOT_REFRESH = refreshType14;
       RefreshType refreshType15 = refreshType14;
       refreshType12 = new RefreshType("LINK_OR_PUSH", 14, "linkOrPush");
       RefreshType.LINK_OR_PUSH = refreshType12;
       RefreshType refreshType16 = refreshType12;
       refreshType14 = new RefreshType("HOT_START_REFRESH", 15, "hotStartRefresh");
       RefreshType.HOT_START_REFRESH = refreshType14;
       RefreshType refreshType17 = refreshType14;
       refreshType12 = new RefreshType("SWITCH_TAB_REFRESH", 16, "switchTabRefresh");
       RefreshType.SWITCH_TAB_REFRESH = refreshType12;
       RefreshType refreshType18 = refreshType12;
       refreshType14 = new RefreshType("LOGIN_REFRESH", 17, "loginRefresh");
       RefreshType.LOGIN_REFRESH = refreshType14;
       RefreshType refreshType19 = refreshType14;
       refreshType12 = new RefreshType("AGREE_PRIVACY_REFRESH", 18, "agreePricacyRefresh");
       RefreshType.AGREE_PRIVACY_REFRESH = refreshType12;
       RefreshType refreshType20 = refreshType12;
       refreshType14 = new RefreshType("SEARCH_BACK", 19, "search_back");
       RefreshType.SEARCH_BACK = refreshType14;
       RefreshType refreshType21 = refreshType14;
       refreshType12 = new RefreshType("FOLLOW_CLICK_FILTER", 20, "click_filter");
       RefreshType.FOLLOW_CLICK_FILTER = refreshType12;
       RefreshType refreshType22 = refreshType12;
       refreshType14 = new RefreshType("FOLLOW_REDPOINT", 21, "redpoint");
       RefreshType.FOLLOW_REDPOINT = refreshType14;
       RefreshType refreshType23 = refreshType14;
       refreshType12 = new RefreshType("FOLLOW_RED_BUBBLE", 22, "red_bubble");
       RefreshType.FOLLOW_RED_BUBBLE = refreshType12;
       RefreshType refreshType24 = refreshType12;
       refreshType14 = new RefreshType("FOLLOW_RETURN_REFRESH", 23, "return_follow");
       RefreshType.FOLLOW_RETURN_REFRESH = refreshType14;
       RefreshType refreshType25 = refreshType14;
       refreshType12 = new RefreshType("FOLLOW_DELETE_TO_NULL", 24, "delete_to_null");
       RefreshType.FOLLOW_DELETE_TO_NULL = refreshType12;
       RefreshType refreshType26 = refreshType12;
       refreshType14 = new RefreshType("FOLLOW_RETRY", 25, "retry");
       RefreshType.FOLLOW_RETRY = refreshType14;
       RefreshType refreshType27 = refreshType14;
       refreshType12 = new RefreshType("FOLLOW_NO_PHOTO", 26, "no_photo");
       RefreshType.FOLLOW_NO_PHOTO = refreshType12;
       RefreshType refreshType28 = refreshType12;
       refreshType14 = new RefreshType("PRELOAD_FRAGMENT", 27, "preload_fragment");
       RefreshType.PRELOAD_FRAGMENT = refreshType14;
       RefreshType refreshType29 = refreshType14;
       refreshType12 = new RefreshType("SCHOOL_INFO_CHANGE", 28, "schoolInfoChange");
       RefreshType.SCHOOL_INFO_CHANGE = refreshType12;
       RefreshType refreshType30 = refreshType12;
       refreshType14 = new RefreshType("UNKNOWN", 29, "unknown");
       RefreshType.UNKNOWN = refreshType14;
       RefreshType[] refreshTypeA = new RefreshType[30];
       refreshTypeA[0] = refreshType;
       refreshTypeA[1] = refreshType1;
       refreshTypeA[2] = refreshType2;
       refreshTypeA[3] = refreshType3;
       refreshTypeA[4] = refreshType4;
       refreshTypeA[5] = refreshType5;
       refreshTypeA[6] = refreshType6;
       refreshTypeA[7] = refreshType7;
       refreshTypeA[8] = refreshType8;
       refreshTypeA[9] = refreshType9;
       refreshTypeA[10] = refreshType10;
       refreshTypeA[11] = refreshType11;
       refreshTypeA[12] = refreshType13;
       refreshTypeA[13] = refreshType15;
       refreshTypeA[14] = refreshType16;
       refreshTypeA[15] = refreshType17;
       refreshTypeA[16] = refreshType18;
       refreshTypeA[17] = refreshType19;
       refreshTypeA[18] = refreshType20;
       refreshTypeA[19] = refreshType21;
       refreshTypeA[20] = refreshType22;
       refreshTypeA[21] = refreshType23;
       refreshTypeA[22] = refreshType24;
       refreshTypeA[23] = refreshType25;
       refreshTypeA[24] = refreshType26;
       refreshTypeA[25] = refreshType27;
       refreshTypeA[26] = refreshType28;
       refreshTypeA[27] = refreshType29;
       refreshTypeA[28] = refreshType30;
       refreshTypeA[29] = refreshType14;
       RefreshType.$VALUES = refreshTypeA;
    }
    public void RefreshType(String p0,int p1,String p2){
       super(p0, p1);
       this.mRefreshSource = p2;
    }
    public static RefreshType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, RefreshType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(RefreshType.class, p0);
    }
    public static RefreshType[] values(){
       Object obj = PatchProxy.apply(null, null, RefreshType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return RefreshType.$VALUES.clone();
    }
    public String refreshTypeToRefreshSource(){
       return this.mRefreshSource;
    }
}
