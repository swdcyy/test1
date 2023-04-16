package com.kwai.performance.stability.leak.monitor.message.FrameInfo;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import zsd.b;
import java.lang.Long;

public final class FrameInfo	// class@001239
{
    public long relPc;
    public String soName;

    public void FrameInfo(long p0,String p1){
       a.q(p1, "soName");
       super();
       this.relPc = p0;
       this.soName = p1;
    }
    public static FrameInfo copy$default(FrameInfo p0,long p1,String p2,int p3,Object p4){
       FrameInfo relPc;
       FrameInfo soName;
       if (p3 & 0x01) {
          relPc = p0.relPc;
       }
       if (p3 & 0x02) {
          soName = p0.soName;
       }
       return p0.copy(relPc, soName);
    }
    public final long component1(){
       return this.relPc;
    }
    public final String component2(){
       return this.soName;
    }
    public final FrameInfo copy(long p0,String p1){
       a.q(p1, "soName");
       return new FrameInfo(p0, p1);
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof FrameInfo && (!this.relPc - p0.relPc && a.g(this.soName, p0.soName)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       FrameInfo trelPc = this.relPc;
       int i = (int)(trelPc ^ (trelPc >> 32)) * 31;
       trelPc = this.soName;
       int i1 = (trelPc != null)? trelPc.hashCode(): 0;
       return (i + i1);
    }
    public String toString(){
       String str = Long.toString(this.relPc, b.a(16));
       a.h(str, "java.lang.Long.toString\(this, checkRadix\(radix\)\)");
       StringBuilder str1 = "0x"+str;
       return str1+"  "+this.soName;
    }
}
