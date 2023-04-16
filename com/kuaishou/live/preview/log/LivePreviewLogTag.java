package com.kuaishou.live.preview.log.LivePreviewLogTag;
import pp.c;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import com.kuaishou.android.live.log.a;

public final class LivePreviewLogTag extends Enum implements c	// class@000e64
{
    public final String mName;
    public static final LivePreviewLogTag[] $VALUES;
    public static final LivePreviewLogTag LIVE_PREVIEW;
    public static final LivePreviewLogTag LIVE_PREVIEW_CONTAINER;
    public static final LivePreviewLogTag LIVE_PREVIEW_EXCEPTION;
    public static final LivePreviewLogTag LIVE_PREVIEW_LIFECYCLE;
    public static final LivePreviewLogTag LIVE_PREVIEW_LONG_CONNECTION;
    public static final LivePreviewLogTag LIVE_PREVIEW_PENDANT;
    public static final LivePreviewLogTag LIVE_PREVIEW_PLAYER;
    public static final LivePreviewLogTag LIVE_PREVIEW_PLAY_CONFIG;
    public static final LivePreviewLogTag LIVE_PREVIEW_PREFETCH;
    public static final LivePreviewLogTag LIVE_PREVIEW_VOICE_PARTY;

    static {
       LivePreviewLogTag livePreviewL = new LivePreviewLogTag("LIVE_PREVIEW", 0, "LivePreview");
       LivePreviewLogTag.LIVE_PREVIEW = livePreviewL;
       LivePreviewLogTag livePreviewL1 = new LivePreviewLogTag("LIVE_PREVIEW_EXCEPTION", 1, "LivePreviewException");
       LivePreviewLogTag.LIVE_PREVIEW_EXCEPTION = livePreviewL1;
       LivePreviewLogTag livePreviewL2 = new LivePreviewLogTag("LIVE_PREVIEW_PLAY_CONFIG", 2, "LivePreviewPlayConfig");
       LivePreviewLogTag.LIVE_PREVIEW_PLAY_CONFIG = livePreviewL2;
       LivePreviewLogTag livePreviewL3 = new LivePreviewLogTag("LIVE_PREVIEW_LONG_CONNECTION", 3, "LivePreviewLongConnection");
       LivePreviewLogTag.LIVE_PREVIEW_LONG_CONNECTION = livePreviewL3;
       LivePreviewLogTag livePreviewL4 = new LivePreviewLogTag("LIVE_PREVIEW_PREFETCH", 4, "LivePreviewPrefetch");
       LivePreviewLogTag.LIVE_PREVIEW_PREFETCH = livePreviewL4;
       LivePreviewLogTag livePreviewL5 = new LivePreviewLogTag("LIVE_PREVIEW_CONTAINER", 5, "LivePreviewContainer");
       LivePreviewLogTag.LIVE_PREVIEW_CONTAINER = livePreviewL5;
       LivePreviewLogTag livePreviewL6 = new LivePreviewLogTag("LIVE_PREVIEW_PLAYER", 6, "LivePreviewPlayer");
       LivePreviewLogTag.LIVE_PREVIEW_PLAYER = livePreviewL6;
       LivePreviewLogTag livePreviewL7 = new LivePreviewLogTag("LIVE_PREVIEW_VOICE_PARTY", 7, "LivePreviewVoiceParty");
       LivePreviewLogTag.LIVE_PREVIEW_VOICE_PARTY = livePreviewL7;
       LivePreviewLogTag livePreviewL8 = new LivePreviewLogTag("LIVE_PREVIEW_LIFECYCLE", 8, "LivePreviewLifecycle");
       LivePreviewLogTag.LIVE_PREVIEW_LIFECYCLE = livePreviewL8;
       LivePreviewLogTag livePreviewL9 = new LivePreviewLogTag("LIVE_PREVIEW_PENDANT", 9, "LivePreviewPendant");
       LivePreviewLogTag.LIVE_PREVIEW_PENDANT = livePreviewL9;
       LivePreviewLogTag[] livePreviewL10 = new LivePreviewLogTag[10];
       livePreviewL10[0] = livePreviewL;
       livePreviewL10[1] = livePreviewL1;
       livePreviewL10[2] = livePreviewL2;
       livePreviewL10[3] = livePreviewL3;
       livePreviewL10[4] = livePreviewL4;
       livePreviewL10[5] = livePreviewL5;
       livePreviewL10[6] = livePreviewL6;
       livePreviewL10[7] = livePreviewL7;
       livePreviewL10[8] = livePreviewL8;
       livePreviewL10[9] = livePreviewL9;
       LivePreviewLogTag.$VALUES = livePreviewL10;
    }
    public void LivePreviewLogTag(String p0,int p1,String p2){
       super(p0, p1);
       this.mName = p2;
    }
    public static LivePreviewLogTag valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LivePreviewLogTag.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LivePreviewLogTag.class, p0);
    }
    public static LivePreviewLogTag[] values(){
       Object obj = PatchProxy.apply(null, null, LivePreviewLogTag.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LivePreviewLogTag.$VALUES.clone();
    }
    public List appendTag(String p0){
       return a.a(this, p0);
    }
    public String getName(){
       return this.mName;
    }
}
