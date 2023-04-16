package com.kuaishou.android.live.log.LiveUtilsLogTag;
import pp.c;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import com.kuaishou.android.live.log.a;

public final class LiveUtilsLogTag extends Enum implements c	// class@0007d5
{
    public String mName;
    public static final LiveUtilsLogTag[] $VALUES;
    public static final LiveUtilsLogTag LiveColorUtils;
    public static final LiveUtilsLogTag LiveEntryMakeMoneyUtils;
    public static final LiveUtilsLogTag LiveUtils;
    public static final LiveUtilsLogTag LiveViewUtils;

    static {
       LiveUtilsLogTag liveUtilsLog = new LiveUtilsLogTag("LiveUtils", 0, "LiveUtils");
       LiveUtilsLogTag.LiveUtils = liveUtilsLog;
       LiveUtilsLogTag liveUtilsLog1 = new LiveUtilsLogTag("LiveViewUtils", 1, "LiveViewUtils");
       LiveUtilsLogTag.LiveViewUtils = liveUtilsLog1;
       LiveUtilsLogTag liveUtilsLog2 = new LiveUtilsLogTag("LiveColorUtils", 2, "LiveColorUtils");
       LiveUtilsLogTag.LiveColorUtils = liveUtilsLog2;
       LiveUtilsLogTag liveUtilsLog3 = new LiveUtilsLogTag("LiveEntryMakeMoneyUtils", 3, "LiveEntryMakeMoneyUtils");
       LiveUtilsLogTag.LiveEntryMakeMoneyUtils = liveUtilsLog3;
       LiveUtilsLogTag[] liveUtilsLog4 = new LiveUtilsLogTag[]{liveUtilsLog,liveUtilsLog1,liveUtilsLog2,liveUtilsLog3};
       LiveUtilsLogTag.$VALUES = liveUtilsLog4;
    }
    public void LiveUtilsLogTag(String p0,int p1,String p2){
       super(p0, p1);
       this.mName = p2;
    }
    public static LiveUtilsLogTag valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveUtilsLogTag.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveUtilsLogTag.class, p0);
    }
    public static LiveUtilsLogTag[] values(){
       Object obj = PatchProxy.apply(null, null, LiveUtilsLogTag.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveUtilsLogTag.$VALUES.clone();
    }
    public List appendTag(String p0){
       return a.a(this, p0);
    }
    public String getName(){
       return this.mName;
    }
}
