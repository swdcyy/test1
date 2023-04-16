package cn7.d;
import cn7.c;
import java.util.concurrent.Callable;
import cn7.h;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import cn7.i;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import com.kuaishou.eve.packageinfo.model.ResourceType;
import java.lang.Number;
import java.lang.StringBuilder;

public final class d extends h implements c, Callable	// class@000578
{
    public final String c;
    public final ResourceType d;
    public final Callable e;
    public final String f;

    public Object call(){
       Iterator obj = PatchProxy.apply(null, this, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.a()) {
          obj = this.H().iterator();
          while (obj.hasNext()) {
             obj.next().b(this);
          }
       }
       Object obj1 = this.e.call();
       if (this.a()) {
          Iterator iterator = this.H().iterator();
          while (iterator.hasNext()) {
             iterator.next().a(this);
          }
       }
       return obj1;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof d && (a.g(this.m(), p0.m()) && (a.g(this.getResource(), p0.getResource()) && (a.g(this.e, p0.e) && a.g(this.q(), p0.q())))))) {
          return true;
       }
       return false;
    }
    public ResourceType getResource(){
       return this.d;
    }
    public int hashCode(){
       String obj = PatchProxy.apply(null, this, d.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.m();
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       ResourceType resource = this.getResource();
       int i2 = (resource != null)? resource.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       d te = this.e;
       i2 = (te != null)? te.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       String str = this.q();
       if (str != null) {
          i = str.hashCode();
       }
       return (i1 + i);
    }
    public String m(){
       return this.c;
    }
    public String q(){
       return this.f;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, d.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LabeledCallable\(label="+this.m()+", resource="+this.getResource()+", callable="+this.e+", seqId="+this.q()+"\)";
    }
}
