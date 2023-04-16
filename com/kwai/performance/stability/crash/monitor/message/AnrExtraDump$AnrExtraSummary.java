package com.kwai.performance.stability.crash.monitor.message.AnrExtraDump$AnrExtraSummary;
import java.io.Serializable;
import java.lang.Object;
import java.lang.StringBuilder;
import java.text.SimpleDateFormat;
import java.lang.String;
import java.util.Date;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;
import java.lang.Integer;

public class AnrExtraDump$AnrExtraSummary implements Serializable	// class@0011f0
{
    public long advTrimCost;
    public List anrTag;
    public long cpuCount;
    public int cpuInfoCount;
    public Map idleRecordStatus;
    public int jvmtiClass;
    public int jvmtiClassReal;
    public int jvmtiGc;
    public int jvmtiGcReal;
    public int keepSize;
    public long maxCpu;
    public int maxCpuIndex;
    public long maxIdleCpu;
    public long maxIdleWall;
    public long maxWall;
    public int maxWallIndex;
    public long maxWallWithIdle;
    public int maxWallWithIdleIndex;
    public int packedSize;
    public Map packedStatus;
    public long recordEndTime;
    public long recordStartTime;
    public int runtimeStatCount;
    public int stackCount;
    public int stackDiffCount;
    public long wallCount;
    public boolean wallIdxEqCpu;

    public void AnrExtraDump$AnrExtraSummary(){
       super();
       this.stackCount = 0;
       this.stackDiffCount = 0;
       this.cpuInfoCount = 0;
       this.runtimeStatCount = 0;
       this.advTrimCost = 0;
       this.jvmtiGc = -1;
       this.jvmtiGcReal = -1;
       this.jvmtiClass = -1;
       this.jvmtiClassReal = -1;
    }
    public StringBuilder toString(StringBuilder p0,SimpleDateFormat p1){
       Iterator iterator;
       p0 = p0+"WallTotal: "+this.wallCount+"\n"+"CpuTotal: "+this.cpuCount+"\n"+"RecordTimes: "+(this.recordEndTime - this.recordStartTime)+"\n"+"RecordStartAt: "+p1.format(new Date(this.recordStartTime))+"\n"+"RecordEndAt: "+p1.format(new Date(this.recordEndTime))+"\n\n";
       if (this.packedStatus != null) {
          p0 = p0+">>> PackedList <<<"+"\n";
          iterator = this.packedStatus.keySet().iterator();
          while (iterator.hasNext()) {
             String str = iterator.next();
             p0 = p0+str+": "+this.packedStatus.get(str)+"\n";
          }
          p0 = p0+"\n";
       }
       if (this.idleRecordStatus != null) {
          p0 = p0+">>> Idle Handler Status <<<"+"\n";
          iterator = this.idleRecordStatus.keySet().iterator();
          while (iterator.hasNext()) {
             Integer integer = iterator.next();
             p0 = p0+"Index = "+integer+" | "+this.idleRecordStatus.get(integer)+"\n";
          }
          p0 = p0+"\n";
       }
       return p0+"MaxWall: "+this.maxWall+", MaxCpu: "+this.maxCpu+", MaxWallIdx: "+this.maxWallIndex+", MaxCpuIdx: "+this.maxCpuIndex+", MaxWallIdxEqCpu: "+this.wallIdxEqCpu+"\n"+"MaxIdleWall: "+this.maxIdleWall+", MaxIdleCpu: "+this.maxIdleCpu+", MaxWallWithIdle: "+this.maxWallWithIdle+", MaxWallWithIdleIndex: "+this.maxWallWithIdleIndex+"\n";
    }
}
