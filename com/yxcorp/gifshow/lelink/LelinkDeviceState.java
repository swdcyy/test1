package com.yxcorp.gifshow.lelink.LelinkDeviceState;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LelinkDeviceState extends Enum	// class@001a23
{
    public static final LelinkDeviceState[] $VALUES;
    public static final LelinkDeviceState Connected;
    public static final LelinkDeviceState Connecting;
    public static final LelinkDeviceState Normal;

    static {
       LelinkDeviceState lelinkDevice1;
       LelinkDeviceState[] lelinkDevice = new LelinkDeviceState[]{lelinkDevice1,lelinkDevice1,lelinkDevice1};
       lelinkDevice1 = new LelinkDeviceState("Normal", 0);
       LelinkDeviceState.Normal = lelinkDevice1;
       lelinkDevice1 = new LelinkDeviceState("Connecting", 1);
       LelinkDeviceState.Connecting = lelinkDevice1;
       lelinkDevice1 = new LelinkDeviceState("Connected", 2);
       LelinkDeviceState.Connected = lelinkDevice1;
       LelinkDeviceState.$VALUES = lelinkDevice;
    }
    public void LelinkDeviceState(String p0,int p1){
       super(p0, p1);
    }
    public static LelinkDeviceState valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LelinkDeviceState.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LelinkDeviceState.class, p0);
    }
    public static LelinkDeviceState[] values(){
       Object obj = PatchProxy.apply(null, null, LelinkDeviceState.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LelinkDeviceState.$VALUES.clone();
    }
}
