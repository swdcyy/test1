package ce9.d;
import erd.g;
import com.yxcorp.gifshow.camera.record.magic.CameraMagicPlatformSchemeActivity;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import ce9.c;
import java.lang.Runnable;
import ye9.j;

public final class d implements g	// class@0005bc
{
    public final CameraMagicPlatformSchemeActivity b;

    public void d(CameraMagicPlatformSchemeActivity p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, d.class, "1")) {
       }else {
          a.p(p0, "error");
          j.c(p0, new c(this));
          PatchProxy.onMethodExit(d.class, "1");
       }
       return;
    }
}
