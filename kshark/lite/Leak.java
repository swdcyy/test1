package kshark.lite.Leak;
import java.io.Serializable;
import kshark.lite.Leak$a;
import nsd.u;
import java.lang.Object;
import java.util.List;
import java.lang.String;
import java.lang.Integer;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kshark.lite.LeakTrace;
import java.util.Iterator;
import java.lang.Iterable;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;

public abstract class Leak implements Serializable	// class@001ba4
{
    public static final Leak$a Companion;
    public static final long serialVersionUID;

    static {
       Leak.Companion = new Leak$a(null);
    }
    public void Leak(){
       super();
    }
    public void Leak(u p0){
       super();
    }
    public abstract List getLeakTraces();
    public abstract String getShortDescription();
    public abstract String getSignature();
    public final Integer getTotalRetainedHeapByteSize(){
       Integer integer;
       if (CollectionsKt___CollectionsKt.m2(this.getLeakTraces()).getRetainedHeapByteSize() == null) {
          integer = null;
       }else {
          int i = 0;
          Iterator iterator = this.getLeakTraces().iterator();
          while (iterator.hasNext()) {
             Integer retainedHeap = iterator.next().getRetainedHeapByteSize();
             a.m(retainedHeap);
             i = i + retainedHeap.intValue();
          }
          integer = Integer.valueOf(i);
       }
       return integer;
    }
    public final Integer getTotalRetainedObjectCount(){
       Integer integer;
       if (CollectionsKt___CollectionsKt.m2(this.getLeakTraces()).getRetainedObjectCount() == null) {
          integer = null;
       }else {
          int i = 0;
          Iterator iterator = this.getLeakTraces().iterator();
          while (iterator.hasNext()) {
             Integer retainedObje = iterator.next().getRetainedObjectCount();
             a.m(retainedObje);
             i = i + retainedObje.intValue();
          }
          integer = Integer.valueOf(i);
       }
       return integer;
    }
    public String toString(){
       StringBuilder str = "";
       String str1 = "";
       String str2 = (this.getTotalRetainedHeapByteSize() != null)? this.getTotalRetainedHeapByteSize()+" bytes retained by leaking objects\n": str1;
       str = str+str2;
       if (this.getLeakTraces().size() > 1) {
          str1 = "Displaying only 1 leak trace out of "+this.getLeakTraces().size()+" with the same signature\n";
       }
       return str+str1+"Signature: "+this.getSignature()+10+CollectionsKt___CollectionsKt.m2(this.getLeakTraces());
    }
}
