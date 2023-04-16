package com.kuaishou.live.basic.utils.LiveBasicLogTag;
import pp.c;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import com.kuaishou.android.live.log.a;

public final class LiveBasicLogTag extends Enum implements c	// class@000d28
{
    public String mName;
    public static final LiveBasicLogTag[] $VALUES;
    public static final LiveBasicLogTag LIVE_EXCEPTION;
    public static final LiveBasicLogTag LIVE_SOCKET;

    static {
       LiveBasicLogTag liveBasicLog = new LiveBasicLogTag("LIVE_EXCEPTION", 0, "LiveException");
       LiveBasicLogTag.LIVE_EXCEPTION = liveBasicLog;
       LiveBasicLogTag liveBasicLog1 = new LiveBasicLogTag("LIVE_SOCKET", 1, "LiveSocket");
       LiveBasicLogTag.LIVE_SOCKET = liveBasicLog1;
       LiveBasicLogTag[] liveBasicLog2 = new LiveBasicLogTag[]{liveBasicLog,liveBasicLog1};
       LiveBasicLogTag.$VALUES = liveBasicLog2;
    }
    public void LiveBasicLogTag(String p0,int p1,String p2){
       super(p0, p1);
       this.mName = p2;
    }
    public static LiveBasicLogTag valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveBasicLogTag.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveBasicLogTag.class, p0);
    }
    public static LiveBasicLogTag[] values(){
       Object obj = PatchProxy.apply(null, null, LiveBasicLogTag.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveBasicLogTag.$VALUES.clone();
    }
    public List appendTag(String p0){
       return a.a(this, p0);
    }
    public String getName(){
       return this.mName;
    }
}
