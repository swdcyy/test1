package com.kuaishou.live.core.show.highlight.LiveHighlightLogTag;
import pp.c;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import com.kuaishou.android.live.log.a;

public final class LiveHighlightLogTag extends Enum implements c	// class@000be4
{
    public final String mName;
    public static final LiveHighlightLogTag[] $VALUES;
    public static final LiveHighlightLogTag LIVE_HIGHLIGHT;

    static {
       LiveHighlightLogTag liveHighligh = new LiveHighlightLogTag("LIVE_HIGHLIGHT", 0, "LiveHighlight");
       LiveHighlightLogTag.LIVE_HIGHLIGHT = liveHighligh;
       LiveHighlightLogTag[] liveHighligh1 = new LiveHighlightLogTag[]{liveHighligh};
       LiveHighlightLogTag.$VALUES = liveHighligh1;
    }
    public void LiveHighlightLogTag(String p0,int p1,String p2){
       super(p0, p1);
       this.mName = p2;
    }
    public static LiveHighlightLogTag valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveHighlightLogTag.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveHighlightLogTag.class, p0);
    }
    public static LiveHighlightLogTag[] values(){
       Object obj = PatchProxy.apply(null, null, LiveHighlightLogTag.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveHighlightLogTag.$VALUES.clone();
    }
    public List appendTag(String p0){
       return a.a(this, p0);
    }
    public String getName(){
       return this.mName;
    }
}
