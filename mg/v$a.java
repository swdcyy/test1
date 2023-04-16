package mg.v$a;
import qh7.b;
import f55.g;
import android.net.Uri;
import java.lang.Object;
import yh7.a;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.webview.bridge.JsSuccessResult;
import android.content.Intent;
import com.kwai.framework.activitycontext.ActivityContext;
import android.app.Activity;
import android.app.Application;
import o56.a;

public final class v$a implements b	// class@00266c
{
    public final g a;
    public final Uri b;

    public void v$a(g p0,Uri p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final void a(a p0){
       v$a ta;
       a.p(p0, "it");
       if (p0.a == 200) {
          ta = this.a;
          if (ta != null) {
             ta.onSuccess(new JsSuccessResult());
          }
       }else {
          Intent intent = new Intent();
          intent.setData(this.b);
          ActivityContext uActivityCon = ActivityContext.g();
          a.o(uActivityCon, "ActivityContext.getInstance\(\)");
          Activity uActivity = uActivityCon.e();
          if (uActivity != null) {
             uActivity.startActivity(intent);
          }else {
             intent.addFlags(0x10000000);
             a.b().startActivity(intent);
          }
          ta = this.a;
          if (ta != null) {
             ta.onSuccess(new JsSuccessResult());
          }
       }
       return;
    }
}
