package com.kwai.framework.exceptionhandler.Clue;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import nsd.u;
import java.lang.System;

public final class Clue	// class@00153a
{
    public final String key;
    public final long timestamp;
    public final String value;

    public void Clue(String p0,String p1,long p2){
       a.p(p0, "key");
       a.p(p1, "value");
       super();
       this.key = p0;
       this.value = p1;
       this.timestamp = p2;
    }
    public void Clue(String p0,String p1,long p2,int p3,u p4){
       if (p3 & 0x04) {
          p2 = System.currentTimeMillis();
       }
       super(p0, p1, p2);
       return;
    }
    public final String getKey(){
       return this.key;
    }
    public final long getTimestamp(){
       return this.timestamp;
    }
    public final String getValue(){
       return this.value;
    }
}
