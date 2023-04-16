package q6c.a;
import com.kwai.android.common.intercept.Interceptor;
import java.lang.Object;
import com.kwai.android.common.intercept.Chain;
import com.kwai.android.register.core.click.ClickChain;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.android.common.bean.PushData;
import com.kwai.android.common.ext.PushDataExtKt;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Date;
import com.kwai.android.common.ext.JsonObjectExtKt;
import s66.a;
import a45.a;

public final class a implements Interceptor	// class@00223c
{

    public void a(){
       super();
    }
    public void intercept(Chain p0){
       try{
          if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          }else {
             String str = "chain";
             a.p(p0, str);
             JsonObject jsonObject = PushDataExtKt.toJson(PushDataExtKt.toJson(p0.getPushData())).r();
             a.o(jsonObject, "json");
             JsonObjectExtKt.set(jsonObject, "crash_monitor_info_time_stamp_format", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.CHINESE).format(new Date()));
             a.d("pushInfo", jsonObject.toString());
             p0.proceed();
          }
       }catch(java.lang.Exception e0){
       }
       return;
    }
    public int supportProcess(){
       return a.a(this);
    }
}
