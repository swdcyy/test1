package kshark.lite.LeakTraceObject$LeakingStatus;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class LeakTraceObject$LeakingStatus extends Enum	// class@001baa
{
    public static final LeakTraceObject$LeakingStatus[] $VALUES;
    public static final LeakTraceObject$LeakingStatus LEAKING;
    public static final LeakTraceObject$LeakingStatus NOT_LEAKING;
    public static final LeakTraceObject$LeakingStatus UNKNOWN;

    static {
       LeakTraceObject$LeakingStatus leakingStatu1;
       LeakTraceObject$LeakingStatus[] leakingStatu = new LeakTraceObject$LeakingStatus[]{leakingStatu1,leakingStatu1,leakingStatu1};
       leakingStatu1 = new LeakTraceObject$LeakingStatus("NOT_LEAKING", 0);
       LeakTraceObject$LeakingStatus.NOT_LEAKING = leakingStatu1;
       leakingStatu1 = new LeakTraceObject$LeakingStatus("LEAKING", 1);
       LeakTraceObject$LeakingStatus.LEAKING = leakingStatu1;
       leakingStatu1 = new LeakTraceObject$LeakingStatus("UNKNOWN", 2);
       LeakTraceObject$LeakingStatus.UNKNOWN = leakingStatu1;
       LeakTraceObject$LeakingStatus.$VALUES = leakingStatu;
    }
    public void LeakTraceObject$LeakingStatus(String p0,int p1){
       super(p0, p1);
    }
    public static LeakTraceObject$LeakingStatus valueOf(String p0){
       return Enum.valueOf(LeakTraceObject$LeakingStatus.class, p0);
    }
    public static LeakTraceObject$LeakingStatus[] values(){
       return LeakTraceObject$LeakingStatus.$VALUES.clone();
    }
}
