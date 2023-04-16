package k71.c$b;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class c$b	// class@002ca5
{
    public final String fileName;
    public final String key;
    public final String subPath;
    public int type;

    public void c$b(){
       a.p("", "key");
       a.p("", "subPath");
       a.p("", "fileName");
       super();
       this.type = 1;
       this.key = "";
       this.subPath = "";
       this.fileName = "";
    }
    public final String a(){
       return this.fileName;
    }
    public final String b(){
       return this.key;
    }
    public final String c(){
       return this.subPath;
    }
    public final int d(){
       return this.type;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c$b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof c$b && (this.type == p0.type && (a.g(this.key, p0.key) && (a.g(this.subPath, p0.subPath) && a.g(this.fileName, p0.fileName)))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, c$b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = this.type * 31;
       c$b tkey = this.key;
       int i1 = 0;
       int i2 = (tkey != null)? tkey.hashCode(): 0;
       i = (i + i2) * 31;
       tkey = this.subPath;
       i2 = (tkey != null)? tkey.hashCode(): 0;
       i = (i + i2) * 31;
       tkey = this.fileName;
       if (tkey != null) {
          i1 = tkey.hashCode();
       }
       return (i + i1);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, c$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Parameter\(type="+this.type+", key="+this.key+", subPath="+this.subPath+", fileName="+this.fileName+"\)";
    }
}
