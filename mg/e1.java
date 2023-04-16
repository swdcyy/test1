package mg.e1;
import erd.g;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import f55.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.String;
import com.yxcorp.gifshow.util.PostUtils;
import com.yxcorp.retrofit.model.KwaiException;
import android.os.Bundle;

public final class e1 implements g	// class@0025f3
{
    public final ProgressFragment b;
    public final g c;

    public void e1(ProgressFragment p0,g p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       e1 tc = this.c;
       PostUtils.D("JsSelectAndUploadMediaF", "uploadFile", p0);
       this.b.dismiss();
       String str = "";
       if (p0 instanceof KwaiException) {
          String message = p0.getMessage();
          int errorCode = p0.getErrorCode();
          if (message != null) {
             str = message;
          }
          tc.a(errorCode, str, new Bundle());
       }else {
          p0 = p0.getMessage();
          if (p0 != null) {
             str = p0;
          }
          tc.a(412, str, new Bundle());
       }
       return;
    }
}
