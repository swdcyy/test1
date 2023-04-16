package cq1.d$a;
import android.view.View;
import cq1.b;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class d$a	// class@001e34
{
    public final View a;
    public final int b;
    public final b c;

    public void d$a(View p0,int p1,b p2){
       a.p(p0, "view");
       a.p(p2, "snapshot");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final int a(){
       return this.b;
    }
    public final b b(){
       return this.c;
    }
    public final View c(){
       return this.a;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof d$a && (a.g(this.a, p0.a) && (this.b == p0.b && a.g(this.c, p0.c))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       d$a obj = PatchProxy.apply(null, this, d$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = ((i1 * 31) + this.b) * 31;
       d$a tc = this.c;
       if (tc != null) {
          i = tc.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, d$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ItemSnapshot\(view="+this.a+", hierarchy="+this.b+", snapshot="+this.c+"\)";
    }
}
