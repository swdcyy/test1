package ce9.b;
import erd.g;
import java.lang.String;
import java.util.Map;
import com.yxcorp.gifshow.camera.record.magic.CameraMagicPlatformSchemeActivity;
import java.lang.Object;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import ce9.a;
import android.app.Activity;
import java.lang.Runnable;
import ye9.j;

public final class b implements g	// class@0005b8
{
    public final String b;
    public final Map c;
    public final CameraMagicPlatformSchemeActivity d;

    public void b(String p0,Map p1,CameraMagicPlatformSchemeActivity p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void accept(Object p0){
       Object obj = p0;
       if (PatchProxy.applyVoidOneRefsWithListener(obj, this, b.class, "1")) {
       }else {
          a.p(obj, "magicFace");
          j.d(this.d, this.b, obj, this.c, R.anim.arg_RES_7f010105, new a(this));
          PatchProxy.onMethodExit(b.class, "1");
       }
       return;
    }
}
