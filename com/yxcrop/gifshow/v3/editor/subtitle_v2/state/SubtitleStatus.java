package com.yxcrop.gifshow.v3.editor.subtitle_v2.state.SubtitleStatus;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class SubtitleStatus extends Enum	// class@000aeb
{
    public static final SubtitleStatus[] $VALUES;
    public static final SubtitleStatus CLEAR;
    public static final SubtitleStatus ERROR;
    public static final SubtitleStatus IDLE;
    public static final SubtitleStatus NO_NETWORK;
    public static final SubtitleStatus NO_RESULT;
    public static final SubtitleStatus NO_RESULT_MUTE;
    public static final SubtitleStatus SUCCESS;

    static {
       SubtitleStatus subtitleStat1;
       SubtitleStatus[] subtitleStat = new SubtitleStatus[]{subtitleStat1,subtitleStat1,subtitleStat1,subtitleStat1,subtitleStat1,subtitleStat1,subtitleStat1};
       subtitleStat1 = new SubtitleStatus("IDLE", 0);
       SubtitleStatus.IDLE = subtitleStat1;
       subtitleStat1 = new SubtitleStatus("ERROR", 1);
       SubtitleStatus.ERROR = subtitleStat1;
       subtitleStat1 = new SubtitleStatus("NO_NETWORK", 2);
       SubtitleStatus.NO_NETWORK = subtitleStat1;
       subtitleStat1 = new SubtitleStatus("SUCCESS", 3);
       SubtitleStatus.SUCCESS = subtitleStat1;
       subtitleStat1 = new SubtitleStatus("NO_RESULT", 4);
       SubtitleStatus.NO_RESULT = subtitleStat1;
       subtitleStat1 = new SubtitleStatus("NO_RESULT_MUTE", 5);
       SubtitleStatus.NO_RESULT_MUTE = subtitleStat1;
       subtitleStat1 = new SubtitleStatus("CLEAR", 6);
       SubtitleStatus.CLEAR = subtitleStat1;
       SubtitleStatus.$VALUES = subtitleStat;
    }
    public void SubtitleStatus(String p0,int p1){
       super(p0, p1);
    }
    public static SubtitleStatus valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, SubtitleStatus.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(SubtitleStatus.class, p0);
    }
    public static SubtitleStatus[] values(){
       Object obj = PatchProxy.apply(null, null, SubtitleStatus.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return SubtitleStatus.$VALUES.clone();
    }
}
