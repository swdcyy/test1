package mq1.c$a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class c$a	// class@0031e0
{
    public final int a;
    public final String b;

    public void c$a(int p0,String p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final int a(){
       return this.a;
    }
    public final String b(){
       return this.b;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof c$a && (this.a == p0.a && a.g(this.b, p0.b)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, c$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = this.a * 31;
       c$a tb = this.b;
       int i1 = (tb != null)? tb.hashCode(): 0;
       return (i + i1);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, c$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "[chatMode:"+this.a+", chatModeId:"+this.b+']';
    }
}
