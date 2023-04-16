package mg.f3;
import java.lang.Runnable;
import java.util.HashMap;
import f55.g;
import java.lang.Object;
import i46.b;
import java.lang.Class;
import lnc.x6;
import lnc.y6;
import java.lang.String;
import com.yxcorp.gifshow.webview.bridge.JsSuccessResult;
import android.os.Bundle;

public final class f3 implements Runnable	// class@0025fb
{
    public final HashMap b;
    public final g c;

    public void f3(HashMap p0,g p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       f3 tb = this.b;
       f3 tc = this.c;
       b uob = y6.r(b.class);
       if (tb == null || uob == null) {
          if (tc != null) {
             tc.a(-1, null, null);
          }
       }else {
          uob.WL("editVisibleDialogSubtitleParams", tb);
          if (tc != null) {
             tc.onSuccess(new JsSuccessResult());
          }
       }
       return;
    }
}
