package fx8.k;
import erd.g;
import com.yxcorp.gifshow.activity.share.topic.ShareTopicGuideFragment;
import java.lang.Object;
import com.kuaishou.android.post.topic.model.TopicItem;
import fx8.b;
import fx8.m0;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import g9c.a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import f66.i;
import jq.a;
import java.lang.StringBuilder;
import q87.c;
import java.util.Collection;
import ekd.q;
import k2b.e0;
import vw8.a;

public final class k implements g	// class@002386
{
    public final ShareTopicGuideFragment b;

    public void k(ShareTopicGuideFragment p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       k tb = this.b;
       int i = tb.r.P0(p0);
       if (i != -1) {
          ShareTopicGuideFragment o = tb.o;
          if (o == null || (o.a(p0) && (!PatchProxy.isSupport(ShareTopicGuideFragment.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), tb, ShareTopicGuideFragment.class, "15")))) {
             if (tb.r.r1()) {
                tb.r.Q0().remove((i - 1));
             }else {
                tb.r.Q0().remove(i);
             }
             tb.r.t0(i);
             Object[] objArray = new Object[0];
             a.b().w("ShareTopicGuideFragment", "removeTopicItem size: "+tb.r.getItemCount(), objArray);
             if (q.f(tb.r.Q0()) && !PatchProxy.applyVoid(null, tb, ShareTopicGuideFragment.class, "14")) {
                tb.ch(0x3f800000, 0);
             }
          }
       }
    label_0091 :
       a.w(tb.c(), "RECO_HISTORY_TOPIC", i, p0);
       return;
    }
}
