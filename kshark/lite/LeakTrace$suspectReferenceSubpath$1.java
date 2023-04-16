package kshark.lite.LeakTrace$suspectReferenceSubpath$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import kshark.lite.LeakTrace;
import java.lang.Object;
import java.lang.Number;
import kshark.lite.LeakTraceReference;
import java.lang.Boolean;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class LeakTrace$suspectReferenceSubpath$1 extends Lambda implements p	// class@001ba8
{
    public final LeakTrace this$0;

    public void LeakTrace$suspectReferenceSubpath$1(LeakTrace p0){
       this.this$0 = p0;
       super(2);
    }
    public Object invoke(Object p0,Object p1){
       return Boolean.valueOf(this.invoke(p0.intValue(), p1));
    }
    public final boolean invoke(int p0,LeakTraceReference p1){
       a.p(p1, "<anonymous parameter 1>");
       return this.this$0.referencePathElementIsSuspect(p0);
    }
}
