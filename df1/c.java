package df1.c;
import ef1.c;
import java.lang.Comparable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ef1.b;
import java.lang.Number;
import qk.h;
import ef1.d;
import java.lang.Integer;
import com.google.common.base.Optional;
import v91.n;
import com.kuaishou.live.basic.model.LiveMessageFrequencyConfig$FrequencyConfig;
import df1.b;
import ok.h;
import java.lang.Long;
import df1.a;

public abstract class c implements c, Comparable	// class@001f8b
{
    public d b;

    public void c(){
       super();
    }
    public String a(){
       Object obj = PatchProxy.apply(null, this, c.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.h();
    }
    public int b(){
       return b.b(this);
    }
    public abstract boolean c();
    public int compareTo(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "7");
       int i = (obj != PatchProxyResult.class)? obj.intValue(): h.j().c(this.getPriority(), p0.getPriority()).i();
       return i;
    }
    public String d(){
       return b.d(this);
    }
    public String e(){
       return b.a(this);
    }
    public int f(){
       return b.c(this);
    }
    public String g(){
       Object obj = PatchProxy.apply(null, this, c.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.h();
    }
    public int getPriority(){
       int i1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       String obj = PatchProxy.apply(objArray, this, c.class, "3");
       if (obj != patchProxyRe) {
          return obj.intValue();
       }
       obj = this.h();
       int i = 0;
       if (PatchProxy.isSupport(d.class)) {
          Object obj1 = PatchProxy.applyTwoRefs(obj, Integer.valueOf(i), objArray, d.class, "5");
          if (obj1 != patchProxyRe) {
             i1 = obj1.intValue();
          label_0044 :
             return i1;
          }
       }
       LiveMessageFrequencyConfig$FrequencyConfig uFrequencyCo = n.d(obj).orNull();
       if (uFrequencyCo != null) {
          i = uFrequencyCo.mPriority;
       }
       i1 = i;
       goto label_0044 ;
    }
    public abstract String h();
    public long i(){
       Object obj = PatchProxy.apply(null, this, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return n.d(this.h()).transform(b.b).or(Long.valueOf(0x2710)).longValue();
    }
    public boolean isValid(){
       return true;
    }
    public boolean j(){
       return (this instanceof a ^ 0x01);
    }
    public abstract boolean k();
    public String toString(){
       return "HighFluencyMessage{}";
    }
}
