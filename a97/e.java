package a97.e;
import java.lang.Object;
import a97.e$a;
import a97.e$b;
import java.lang.String;
import java.lang.CharSequence;
import android.text.TextUtils;
import c97.d;
import r97.a0;
import r97.r$a;
import r97.r;
import r97.o$a;
import r97.o;
import java.lang.StringBuilder;
import java.lang.Exception;
import t87.d;
import java.lang.Throwable;
import java.lang.StackTraceElement;
import java.util.HashMap;

public class e	// class@000084
{
    public HashMap a;

    public void e(){
       super();
    }
    public void e(e$a p0){
       super();
    }
    public static e b(){
       return e$b.a;
    }
    public void a(String p0,String p1){
       if (TextUtils.isEmpty(p0)) {
          return;
       }
       try{
          r$a uoa = r.b();
          uoa.d(o.builder().i("obiwan").b());
          uoa.f(p0);
          uoa.h(p1);
          d.a().g().E(uoa.c());
       }catch(java.lang.Exception e0){
          d.b("ObiwanUploader", e0.toString()+" when addCustomStatEvent key: "+p0+", value: "+p1);
       }
       if (this.a != null) {
          this.a.put(p0, new Throwable().getStackTrace()[2].getMethodName());
       }
       return;
    }
}
