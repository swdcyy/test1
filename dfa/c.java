package dfa.c;
import dfa.b;
import java.util.List;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.io.Serializable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Iterator;
import java.lang.Iterable;
import java.lang.StringBuilder;
import java.util.Collection;
import java.lang.CharSequence;
import dfa.b$a;

public final class c implements b	// class@00249e
{
    public final List a;

    public void c(List p0){
       a.p(p0, "filterList");
       super();
       this.a = p0;
    }
    public Serializable a(Serializable p0){
       Iterator obj = PatchProxy.applyOneRefs(p0, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a.iterator();
       Serializable serializable = p0;
       while (obj.hasNext()) {
          serializable = obj.next().a(p0);
       }
       return serializable;
    }
    public String getName(){
       Object[] objArray = null;
       String obj = PatchProxy.apply(objArray, this, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "";
       c ta = this.a;
       int i = 1;
       if (ta.isEmpty() ^ i) {
          objArray = ta;
       }
       if (objArray != null) {
          Iterator iterator = objArray.iterator();
          while (iterator.hasNext()) {
             obj = obj+iterator.next().getName()+"-";
          }
       }
       obj = obj;
       a.o(obj, "stringBuilder.toString\(\)");
       if (obj.length()) {
          i = 0;
       }
       if (i) {
          obj = b$a.a(this);
       }
       return obj;
    }
}
