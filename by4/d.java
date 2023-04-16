package by4.d;
import erd.g;
import crd.a;
import java.lang.Object;
import java.lang.Throwable;
import e4a.a;
import java.lang.String;
import com.yxcorp.gifshow.detail.plc.error.exception.BasePlcException;
import com.yxcorp.gifshow.detail.plc.error.exception.PlcExceptionHandler;
import crd.b;
import lnc.b9;

public final class d implements g	// class@0003ed
{
    public final a b;

    public void d(a p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       a uoa = new a();
       uoa.b(2);
       PlcExceptionHandler.a(uoa.c("plc refresh data crash!").d(p0).a(), "PlcCorePluginImpl");
       b9.a(this.b);
    }
}
