package com.kwai.performance.overhead.io.monitor.IoMonitorPdConfig;
import java.io.Serializable;
import java.lang.Object;
import dg7.b;
import java.lang.String;
import java.lang.StringBuilder;
import java.util.Arrays;

public class IoMonitorPdConfig implements Serializable	// class@001156
{
    public int[] bufferPdRulesByte;

    public void IoMonitorPdConfig(){
       super();
       this.bufferPdRulesByte = b.n;
    }
    public String toString(){
       return "IoMonitorPdConfig{bufferPdRulesByte="+Arrays.toString(this.bufferPdRulesByte)+'}';
    }
}
