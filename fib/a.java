package fib.a;
import erd.g;
import com.yxcorp.gifshow.message_camera.effect.prettify.IMPrettifyEffectPanel;
import java.lang.Object;
import com.trello.rxlifecycle3.android.ActivityEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class a implements g	// class@002945
{
    public final IMPrettifyEffectPanel b;

    public void a(IMPrettifyEffectPanel p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, a.class, "1")) {
       }else {
          this.b.e();
          PatchProxy.onMethodExit(a.class, "1");
       }
       return;
    }
}
