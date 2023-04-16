package com.kuaishou.live.common.core.basic.debuglog.LiveCommonLogTag;
import pp.c;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import com.kuaishou.android.live.log.a;

public final class LiveCommonLogTag extends Enum implements c	// class@000e95
{
    public String mName;
    public static final LiveCommonLogTag[] $VALUES;
    public static final LiveCommonLogTag BLIND_DATE;
    public static final LiveCommonLogTag BOTTOM_BAR;
    public static final LiveCommonLogTag BOTTOM_BUBBLE;
    public static final LiveCommonLogTag COMMENT_NOTICE;
    public static final LiveCommonLogTag DIALOG;
    public static final LiveCommonLogTag INTERACTIVE_GUIDE;
    public static final LiveCommonLogTag LEFT_INFO_BAR;
    public static final LiveCommonLogTag LITE_NEW_MULTI_CHAT;
    public static final LiveCommonLogTag LIVE_PLUS;
    public static final LiveCommonLogTag MULTI_LINE;
    public static final LiveCommonLogTag MULTI_PK;
    public static final LiveCommonLogTag NETWORK_REQUEST;
    public static final LiveCommonLogTag NEW_MULTI_CHAT;

    static {
       LiveCommonLogTag liveCommonLo = new LiveCommonLogTag("COMMENT_NOTICE", 0, "CommentNotice");
       LiveCommonLogTag.COMMENT_NOTICE = liveCommonLo;
       LiveCommonLogTag liveCommonLo1 = new LiveCommonLogTag("INTERACTIVE_GUIDE", 1, "InteractiveGuide");
       LiveCommonLogTag.INTERACTIVE_GUIDE = liveCommonLo1;
       LiveCommonLogTag liveCommonLo2 = new LiveCommonLogTag("BOTTOM_BAR", 2, "BottomBar");
       LiveCommonLogTag.BOTTOM_BAR = liveCommonLo2;
       LiveCommonLogTag liveCommonLo3 = new LiveCommonLogTag("DIALOG", 3, "Dialog");
       LiveCommonLogTag.DIALOG = liveCommonLo3;
       LiveCommonLogTag liveCommonLo4 = new LiveCommonLogTag("NETWORK_REQUEST", 4, "NetWorkRequest");
       LiveCommonLogTag.NETWORK_REQUEST = liveCommonLo4;
       LiveCommonLogTag liveCommonLo5 = new LiveCommonLogTag("BOTTOM_BUBBLE", 5, "BottomBubble");
       LiveCommonLogTag.BOTTOM_BUBBLE = liveCommonLo5;
       LiveCommonLogTag liveCommonLo6 = new LiveCommonLogTag("LEFT_INFO_BAR", 6, "LeftInfoBar");
       LiveCommonLogTag.LEFT_INFO_BAR = liveCommonLo6;
       LiveCommonLogTag liveCommonLo7 = new LiveCommonLogTag("MULTI_PK", 7, "MultiPk");
       LiveCommonLogTag.MULTI_PK = liveCommonLo7;
       LiveCommonLogTag liveCommonLo8 = new LiveCommonLogTag("MULTI_LINE", 8, "MultiLine");
       LiveCommonLogTag.MULTI_LINE = liveCommonLo8;
       LiveCommonLogTag liveCommonLo9 = new LiveCommonLogTag("BLIND_DATE", 9, "BlindDate");
       LiveCommonLogTag.BLIND_DATE = liveCommonLo9;
       LiveCommonLogTag liveCommonLo10 = new LiveCommonLogTag("LIVE_PLUS", 10, "LivePlus");
       LiveCommonLogTag.LIVE_PLUS = liveCommonLo10;
       LiveCommonLogTag liveCommonLo11 = new LiveCommonLogTag("NEW_MULTI_CHAT", 11, "NEW_MULTI_CHAT");
       LiveCommonLogTag.NEW_MULTI_CHAT = liveCommonLo11;
       LiveCommonLogTag liveCommonLo12 = new LiveCommonLogTag("LITE_NEW_MULTI_CHAT", 12, "LITE_NEW_MULTI_CHAT");
       LiveCommonLogTag.LITE_NEW_MULTI_CHAT = liveCommonLo12;
       LiveCommonLogTag[] liveCommonLo13 = new LiveCommonLogTag[13];
       liveCommonLo13[0] = liveCommonLo;
       liveCommonLo13[1] = liveCommonLo1;
       liveCommonLo13[2] = liveCommonLo2;
       liveCommonLo13[3] = liveCommonLo3;
       liveCommonLo13[4] = liveCommonLo4;
       liveCommonLo13[5] = liveCommonLo5;
       liveCommonLo13[6] = liveCommonLo6;
       liveCommonLo13[7] = liveCommonLo7;
       liveCommonLo13[8] = liveCommonLo8;
       liveCommonLo13[9] = liveCommonLo9;
       liveCommonLo13[10] = liveCommonLo10;
       liveCommonLo13[11] = liveCommonLo11;
       liveCommonLo13[12] = liveCommonLo12;
       LiveCommonLogTag.$VALUES = liveCommonLo13;
    }
    public void LiveCommonLogTag(String p0,int p1,String p2){
       super(p0, p1);
       this.mName = p2;
    }
    public static LiveCommonLogTag valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveCommonLogTag.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveCommonLogTag.class, p0);
    }
    public static LiveCommonLogTag[] values(){
       Object obj = PatchProxy.apply(null, null, LiveCommonLogTag.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveCommonLogTag.$VALUES.clone();
    }
    public List appendTag(String p0){
       return a.a(this, p0);
    }
    public String getName(){
       return this.mName;
    }
}
