package a1d.i0;
import erd.g;
import a1d.m0;
import java.lang.Object;
import java.lang.Throwable;
import com.yxcorp.retrofit.model.KwaiException;
import java.lang.String;
import w0d.g;

public final class i0 implements g	// class@00002c
{
    public final m0 b;

    public void i0(m0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       int errorCode;
       i0 tb = this.b;
       tb.P8();
       if (p0 instanceof KwaiException) {
          errorCode = p0.getErrorCode();
          p0 = p0.getMessage();
       }else {
          errorCode = 0x2713;
          p0 = "auth info response error";
       }
       m0 f = tb.F;
       if (f != null) {
          f.C2(errorCode, p0);
       }
       return;
    }
}
