package k71.c$c;
import java.util.ArrayList;
import java.util.List;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class c$c	// class@002ca6
{
    public final List resInfoList;

    public void c$c(){
       super(new ArrayList());
    }
    public void c$c(List p0){
       a.p(p0, "resInfoList");
       super();
       this.resInfoList = p0;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c$c.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof c$c && a.g(this.resInfoList, p0.resInfoList))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       c$c obj = PatchProxy.apply(null, this, c$c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.resInfoList;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, c$c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Request\(resInfoList="+this.resInfoList+"\)";
    }
}
