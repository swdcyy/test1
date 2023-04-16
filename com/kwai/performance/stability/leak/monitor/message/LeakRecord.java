package com.kwai.performance.stability.leak.monitor.message.LeakRecord;
import java.lang.String;
import com.kwai.performance.stability.leak.monitor.message.FrameInfo;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import java.util.Arrays;
import kotlin.TypeCastException;
import java.lang.StringBuilder;

public final class LeakRecord	// class@00123a
{
    public FrameInfo[] frames;
    public long index;
    public int size;
    public String tag;
    public String threadName;

    public void LeakRecord(long p0,int p1,String p2,FrameInfo[] p3){
       a.q(p2, "threadName");
       a.q(p3, "frames");
       super();
       this.index = p0;
       this.size = p1;
       this.threadName = p2;
       this.frames = p3;
    }
    public static LeakRecord copy$default(LeakRecord p0,long p1,int p2,String p3,FrameInfo[] p4,int p5,Object p6){
       LeakRecord index;
       LeakRecord size;
       LeakRecord threadName;
       LeakRecord frames;
       if (p5 & 0x01) {
          index = p0.index;
       }
       LeakRecord leakRecord = index;
       if (p5 & 0x02) {
          size = p0.size;
       }
       LeakRecord leakRecord1 = size;
       if (p5 & 0x04) {
          threadName = p0.threadName;
       }
       LeakRecord leakRecord2 = threadName;
       if (p5 & 0x08) {
          frames = p0.frames;
       }
       return p0.copy(leakRecord, leakRecord1, leakRecord2, frames);
    }
    public final long component1(){
       return this.index;
    }
    public final int component2(){
       return this.size;
    }
    public final String component3(){
       return this.threadName;
    }
    public final FrameInfo[] component4(){
       return this.frames;
    }
    public final LeakRecord copy(long p0,int p1,String p2,FrameInfo[] p3){
       a.q(p2, "threadName");
       a.q(p3, "frames");
       LeakRecord leakRecord = new LeakRecord(p0, p1, p2, p3);
       return v0;
    }
    public boolean equals(Object p0){
       boolean b = true;
       if (this == p0) {
          return b;
       }
       LeakRecord leakRecord = LeakRecord.class;
       Class class = (p0 != null)? p0.getClass(): null;
       if (a.g(leakRecord, class) ^ b) {
          return false;
       }else if(p0 != null){
          if (this.index - p0.index) {
             return false;
          }else if(this.size != p0.size){
             return false;
          }else if(a.g(this.threadName, p0.threadName) ^ b){
             return false;
          }else if(!Arrays.equals(this.frames, p0.frames)){
             return false;
          }else if(a.g(this.tag, p0.tag) ^ b){
             return false;
          }else {
             return b;
          }
       }else {
          throw new TypeCastException("null cannot be cast to non-null type com.kwai.performance.stability.leak.monitor.message.LeakRecord");
       }
    }
    public int hashCode(){
       LeakRecord tindex = this.index;
       int i = (((((((int)(tindex ^ (tindex >> 32)) * 31) + this.size) * 31) + (this.threadName).hashCode()) * 31) + Arrays.hashCode(this.frames)) * 31;
       tindex = this.tag;
       int i1 = (tindex != null)? tindex.hashCode(): 0;
       return (i + i1);
    }
    public String toString(){
       String str = "Activity: "+this.tag+10+"LeakSize: "+this.size+" Byte\n"+"LeakThread: "+this.threadName+10+"Backtrace:\n";
       LeakRecord tframes = this.frames;
       int len = tframes.length;
       for (int i = 0; i < len; i = i + 1) {
          str = str+'#'+i+" pc "+tframes[i]+10;
       }
       str = str;
       a.h(str, "StringBuilder\(\).apply {\n¡­\\n\"\)\n    }\n  }.toString\(\)");
       return str;
    }
}
