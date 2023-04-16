package com.kwai.live.gzone.connect.service.LiveGzoneConnectionService$MessageType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveGzoneConnectionService$MessageType extends Enum	// class@000cce
{
    public int mType;
    public static final LiveGzoneConnectionService$MessageType[] $VALUES;
    public static final LiveGzoneConnectionService$MessageType COMMENT;

    static {
       LiveGzoneConnectionService$MessageType messageType = new LiveGzoneConnectionService$MessageType("COMMENT", 0, 1);
       LiveGzoneConnectionService$MessageType.COMMENT = messageType;
       LiveGzoneConnectionService$MessageType[] messageTypeA = new LiveGzoneConnectionService$MessageType[]{messageType};
       LiveGzoneConnectionService$MessageType.$VALUES = messageTypeA;
    }
    public void LiveGzoneConnectionService$MessageType(String p0,int p1,int p2){
       super(p0, p1);
       this.mType = p2;
    }
    public static LiveGzoneConnectionService$MessageType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveGzoneConnectionService$MessageType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveGzoneConnectionService$MessageType.class, p0);
    }
    public static LiveGzoneConnectionService$MessageType[] values(){
       Object obj = PatchProxy.apply(null, null, LiveGzoneConnectionService$MessageType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveGzoneConnectionService$MessageType.$VALUES.clone();
    }
    public int value(){
       return this.mType;
    }
}
