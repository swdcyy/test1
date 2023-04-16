package com.kuaishou.live.core.show.quiz.helper.LiveQuizSoundHelper$LiveQuizSoundType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import com.kuaishou.live.common.core.basic.resource.LiveResourceFileUtil;
import java.lang.Boolean;
import com.kuaishou.live.common.core.basic.resource.LiveResourceFileUtil$LiveResourceFileType;
import java.io.File;
import qkd.b;

public final class LiveQuizSoundHelper$LiveQuizSoundType extends Enum	// class@000e07
{
    public String mAudioFileName;
    public static final LiveQuizSoundHelper$LiveQuizSoundType[] $VALUES;
    public static final LiveQuizSoundHelper$LiveQuizSoundType BACKGROUND_SOUND;
    public static final LiveQuizSoundHelper$LiveQuizSoundType CAN_NOT_CLICK;
    public static final LiveQuizSoundHelper$LiveQuizSoundType CLICK;
    public static final LiveQuizSoundHelper$LiveQuizSoundType CORRECT_ANSWER;
    public static final LiveQuizSoundHelper$LiveQuizSoundType COUNT_DOWN;
    public static final LiveQuizSoundHelper$LiveQuizSoundType POPUP;
    public static final LiveQuizSoundHelper$LiveQuizSoundType TIME_UP;
    public static final LiveQuizSoundHelper$LiveQuizSoundType WRONG_ANSWER;

    static {
       LiveQuizSoundHelper$LiveQuizSoundType liveQuizSoun = new LiveQuizSoundHelper$LiveQuizSoundType("CAN_NOT_CLICK", 0, "live_quiz_can_not_click.m4a");
       LiveQuizSoundHelper$LiveQuizSoundType.CAN_NOT_CLICK = liveQuizSoun;
       LiveQuizSoundHelper$LiveQuizSoundType liveQuizSoun1 = new LiveQuizSoundHelper$LiveQuizSoundType("CLICK", 1, "live_quiz_click.m4a");
       LiveQuizSoundHelper$LiveQuizSoundType.CLICK = liveQuizSoun1;
       LiveQuizSoundHelper$LiveQuizSoundType liveQuizSoun2 = new LiveQuizSoundHelper$LiveQuizSoundType("COUNT_DOWN", 2, "live_quiz_count_down.m4a");
       LiveQuizSoundHelper$LiveQuizSoundType.COUNT_DOWN = liveQuizSoun2;
       LiveQuizSoundHelper$LiveQuizSoundType liveQuizSoun3 = new LiveQuizSoundHelper$LiveQuizSoundType("POPUP", 3, "live_quiz_popup.m4a");
       LiveQuizSoundHelper$LiveQuizSoundType.POPUP = liveQuizSoun3;
       LiveQuizSoundHelper$LiveQuizSoundType liveQuizSoun4 = new LiveQuizSoundHelper$LiveQuizSoundType("CORRECT_ANSWER", 4, "live_quiz_right.m4a");
       LiveQuizSoundHelper$LiveQuizSoundType.CORRECT_ANSWER = liveQuizSoun4;
       LiveQuizSoundHelper$LiveQuizSoundType liveQuizSoun5 = new LiveQuizSoundHelper$LiveQuizSoundType("WRONG_ANSWER", 5, "live_quiz_wrong.m4a");
       LiveQuizSoundHelper$LiveQuizSoundType.WRONG_ANSWER = liveQuizSoun5;
       LiveQuizSoundHelper$LiveQuizSoundType liveQuizSoun6 = new LiveQuizSoundHelper$LiveQuizSoundType("TIME_UP", 6, "live_quiz_time_up.m4a");
       LiveQuizSoundHelper$LiveQuizSoundType.TIME_UP = liveQuizSoun6;
       LiveQuizSoundHelper$LiveQuizSoundType liveQuizSoun7 = new LiveQuizSoundHelper$LiveQuizSoundType("BACKGROUND_SOUND", 7, "live_quiz_background_sound.m4a");
       LiveQuizSoundHelper$LiveQuizSoundType.BACKGROUND_SOUND = liveQuizSoun7;
       LiveQuizSoundHelper$LiveQuizSoundType[] liveQuizSoun8 = new LiveQuizSoundHelper$LiveQuizSoundType[]{liveQuizSoun,liveQuizSoun1,liveQuizSoun2,liveQuizSoun3,liveQuizSoun4,liveQuizSoun5,liveQuizSoun6,liveQuizSoun7};
       LiveQuizSoundHelper$LiveQuizSoundType.$VALUES = liveQuizSoun8;
    }
    public void LiveQuizSoundHelper$LiveQuizSoundType(String p0,int p1,String p2){
       super(p0, p1);
       this.mAudioFileName = p2;
    }
    public static LiveQuizSoundHelper$LiveQuizSoundType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveQuizSoundHelper$LiveQuizSoundType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveQuizSoundHelper$LiveQuizSoundType.class, p0);
    }
    public static LiveQuizSoundHelper$LiveQuizSoundType[] values(){
       Object obj = PatchProxy.apply(null, null, LiveQuizSoundHelper$LiveQuizSoundType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveQuizSoundHelper$LiveQuizSoundType.$VALUES.clone();
    }
    public String getAudioFilePath(){
       Object obj = PatchProxy.apply(null, this, LiveQuizSoundHelper$LiveQuizSoundType.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveResourceFileUtil.k("live_quiz_sound")+"/"+this.mAudioFileName;
    }
    public boolean isAudioFileReady(){
       Object obj = PatchProxy.apply(null, this, LiveQuizSoundHelper$LiveQuizSoundType.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return b.S(LiveResourceFileUtil.j(LiveResourceFileUtil$LiveResourceFileType.QUIZ_SOUND, this.getAudioFilePath()));
    }
}
