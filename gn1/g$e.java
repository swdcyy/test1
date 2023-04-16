package gn1.g$e;
import z0.a;
import android.content.res.Resources;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.common.core.component.hotspot.detail.baseinfo.LiveHotSpotDetailBaseInfoModel;
import nsd.r0;
import kotlin.jvm.internal.a;
import java.lang.Integer;
import java.util.Arrays;

public final class g$e implements a	// class@002529
{
    public final Resources a;

    public void g$e(Resources p0){
       this.a = p0;
       super();
    }
    public final Object apply(Object p0){
       String obj = PatchProxy.applyOneRefs(p0, this, g$e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null) {
          obj = this.a.getString(R.string.arg_RES_7f1024e5);
          a.o(obj, "resource.getString\(R.str¡­live_hotspot_profile_top\)");
          Object[] objArray = new Object[]{Integer.valueOf(p0.rank)};
          p0 = String.format(obj, Arrays.copyOf(objArray, 1));
          a.o(p0, "java.lang.String.format\(format, *args\)");
       }else {
          p0 = null;
       }
       return p0;
    }
}
