package kshark.lite.LeakTraceReference;
import java.io.Serializable;
import kshark.lite.LeakTraceReference$a;
import nsd.u;
import kshark.lite.LeakTraceObject;
import kshark.lite.LeakTraceReference$ReferenceType;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import std.o;
import rtd.p;
import java.lang.Enum;
import kotlin.NoWhenBranchMatchedException;
import java.lang.StringBuilder;

public final class LeakTraceReference implements Serializable	// class@001baf
{
    public final LeakTraceObject originObject;
    public final String owningClassName;
    public final String referenceName;
    public final LeakTraceReference$ReferenceType referenceType;
    public static final LeakTraceReference$a Companion;
    public static final long serialVersionUID;

    static {
       LeakTraceReference.Companion = new LeakTraceReference$a(null);
    }
    public void LeakTraceReference(LeakTraceObject p0,LeakTraceReference$ReferenceType p1,String p2,String p3){
       a.p(p0, "originObject");
       a.p(p1, "referenceType");
       a.p(p2, "owningClassName");
       a.p(p3, "referenceName");
       super();
       this.originObject = p0;
       this.referenceType = p1;
       this.owningClassName = p2;
       this.referenceName = p3;
    }
    public static LeakTraceReference copy$default(LeakTraceReference p0,LeakTraceObject p1,LeakTraceReference$ReferenceType p2,String p3,String p4,int p5,Object p6){
       LeakTraceReference originObject;
       LeakTraceReference referenceTyp;
       LeakTraceReference owningClassN;
       LeakTraceReference referenceNam;
       if (p5 & 0x01) {
          originObject = p0.originObject;
       }
       if (p5 & 0x02) {
          referenceTyp = p0.referenceType;
       }
       if (p5 & 0x04) {
          owningClassN = p0.owningClassName;
       }
       if (p5 & 0x08) {
          referenceNam = p0.referenceName;
       }
       return p0.copy(originObject, referenceTyp, owningClassN, referenceNam);
    }
    public final LeakTraceObject component1(){
       return this.originObject;
    }
    public final LeakTraceReference$ReferenceType component2(){
       return this.referenceType;
    }
    public final String component3(){
       return this.owningClassName;
    }
    public final String component4(){
       return this.referenceName;
    }
    public final LeakTraceReference copy(LeakTraceObject p0,LeakTraceReference$ReferenceType p1,String p2,String p3){
       a.p(p0, "originObject");
       a.p(p1, "referenceType");
       a.p(p2, "owningClassName");
       a.p(p3, "referenceName");
       return new LeakTraceReference(p0, p1, p2, p3);
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof LeakTraceReference && (a.g(this.originObject, p0.originObject) && (a.g(this.referenceType, p0.referenceType) && (a.g(this.owningClassName, p0.owningClassName) && a.g(this.referenceName, p0.referenceName)))))) {
          return true;
       }
       return false;
    }
    public final LeakTraceObject getOriginObject(){
       return this.originObject;
    }
    public final String getOwningClassName(){
       return this.owningClassName;
    }
    public final String getOwningClassSimpleName(){
       return o.b(this.owningClassName, '.');
    }
    public final String getReferenceDisplayName(){
       String str;
       int i = p.a[this.referenceType.ordinal()];
       if (i != 1) {
          if (i != 2 && i != 3) {
             if (i == 4) {
                str = "<Java Local>";
             }else {
                throw new NoWhenBranchMatchedException();
             }
          }else {
             str = this.referenceName;
          }
       }else {
          str = '['+this.referenceName+']';
       }
       return str;
    }
    public final String getReferenceGenericName(){
       String str;
       int i = p.b[this.referenceType.ordinal()];
       if (i != 1) {
          if (i != 2 && i != 3) {
             if (i == 4) {
                str = "<Java Local>";
             }else {
                throw new NoWhenBranchMatchedException();
             }
          }else {
             str = this.referenceName;
          }
       }else {
          str = "[x]";
       }
       return str;
    }
    public final String getReferenceName(){
       return this.referenceName;
    }
    public final LeakTraceReference$ReferenceType getReferenceType(){
       return this.referenceType;
    }
    public int hashCode(){
       LeakTraceReference toriginObjec = this.originObject;
       int i = 0;
       int i1 = (toriginObjec != null)? toriginObjec.hashCode(): 0;
       i1 = i1 * 31;
       LeakTraceReference treferenceTy = this.referenceType;
       int i2 = (treferenceTy != null)? treferenceTy.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       treferenceTy = this.owningClassName;
       i2 = (treferenceTy != null)? treferenceTy.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       treferenceTy = this.referenceName;
       if (treferenceTy != null) {
          i = treferenceTy.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       return "LeakTraceReference\(originObject="+this.originObject+", referenceType="+this.referenceType+", owningClassName="+this.owningClassName+", referenceName="+this.referenceName+"\)";
    }
}
