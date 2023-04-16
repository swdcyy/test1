package by4.c;
import erd.g;
import x06.a;
import java.lang.Object;
import java.lang.Throwable;
import e4a.a;
import java.lang.StringBuilder;
import java.lang.String;
import com.yxcorp.gifshow.detail.plc.error.exception.BasePlcException;
import com.yxcorp.gifshow.detail.plc.error.exception.PlcExceptionHandler;

public final class c implements g	// class@0003ec
{
    public final a b;

    public void c(a p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       a uoa = new a();
       uoa.b(3);
       p0 = uoa.d(p0);
       PlcExceptionHandler.a(p0.c("plc global event error, when ["+this.b.b()+"] business listen").a(), "PlcCorePluginImpl");
    }
}
