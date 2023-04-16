package androidx.core.util.Pools$SimplePool;
import z1.f;
import java.lang.Object;
import java.lang.IllegalArgumentException;
import java.lang.String;
import java.lang.IllegalStateException;

public class Pools$SimplePool implements f	// class@000234
{
    public final Object[] a;
    public int b;

    public void Pools$SimplePool(int p0){
       super();
       if (p0 <= 0) {
          throw new IllegalArgumentException("The max pool size must be > 0");
       }
       Object[] objArray = new Object[p0];
       this.a = objArray;
       return;
    }
    public boolean a(Object p0){
       if (this.b(p0)) {
          throw new IllegalStateException("Already in the pool!");
       }
       Pools$SimplePool tb = this.b;
       Pools$SimplePool ta = this.a;
       if (tb >= ta.length) {
          return false;
       }
       ta[tb] = p0;
       this.b = tb + 1;
       return 1;
    }
    public final boolean b(Object p0){
       int i = 0;
       while (true) {
          if (i >= this.b) {
             return false;
          }
          if (this.a[i] == p0) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return true;
    }
    public Object q(){
       Pools$SimplePool tb = this.b;
       if (tb <= null) {
          return null;
       }
       int i = tb - 1;
       Pools$SimplePool ta = this.a;
       object oobject = ta[i];
       ta[i] = null;
       this.b = tb - 1;
       return oobject;
    }
}
