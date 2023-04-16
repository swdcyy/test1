package com.kwai.performance.overhead.io.monitor.IoMonitorWBConfig;
import java.io.Serializable;
import java.lang.Object;
import dg7.b;
import java.lang.String;
import java.lang.StringBuilder;
import java.util.Arrays;

public class IoMonitorWBConfig implements Serializable	// class@001157
{
    public String[] ignoreElfs;
    public String[] monitorBlackFiles;
    public String[] monitorWhiteFiles;
    public String[] overviewBlackFiles;
    public String[] overviewElfs;
    public String[] overviewFiles;
    public String[] overviewWhiteFiles;

    public void IoMonitorWBConfig(){
       super();
       this.overviewElfs = b.a;
       this.ignoreElfs = b.b;
       this.overviewWhiteFiles = b.e;
       this.overviewFiles = b.f;
       this.overviewBlackFiles = b.g;
       this.monitorWhiteFiles = b.c;
       this.monitorBlackFiles = b.d;
    }
    public String toString(){
       return "IoMonitorWBConfig{overviewElfs="+Arrays.toString(this.overviewElfs)+", ignoreElfs="+Arrays.toString(this.ignoreElfs)+", overviewWhiteFiles="+Arrays.toString(this.overviewWhiteFiles)+", overviewFiles="+Arrays.toString(this.overviewFiles)+", overviewBlackFiles="+Arrays.toString(this.overviewBlackFiles)+", monitorWhiteFiles="+Arrays.toString(this.monitorWhiteFiles)+", monitorBlackFiles="+Arrays.toString(this.monitorBlackFiles)+'}';
    }
}
