package cn7.f;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class f	// class@00057a
{
    public final long createTime;
    public final String currentLabel;
    public final int queueLength;
    public final int threadPriority;

    public void f(int p0,int p1,String p2,long p3){
       a.p(p2, "currentLabel");
       super();
       this.threadPriority = p0;
       this.queueLength = p1;
       this.currentLabel = p2;
       this.createTime = p3;
    }
    public final long a(){
       return this.createTime;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof f && (this.threadPriority == p0.threadPriority && (this.queueLength == p0.queueLength && (a.g(this.currentLabel, p0.currentLabel) && !this.createTime - p0.createTime))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, f.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = ((this.threadPriority * 31) + this.queueLength) * 31;
       f tcurrentLabe = this.currentLabel;
       int i1 = (tcurrentLabe != null)? tcurrentLabe.hashCode(): 0;
       tcurrentLabe = this.createTime;
       return (((i + i1) * 31) + (int)(tcurrentLabe ^ (tcurrentLabe >> 32)));
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, f.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "SchedulerInfo\(threadPriority="+this.threadPriority+", queueLength="+this.queueLength+", currentLabel="+this.currentLabel+", createTime="+this.createTime+"\)";
    }
}
