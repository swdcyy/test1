package com.kuaishou.live.jsbridge.LiveJsBridgeLogTag;
import pp.c;
import java.lang.Enum;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import com.kuaishou.android.live.log.a;

public final class LiveJsBridgeLogTag extends Enum implements c	// class@001d1e
{
    public final String mName;
    public static final LiveJsBridgeLogTag[] $VALUES;
    public static final LiveJsBridgeLogTag COMMON;
    public static final LiveJsBridgeLogTag RN;
    public static final LiveJsBridgeLogTag TK;
    public static final LiveJsBridgeLogTag Web;

    static {
       LiveJsBridgeLogTag liveJsBridge = new LiveJsBridgeLogTag("COMMON", 0, "");
       LiveJsBridgeLogTag.COMMON = liveJsBridge;
       LiveJsBridgeLogTag liveJsBridge1 = new LiveJsBridgeLogTag("RN", 1, "Rn");
       LiveJsBridgeLogTag.RN = liveJsBridge1;
       LiveJsBridgeLogTag liveJsBridge2 = new LiveJsBridgeLogTag("TK", 2, "Tk");
       LiveJsBridgeLogTag.TK = liveJsBridge2;
       LiveJsBridgeLogTag liveJsBridge3 = new LiveJsBridgeLogTag("Web", 3, "Web");
       LiveJsBridgeLogTag.Web = liveJsBridge3;
       LiveJsBridgeLogTag[] liveJsBridge4 = new LiveJsBridgeLogTag[]{liveJsBridge,liveJsBridge1,liveJsBridge2,liveJsBridge3};
       LiveJsBridgeLogTag.$VALUES = liveJsBridge4;
    }
    public void LiveJsBridgeLogTag(String p0,int p1,String p2){
       super(p0, p1);
       this.mName = "LiveJsBridge"+p2;
    }
    public static LiveJsBridgeLogTag valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveJsBridgeLogTag.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveJsBridgeLogTag.class, p0);
    }
    public static LiveJsBridgeLogTag[] values(){
       Object obj = PatchProxy.apply(null, null, LiveJsBridgeLogTag.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveJsBridgeLogTag.$VALUES.clone();
    }
    public List appendTag(String p0){
       return a.a(this, p0);
    }
    public String getName(){
       return this.mName;
    }
}
