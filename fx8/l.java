package fx8.l;
import erd.g;
import com.yxcorp.gifshow.activity.share.topic.ShareTopicGuideFragment;
import fx8.a0;
import java.lang.Object;
import com.kuaishou.android.post.topic.model.TopicCollectionsResponse;
import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import com.yxcorp.gifshow.activity.share.topic.ShareTopicExtra;
import java.util.Collection;
import ekd.q;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import g9c.a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import android.view.ViewTreeObserver;
import android.view.ViewGroup;
import fx8.m;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.view.View;
import i2b.a;
import fx8.b;
import f66.i;
import jq.a;
import q87.c;
import com.yxcorp.gifshow.model.topic.HotRecommendResponse;
import com.yxcorp.gifshow.activity.share.topic.ShareTopicGuideFragment$c;

public final class l implements g	// class@002388
{
    public final ShareTopicGuideFragment b;
    public final a0 c;

    public void l(ShareTopicGuideFragment p0,a0 p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       l tb = this.b;
       l tc = this.c;
       Objects.requireNonNull(tb);
       ArrayList uArrayList = new ArrayList();
       if (!q.f(tb.n.getForceTopItems())) {
          uArrayList.addAll(tb.n.getForceTopItems());
       }
       if (!q.f(p0.getItems())) {
          uArrayList.addAll(p0.getItems());
          Object[] objArray = null;
          if (!PatchProxy.applyVoid(objArray, tb, ShareTopicGuideFragment.class, "13")) {
             tb.ch(0, 0x3f800000);
          }
          tb.r.W0(uArrayList);
          tb.r.k0();
          if (!PatchProxy.applyVoid(objArray, tb, ShareTopicGuideFragment.class, "16")) {
             tb.s.getViewTreeObserver().addOnGlobalLayoutListener(new m(tb));
          }
          if (!PatchProxy.applyVoid(objArray, tb, ShareTopicGuideFragment.class, "9")) {
             tb.r.u1(a.i(tb.s, R.layout.arg_RES_7f0d14ff));
          }
          if (!PatchProxy.applyVoid(objArray, tb, ShareTopicGuideFragment.class, "7")) {
             Object[] objArray1 = new Object[0];
             a.b().w("ShareTopicGuideFragment", "addFooterView: not enable topic category page, not show entrance", objArray1);
             if (!PatchProxy.applyVoid(objArray, tb, ShareTopicGuideFragment.class, "8")) {
                tb.r.t1(a.i(tb.s, R.layout.arg_RES_7f0d14ff));
             }
          }
       }
    label_00b3 :
       p0 = tb.y;
       if (p0 != null) {
          p0.c(tc.b());
          tb.y.a((q.f(uArrayList) ^ 0x01), uArrayList);
       }
       return;
    }
}
