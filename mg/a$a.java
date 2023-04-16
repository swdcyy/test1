package mg.a$a;
import og.b1;
import mg.a;
import f55.g;
import android.app.Activity;
import java.lang.Object;
import r26.e;
import w26.c;
import com.yxcorp.gifshow.webview.bridge.JsErrorResult;
import java.lang.String;
import android.os.Bundle;

public class a$a implements b1	// class@0025c8
{
    public final g a;
    public final Activity b;
    public final a c;

    public void a$a(a p0,g p1,Activity p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void a(Object p0){
       this.a.onSuccess(p0);
    }
    public void b(e p0,c p1){
       p1.Cy(this.b, p0);
    }
    public void c(e p0,c p1){
       p1.MQ(this.b, p0);
    }
    public void d(JsErrorResult p0){
       this.a.a(p0.mResult, p0.mErrorMsg, null);
    }
}
