package kotlin.SynchronizedLazyImpl;
import qrd.p;
import java.io.Serializable;
import msd.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import qrd.f1;
import nsd.u;
import kotlin.InitializedLazyImpl;

public final class SynchronizedLazyImpl implements p, Serializable	// class@001c3e
{
    public Object _value;
    public a initializer;
    public final Object lock;

    public void SynchronizedLazyImpl(a p0,Object p1){
       a.p(p0, "initializer");
       super();
       this.initializer = p0;
       this._value = f1.a;
       if (p1 != null) {
       }else {
          p1 = this;
       }
       this.lock = p1;
       return;
    }
    public void SynchronizedLazyImpl(a p0,Object p1,int p2,u p3){
       if (p2 & 0x02) {
          p1 = null;
       }
       super(p0, p1);
       return;
    }
    public Object getValue(){
       SynchronizedLazyImpl t_value = this._value;
       f1 a = f1.a;
       if (t_value != a) {
          return t_value;
       }
       t_value = this.lock;
       _monitor_enter(t_value);
       SynchronizedLazyImpl t_value1 = this._value;
       if (t_value1 == a) {
          SynchronizedLazyImpl tinitializer = this.initializer;
          a.m(tinitializer);
          t_value1 = tinitializer.invoke();
          this._value = t_value1;
          this.initializer = null;
       }
       _monitor_exit(t_value);
       return t_value1;
    }
    public boolean isInitialized(){
       boolean b = (this._value != f1.a)? true: false;
       return b;
    }
    public String toString(){
       String str = (this.isInitialized())? String.valueOf(this.getValue()): "Lazy value not initialized yet.";
       return str;
    }
    public final Object writeReplace(){
       return new InitializedLazyImpl(this.getValue());
    }
}
