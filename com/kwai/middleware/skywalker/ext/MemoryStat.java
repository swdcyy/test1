package com.kwai.middleware.skywalker.ext.MemoryStat;
import java.lang.Cloneable;
import java.lang.Object;

public final class MemoryStat implements Cloneable	// class@000f5f
{
    public int avg;
    public int count;
    public int end;
    public int max;
    public int min;
    public int start;
    public int total;

    public void MemoryStat(){
       super();
       this.max = Integer.MIN_VALUE;
       this.min = Integer.MAX_VALUE;
    }
    public Object clone(){
       return super.clone();
    }
}
