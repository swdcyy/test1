package com.kuaishou.live.debuglog.LiveModelLogTag;
import pp.c;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import com.kuaishou.android.live.log.a;

public final class LiveModelLogTag extends Enum implements c	// class@001ae7
{
    public String mName;
    public static final LiveModelLogTag[] $VALUES;
    public static final LiveModelLogTag LIVE_HIGHLIGHT;

    static {
       LiveModelLogTag liveModelLog = new LiveModelLogTag("LIVE_HIGHLIGHT", 0, "LiveHighlight");
       LiveModelLogTag.LIVE_HIGHLIGHT = liveModelLog;
       LiveModelLogTag[] liveModelLog1 = new LiveModelLogTag[]{liveModelLog};
       LiveModelLogTag.$VALUES = liveModelLog1;
    }
    public void LiveModelLogTag(String p0,int p1,String p2){
       super(p0, p1);
       this.mName = p2;
    }
    public static LiveModelLogTag valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveModelLogTag.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveModelLogTag.class, p0);
    }
    public static LiveModelLogTag[] values(){
       Object obj = PatchProxy.apply(null, null, LiveModelLogTag.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveModelLogTag.$VALUES.clone();
    }
    public List appendTag(String p0){
       return a.a(this, p0);
    }
    public String getName(){
       return this.mName;
    }
}
