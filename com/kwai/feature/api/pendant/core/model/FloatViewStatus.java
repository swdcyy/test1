package com.kwai.feature.api.pendant.core.model.FloatViewStatus;
import java.lang.Enum;
import com.kwai.feature.api.pendant.core.model.FloatWidgetType;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class FloatViewStatus extends Enum	// class@001033
{
    public final FloatWidgetType mFloatType;
    public final int mValue;
    public static final FloatViewStatus[] $VALUES;
    public static final FloatViewStatus DAILY_END;
    public static final FloatViewStatus DAILY_FIRST;
    public static final FloatViewStatus DETAIL_NO_DATA;
    public static final FloatViewStatus FIRST_OR_END_OPENED;
    public static final FloatViewStatus GOLD_EGG;
    public static final FloatViewStatus GOLD_EGG_OPENED;
    public static final FloatViewStatus IDLE;
    public static final FloatViewStatus LIFE_FIRST;
    public static final FloatViewStatus LIVE_COIN_ARRIVE;
    public static final FloatViewStatus LIVE_COIN_DAY_END;
    public static final FloatViewStatus LIVE_COIN_DAY_FIRST;
    public static final FloatViewStatus LIVE_COIN_ERROR;
    public static final FloatViewStatus LIVE_LIFE_FIRST;
    public static final FloatViewStatus LIVE_NO_DATA;
    public static final FloatViewStatus LIVE_TIMER_WAIT_OPENED;
    public static final FloatViewStatus LIVE_TIMING;
    public static final FloatViewStatus MOTIVATE_EXP;
    public static final FloatViewStatus MOTIVATE_OPEN_EXP;
    public static final FloatViewStatus NOT_LOGIN;
    public static final FloatViewStatus NOT_LOGIN_OPENED;
    public static final FloatViewStatus RED_PACKET;
    public static final FloatViewStatus RED_PACKET_OPENED;
    public static final FloatViewStatus UNLOGIN_RED_PACKET;
    public static final FloatViewStatus UNLOGIN_RED_PACKET_OPENED;
    public static final FloatViewStatus UNLOGIN_RED_PACKET_WITH_TIP;

    static {
       FloatWidgetType dETAIL = FloatWidgetType.DETAIL;
       FloatViewStatus uFloatViewSt = new FloatViewStatus("RED_PACKET", 0, 0, dETAIL);
       FloatViewStatus.RED_PACKET = uFloatViewSt;
       FloatViewStatus uFloatViewSt1 = new FloatViewStatus("LIFE_FIRST", 1, 1, dETAIL);
       FloatViewStatus.LIFE_FIRST = uFloatViewSt1;
       FloatViewStatus uFloatViewSt2 = new FloatViewStatus("DAILY_FIRST", 2, 2, dETAIL);
       FloatViewStatus.DAILY_FIRST = uFloatViewSt2;
       FloatViewStatus uFloatViewSt3 = new FloatViewStatus("DAILY_END", 3, 3, dETAIL);
       FloatViewStatus.DAILY_END = uFloatViewSt3;
       FloatViewStatus uFloatViewSt4 = new FloatViewStatus("GOLD_EGG", 4, 4, dETAIL);
       FloatViewStatus.GOLD_EGG = uFloatViewSt4;
       FloatViewStatus uFloatViewSt5 = new FloatViewStatus("NOT_LOGIN", 5, 6, dETAIL);
       FloatViewStatus.NOT_LOGIN = uFloatViewSt5;
       FloatViewStatus uFloatViewSt6 = new FloatViewStatus("NOT_LOGIN_OPENED", 6, 7, dETAIL);
       FloatViewStatus.NOT_LOGIN_OPENED = uFloatViewSt6;
       FloatViewStatus uFloatViewSt7 = new FloatViewStatus("FIRST_OR_END_OPENED", 7, 8, dETAIL);
       FloatViewStatus.FIRST_OR_END_OPENED = uFloatViewSt7;
       FloatViewStatus uFloatViewSt8 = new FloatViewStatus("RED_PACKET_OPENED", 8, 9, dETAIL);
       FloatViewStatus.RED_PACKET_OPENED = uFloatViewSt8;
       FloatViewStatus uFloatViewSt9 = new FloatViewStatus("GOLD_EGG_OPENED", 9, 10, dETAIL);
       FloatViewStatus.GOLD_EGG_OPENED = uFloatViewSt9;
       FloatViewStatus uFloatViewSt10 = new FloatViewStatus("DETAIL_NO_DATA", 10, 11, dETAIL);
       FloatViewStatus.DETAIL_NO_DATA = uFloatViewSt10;
       FloatViewStatus uFloatViewSt11 = new FloatViewStatus("MOTIVATE_EXP", 11, 17, dETAIL);
       FloatViewStatus.MOTIVATE_EXP = uFloatViewSt11;
       FloatViewStatus uFloatViewSt12 = uFloatViewSt11;
       FloatViewStatus uFloatViewSt13 = new FloatViewStatus("MOTIVATE_OPEN_EXP", 12, 18, dETAIL);
       FloatViewStatus.MOTIVATE_OPEN_EXP = uFloatViewSt13;
       FloatWidgetType lIVE = FloatWidgetType.LIVE;
       FloatViewStatus uFloatViewSt14 = uFloatViewSt13;
       FloatViewStatus uFloatViewSt15 = uFloatViewSt10;
       FloatViewStatus uFloatViewSt16 = new FloatViewStatus("LIVE_TIMING", 13, 50, lIVE);
       FloatViewStatus.LIVE_TIMING = uFloatViewSt16;
       FloatViewStatus uFloatViewSt17 = uFloatViewSt16;
       uFloatViewSt11 = new FloatViewStatus("LIVE_LIFE_FIRST", 14, 51, lIVE);
       FloatViewStatus.LIVE_LIFE_FIRST = uFloatViewSt11;
       FloatViewStatus uFloatViewSt18 = uFloatViewSt11;
       uFloatViewSt16 = new FloatViewStatus("LIVE_COIN_DAY_FIRST", 15, 52, lIVE);
       FloatViewStatus.LIVE_COIN_DAY_FIRST = uFloatViewSt16;
       FloatViewStatus uFloatViewSt19 = uFloatViewSt16;
       uFloatViewSt11 = new FloatViewStatus("LIVE_COIN_DAY_END", 16, 53, lIVE);
       FloatViewStatus.LIVE_COIN_DAY_END = uFloatViewSt11;
       FloatViewStatus uFloatViewSt20 = uFloatViewSt11;
       uFloatViewSt16 = new FloatViewStatus("IDLE", 17, 54, lIVE);
       FloatViewStatus.IDLE = uFloatViewSt16;
       FloatViewStatus uFloatViewSt21 = uFloatViewSt16;
       uFloatViewSt13 = new FloatViewStatus("LIVE_NO_DATA", 18, 55, lIVE);
       FloatViewStatus.LIVE_NO_DATA = uFloatViewSt13;
       FloatViewStatus uFloatViewSt22 = uFloatViewSt13;
       uFloatViewSt16 = new FloatViewStatus("LIVE_TIMER_WAIT_OPENED", 19, 56, lIVE);
       FloatViewStatus.LIVE_TIMER_WAIT_OPENED = uFloatViewSt16;
       FloatViewStatus uFloatViewSt23 = uFloatViewSt16;
       uFloatViewSt13 = new FloatViewStatus("LIVE_COIN_ARRIVE", 20, 57, lIVE);
       FloatViewStatus.LIVE_COIN_ARRIVE = uFloatViewSt13;
       FloatViewStatus uFloatViewSt24 = uFloatViewSt13;
       uFloatViewSt16 = new FloatViewStatus("LIVE_COIN_ERROR", 21, 58, lIVE);
       FloatViewStatus.LIVE_COIN_ERROR = uFloatViewSt16;
       FloatViewStatus uFloatViewSt25 = new FloatViewStatus("UNLOGIN_RED_PACKET", 22, 100, dETAIL);
       FloatViewStatus.UNLOGIN_RED_PACKET = uFloatViewSt25;
       FloatViewStatus uFloatViewSt26 = uFloatViewSt25;
       uFloatViewSt13 = new FloatViewStatus("UNLOGIN_RED_PACKET_OPENED", 23, 101, dETAIL);
       FloatViewStatus.UNLOGIN_RED_PACKET_OPENED = uFloatViewSt13;
       FloatViewStatus uFloatViewSt27 = uFloatViewSt13;
       uFloatViewSt25 = new FloatViewStatus("UNLOGIN_RED_PACKET_WITH_TIP", 24, 102, dETAIL);
       FloatViewStatus.UNLOGIN_RED_PACKET_WITH_TIP = uFloatViewSt25;
       FloatViewStatus[] uFloatViewSt28 = new FloatViewStatus[25];
       uFloatViewSt28[0] = uFloatViewSt;
       uFloatViewSt28[1] = uFloatViewSt1;
       uFloatViewSt28[2] = uFloatViewSt2;
       uFloatViewSt28[3] = uFloatViewSt3;
       uFloatViewSt28[4] = uFloatViewSt4;
       uFloatViewSt28[5] = uFloatViewSt5;
       uFloatViewSt28[6] = uFloatViewSt6;
       uFloatViewSt28[7] = uFloatViewSt7;
       uFloatViewSt28[8] = uFloatViewSt8;
       uFloatViewSt28[9] = uFloatViewSt9;
       uFloatViewSt28[10] = uFloatViewSt15;
       uFloatViewSt28[11] = uFloatViewSt12;
       uFloatViewSt28[12] = uFloatViewSt14;
       uFloatViewSt28[13] = uFloatViewSt17;
       uFloatViewSt28[14] = uFloatViewSt18;
       uFloatViewSt28[15] = uFloatViewSt19;
       uFloatViewSt28[16] = uFloatViewSt20;
       uFloatViewSt28[17] = uFloatViewSt21;
       uFloatViewSt28[18] = uFloatViewSt22;
       uFloatViewSt28[19] = uFloatViewSt23;
       uFloatViewSt28[20] = uFloatViewSt24;
       uFloatViewSt28[21] = uFloatViewSt16;
       uFloatViewSt28[22] = uFloatViewSt26;
       uFloatViewSt28[23] = uFloatViewSt27;
       uFloatViewSt28[24] = uFloatViewSt25;
       FloatViewStatus.$VALUES = uFloatViewSt28;
    }
    public void FloatViewStatus(String p0,int p1,int p2,FloatWidgetType p3){
       super(p0, p1);
       this.mValue = p2;
       this.mFloatType = p3;
    }
    public static FloatViewStatus valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, FloatViewStatus.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(FloatViewStatus.class, p0);
    }
    public static FloatViewStatus[] values(){
       Object obj = PatchProxy.apply(null, null, FloatViewStatus.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return FloatViewStatus.$VALUES.clone();
    }
    public FloatWidgetType getFloatType(){
       return this.mFloatType;
    }
    public int getValue(){
       return this.mValue;
    }
}
