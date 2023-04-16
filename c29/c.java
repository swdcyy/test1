package c29.c;
import qp7.e;
import hs7.e;
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
import qp7.t0;
import lnc.a1;
import android.graphics.Rect;
import java.util.ArrayList;
import vq7.f;
import java.util.List;
import vq7.g;
import com.kwai.slide.play.detail.group.Orientation;
import vq7.c;
import nsd.u;
import android.widget.LinearLayout;
import c29.a;
import android.view.View$OnClickListener;
import c29.b;
import android.view.View$OnLongClickListener;

public final class c extends e	// class@0004cf
{

    public void c(){
       super(new e());
    }
    public h m(RelativeLayout p0){
       d uod = PatchProxy.applyOneRefs(p0, this, c.class, "1");
       if (uod != PatchProxyResult.class) {
       }else {
          a.p(p0, "detailPageView");
          e uoe = new e(a1.e(this.q().o()), -2);
          uoe.j(new Rect(0, 0, 0, a1.e(this.q().n())));
          uoe.i(R.id.slide_play_right_button_layout);
          ArrayList uArrayList = new ArrayList();
          uArrayList.add(new f(11));
          uoe.g(uArrayList);
          uArrayList = new ArrayList();
          uArrayList.add(new g(2, R.id.thanos_parent_bottom_line));
          uoe.h(uArrayList);
          d uod1 = new d(p0, 81, Orientation.VERTICAL, uoe, null, 16, null);
          uArrayList.d().setOnClickListener(a.b);
          uArrayList.d().setOnLongClickListener(b.b);
       }
       return uod;
    }
}
