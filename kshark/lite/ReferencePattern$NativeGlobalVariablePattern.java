package kshark.lite.ReferencePattern$NativeGlobalVariablePattern;
import kshark.lite.ReferencePattern;
import kshark.lite.ReferencePattern$NativeGlobalVariablePattern$a;
import nsd.u;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;

public final class ReferencePattern$NativeGlobalVariablePattern extends ReferencePattern	// class@001bbd
{
    public final String className;
    public static final ReferencePattern$NativeGlobalVariablePattern$a Companion;
    public static final long serialVersionUID;

    static {
       ReferencePattern$NativeGlobalVariablePattern.Companion = new ReferencePattern$NativeGlobalVariablePattern$a(null);
    }
    public void ReferencePattern$NativeGlobalVariablePattern(String p0){
       a.p(p0, "className");
       super(null);
       this.className = p0;
    }
    public static ReferencePattern$NativeGlobalVariablePattern copy$default(ReferencePattern$NativeGlobalVariablePattern p0,String p1,int p2,Object p3){
       ReferencePattern$NativeGlobalVariablePattern className;
       if (p2 & 0x01) {
          className = p0.className;
       }
       return p0.copy(className);
    }
    public final String component1(){
       return this.className;
    }
    public final ReferencePattern$NativeGlobalVariablePattern copy(String p0){
       a.p(p0, "className");
       return new ReferencePattern$NativeGlobalVariablePattern(p0);
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof ReferencePattern$NativeGlobalVariablePattern && a.g(this.className, p0.className))) {
          return true;
       }
       return false;
    }
    public final String getClassName(){
       return this.className;
    }
    public int hashCode(){
       ReferencePattern$NativeGlobalVariablePattern tclassName = this.className;
       int i = (tclassName != null)? tclassName.hashCode(): 0;
       return i;
    }
    public String toString(){
       return "native global variable referencing "+this.className;
    }
}
