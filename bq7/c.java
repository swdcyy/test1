package bq7.c;
import qp7.e;
import bq7.e;
import qp7.g;
import android.widget.RelativeLayout;
import qp7.h;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import vq7.d;
import kotlin.jvm.internal.a;
import vq7.e;
import android.graphics.Rect;
import lnc.a1;
import vq7.f;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.util.List;
import vq7.g;
import com.kwai.slide.play.detail.group.Orientation;
import vq7.c;
import nsd.u;

public final class c extends e	// class@000443
{

    public void c(){
       super(new e());
    }
    public h m(RelativeLayout p0){
       d uod = PatchProxy.applyOneRefs(p0, this, c.class, "1");
       if (uod != PatchProxyResult.class) {
       }else {
          a.p(p0, "detailPageView");
          e uoe = new e(-1, -2);
          uoe.i(R.id.group_bottom_panel_root_layout);
          uoe.j(new Rect(0, 0, a1.d(R.dimen.arg_RES_7f070340), 0));
          f[] uofArray = new f[]{new f(9)};
          uoe.g(CollectionsKt__CollectionsKt.r(uofArray));
          g[] ogArray = new g[]{new g(2, 0x7f0a1127)};
          uoe.h(CollectionsKt__CollectionsKt.r(ogArray));
          d uod1 = new d(p0, 0, Orientation.VERTICAL, uoe, null, 16, null);
       }
       return uod;
    }
}
