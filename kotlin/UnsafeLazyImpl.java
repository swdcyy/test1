package kotlin.UnsafeLazyImpl;
import qrd.p;
import java.io.Serializable;
import msd.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import qrd.f1;
import kotlin.InitializedLazyImpl;

public final class UnsafeLazyImpl implements p, Serializable	// class@00181e
{
    public Object _value;
    public a initializer;

    public void UnsafeLazyImpl(a p0){
       a.p(p0, "initializer");
       super();
       this.initializer = p0;
       this._value = f1.a;
    }
    public Object getValue(){
       if (this._value == f1.a) {
          UnsafeLazyImpl tinitializer = this.initializer;
          a.m(tinitializer);
          this._value = tinitializer.invoke();
          this.initializer = null;
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
