package iy1.l$d;
import iy1.l;
import java.lang.String;
import java.lang.Object;
import jy1.b;
import iy1.k;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public class l$d implements l	// class@0029cc
{
    public final String k;

    public void l$d(String p0){
       super();
       this.k = p0;
    }
    public b a(){
       return k.a(this);
    }
    public String b(){
       return this.k;
    }
    public boolean equals(Object p0){
       l$d uod = l$d.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, uod, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (p0 == null || uod != p0.getClass()) {
          return false;
       }
       uod = this.k;
       p0 = p0.k;
       if (uod != null) {
          b = uod.equals(p0);
       }else if(p0 == null){
          b = false;
       }
       return b;
    }
    public int getPriority(){
       return k.b(this);
    }
    public int hashCode(){
       l$d obj = PatchProxy.apply(null, this, l$d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.k;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, l$d.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "StaticConfigIdMessageType{mConfigId=\'"+this.k+'''+'}';
    }
}
