package c7d.b;
import android.view.View$OnClickListener;
import c7d.c;
import java.lang.Object;
import android.view.View;
import android.widget.ImageView;
import nfd.t0;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import gbd.d;
import com.yxcorp.plugin.search.entity.SearchItem;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import nfd.q1;
import com.yxcorp.plugin.search.utils.f0;
import com.yxcorp.plugin.search.result.fragment.SearchResultFragment;
import com.yxcorp.plugin.search.utils.f0$c;

public final class b implements View$OnClickListener	// class@0004ed
{
    public final c b;

    public void b(c p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       b tb = this.b;
       if (tb.q == null) {
       }else {
          int[] ointArray = new int[2];
          tb.s.getLocationOnScreen(ointArray);
          int i = 1;
          int i1 = ointArray[i] + t0.I;
          c uoc = c.class;
          if (!PatchProxy.applyVoid(null, tb, uoc, "7")) {
             c q = tb.q;
             c r = tb.r;
             ClientEvent$ElementPackage uElementPack = PatchProxy.applyOneRefs(r, null, uoc, "8");
             if (uElementPack != PatchProxyResult.class) {
             }else {
                d uod = d.r();
                uod.a("CLICK_FEEDBACK_BUTTON");
                uod.k(r.getId());
                uod.w(r.getType());
                uod.u(r.mRank);
                uod.c(r.getAuthorId());
                uod.t(r.mPosition);
                uElementPack = uod.d();
             }
             q1.u(i, q, r, uElementPack);
          }
          new f0().i(tb.q, tb.r, i1, null);
       }
       return;
    }
}
