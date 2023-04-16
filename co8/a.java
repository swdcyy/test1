package co8.a;
import oo8.o;
import com.tachikoma.component.network.TKNetwork;
import com.tkruntime.v8.JsValueRef;
import java.lang.Object;
import com.tachikoma.core.component.network.TKNetResponse;
import com.tachikoma.core.component.network.TKNetErrorInfo;
import java.lang.String;

public final class a implements o	// class@000536
{
    public final TKNetwork a;
    public final JsValueRef b;

    public void a(TKNetwork p0,JsValueRef p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void a(TKNetResponse p0,TKNetErrorInfo p1){
       a ta = this.a;
       ta.g(ta.i, "request", this.b, p0, p1);
    }
}
