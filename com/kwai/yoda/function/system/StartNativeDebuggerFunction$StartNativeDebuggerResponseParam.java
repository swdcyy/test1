package com.kwai.yoda.function.system.StartNativeDebuggerFunction$StartNativeDebuggerResponseParam;
import com.kwai.yoda.function.FunctionResultParams;

public final class StartNativeDebuggerFunction$StartNativeDebuggerResponseParam extends FunctionResultParams	// class@0011fa
{
    public boolean canNativeDebug;
    public int cpuCount;
    public String deviceName;
    public String did;
    public boolean isArm64;
    public boolean isLowPhone;
    public boolean isSupportArm64;
    public boolean isSysWebView;
    public String kpn;
    public String mod;
    public String systemVersion;

    public void StartNativeDebuggerFunction$StartNativeDebuggerResponseParam(){
       super();
       this.kpn = "";
       this.systemVersion = "";
       this.did = "";
       this.mod = "";
       this.deviceName = "";
       this.cpuCount = -1;
    }
}
