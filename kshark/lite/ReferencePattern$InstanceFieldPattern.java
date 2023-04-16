package kshark.lite.ReferencePattern$InstanceFieldPattern;
import kshark.lite.ReferencePattern;
import kshark.lite.ReferencePattern$InstanceFieldPattern$a;
import nsd.u;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;

public final class ReferencePattern$InstanceFieldPattern extends ReferencePattern	// class@001bb9
{
    public final String className;
    public final String fieldName;
    public static final ReferencePattern$InstanceFieldPattern$a Companion;
    public static final long serialVersionUID;

    static {
       ReferencePattern$InstanceFieldPattern.Companion = new ReferencePattern$InstanceFieldPattern$a(null);
    }
    public void ReferencePattern$InstanceFieldPattern(String p0,String p1){
       a.p(p0, "className");
       a.p(p1, "fieldName");
       super(null);
       this.className = p0;
       this.fieldName = p1;
    }
    public static ReferencePattern$InstanceFieldPattern copy$default(ReferencePattern$InstanceFieldPattern p0,String p1,String p2,int p3,Object p4){
       ReferencePattern$InstanceFieldPattern className;
       ReferencePattern$InstanceFieldPattern fieldName;
       if (p3 & 0x01) {
          className = p0.className;
       }
       if (p3 & 0x02) {
          fieldName = p0.fieldName;
       }
       return p0.copy(className, fieldName);
    }
    public final String component1(){
       return this.className;
    }
    public final String component2(){
       return this.fieldName;
    }
    public final ReferencePattern$InstanceFieldPattern copy(String p0,String p1){
       a.p(p0, "className");
       a.p(p1, "fieldName");
       return new ReferencePattern$InstanceFieldPattern(p0, p1);
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof ReferencePattern$InstanceFieldPattern && (a.g(this.className, p0.className) && a.g(this.fieldName, p0.fieldName)))) {
          return true;
       }
       return false;
    }
    public final String getClassName(){
       return this.className;
    }
    public final String getFieldName(){
       return this.fieldName;
    }
    public int hashCode(){
       ReferencePattern$InstanceFieldPattern tclassName = this.className;
       int i = 0;
       int i1 = (tclassName != null)? tclassName.hashCode(): 0;
       i1 = i1 * 31;
       ReferencePattern$InstanceFieldPattern tfieldName = this.fieldName;
       if (tfieldName != null) {
          i = tfieldName.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       return "instance field "+this.className+'#'+this.fieldName;
    }
}
