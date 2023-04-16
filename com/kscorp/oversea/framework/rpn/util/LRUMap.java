package com.kscorp.oversea.framework.rpn.util.LRUMap;
import java.util.LinkedHashMap;
import java.util.Map$Entry;

public class LRUMap extends LinkedHashMap	// class@00076c
{
    public int maxSize;

    public void LRUMap(int p0){
       super(0, 0x3f400000, true);
       this.maxSize = p0;
    }
    public boolean removeEldestEntry(Map$Entry p0){
       boolean b = (this.size() > this.maxSize)? true: false;
       return b;
    }
}
