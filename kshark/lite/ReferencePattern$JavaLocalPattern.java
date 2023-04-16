package kshark.lite.ReferencePattern$JavaLocalPattern;
import kshark.lite.ReferencePattern;
import kshark.lite.ReferencePattern$JavaLocalPattern$a;
import nsd.u;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;

public final class ReferencePattern$JavaLocalPattern extends ReferencePattern	// class@001bbb
{
    public final String threadName;
    public static final ReferencePattern$JavaLocalPattern$a Companion;
    public static final long serialVersionUID;

    static {
       ReferencePattern$JavaLocalPattern.Companion = new ReferencePattern$JavaLocalPattern$a(null);
    }
    public void ReferencePattern$JavaLocalPattern(String p0){
       a.p(p0, "threadName");
       super(null);
       this.threadName = p0;
    }
    public static ReferencePattern$JavaLocalPattern copy$default(ReferencePattern$JavaLocalPattern p0,String p1,int p2,Object p3){
       ReferencePattern$JavaLocalPattern threadName;
       if (p2 & 0x01) {
          threadName = p0.threadName;
       }
       return p0.copy(threadName);
    }
    public final String component1(){
       return this.threadName;
    }
    public final ReferencePattern$JavaLocalPattern copy(String p0){
       a.p(p0, "threadName");
       return new ReferencePattern$JavaLocalPattern(p0);
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof ReferencePattern$JavaLocalPattern && a.g(this.threadName, p0.threadName))) {
          return true;
       }
       return false;
    }
    public final String getThreadName(){
       return this.threadName;
    }
    public int hashCode(){
       ReferencePattern$JavaLocalPattern tthreadName = this.threadName;
       int i = (tthreadName != null)? tthreadName.hashCode(): 0;
       return i;
    }
    public String toString(){
       return "local variable on thread "+this.threadName;
    }
}
