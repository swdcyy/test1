package i56.f;
import zu8.c;
import com.kwai.framework.abtest.ABTestInitModule;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.google.gson.JsonObject;
import android.util.Log;
import com.google.gson.JsonElement;
import k2b.u1;
import com.yxcorp.gifshow.util.rx.RxBus;
import i56.h;
import java.lang.reflect.Type;
import java.lang.StringBuilder;

public class f extends c	// class@0017a3
{
    public final ABTestInitModule a;

    public void f(ABTestInitModule p0){
       this.a = p0;
       super();
    }
    public void a(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "2")) {
          return;
       }
       super.a(p0);
       JsonObject jsonObject = new JsonObject();
       jsonObject.c0("exception", Log.getStackTraceString(p0));
       String str = jsonObject.toString();
       u1.U("abtest_request_failed", str);
       RxBus.f.b(new h(false));
       return;
    }
    public void c(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "4")) {
          return;
       }
       super.c(p0);
       JsonObject jsonObject = new JsonObject();
       jsonObject.c0("exception", Log.getStackTraceString(p0));
       String str = jsonObject.toString();
       u1.Q("abtest_log_error", str);
       return;
    }
    public void d(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "1")) {
          return;
       }
       super.d(p0);
       RxBus.f.b(new h(true));
       return;
    }
    public void h(String p0,Type p1,Throwable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, f.class, "3")) {
          return;
       }
       super.h(p0, p1, p2);
       JsonObject jsonObject = new JsonObject();
       jsonObject.c0("key", p0);
       String str = (p1 != null)? p1.toString(): "";
       jsonObject.c0("getType", str);
       jsonObject.c0("exception", Log.getStackTraceString(p2));
       u1.U("abtest_get_value_failed", jsonObject.toString());
       "abtest_get_value_failed key: "+p0+" , typeOfT: "+p1;
       return;
    }
}
