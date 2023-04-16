package ee7.g;
import ee7.b;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicBoolean;
import ee7.d;
import ee7.e;
import java.lang.Class;
import java.lang.Enum;
import com.kwai.page.component.state.StateException;
import java.lang.String;
import java.lang.StringBuilder;

public abstract class g implements b	// class@0022b9
{
    public final AtomicBoolean a;

    public void g(){
       super();
       this.a = new AtomicBoolean(false);
    }
    public final void a(d p0,e[] p1){
       int i = 0;
       object oobject = 1;
       int i1 = (p0.a == this)? 1: 0;
       if (!i1) {
          d f = p0.f;
          if (f != null && f.length > 0) {
             int len = f.length;
             int i2 = 0;
             while (true) {
                if (i2 < len) {
                   if (this.getClass() == f[i2]) {
                   label_0023 :
                      if (oobject) {
                         i1 = p1.length;
                         while (true) {
                            if (i >= i1) {
                               return;
                            }
                            oobject = p1[i];
                            if (oobject instanceof Enum) {
                               p0.t(oobject);
                               i = i + 1;
                            }else {
                               break ;
                            }
                         }
                         throw new StateException("action 需要为枚举类");
                      }else {
                         throw new StateException(this.getClass().getName()+": State 只能在创建State的StateProvider里或声明的ActionStore中注册action");
                      }
                   }else {
                      i2 = i2 + 1;
                   }
                }
             }
          }
       }
       oobject = i1;
       goto label_0023 ;
    }
    public abstract void b();
    public final void e(){
       if (!this.a.getAndSet(true)) {
          this.b();
       }
       return;
    }
}
