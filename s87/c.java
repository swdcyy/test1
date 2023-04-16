package s87.c;
import java.lang.Object;
import java.util.Random;
import java.lang.System;
import s87.c$a;
import s87.c$b;
import java.util.HashMap;
import java.lang.String;
import android.os.SystemClock;
import android.content.Context;
import com.kwai.logger.KwaiLog;
import b97.d;
import java.util.Map;
import s87.a$b;
import java.util.Objects;
import java.lang.CharSequence;
import android.text.TextUtils;
import c97.d;
import r97.a0;
import java.lang.StringBuilder;
import java.lang.Exception;
import s87.a;
import java.lang.Throwable;
import java.lang.StackTraceElement;

public class c	// class@0023fb
{
    public final Random a;
    public float b;
    public float c;
    public float d;
    public boolean e;

    public void c(){
       super();
       this.b = 0.00f;
       this.c = 0.00f;
       this.d = 0.00f;
       this.e = false;
       this.a = new Random(System.currentTimeMillis());
    }
    public void c(c$a p0){
       super();
       this.b = 0.00f;
       this.c = 0.00f;
       this.d = 0.00f;
       this.e = false;
       this.a = new Random(System.currentTimeMillis());
    }
    public static c b(){
       return c$b.a;
    }
    public void a(long p0){
       if (!this.e(this.b)) {
          return;
       }
       HashMap hashMap = new HashMap();
       hashMap.put("is_success", String.valueOf(true));
       hashMap.put("init_cost_ms", String.valueOf((SystemClock.elapsedRealtime() - p0)));
       hashMap.put("process_name", d.a(KwaiLog.h()));
       this.d("obiwan_sdk_init", hashMap);
       return;
    }
    public void c(long p0,int p1,String p2){
       HashMap hashMap = new HashMap();
       hashMap.put("is_success", String.valueOf(false));
       hashMap.put("init_cost_ms", String.valueOf((SystemClock.elapsedRealtime() - p0)));
       hashMap.put("error_code", String.valueOf(p1));
       hashMap.put("error_msg", p2);
       hashMap.put("process_name", d.a(KwaiLog.h()));
       this.d("obiwan_sdk_init", hashMap);
    }
    public final void d(String p0,Map p1){
       String str = "obiwan";
       p1.put("serviceName", str);
       p1.put("sdkversion", "4.2.10");
       a a = a$b.a;
       Objects.requireNonNull(a);
       if (TextUtils.isEmpty(p0)) {
       }else {
          try{
             d.a().g().b(str, "", p0, p1);
          }catch(java.lang.Exception e1){
             Object[] objArray = new Object[0];
             KwaiLog.e("ObiwanLogger_TAG", e1.toString()+" when addCustomStatEvent key: "+p0+", value: "+p1.toString(), objArray);
          }
          if (a.a != null) {
             a.a.put(p0, new Throwable().getStackTrace()[2].getMethodName());
          }
       }
       return;
    }
    public final boolean e(float p0){
       boolean b = (p0 - 0x3f800000 >= 0 || this.a.nextFloat() - p0 < 0)? true: false;
       return b;
    }
}
