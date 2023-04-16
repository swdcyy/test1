package com.kwai.feature.api.danmaku.params.DanmakuSendType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class DanmakuSendType extends Enum	// class@000e8b
{
    public String content;
    public static final DanmakuSendType[] $VALUES;
    public static final DanmakuSendType NORMAL;
    public static final DanmakuSendType PLUS_ONE;
    public static final DanmakuSendType PRESET;
    public static final DanmakuSendType PRESET_DIRECT;
    public static final DanmakuSendType PRODUCTION_VOTE;
    public static final DanmakuSendType STICKER;

    static {
       DanmakuSendType uDanmakuSend1;
       DanmakuSendType[] uDanmakuSend = new DanmakuSendType[]{uDanmakuSend1,uDanmakuSend1,uDanmakuSend1,uDanmakuSend1,uDanmakuSend1,uDanmakuSend1};
       uDanmakuSend1 = new DanmakuSendType("NORMAL", 0, "NORMAL");
       DanmakuSendType.NORMAL = uDanmakuSend1;
       uDanmakuSend1 = new DanmakuSendType("PRESET", 1, "PRESET");
       DanmakuSendType.PRESET = uDanmakuSend1;
       uDanmakuSend1 = new DanmakuSendType("PRESET_DIRECT", 2, "PRESET");
       DanmakuSendType.PRESET_DIRECT = uDanmakuSend1;
       uDanmakuSend1 = new DanmakuSendType("PLUS_ONE", 3, "PLUS_ONE");
       DanmakuSendType.PLUS_ONE = uDanmakuSend1;
       uDanmakuSend1 = new DanmakuSendType("STICKER", 4, "STICKER");
       DanmakuSendType.STICKER = uDanmakuSend1;
       uDanmakuSend1 = new DanmakuSendType("PRODUCTION_VOTE", 5, "PRODUCTION_VOTE");
       DanmakuSendType.PRODUCTION_VOTE = uDanmakuSend1;
       DanmakuSendType.$VALUES = uDanmakuSend;
    }
    public void DanmakuSendType(String p0,int p1,String p2){
       super(p0, p1);
       this.content = p2;
    }
    public static DanmakuSendType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, DanmakuSendType.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(DanmakuSendType.class, p0);
    }
    public static DanmakuSendType[] values(){
       Object obj = PatchProxy.apply(null, null, DanmakuSendType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return DanmakuSendType.$VALUES.clone();
    }
    public final String getContent(){
       return this.content;
    }
    public final void setContent(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DanmakuSendType.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.content = p0;
       return;
    }
}
