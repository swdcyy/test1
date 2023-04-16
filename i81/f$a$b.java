package i81.f$a$b;
import i81.f$a;
import android.view.View;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import nsd.u;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class f$a$b extends f$a	// class@002851
{
    public final View a;

    public void f$a$b(View p0){
       a.p(p0, "view");
       super(null);
       this.a = p0;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f$a$b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof f$a$b && a.g(this.a, p0.a))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       f$a$b obj = PatchProxy.apply(null, this, f$a$b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, f$a$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "HalfScreen\(view="+this.a+"\)";
    }
}
