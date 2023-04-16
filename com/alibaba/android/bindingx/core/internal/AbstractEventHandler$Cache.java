package com.alibaba.android.bindingx.core.internal.AbstractEventHandler$Cache;
import java.util.LinkedHashMap;
import java.lang.Math;
import java.util.Map$Entry;

public class AbstractEventHandler$Cache extends LinkedHashMap	// class@000ddd
{
    public int maxSize;

    public void AbstractEventHandler$Cache(int p0){
       super(4, 0x3f400000, true);
       this.maxSize = Math.max(p0, 4);
    }
    public boolean removeEldestEntry(Map$Entry p0){
       boolean b = (this.size() > this.maxSize)? true: false;
       return b;
    }
}
