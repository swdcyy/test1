package ac6.b;
import io7.a;
import java.lang.Object;
import java.lang.String;
import io7.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.google.gson.JsonElement;
import fg6.a;
import na0.h;
import com.google.gson.Gson;
import java.lang.StringBuilder;
import java.util.List;
import java.lang.Integer;
import com.yxcorp.utility.Log;
import ac6.d;
import com.kwai.soc.arch.rubas.base.Rubas;

public final class b implements a	// class@00006e
{

    public void b(){
       super();
    }
    public void a(String p0,f p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "1")) {
          return;
       }
       if (p1 != null) {
          try{
             JsonElement jsonElement = p1.c();
             if (jsonElement != null) {
                h oh = a.a.c(jsonElement, h.class);
                if (oh != null) {
                   StringBuilder str = "initKSwitchConfig config onChanged : key:"+p0+" , newValue : ";
                   List list = oh.a();
                   Integer integer = (list != null)? Integer.valueOf(list.size()): null;
                   Log.g("PerfDegradeUtils", str+integer.intValue());
                   d.c.d(oh, false);
                }
             }
          }catch(java.lang.Exception e8){
             Log.d("PerfDegradeUtils", "switchConfig onChange exception : "+e8+".message");
             Rubas.f("perf_degrade_kswitch_parseConfig_failed", null, null, null, 14, null);
          }
       }
    }
}
