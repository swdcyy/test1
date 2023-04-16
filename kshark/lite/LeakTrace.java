package kshark.lite.LeakTrace;
import java.io.Serializable;
import kshark.lite.LeakTrace$GcRootType;
import java.util.List;
import kshark.lite.LeakTraceObject;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Integer;
import trd.t;
import java.util.ArrayList;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import kshark.lite.LeakTraceReference;
import java.util.Collection;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kshark.lite.LeakTraceObject$LeakingStatus;
import java.lang.Comparable;
import wsd.m;
import kshark.lite.LeakTrace$signature$1;
import java.lang.CharSequence;
import msd.l;
import kotlin.sequences.SequencesKt___SequencesKt;
import std.o;
import kshark.lite.LeakTrace$suspectReferenceSubpath$1;
import msd.p;
import rtd.o;
import java.lang.Enum;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.lang.StringBuilder;

public final class LeakTrace implements Serializable	// class@001ba9
{
    public final List elements;
    public final LeakTrace$GcRootType gcRootType;
    public final LeakTraceObject leakingObject;
    public final List referencePath;

    public void LeakTrace(LeakTrace$GcRootType p0,List p1,LeakTraceObject p2){
       a.p(p0, "gcRootType");
       a.p(p1, "referencePath");
       a.p(p2, "leakingObject");
       super();
       this.gcRootType = p0;
       this.referencePath = p1;
       this.leakingObject = p2;
    }
    public static LeakTrace copy$default(LeakTrace p0,LeakTrace$GcRootType p1,List p2,LeakTraceObject p3,int p4,Object p5){
       LeakTrace gcRootType;
       LeakTrace referencePat;
       LeakTrace leakingObjec;
       if (p4 & 0x01) {
          gcRootType = p0.gcRootType;
       }
       if (p4 & 0x02) {
          referencePat = p0.referencePath;
       }
       if (p4 & 0x04) {
          leakingObjec = p0.leakingObject;
       }
       return p0.copy(gcRootType, referencePat, leakingObjec);
    }
    public final LeakTrace$GcRootType component1(){
       return this.gcRootType;
    }
    public final List component2(){
       return this.referencePath;
    }
    public final LeakTraceObject component3(){
       return this.leakingObject;
    }
    public final LeakTrace copy(LeakTrace$GcRootType p0,List p1,LeakTraceObject p2){
       a.p(p0, "gcRootType");
       a.p(p1, "referencePath");
       a.p(p2, "leakingObject");
       return new LeakTrace(p0, p1, p2);
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof LeakTrace && (a.g(this.gcRootType, p0.gcRootType) && (a.g(this.referencePath, p0.referencePath) && a.g(this.leakingObject, p0.leakingObject))))) {
          return true;
       }
       return false;
    }
    public final LeakTrace$GcRootType getGcRootType(){
       return this.gcRootType;
    }
    public final LeakTraceObject getLeakingObject(){
       return this.leakingObject;
    }
    public final List getReferencePath(){
       return this.referencePath;
    }
    public final Integer getRetainedHeapByteSize(){
       Integer obj;
       List list = t.k(this.leakingObject);
       LeakTrace treferencePa = this.referencePath;
       ArrayList uArrayList = new ArrayList(u.Y(treferencePa, 10));
       Iterator iterator = treferencePa.iterator();
       while (iterator.hasNext()) {
          uArrayList.add(iterator.next().getOriginObject());
       }
       ArrayList uArrayList1 = new ArrayList();
       Iterator iterator1 = CollectionsKt___CollectionsKt.m4(list, uArrayList).iterator();
       while (iterator1.hasNext()) {
          obj = iterator1.next();
          Object obj1 = (obj.getLeakingStatus() == LeakTraceObject$LeakingStatus.LEAKING)? 1: null;
          if (obj1) {
             uArrayList1.add(obj);
          }
       }
       ArrayList uArrayList2 = new ArrayList();
       iterator = uArrayList1.iterator();
       while (iterator.hasNext()) {
          obj = iterator.next().getRetainedHeapByteSize();
          if (obj != null) {
             uArrayList2.add(obj);
          }
       }
       return CollectionsKt___CollectionsKt.o3(uArrayList2);
    }
    public final Integer getRetainedObjectCount(){
       Integer obj;
       List list = t.k(this.leakingObject);
       LeakTrace treferencePa = this.referencePath;
       ArrayList uArrayList = new ArrayList(u.Y(treferencePa, 10));
       Iterator iterator = treferencePa.iterator();
       while (iterator.hasNext()) {
          uArrayList.add(iterator.next().getOriginObject());
       }
       ArrayList uArrayList1 = new ArrayList();
       Iterator iterator1 = CollectionsKt___CollectionsKt.m4(list, uArrayList).iterator();
       while (iterator1.hasNext()) {
          obj = iterator1.next();
          Object obj1 = (obj.getLeakingStatus() == LeakTraceObject$LeakingStatus.LEAKING)? 1: null;
          if (obj1) {
             uArrayList1.add(obj);
          }
       }
       ArrayList uArrayList2 = new ArrayList();
       iterator = uArrayList1.iterator();
       while (iterator.hasNext()) {
          obj = iterator.next().getRetainedObjectCount();
          if (obj != null) {
             uArrayList2.add(obj);
          }
       }
       return CollectionsKt___CollectionsKt.o3(uArrayList2);
    }
    public final String getSignature(){
       return o.a(SequencesKt___SequencesKt.V0(this.getSuspectReferenceSubpath(), "", null, null, 0, null, LeakTrace$signature$1.INSTANCE, 30, null));
    }
    public final m getSuspectReferenceSubpath(){
       return SequencesKt___SequencesKt.j0(CollectionsKt___CollectionsKt.l1(this.referencePath), new LeakTrace$suspectReferenceSubpath$1(this));
    }
    public int hashCode(){
       LeakTrace tgcRootType = this.gcRootType;
       int i = 0;
       int i1 = (tgcRootType != null)? tgcRootType.hashCode(): 0;
       i1 = i1 * 31;
       LeakTrace treferencePa = this.referencePath;
       int i2 = (treferencePa != null)? treferencePa.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       treferencePa = this.leakingObject;
       if (treferencePa != null) {
          i = treferencePa.hashCode();
       }
       return (i1 + i);
    }
    public final boolean referencePathElementIsSuspect(int p0){
       int i = o.a[this.referencePath.get(p0).getOriginObject().getLeakingStatus().ordinal()];
       boolean b = false;
       if (i == 1 || (i == 2 && (p0 == CollectionsKt__CollectionsKt.G(this.referencePath) || this.referencePath.get((p0 + 1)).getOriginObject().getLeakingStatus() != LeakTraceObject$LeakingStatus.NOT_LEAKING))) {
          b = true;
       }
       return b;
    }
    public String toString(){
       return "LeakTrace\(gcRootType="+this.gcRootType+", referencePath="+this.referencePath+", leakingObject="+this.leakingObject+"\)";
    }
}
