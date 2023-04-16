package ana.e$b;
import com.kwai.plugin.dva.work.c$c;
import ana.e;
import java.lang.String;
import f55.g;
import java.lang.Object;
import java.lang.Exception;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.webview.bridge.JsErrorResult;
import cra.w;
import java.lang.Throwable;
import q87.c;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import brd.t;
import t45.d;
import brd.z;
import ana.c;
import ana.d;
import erd.g;
import crd.b;
import java.lang.Float;
import java.lang.StringBuilder;
import sj7.d;
import km8.b;
import android.content.SharedPreferences;
import android.content.SharedPreferences$Editor;
import oe6.g;
import com.yxcorp.gifshow.webview.bridge.JsSuccessResult;

public class e$b implements c$c	// class@0000ab
{
    public final String a;
    public final g b;
    public final e c;

    public void e$b(e p0,String p1,g p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void onFailed(Exception p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$b.class, "3")) {
          return;
       }
       this.b.onSuccess(new JsErrorResult(-1, "splitœ¬‘ÿ ß∞‹"));
       w.C().e("GrowthSimulation", "dva plugin install failed", p0);
       e$b tc = this.c;
       e$b ta = this.a;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoidOneRefs(ta, tc, e.class, "18")) {
          long l = 2;
          try{
             t.timer(l, TimeUnit.SECONDS).observeOn(d.a).subscribe(new c(ta), new d(ta));
          }catch(java.lang.Exception e5){
             e5.printStackTrace();
          }
       }
    }
    public void onProgress(float p0){
       e$b uob = e$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uob, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       w.C().w("GrowthSimulation", "onProgress : "+p0, objArray);
       return;
    }
    public void onStart(){
       d.a(this);
    }
    public void onSucceed(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$b.class, "2")) {
       }else {
          g.a(b.b("DefaultPreferenceHelper").edit().putString("ug_sim_name", this.a));
          this.b.onSuccess(new JsSuccessResult());
          Object[] objArray = new Object[0];
          w.C().w("GrowthSimulation", "dva plugin install success", objArray);
       }
       return;
    }
}
