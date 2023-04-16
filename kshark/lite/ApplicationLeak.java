package kshark.lite.ApplicationLeak;
import kshark.lite.Leak;
import kshark.lite.ApplicationLeak$a;
import nsd.u;
import java.util.List;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kshark.lite.LeakTrace;
import wsd.m;
import kotlin.sequences.SequencesKt___SequencesKt;
import kshark.lite.LeakTraceReference;
import java.lang.StringBuilder;
import kshark.lite.LeakTraceObject;

public final class ApplicationLeak extends Leak	// class@001b7d
{
    public final LeakTrace leakTrace;
    public final List leakTraces;
    public final Integer retainedHeapByteSize;
    public static final ApplicationLeak$a Companion;
    public static final long serialVersionUID;

    static {
       ApplicationLeak.Companion = new ApplicationLeak$a(null);
    }
    public void ApplicationLeak(List p0){
       a.p(p0, "leakTraces");
       super(null);
       this.leakTraces = p0;
    }
    public static ApplicationLeak copy$default(ApplicationLeak p0,List p1,int p2,Object p3){
       if (p2 & 0x01) {
          p1 = p0.getLeakTraces();
       }
       return p0.copy(p1);
    }
    public final List component1(){
       return this.getLeakTraces();
    }
    public final ApplicationLeak copy(List p0){
       a.p(p0, "leakTraces");
       return new ApplicationLeak(p0);
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof ApplicationLeak && a.g(this.getLeakTraces(), p0.getLeakTraces()))) {
          return true;
       }
       return false;
    }
    public List getLeakTraces(){
       return this.leakTraces;
    }
    public String getShortDescription(){
       String str;
       LeakTrace leakTrace = CollectionsKt___CollectionsKt.m2(this.getLeakTraces());
       LeakTraceReference leakTraceRef = SequencesKt___SequencesKt.w0(leakTrace.getSuspectReferenceSubpath());
       if (leakTraceRef != null) {
          str = leakTraceRef.getOriginObject().getClassSimpleName()+"."+leakTraceRef.getReferenceGenericName();
          if (str != null) {
          label_0041 :
             return str;
          }
       }
       str = leakTrace.getLeakingObject().getClassName();
       goto label_0041 ;
    }
    public String getSignature(){
       return CollectionsKt___CollectionsKt.m2(this.getLeakTraces()).getSignature();
    }
    public int hashCode(){
       List leakTraces = this.getLeakTraces();
       int i = (leakTraces != null)? leakTraces.hashCode(): 0;
       return i;
    }
    public String toString(){
       return super.toString();
    }
}
