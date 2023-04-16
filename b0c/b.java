package b0c.b;
import erd.g;
import com.tkruntime.v8.JsValueRef;
import java.lang.Object;
import java.lang.Throwable;
import com.tkruntime.v8.V8Function;
import java.lang.Boolean;
import com.tkruntime.v8.V8Object;

public final class b implements g	// class@00037f
{
    public final JsValueRef b;

    public void b(JsValueRef p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       b tb = this.b;
       if (tb != null && tb.get() != null) {
          Object[] objArray = new Object[]{Boolean.FALSE};
          tb.get().call(null, objArray);
       }
       return;
    }
}
