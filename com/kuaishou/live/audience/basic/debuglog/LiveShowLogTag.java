package com.kuaishou.live.audience.basic.debuglog.LiveShowLogTag;
import pp.c;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import com.kuaishou.android.live.log.a;

public final class LiveShowLogTag extends Enum implements c	// class@000a38
{
    public String mName;
    public static final LiveShowLogTag[] $VALUES;
    public static final LiveShowLogTag BOTTOM_BUBBLE;
    public static final LiveShowLogTag DELAY_INFO;
    public static final LiveShowLogTag SHOW_SCENE;

    static {
       LiveShowLogTag liveShowLogT = new LiveShowLogTag("SHOW_SCENE", 0, "ShowScene");
       LiveShowLogTag.SHOW_SCENE = liveShowLogT;
       LiveShowLogTag liveShowLogT1 = new LiveShowLogTag("BOTTOM_BUBBLE", 1, "BottomBubble");
       LiveShowLogTag.BOTTOM_BUBBLE = liveShowLogT1;
       LiveShowLogTag liveShowLogT2 = new LiveShowLogTag("DELAY_INFO", 2, "DelayInfo");
       LiveShowLogTag.DELAY_INFO = liveShowLogT2;
       LiveShowLogTag[] liveShowLogT3 = new LiveShowLogTag[]{liveShowLogT,liveShowLogT1,liveShowLogT2};
       LiveShowLogTag.$VALUES = liveShowLogT3;
    }
    public void LiveShowLogTag(String p0,int p1,String p2){
       super(p0, p1);
       this.mName = p2;
    }
    public static LiveShowLogTag valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveShowLogTag.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveShowLogTag.class, p0);
    }
    public static LiveShowLogTag[] values(){
       Object obj = PatchProxy.apply(null, null, LiveShowLogTag.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveShowLogTag.$VALUES.clone();
    }
    public List appendTag(String p0){
       return a.a(this, p0);
    }
    public String getName(){
       return this.mName;
    }
}
