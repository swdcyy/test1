package com.kwai.performance.overhead.memory.monitor.MemoryStat;
import java.lang.Cloneable;
import java.lang.Object;
import java.util.LinkedHashMap;

public final class MemoryStat implements Cloneable	// class@001162
{
    public int avg;
    public int count;
    public int end;
    public int max;
    public int min;
    public int start;
    public int total;
    public Map trends;

    public void MemoryStat(){
       super();
       this.max = Integer.MIN_VALUE;
       this.min = Integer.MAX_VALUE;
       this.trends = new LinkedHashMap();
    }
    public Object clone(){
       return super.clone();
    }
}
