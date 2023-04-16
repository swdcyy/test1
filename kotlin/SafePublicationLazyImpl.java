package kotlin.SafePublicationLazyImpl;
import qrd.p;
import java.io.Serializable;
import kotlin.SafePublicationLazyImpl$a;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import msd.a;
import kotlin.jvm.internal.a;
import qrd.f1;
import kotlin.InitializedLazyImpl;

public final class SafePublicationLazyImpl implements p, Serializable	// class@00181a
{
    public Object _value;
    public final Object final;
    public a initializer;
    public static final SafePublicationLazyImpl$a Companion;
    public static final AtomicReferenceFieldUpdater b;

    static {
       SafePublicationLazyImpl.Companion = new SafePublicationLazyImpl$a(null);
       SafePublicationLazyImpl.b = AtomicReferenceFieldUpdater.newUpdater(SafePublicationLazyImpl.class, Object.class, "_value");
    }
    public void SafePublicationLazyImpl(a p0){
       f1 a;
       a.p(p0, "initializer");
       super();
       this.initializer = p0;
       a = f1.a;
       this._value = a;
       this.final = a;
    }
    public Object getValue(){
       SafePublicationLazyImpl t_value = this._value;
       f1 a = f1.a;
       if (t_value != a) {
          return t_value;
       }
       t_value = this.initializer;
       if (t_value != null) {
          Object obj = t_value.invoke();
          if (SafePublicationLazyImpl.b.compareAndSet(this, a, obj)) {
             this.initializer = null;
             return obj;
          }
       }
       return this._value;
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
