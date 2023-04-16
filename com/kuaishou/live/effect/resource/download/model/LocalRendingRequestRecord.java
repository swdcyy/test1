package com.kuaishou.live.effect.resource.download.model.LocalRendingRequestRecord;
import java.io.Serializable;
import java.lang.Cloneable;
import java.lang.Object;
import java.lang.System;

public class LocalRendingRequestRecord implements Serializable, Cloneable	// class@001b4b
{
    public int curCacheNum;
    public int isClean;
    public int preCacheNum;
    public long timestamp;
    public static final long serialVersionUID = 0xf92b4dd06c7829db;

    public void LocalRendingRequestRecord(int p0,int p1){
       super();
       this.preCacheNum = p0;
       this.curCacheNum = p1;
       this.timestamp = System.currentTimeMillis();
       p0 = (!p1 && p0 > p1)? 1: 0;
       this.isClean = p0;
       return;
    }
}
