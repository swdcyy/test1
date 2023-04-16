package c2c.f$a;
import msd.l;
import java.lang.Object;
import com.kwai.video.wayne.player.builder.WayneBuildData;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import qrd.l1;

public final class f$a implements l	// class@0004fb
{

    public void f$a(){
       super();
    }
    public Object invoke(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$a.class, "1")) {
       }else {
          a.p(p0, "buildData");
          p0 = p0.setBizFt(":ks-components:auto-play");
          a.o(p0, "buildData.setBizFt\(BuildConfig.PROJECT_NAME\)");
          p0.setBizType("ProfileBgPlayer");
       }
       return l1.a;
    }
}
