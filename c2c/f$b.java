package c2c.f$b;
import msd.l;
import java.lang.Object;
import com.kwai.video.wayne.player.builder.WayneBuildData;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import qrd.l1;

public final class f$b implements l	// class@0004fc
{

    public void f$b(){
       super();
    }
    public Object invoke(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$b.class, "1")) {
       }else {
          a.p(p0, "buildData");
          p0 = p0.setBizFt(":ks-components:auto-play");
          a.o(p0, "buildData.setBizFt\(BuildConfig.PROJECT_NAME\)");
          p0.setBizType("ProfileBgPlayer");
       }
       return l1.a;
    }
}
