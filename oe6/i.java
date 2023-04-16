package oe6.i;
import vid.c$a;
import oe6.k;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.app.Application;
import o56.a;
import iud.a;
import java.nio.charset.Charset;
import android.os.Build$VERSION;
import android.content.Context;
import com.yxcorp.gifshow.util.CPU;
import java.io.File;
import j80.f;
import com.yxcorp.utility.SystemUtil;
import com.google.gson.Gson;
import fg6.a;
import ekd.v0;

public class i implements c$a	// class@002017
{
    public final k a;

    public void i(k p0){
       this.a = p0;
       super();
    }
    public String a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, i.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return CPU.getClock(a.b(), p0.getBytes(a.f), Build$VERSION.SDK_INT);
    }
    public File b(){
       Object obj = PatchProxy.apply(null, this, i.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new File(f.b(a.b()), "shared_prefs");
    }
    public String c(){
       Object obj = PatchProxy.apply(null, this, i.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return SystemUtil.r(a.b());
    }
    public Gson d(){
       return a.b;
    }
    public String e(){
       return a.w;
    }
    public Context getContext(){
       Object obj = PatchProxy.apply(null, this, i.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.b();
    }
    public void loadLibrary(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "1")) {
          return;
       }
       a.b().c(p0, a.b(), String.valueOf(a.q));
       return;
    }
}
