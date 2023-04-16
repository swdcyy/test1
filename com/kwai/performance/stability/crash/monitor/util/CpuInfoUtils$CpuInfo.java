package com.kwai.performance.stability.crash.monitor.util.CpuInfoUtils$CpuInfo;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;

public class CpuInfoUtils$CpuInfo implements Serializable	// class@00120b
{
    public Integer cpu;
    public String name;
    public int nice;
    public String status;
    public long stm;
    public int tid;
    public long utm;

    public void CpuInfoUtils$CpuInfo(){
       super();
    }
    public String toString(){
       return "CpuInfo {name=\'"+this.name+'''+", tid="+this.tid+", nice="+this.nice+", status=\'"+this.status+'''+", utm="+this.utm+", stm="+this.stm+", cpu="+this.cpu+'}';
    }
}
