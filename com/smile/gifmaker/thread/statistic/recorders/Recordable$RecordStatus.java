package com.smile.gifmaker.thread.statistic.recorders.Recordable$RecordStatus;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class Recordable$RecordStatus extends Enum	// class@000fce
{
    public static final Recordable$RecordStatus[] $VALUES;
    public static final Recordable$RecordStatus RECORDING;
    public static final Recordable$RecordStatus RECORD_END;
    public static final Recordable$RecordStatus UNINITIATED;

    static {
       Recordable$RecordStatus recordStatus = new Recordable$RecordStatus("UNINITIATED", 0);
       Recordable$RecordStatus.UNINITIATED = recordStatus;
       Recordable$RecordStatus recordStatus1 = new Recordable$RecordStatus("RECORDING", 1);
       Recordable$RecordStatus.RECORDING = recordStatus1;
       Recordable$RecordStatus recordStatus2 = new Recordable$RecordStatus("RECORD_END", 2);
       Recordable$RecordStatus.RECORD_END = recordStatus2;
       Recordable$RecordStatus[] recordStatus3 = new Recordable$RecordStatus[]{recordStatus,recordStatus1,recordStatus2};
       Recordable$RecordStatus.$VALUES = recordStatus3;
    }
    public void Recordable$RecordStatus(String p0,int p1){
       super(p0, p1);
    }
    public static Recordable$RecordStatus valueOf(String p0){
       return Enum.valueOf(Recordable$RecordStatus.class, p0);
    }
    public static Recordable$RecordStatus[] values(){
       return Recordable$RecordStatus.$VALUES.clone();
    }
}
