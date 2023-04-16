package az4.a;
import z1.a;
import java.lang.Object;
import java.lang.Integer;
import e4a.a;
import java.lang.String;
import com.yxcorp.gifshow.detail.plc.error.exception.BasePlcException;
import com.yxcorp.gifshow.detail.plc.error.exception.PlcExceptionHandler;

public final class a implements a	// class@00032a
{
    public final int[] a;

    public void a(int[] p0){
       this.a = p0;
    }
    public final void accept(Object p0){
       a ta = this.a;
       if (p0 != null) {
          ta[0] = p0.intValue();
       }else {
          p0 = new a();
          p0.b(3);
          PlcExceptionHandler.a(p0.c("plc click subProcessCallback receive action code is null!").a(), "ActionClickHelper");
       }
       return;
    }
}
