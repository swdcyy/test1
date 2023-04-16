package com.kwai.performance.stability.crash.monitor.message.AnrExtraDump$SamplingPerf;
import java.io.Serializable;
import java.lang.Object;

public class AnrExtraDump$SamplingPerf implements Serializable	// class@0011f2
{
    public float avgCpu;
    public float avgWall;
    public float checkTimeAvg;
    public long checkTimeMax;
    public long maxCpu;
    public long maxWall;
    public long minCpu;
    public long minWall;
    public long samplingCount;
    public long stackCount;
    public long stackDiffCount;
    public long stackDiffMax;
    public long stackDiffTotal;

    public void AnrExtraDump$SamplingPerf(){
       super();
       this.minCpu = -1;
       this.minWall = -1;
       this.maxCpu = -1;
       this.maxWall = -1;
       this.avgCpu = 0xbf800000;
       this.avgWall = 0xbf800000;
       this.stackCount = 0;
       this.stackDiffCount = 0;
       this.stackDiffTotal = 0;
       this.stackDiffMax = 0;
       this.samplingCount = 0;
       this.checkTimeMax = 0;
       this.checkTimeAvg = 0;
    }
}
