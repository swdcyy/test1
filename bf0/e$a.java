package bf0.e$a;
import android.os.Handler;
import bf0.e;
import android.os.Looper;
import android.os.Message;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import bf0.f$a;
import xe0.b;
import bf0.g;
import java.lang.StringBuilder;
import ye0.a;
import java.lang.Throwable;

public final class e$a extends Handler	// class@000368
{
    public final e a;

    public void e$a(e p0,Looper p1){
       this.a = p0;
       super(p1);
    }
    public void handleMessage(Message p0){
       String str1;
       if (PatchProxy.applyVoidOneRefs(p0, this, e$a.class, "1")) {
          return;
       }
       a.p(p0, "msg");
       e$a ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoidOneRefs(p0, ta, e.class, "3")) {
          Message what = p0.what;
          Objects.requireNonNull(f$a.c);
          StringBuilder str = 1;
          if (what != str) {
             if (what != 2) {
                str1 = (what != 3)? "MSG_UNKNOWN": "MSG_SPEED_UPDATE_REPORT";
             }else {
                str1 = "MSG_INFER_REPORT";
             }
          }else {
             str1 = "MSG_POST_FEATURE";
          }
          String str2 = "PrtpThread#handleMessage: code = ";
          if (what == str) {
             b uob = g.a(p0);
             if (uob != null) {
                a.b(str2+str1+", "+"action = "+uob.a+", "+"value = "+uob.c, false, 2, null);
             }
          }else {
             what = p0.obj;
             String str3 = (what != null)? what.toString(): null;
             a.b(str2+str1+", obj = "+str3, false, 2, null);
          }
       }
       this.a.b(p0);
       return;
    }
}
