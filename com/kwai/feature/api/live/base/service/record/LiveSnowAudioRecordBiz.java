package com.kwai.feature.api.live.base.service.record.LiveSnowAudioRecordBiz;
import ot.a;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveSnowAudioRecordBiz extends Enum implements a	// class@000fa7
{
    public final int mPriority;
    public static final LiveSnowAudioRecordBiz[] $VALUES;
    public static final LiveSnowAudioRecordBiz AUDIO_RECORDER;
    public static final LiveSnowAudioRecordBiz LIVE_ASR;
    public static final LiveSnowAudioRecordBiz LIVE_PUSH;
    public static final LiveSnowAudioRecordBiz LIVE_ROBOT;
    public static final LiveSnowAudioRecordBiz LIVE_VOICE_COMMENT;
    public static final LiveSnowAudioRecordBiz LIVE_VOICE_INPUT;
    public static final LiveSnowAudioRecordBiz MERCHANT_RECORD;
    public static final LiveSnowAudioRecordBiz SEARCH_ASR;

    static {
       LiveSnowAudioRecordBiz liveSnowAudi = new LiveSnowAudioRecordBiz("LIVE_ROBOT", 0, 100);
       LiveSnowAudioRecordBiz.LIVE_ROBOT = liveSnowAudi;
       LiveSnowAudioRecordBiz liveSnowAudi1 = new LiveSnowAudioRecordBiz("LIVE_ASR", 1, 200);
       LiveSnowAudioRecordBiz.LIVE_ASR = liveSnowAudi1;
       LiveSnowAudioRecordBiz liveSnowAudi2 = new LiveSnowAudioRecordBiz("LIVE_VOICE_COMMENT", 2, 300);
       LiveSnowAudioRecordBiz.LIVE_VOICE_COMMENT = liveSnowAudi2;
       LiveSnowAudioRecordBiz liveSnowAudi3 = new LiveSnowAudioRecordBiz("LIVE_VOICE_INPUT", 3, 310);
       LiveSnowAudioRecordBiz.LIVE_VOICE_INPUT = liveSnowAudi3;
       LiveSnowAudioRecordBiz liveSnowAudi4 = new LiveSnowAudioRecordBiz("MERCHANT_RECORD", 4, 400);
       LiveSnowAudioRecordBiz.MERCHANT_RECORD = liveSnowAudi4;
       LiveSnowAudioRecordBiz liveSnowAudi5 = new LiveSnowAudioRecordBiz("SEARCH_ASR", 5, 500);
       LiveSnowAudioRecordBiz.SEARCH_ASR = liveSnowAudi5;
       LiveSnowAudioRecordBiz liveSnowAudi6 = new LiveSnowAudioRecordBiz("AUDIO_RECORDER", 6, 600);
       LiveSnowAudioRecordBiz.AUDIO_RECORDER = liveSnowAudi6;
       LiveSnowAudioRecordBiz liveSnowAudi7 = new LiveSnowAudioRecordBiz("LIVE_PUSH", 7, 9999);
       LiveSnowAudioRecordBiz.LIVE_PUSH = liveSnowAudi7;
       LiveSnowAudioRecordBiz[] liveSnowAudi8 = new LiveSnowAudioRecordBiz[]{liveSnowAudi,liveSnowAudi1,liveSnowAudi2,liveSnowAudi3,liveSnowAudi4,liveSnowAudi5,liveSnowAudi6,liveSnowAudi7};
       LiveSnowAudioRecordBiz.$VALUES = liveSnowAudi8;
    }
    public void LiveSnowAudioRecordBiz(String p0,int p1,int p2){
       super(p0, p1);
       this.mPriority = p2;
    }
    public static LiveSnowAudioRecordBiz valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveSnowAudioRecordBiz.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveSnowAudioRecordBiz.class, p0);
    }
    public static LiveSnowAudioRecordBiz[] values(){
       Object obj = PatchProxy.apply(null, null, LiveSnowAudioRecordBiz.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveSnowAudioRecordBiz.$VALUES.clone();
    }
    public int getPriority(){
       return this.mPriority;
    }
}
