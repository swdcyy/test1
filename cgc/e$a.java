package cgc.e$a;
import com.kwai.plugin.dva.work.c$c;
import brd.v;
import java.lang.Object;
import java.lang.Exception;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.logger.KwaiLog;
import cgc.f;
import java.lang.Throwable;
import android.util.Log;
import java.util.Objects;
import brd.g;
import java.lang.Float;
import sj7.d;
import java.lang.Boolean;

public final class e$a implements c$c	// class@000596
{
    public final v a;

    public void e$a(v p0){
       this.a = p0;
       super();
    }
    public void onFailed(Exception p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$a.class, "3")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       KwaiLog.c("screencast_plugin", "SCREENCAST_PLUGIN", "插件下载失败", objArray);
       f b = f.b;
       String stackTraceSt = Log.getStackTraceString(p0);
       Objects.requireNonNull(b);
       if (!PatchProxy.applyVoidTwoRefs(stackTraceSt, "DVA_RELOAD", b, f.class, "4")) {
          b.c("biz_screencast_plugin_error", stackTraceSt, "DVA_RELOAD");
       }
       f.a(b, i);
       if (p0 != null) {
          Throwable cause = p0.getCause();
          if (cause != null) {
             this.a.onError(cause);
          }
       }
       return;
    }
    public void onProgress(float p0){
       e$a uoa = e$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uoa, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       KwaiLog.c("screencast_plugin", "SCREENCAST_PLUGIN", "插件下载中", objArray);
       return;
    }
    public void onStart(){
       d.a(this);
    }
    public void onSucceed(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$a.class, "2")) {
       }else {
          Object[] objArray = new Object[0];
          KwaiLog.c("screencast_plugin", "SCREENCAST_PLUGIN", "插件下载成功", objArray);
          f b = f.b;
          b.c("biz_screencast_plugin_success", "", "DVA_RELOAD");
          f.a(b, 0);
          this.a.onNext(Boolean.TRUE);
       }
       return;
    }
}
