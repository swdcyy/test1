package d5a.p$a;
import com.kwai.plugin.dva.work.c$c;
import d5a.p;
import java.lang.Object;
import java.lang.Exception;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.os.SystemClock;
import d5a.s;
import com.yxcorp.gifshow.detail.presenter.landscape.LandscapeEntranceVMPresenter;
import java.util.Map;
import sj7.d;

public final class p$a implements c$c	// class@001e8a
{
    public final p a;

    public void p$a(p p0){
       this.a = p0;
       super();
    }
    public void onFailed(Exception p0){
       String message;
       if (PatchProxy.applyVoidOneRefs(p0, this, p$a.class, "2")) {
          return;
       }
       s.b("preFailedEndTime", String.valueOf(SystemClock.elapsedRealtime()));
       p$a ta = this.a;
       p b = ta.b;
       p c = ta.c;
       if (p0 != null) {
          message = p0.getMessage();
          if (message != null) {
          label_002a :
             LandscapeEntranceVMPresenter.c9(b, "onFailed", false, c, "PreLoad", message, 0, null, 64, null);
             return;
          }
       }
       message = "";
       goto label_002a ;
    }
    public void onProgress(float p0){
    }
    public void onStart(){
       d.a(this);
    }
    public void onSucceed(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p$a.class, "1")) {
       }else {
          s.b("preSuccessEndTime", String.valueOf(SystemClock.elapsedRealtime()));
          p$a ta = this.a;
          p b = ta.b;
          p c = ta.c;
          if (p0 == null) {
             p0 = "";
          }
          LandscapeEntranceVMPresenter.c9(b, "onSucceed", false, c, "PreLoad", p0, 1, null, 64, null);
       }
       return;
    }
}
