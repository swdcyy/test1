package ana.b;
import erd.g;
import f55.g;
import java.lang.Object;
import java.lang.Throwable;
import com.yxcorp.retrofit.model.KwaiException;
import java.lang.String;
import android.os.Bundle;
import o56.a;
import android.app.Application;

public final class b implements g	// class@0000a7
{
    public final g b;

    public void b(g p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       b tb = this.b;
       if (p0 instanceof KwaiException) {
          tb.a(p0.getErrorCode(), p0.getMessage(), null);
       }else {
          tb.a(-1, a.B.getString(R.string.arg_RES_7f1038e7), null);
       }
       return;
    }
}
