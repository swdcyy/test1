package q90.k;
import androidx.viewpager.widget.ViewPager$l;
import q90.f;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kuaishou.gifshow.kuaishan.ui.feed.KSFeedGroupPagerFragment;
import com.kwai.library.widget.viewpager.tabstrip.a;
import androidx.fragment.app.Fragment;
import com.kuaishou.gifshow.kuaishan.ui.feed.KSFeedListFragment;
import u80.e;
import java.lang.StringBuilder;
import q87.c;
import java.util.Objects;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$a;
import com.kuaishou.gifshow.kuaishan.network.feed.KSFeedGroupInfo;
import k2b.e0;
import t90.j;
import kotlin.jvm.internal.a;
import java.util.Collection;
import qvb.i;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import j90.a;
import t90.k;
import java.util.ArrayList;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import com.yxcorp.gifshow.kuaishan.model.KSTemplateDetailInfo;

public final class k extends ViewPager$l	// class@002995
{
    public final f b;
    public final List c;

    public void k(f p0,List p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void onPageSelected(int p0){
       k ok = k.class;
       if (PatchProxy.isSupport(ok) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ok, "1")) {
          return;
       }
       if (!this.b.X8() instanceof KSFeedGroupPagerFragment) {
          return;
       }
       if (!this.b.Y8().a(p0) instanceof KSFeedListFragment) {
          return;
       }
       Object[] objArray = new Object[0];
       e.D().w("KSFeedGroupPagerPresenter", "Page with index "+p0+" impressed", objArray);
       Fragment uFragment = this.b.Y8().a(p0);
       Objects.requireNonNull(uFragment, "null cannot be cast to non-null type com.kuaishou.gifshow.kuaishan.ui.feed.KSFeedListFragment");
       this.b.x = uFragment.Hh();
       KSDataManager.q.a().F0(f.P8(this.b));
       this.b.a9(uFragment);
       k tb = this.b;
       ArrayList uArrayList = 1;
       if (tb.C != null) {
          tb.C = false;
       }else {
          j.d(tb.X8(), f.P8(this.b), this.c.get(p0).mGroupName, p0, uArrayList);
       }
       if (a.g(f.P8(this.b), "999")) {
          f i = this.b.I;
          if (i != null && !i.isEmpty()) {
             uArrayList = null;
          }
          if (!uArrayList && uFragment.q() instanceof a) {
             i oi = uFragment.q();
             a.o(oi, "feedListFragment.pageList");
             List items = oi.getItems();
             tb = k.a;
             f i1 = this.b.I;
             uArrayList = new ArrayList(u.Y(i1, 10));
             Iterator iterator = i1.iterator();
             while (iterator.hasNext()) {
                uArrayList.add(iterator.next().mTemplateId);
             }
             tb.b(items, uArrayList);
             items.addAll(0, this.b.I);
             oi.l0(items);
          }
       }
    label_0106 :
       return;
    }
}
