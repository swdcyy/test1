package kshark.lite.HeapAnalyzer$b;
import kshark.lite.HeapObject;
import kshark.lite.LeakTraceObject$LeakingStatus;
import java.lang.String;
import java.util.Set;
import java.lang.Object;
import kotlin.jvm.internal.a;

public final class HeapAnalyzer$b	// class@001b7f
{
    public final HeapObject a;
    public final LeakTraceObject$LeakingStatus b;
    public final String c;
    public final Set d;

    public void HeapAnalyzer$b(HeapObject p0,LeakTraceObject$LeakingStatus p1,String p2,Set p3){
       a.p(p0, "heapObject");
       a.p(p1, "leakingStatus");
       a.p(p2, "leakingStatusReason");
       a.p(p3, "labels");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public final HeapObject a(){
       return this.a;
    }
}
