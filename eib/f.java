package eib.f;
import erd.g;
import com.yxcorp.gifshow.message_camera.effect.magic.IMMagicEffectPanel;
import java.lang.Object;
import com.trello.rxlifecycle3.android.ActivityEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class f implements g	// class@0026a8
{
    public final IMMagicEffectPanel b;

    public void f(IMMagicEffectPanel p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, f.class, "1")) {
       }else {
          this.b.g();
          PatchProxy.onMethodExit(f.class, "1");
       }
       return;
    }
}
