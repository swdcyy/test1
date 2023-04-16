package ni1.c;
import lj1.c;
import ul1.a;
import ul1.d;
import java.util.Map;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class c	// class@003328
{
    public final c a;
    public final int b;
    public final a c;
    public final d d;
    public final int e;
    public final Map f;

    public void c(c p0,int p1,a p2,d p3,int p4,Map p5){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
    }
    public final c a(){
       return this.a;
    }
    public final int b(){
       return this.e;
    }
    public final a c(){
       return this.c;
    }
    public final d d(){
       return this.d;
    }
    public final int e(){
       return this.b;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof c && (a.g(this.a, p0.a) && (this.b == p0.b && (a.g(this.c, p0.c) && (a.g(this.d, p0.d) && (this.e == p0.e && a.g(this.f, p0.f)))))))) {
          return true;
       }
       return false;
    }
    public final Map f(){
       return this.f;
    }
    public int hashCode(){
       c obj = PatchProxy.apply(null, this, c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = ((i1 * 31) + this.b) * 31;
       c tc = this.c;
       int i2 = (tc != null)? tc.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tc = this.d;
       i2 = (tc != null)? tc.hashCode(): 0;
       i1 = (((i1 + i2) * 31) + this.e) * 31;
       tc = this.f;
       if (tc != null) {
          i = tc.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "GiftBoxState\(receiver="+this.a+", sourceType="+this.b+", selectGift="+this.c+", selectTab="+this.d+", selectBatchCount="+this.e+", tabSortTypes="+this.f+"\)";
    }
}
