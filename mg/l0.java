package mg.l0;
import xxb.b$a;
import f55.g;
import xxb.a;
import com.yxcorp.gifshow.webview.bridge.JsSuccessResult;
import java.lang.Object;
import java.lang.String;
import lnc.a1;
import android.os.Bundle;
import java.lang.Throwable;

public class l0 extends b$a	// class@002630
{
    public final g a;

    public void l0(g p0){
       this.a = p0;
       super();
    }
    public void b(a p0){
       if (p0.h()) {
          this.a.onSuccess(new JsSuccessResult());
       }else if(p0.f()){
          this.a.a(0, a1.p(R.string.arg_RES_7f104fc9), new Bundle());
       }else if(p0.g()){
          this.a.a(412, p0.c.toString(), new Bundle());
       }
       return;
    }
}
