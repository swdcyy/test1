package bs7.a;
import qp7.e;
import bs7.c;
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
import java.util.ArrayList;
import vq7.g;
import java.util.List;
import com.kwai.slide.play.detail.group.Orientation;
import vq7.c;
import nsd.u;
import android.widget.LinearLayout;

public final class a extends e	// class@000461
{

    public void a(){
       super(new c());
    }
    public h m(RelativeLayout p0){
       d uod = PatchProxy.applyOneRefs(p0, this, a.class, "1");
       if (uod != PatchProxyResult.class) {
       }else {
          a.p(p0, "detailPageView");
          e uoe = new e(-1, -2);
          uoe.i(R.id.group_middle_root_layout);
          ArrayList uArrayList = new ArrayList();
          uArrayList.add(new g(2, R.id.group_bottom_root_layout));
          uoe.h(uArrayList);
          d uod1 = new d(p0, 0, Orientation.VERTICAL, uoe, null, 16, null);
          uArrayList.c.setClipChildren(false);
       }
       return uod;
    }
}
