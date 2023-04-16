package com.kwai.yoda.kernel.dev.DevToolClientEvent$EventParam;
import java.lang.Object;
import java.lang.System;

public final class DevToolClientEvent$EventParam	// class@0012a0
{
    public Object eventInfo;
    public String eventName;
    public long timestamp;

    public void DevToolClientEvent$EventParam(){
       super();
       this.timestamp = System.currentTimeMillis();
       this.eventName = "";
    }
}
