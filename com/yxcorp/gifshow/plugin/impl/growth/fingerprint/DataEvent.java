package com.yxcorp.gifshow.plugin.impl.growth.fingerprint.DataEvent;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class DataEvent extends Enum	// class@000fc5
{
    public static final DataEvent[] $VALUES;
    public static final DataEvent IMEI_AUTHORIZED_POPUP;
    public static final DataEvent PRIVACY_POPUP;
    public static final DataEvent SYSTEM_STARTUP;
    public static final DataEvent SYSTEM_STAT_APP_STARTUP;
    public static final DataEvent UNKNOWN_DATA_EVENT;

    static {
       DataEvent uDataEvent;
       DataEvent[] uDataEventAr = new DataEvent[]{uDataEvent,uDataEvent,uDataEvent,uDataEvent,uDataEvent};
       uDataEvent = new DataEvent("UNKNOWN_DATA_EVENT", 0);
       DataEvent.UNKNOWN_DATA_EVENT = uDataEvent;
       uDataEvent = new DataEvent("SYSTEM_STAT_APP_STARTUP", 1);
       DataEvent.SYSTEM_STAT_APP_STARTUP = uDataEvent;
       uDataEvent = new DataEvent("SYSTEM_STARTUP", 2);
       DataEvent.SYSTEM_STARTUP = uDataEvent;
       uDataEvent = new DataEvent("PRIVACY_POPUP", 3);
       DataEvent.PRIVACY_POPUP = uDataEvent;
       uDataEvent = new DataEvent("IMEI_AUTHORIZED_POPUP", 4);
       DataEvent.IMEI_AUTHORIZED_POPUP = uDataEvent;
       DataEvent.$VALUES = uDataEventAr;
    }
    public void DataEvent(String p0,int p1){
       super(p0, p1);
    }
    public static DataEvent valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, DataEvent.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(DataEvent.class, p0);
    }
    public static DataEvent[] values(){
       Object obj = PatchProxy.apply(null, null, DataEvent.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return DataEvent.$VALUES.clone();
    }
}
