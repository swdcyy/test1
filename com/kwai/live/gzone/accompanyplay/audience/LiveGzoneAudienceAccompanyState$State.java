package com.kwai.live.gzone.accompanyplay.audience.LiveGzoneAudienceAccompanyState$State;
import java.lang.Enum;
import com.kwai.live.gzone.accompanyplay.audience.LiveGzoneAccompanyPanelStyle;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveGzoneAudienceAccompanyState$State extends Enum	// class@000b62
{
    public LiveGzoneAccompanyPanelStyle mPanelStyle;
    public static final LiveGzoneAudienceAccompanyState$State[] $VALUES;
    public static final LiveGzoneAudienceAccompanyState$State IDLE;
    public static final LiveGzoneAudienceAccompanyState$State PLAYING;
    public static final LiveGzoneAudienceAccompanyState$State QUEUE;
    public static final LiveGzoneAudienceAccompanyState$State RATE;
    public static final LiveGzoneAudienceAccompanyState$State UN_PAYMENT;
    public static final LiveGzoneAudienceAccompanyState$State VERSION_LIMIT;
    public static final LiveGzoneAudienceAccompanyState$State WAIT_LOCK;
    public static final LiveGzoneAudienceAccompanyState$State WAIT_START;

    static {
       LiveGzoneAccompanyPanelStyle cLOSE = LiveGzoneAccompanyPanelStyle.CLOSE;
       LiveGzoneAudienceAccompanyState$State state = new LiveGzoneAudienceAccompanyState$State("IDLE", 0, cLOSE);
       LiveGzoneAudienceAccompanyState$State.IDLE = state;
       LiveGzoneAudienceAccompanyState$State state1 = new LiveGzoneAudienceAccompanyState$State("VERSION_LIMIT", 1, cLOSE);
       LiveGzoneAudienceAccompanyState$State.VERSION_LIMIT = state1;
       LiveGzoneAudienceAccompanyState$State state2 = new LiveGzoneAudienceAccompanyState$State("UN_PAYMENT", 2, LiveGzoneAccompanyPanelStyle.BEFORE_ABOARD_PANEL);
       LiveGzoneAudienceAccompanyState$State.UN_PAYMENT = state2;
       LiveGzoneAudienceAccompanyState$State state3 = new LiveGzoneAudienceAccompanyState$State("QUEUE", 3, LiveGzoneAccompanyPanelStyle.QUEUE_SUCCESS_PANEL);
       LiveGzoneAudienceAccompanyState$State.QUEUE = state3;
       LiveGzoneAudienceAccompanyState$State state4 = new LiveGzoneAudienceAccompanyState$State("WAIT_LOCK", 4, LiveGzoneAccompanyPanelStyle.WAITING_START_PANEL);
       LiveGzoneAudienceAccompanyState$State.WAIT_LOCK = state4;
       LiveGzoneAudienceAccompanyState$State state5 = new LiveGzoneAudienceAccompanyState$State("WAIT_START", 5, LiveGzoneAccompanyPanelStyle.PREPARE_ABOARD_PANEL);
       LiveGzoneAudienceAccompanyState$State.WAIT_START = state5;
       LiveGzoneAudienceAccompanyState$State state6 = new LiveGzoneAudienceAccompanyState$State("PLAYING", 6, LiveGzoneAccompanyPanelStyle.FLEET_IN_PROCESS_PANEL);
       LiveGzoneAudienceAccompanyState$State.PLAYING = state6;
       LiveGzoneAudienceAccompanyState$State state7 = new LiveGzoneAudienceAccompanyState$State("RATE", 7, LiveGzoneAccompanyPanelStyle.AUDIENCE_COMPLETE_ORDER_PANEL);
       LiveGzoneAudienceAccompanyState$State.RATE = state7;
       LiveGzoneAudienceAccompanyState$State[] stateArray = new LiveGzoneAudienceAccompanyState$State[]{state,state1,state2,state3,state4,state5,state6,state7};
       LiveGzoneAudienceAccompanyState$State.$VALUES = stateArray;
    }
    public void LiveGzoneAudienceAccompanyState$State(String p0,int p1,LiveGzoneAccompanyPanelStyle p2){
       super(p0, p1);
       this.mPanelStyle = p2;
    }
    public static LiveGzoneAudienceAccompanyState$State valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveGzoneAudienceAccompanyState$State.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveGzoneAudienceAccompanyState$State.class, p0);
    }
    public static LiveGzoneAudienceAccompanyState$State[] values(){
       Object obj = PatchProxy.apply(null, null, LiveGzoneAudienceAccompanyState$State.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveGzoneAudienceAccompanyState$State.$VALUES.clone();
    }
}
