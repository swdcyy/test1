package ltd.k0;
import kotlin.coroutines.CoroutineContext$b;
import java.lang.ThreadLocal;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.String;
import java.lang.StringBuilder;

public final class k0 implements CoroutineContext$b	// class@001ccf
{
    public final ThreadLocal a;

    public void k0(ThreadLocal p0){
       super();
       this.a = p0;
    }
    public static k0 c(k0 p0,ThreadLocal p1,int p2,Object p3){
       k0 a;
       if (p2 & 0x01) {
          a = p0.a;
       }
       return p0.b(a);
    }
    public final ThreadLocal a(){
       return this.a;
    }
    public final k0 b(ThreadLocal p0){
       return new k0(p0);
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof k0 && a.g(this.a, p0.a))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       k0 ta = this.a;
       int i = (ta != null)? ta.hashCode(): 0;
       return i;
    }
    public String toString(){
       return "ThreadLocalKey\(threadLocal="+this.a+"\)";
    }
}
