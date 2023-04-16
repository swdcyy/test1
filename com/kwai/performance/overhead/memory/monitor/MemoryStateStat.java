package com.kwai.performance.overhead.memory.monitor.MemoryStateStat;
import java.lang.Cloneable;
import java.lang.Object;
import java.util.LinkedHashMap;

public final class MemoryStateStat implements Cloneable	// class@001163
{
    public int count;
    public int current;
    public float ratio;
    public int total;
    public Map trends;

    public void MemoryStateStat(){
       super();
       this.trends = new LinkedHashMap();
    }
    public Object clone(){
       return super.clone();
    }
}
