package com.kuaishou.live.core.voiceparty.theater.player.sync.audience.ProgressSource;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class ProgressSource extends Enum	// class@0019c0
{
    public static final ProgressSource[] $VALUES;
    public static final ProgressSource ARYA_BROADCAST;
    public static final ProgressSource FLV_STREAM;

    static {
       ProgressSource progressSour = new ProgressSource("FLV_STREAM", 0);
       ProgressSource.FLV_STREAM = progressSour;
       ProgressSource progressSour1 = new ProgressSource("ARYA_BROADCAST", 1);
       ProgressSource.ARYA_BROADCAST = progressSour1;
       ProgressSource[] progressSour2 = new ProgressSource[]{progressSour,progressSour1};
       ProgressSource.$VALUES = progressSour2;
    }
    public void ProgressSource(String p0,int p1){
       super(p0, p1);
    }
    public static ProgressSource valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ProgressSource.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(ProgressSource.class, p0);
    }
    public static ProgressSource[] values(){
       Object obj = PatchProxy.apply(null, null, ProgressSource.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ProgressSource.$VALUES.clone();
    }
}
