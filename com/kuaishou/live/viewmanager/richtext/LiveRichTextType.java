package com.kuaishou.live.viewmanager.richtext.LiveRichTextType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveRichTextType extends Enum	// class@000ff6
{
    public static final LiveRichTextType[] $VALUES;
    public static final LiveRichTextType COMMENT;
    public static final LiveRichTextType USERSTATE;

    static {
       LiveRichTextType liveRichText1;
       LiveRichTextType[] liveRichText = new LiveRichTextType[]{liveRichText1,liveRichText1};
       liveRichText1 = new LiveRichTextType("COMMENT", 0);
       LiveRichTextType.COMMENT = liveRichText1;
       liveRichText1 = new LiveRichTextType("USERSTATE", 1);
       LiveRichTextType.USERSTATE = liveRichText1;
       LiveRichTextType.$VALUES = liveRichText;
    }
    public void LiveRichTextType(String p0,int p1){
       super(p0, p1);
    }
    public static LiveRichTextType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveRichTextType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveRichTextType.class, p0);
    }
    public static LiveRichTextType[] values(){
       Object obj = PatchProxy.apply(null, null, LiveRichTextType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveRichTextType.$VALUES.clone();
    }
}
