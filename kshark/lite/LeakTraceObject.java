package kshark.lite.LeakTraceObject;
import java.io.Serializable;
import kshark.lite.LeakTraceObject$ObjectType;
import java.lang.String;
import java.util.Set;
import kshark.lite.LeakTraceObject$LeakingStatus;
import java.lang.Integer;
import java.lang.Object;
import kotlin.jvm.internal.a;
import std.o;
import java.lang.Enum;
import java.util.Locale;
import java.util.Objects;
import java.lang.StringBuilder;

public final class LeakTraceObject implements Serializable	// class@001bac
{
    public final String className;
    public final Set labels;
    public final LeakTraceObject$LeakingStatus leakingStatus;
    public String leakingStatusReason;
    public final long objectId;
    public final Integer retainedHeapByteSize;
    public final Integer retainedObjectCount;
    public final LeakTraceObject$ObjectType type;

    public void LeakTraceObject(long p0,LeakTraceObject$ObjectType p1,String p2,Set p3,LeakTraceObject$LeakingStatus p4,String p5,Integer p6,Integer p7){
       a.p(p1, "type");
       a.p(p2, "className");
       a.p(p3, "labels");
       a.p(p4, "leakingStatus");
       a.p(p5, "leakingStatusReason");
       super();
       this.objectId = p0;
       this.type = p1;
       this.className = p2;
       this.labels = p3;
       this.leakingStatus = p4;
       this.leakingStatusReason = p5;
       this.retainedHeapByteSize = p6;
       this.retainedObjectCount = p7;
    }
    public static LeakTraceObject copy$default(LeakTraceObject p0,long p1,LeakTraceObject$ObjectType p2,String p3,Set p4,LeakTraceObject$LeakingStatus p5,String p6,Integer p7,Integer p8,int p9,Object p10){
       LeakTraceObject leakTraceObj = p0;
       int i = p9;
       LeakTraceObject objectId = (i & 0x01)? leakTraceObj.objectId: p1;
       LeakTraceObject type = (i & 0x02)? leakTraceObj.type: p2;
       LeakTraceObject className = (i & 0x04)? leakTraceObj.className: p3;
       LeakTraceObject labels = (i & 0x08)? leakTraceObj.labels: p4;
       LeakTraceObject leakingStatu = (i & 0x10)? leakTraceObj.leakingStatus: p5;
       LeakTraceObject leakingStatu1 = (i & 0x20)? leakTraceObj.leakingStatusReason: p6;
       LeakTraceObject retainedHeap = (i & 0x40)? leakTraceObj.retainedHeapByteSize: p7;
       LeakTraceObject retainedObje = (i & 0x0080)? leakTraceObj.retainedObjectCount: p8;
       return p0.copy(objectId, type, className, labels, leakingStatu, leakingStatu1, retainedHeap, retainedObje);
    }
    public final long component1(){
       return this.objectId;
    }
    public final LeakTraceObject$ObjectType component2(){
       return this.type;
    }
    public final String component3(){
       return this.className;
    }
    public final Set component4(){
       return this.labels;
    }
    public final LeakTraceObject$LeakingStatus component5(){
       return this.leakingStatus;
    }
    public final String component6(){
       return this.leakingStatusReason;
    }
    public final Integer component7(){
       return this.retainedHeapByteSize;
    }
    public final Integer component8(){
       return this.retainedObjectCount;
    }
    public final LeakTraceObject copy(long p0,LeakTraceObject$ObjectType p1,String p2,Set p3,LeakTraceObject$LeakingStatus p4,String p5,Integer p6,Integer p7){
       a.p(p1, "type");
       a.p(p2, "className");
       Object obj = p3;
       a.p(obj, "labels");
       Object obj1 = p4;
       a.p(obj1, "leakingStatus");
       Object obj2 = p5;
       a.p(obj2, "leakingStatusReason");
       LeakTraceObject leakTraceObj = new LeakTraceObject(p0, p1, p2, obj, obj1, obj2, p6, p7);
       return v0;
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof LeakTraceObject && (!this.objectId - p0.objectId && (a.g(this.type, p0.type) && (a.g(this.className, p0.className) && (a.g(this.labels, p0.labels) && (a.g(this.leakingStatus, p0.leakingStatus) && (a.g(this.leakingStatusReason, p0.leakingStatusReason) && (a.g(this.retainedHeapByteSize, p0.retainedHeapByteSize) && a.g(this.retainedObjectCount, p0.retainedObjectCount)))))))))) {
          return true;
       }
       return false;
    }
    public final String getClassName(){
       return this.className;
    }
    public final String getClassSimpleName(){
       return o.b(this.className, '.');
    }
    public final Set getLabels(){
       return this.labels;
    }
    public final LeakTraceObject$LeakingStatus getLeakingStatus(){
       return this.leakingStatus;
    }
    public final String getLeakingStatusReason(){
       return this.leakingStatusReason;
    }
    public final long getObjectId(){
       return this.objectId;
    }
    public final Integer getRetainedHeapByteSize(){
       return this.retainedHeapByteSize;
    }
    public final Integer getRetainedObjectCount(){
       return this.retainedObjectCount;
    }
    public final LeakTraceObject$ObjectType getType(){
       return this.type;
    }
    public final String getTypeName(){
       String str = this.type.name();
       Locale uS = Locale.US;
       a.o(uS, "Locale.US");
       Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
       str = str.toLowerCase(uS);
       a.o(str, "\(this as java.lang.String\).toLowerCase\(locale\)");
       return str;
    }
    public int hashCode(){
       LeakTraceObject tobjectId = this.objectId;
       int i = (int)(tobjectId ^ (tobjectId >> 32)) * 31;
       tobjectId = this.type;
       int i1 = 0;
       int i2 = (tobjectId != null)? tobjectId.hashCode(): 0;
       i = (i + i2) * 31;
       tobjectId = this.className;
       i2 = (tobjectId != null)? tobjectId.hashCode(): 0;
       i = (i + i2) * 31;
       tobjectId = this.labels;
       i2 = (tobjectId != null)? tobjectId.hashCode(): 0;
       i = (i + i2) * 31;
       tobjectId = this.leakingStatus;
       i2 = (tobjectId != null)? tobjectId.hashCode(): 0;
       i = (i + i2) * 31;
       tobjectId = this.leakingStatusReason;
       i2 = (tobjectId != null)? tobjectId.hashCode(): 0;
       i = (i + i2) * 31;
       tobjectId = this.retainedHeapByteSize;
       i2 = (tobjectId != null)? tobjectId.hashCode(): 0;
       i = (i + i2) * 31;
       tobjectId = this.retainedObjectCount;
       if (tobjectId != null) {
          i1 = tobjectId.hashCode();
       }
       return (i + i1);
    }
    public final void setLeakingStatusReason(String p0){
       a.p(p0, "<set-?>");
       this.leakingStatusReason = p0;
    }
    public String toString(){
       return "LeakTraceObject\(objectId="+this.objectId+", type="+this.type+", className="+this.className+", labels="+this.labels+", leakingStatus="+this.leakingStatus+", leakingStatusReason="+this.leakingStatusReason+", retainedHeapByteSize="+this.retainedHeapByteSize+", retainedObjectCount="+this.retainedObjectCount+"\)";
    }
}
