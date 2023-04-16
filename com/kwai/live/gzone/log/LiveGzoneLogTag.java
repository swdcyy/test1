package com.kwai.live.gzone.log.LiveGzoneLogTag;
import pp.c;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import com.kuaishou.android.live.log.a;

public final class LiveGzoneLogTag extends Enum implements c	// class@000d91
{
    public String name;
    public static final LiveGzoneLogTag[] $VALUES;
    public static final LiveGzoneLogTag ACTIVITY_TAB;
    public static final LiveGzoneLogTag CLIP;
    public static final LiveGzoneLogTag COMMENT_NOTICE;
    public static final LiveGzoneLogTag KDS;
    public static final LiveGzoneLogTag PENDANT;
    public static final LiveGzoneLogTag PENDANT_TRANCE;
    public static final LiveGzoneLogTag PLAY_STATION;
    public static final LiveGzoneLogTag TREASURE_TASK;

    static {
       LiveGzoneLogTag liveGzoneLog = new LiveGzoneLogTag("PENDANT", 0, "LiveGzonePendant");
       LiveGzoneLogTag.PENDANT = liveGzoneLog;
       LiveGzoneLogTag liveGzoneLog1 = new LiveGzoneLogTag("TREASURE_TASK", 1, "TreasureTask");
       LiveGzoneLogTag.TREASURE_TASK = liveGzoneLog1;
       LiveGzoneLogTag liveGzoneLog2 = new LiveGzoneLogTag("COMMENT_NOTICE", 2, "LiveGzoneCommentNotice");
       LiveGzoneLogTag.COMMENT_NOTICE = liveGzoneLog2;
       LiveGzoneLogTag liveGzoneLog3 = new LiveGzoneLogTag("PENDANT_TRANCE", 3, "LiveGzonePendantTrace");
       LiveGzoneLogTag.PENDANT_TRANCE = liveGzoneLog3;
       LiveGzoneLogTag liveGzoneLog4 = new LiveGzoneLogTag("CLIP", 4, "LiveGzoneClip");
       LiveGzoneLogTag.CLIP = liveGzoneLog4;
       LiveGzoneLogTag liveGzoneLog5 = new LiveGzoneLogTag("ACTIVITY_TAB", 5, "GzoneActivityTab");
       LiveGzoneLogTag.ACTIVITY_TAB = liveGzoneLog5;
       LiveGzoneLogTag liveGzoneLog6 = new LiveGzoneLogTag("PLAY_STATION", 6, "GzonePlayStation");
       LiveGzoneLogTag.PLAY_STATION = liveGzoneLog6;
       LiveGzoneLogTag liveGzoneLog7 = new LiveGzoneLogTag("KDS", 7, "LiveGzoneKDS");
       LiveGzoneLogTag.KDS = liveGzoneLog7;
       LiveGzoneLogTag[] liveGzoneLog8 = new LiveGzoneLogTag[]{liveGzoneLog,liveGzoneLog1,liveGzoneLog2,liveGzoneLog3,liveGzoneLog4,liveGzoneLog5,liveGzoneLog6,liveGzoneLog7};
       LiveGzoneLogTag.$VALUES = liveGzoneLog8;
    }
    public void LiveGzoneLogTag(String p0,int p1,String p2){
       super(p0, p1);
       this.name = p2;
    }
    public static LiveGzoneLogTag valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveGzoneLogTag.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveGzoneLogTag.class, p0);
    }
    public static LiveGzoneLogTag[] values(){
       Object obj = PatchProxy.apply(null, null, LiveGzoneLogTag.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveGzoneLogTag.$VALUES.clone();
    }
    public List appendTag(String p0){
       return a.a(this, p0);
    }
    public String getName(){
       return this.name;
    }
}
