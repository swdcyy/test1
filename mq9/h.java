package mq9.h;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import jd6.g;
import com.kwai.plugin.dva.Dva;
import cm5.d;
import crd.b;
import mq9.e;
import java.util.concurrent.Callable;
import brd.t;
import t45.d;
import brd.z;
import erd.g;
import io.reactivex.internal.functions.Functions;
import mq9.c;
import android.app.Activity;
import com.kwai.framework.plugin.downloader.PluginDownloadExtension;
import mq9.d;
import mq9.b;

public class h	// class@003074
{

    public void h(){
       super();
    }
    public static boolean a(){
       String obj = PatchProxy.apply(null, null, h.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = "corona_core_plugin";
       boolean b = (g.e(obj) || Dva.instance().isLoaded(obj))? true: false;
       return b;
    }
    public static b b(d p0){
       String obj = PatchProxy.applyOneRefs(p0, null, h.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "corona_core_plugin";
       if (g.e(obj) || Dva.instance().isLoaded(obj)) {
          return t.just(Boolean.TRUE).subscribe(new c(p0));
       }
       return t.fromCallable(new e(p0)).subscribeOn(d.c).observeOn(d.a).subscribe(Functions.d());
    }
    public static b c(Activity p0,d p1){
       String obj = PatchProxy.applyTwoRefs(p0, p1, null, h.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "corona_core_plugin";
       if (!g.e(obj)) {
          PluginDownloadExtension.k.a(obj);
       }
       if (g.e(obj) || Dva.instance().isLoaded(obj)) {
          return t.just(Boolean.TRUE).subscribe(new b(p1));
       }else {
          return t.fromCallable(new d(p0, p1)).subscribeOn(d.c).observeOn(d.a).subscribe(Functions.d());
       }
    }
}
