package bu7.z;
import erd.g;
import com.kwai.tokenshare.f;
import java.lang.String;
import java.lang.Object;
import java.lang.Throwable;
import java.util.Objects;
import com.yxcorp.retrofit.model.KwaiException;
import e17.i;
import o56.a;
import android.content.Context;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import com.kwai.tokenshare.KwaiTokenInitModule;
import j4d.b;
import com.kwai.tokenshare.model.TokenInfoModel;

public final class z implements g	// class@0004a2
{
    public final f b;
    public final int c;
    public final String d;
    public final String e;

    public void z(f p0,int p1,String p2,String p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void accept(Object p0){
       z tb = this.b;
       z tc = this.c;
       z td = this.d;
       z te = this.e;
       Objects.requireNonNull(tb);
       if (p0 instanceof KwaiException) {
          int errorCode = p0.getErrorCode();
          if (errorCode == 513 || (errorCode != 512 && errorCode != 0x57e56)) {
             if (errorCode == 0x57e57) {
                i.a(R.style.arg_RES_7f110668, 0x7f101c3e);
             }else {
                ExceptionHandler.handleException(a.B, p0);
             }
          }
       }
       p0 = tb.a.q;
       if (p0 != null) {
          p0.C1(tc, td, false, te);
       }
       tb.j(null, te);
       return;
    }
}
