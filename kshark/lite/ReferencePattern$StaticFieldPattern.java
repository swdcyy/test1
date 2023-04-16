package kshark.lite.ReferencePattern$StaticFieldPattern;
import kshark.lite.ReferencePattern;
import kshark.lite.ReferencePattern$StaticFieldPattern$a;
import nsd.u;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;

public final class ReferencePattern$StaticFieldPattern extends ReferencePattern	// class@001bbf
{
    public final String className;
    public final String fieldName;
    public static final ReferencePattern$StaticFieldPattern$a Companion;
    public static final long serialVersionUID;

    static {
       ReferencePattern$StaticFieldPattern.Companion = new ReferencePattern$StaticFieldPattern$a(null);
    }
    public void ReferencePattern$StaticFieldPattern(String p0,String p1){
       a.p(p0, "className");
       a.p(p1, "fieldName");
       super(null);
       this.className = p0;
       this.fieldName = p1;
    }
    public static ReferencePattern$StaticFieldPattern copy$default(ReferencePattern$StaticFieldPattern p0,String p1,String p2,int p3,Object p4){
       ReferencePattern$StaticFieldPattern className;
       ReferencePattern$StaticFieldPattern fieldName;
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
    public final ReferencePattern$StaticFieldPattern copy(String p0,String p1){
       a.p(p0, "className");
       a.p(p1, "fieldName");
       return new ReferencePattern$StaticFieldPattern(p0, p1);
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof ReferencePattern$StaticFieldPattern && (a.g(this.className, p0.className) && a.g(this.fieldName, p0.fieldName)))) {
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
       ReferencePattern$StaticFieldPattern tclassName = this.className;
       int i = 0;
       int i1 = (tclassName != null)? tclassName.hashCode(): 0;
       i1 = i1 * 31;
       ReferencePattern$StaticFieldPattern tfieldName = this.fieldName;
       if (tfieldName != null) {
          i = tfieldName.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       return "static field "+this.className+'#'+this.fieldName;
    }
}
